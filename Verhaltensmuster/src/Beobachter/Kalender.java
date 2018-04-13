package Beobachter;

import java.util.Date;
import java.util.HashMap;

public class Kalender implements Beobachter 
{
	private Datumsauswahl datumsauswahl;
	private HashMap<Date, String> termine; //interner Zustand = Termine 
	
	public Kalender(Datumsauswahl datumsauswahl)
	{
		this.datumsauswahl = datumsauswahl;
		termine = new HashMap<Date, String>();
	}
	
	public void aktualisiere() 
	{
		Date aktuellesDatum = datumsauswahl.getAktuellesDatum();
		//Daten abrufen und darstellen
	}
}
