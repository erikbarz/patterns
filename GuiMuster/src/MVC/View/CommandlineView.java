package MVC.View;

import java.util.Observable;

import MVC.Controller.KompassControllerInterface;
import MVC.Model.KompassModel;

public class CommandlineView extends KompassView  
{
	public CommandlineView(KompassModel kompassModel, KompassControllerInterface controller) 
	{
		super(kompassModel, controller);
	}

	public void zeigeKurskorrektur(int kurskorrektur)
	{
		System.out.println("Steuerkurs-Korrekturanfrage: "+kurskorrektur+" Grad");
	}
	
	public void update(Observable obs, Object obj) 
	{
		System.out.println("---------------------------------");
		System.out.println("Steuerkurs: "+getKompassModel().getSteuerkurs());
		System.out.println("Aktueller Kurs: "+getKompassModel().getKompasskurs());
		System.out.println("---------------------------------");
	}
}
