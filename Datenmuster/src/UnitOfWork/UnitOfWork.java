package UnitOfWork;

import java.util.ArrayList;

public class UnitOfWork 
{
	private ArrayList<EntityBase> zuLoeschendeObjekte;
	private ArrayList<EntityBase> hinzuzufuegendeObjekte;
	private ArrayList<EntityBase> zuAenderndeObjekte;
	
	public UnitOfWork()
	{
		zuLoeschendeObjekte = new ArrayList<EntityBase>();
		hinzuzufuegendeObjekte = new ArrayList<EntityBase>();
		zuAenderndeObjekte = new ArrayList<EntityBase>();
	}
	
	public void registriereNeu(EntityBase entity)
	{
		assert entity.Id == -1 : "Die Entity ist bereits gespeichert worden";
		assert !zuAenderndeObjekte.contains(entity) : "Entitiy bereits in Änderungsliste";
		assert !hinzuzufuegendeObjekte.contains(entity) : "Entity bereits in Hinzufügeliste";
		assert !zuLoeschendeObjekte.contains(entity) : "Entity bereits in Löschliste";
		hinzuzufuegendeObjekte.add(entity);
	}
	
	public void registriereGeloescht(EntityBase entity)
	{
		//Noch gar nicht hinzugefügt, muss daher nicht physisch gelöscht werden
		if (hinzuzufuegendeObjekte.remove(entity))
			return;
		//Änderung überflüssig, wird ohnehin gelöscht
		zuAenderndeObjekte.remove(entity);
		assert entity.Id != -1 : "Die Entity ist noch nicht gespeichert worden";
		if (!zuLoeschendeObjekte.contains(entity))
			zuLoeschendeObjekte.add(entity);
	}
	
	public void registriereGeaendert(EntityBase entity)
	{
		assert !zuLoeschendeObjekte.contains(entity) : "Entity bereits in Löschliste";
		assert !hinzuzufuegendeObjekte.contains(entity) : "Entity bereits in Hinzufügeliste";
		if (!zuAenderndeObjekte.contains(entity))
			zuAenderndeObjekte.add(entity);
	}
	
	public void rollback()
	{
		leereListen();
	}
	
	private void leereListen()
	{
		zuLoeschendeObjekte.clear();
		hinzuzufuegendeObjekte.clear();
		zuAenderndeObjekte.clear();
	}
	
	public void commit()
	{
		DatenbankTreiber treiber = new DatenbankTreiber();
		treiber.startTransaktion();
		
		for(EntityBase entity: hinzuzufuegendeObjekte)
		{
			entity.Id = treiber.entityHinzufuegen(entity);
		}
		for(EntityBase entity: zuLoeschendeObjekte)
		{
			treiber.entityLoeschen(entity);
		}
		for(EntityBase entity: zuAenderndeObjekte)
		{
			treiber.entityAendern(entity);
		}
		treiber.commitTransaktion();
		leereListen();
	}
	
	
}
