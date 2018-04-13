package Besucher;

import java.util.ArrayList;

public class Warenkorb 
{
	private ArrayList<Element> produkte;
	
	public Warenkorb()
	{
		produkte = new ArrayList<Element>();
	}
	
	public ArrayList<Element> getProdukte()
	{
		return produkte;
	}
	
	public float berechneGesamtpreis()
	{
		BerechnePreisBesucher preisBesucher = new BerechnePreisBesucher();
		for (Element element : produkte)
		{
			element.nimmEntgegen(preisBesucher);
		}
		return preisBesucher.getPreis();
	}
	
	//Analog weitere Methoden für die Generierung von HTML, Text und PDF
}
