package Beobachter;

import java.util.Date;
import java.util.HashMap;

public class Aufgaben implements Beobachter 
{
	private Datumsauswahl datumsauswahl;
	private HashMap<Date, String> aufgaben; //interner Zustand = Aufgaben 
	
	public Aufgaben(Datumsauswahl datumsauswahl)
	{
		this.datumsauswahl = datumsauswahl;
	}
	
	public void aktualisiere() 
	{
		Date aktuellesDatum = datumsauswahl.getAktuellesDatum();
		//Daten abrufen und darstellen
	}
}
