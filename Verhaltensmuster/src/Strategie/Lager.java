package Strategie;

import java.util.ArrayList;

public class Lager 
{
	private ArrayList<Bewegung> lagerbestand;
	private float aktuellerPreis;
	private Bewertung aktuelleBewertung;
	
	public Lager()
	{
		lagerbestand = new ArrayList<Bewegung>();
	}
	
	public void setBewertung(Bewertung bewertung)
	{
		aktuelleBewertung = bewertung;
	}
	
	public float bewerte()
	{
		if (aktuelleBewertung != null)
			return aktuelleBewertung.bewerte(this);
		else
			throw new RuntimeException("Keine Strategie ausgewählt");
	}
	
	public ArrayList<Bewegung> getLagerbestand()
	{
		return lagerbestand;
	}
	
	public float getAktuellerPreis()
	{
		return aktuellerPreis;
	}
	
	public void setAktuellerPreis(float aktuellerPreis)
	{
		this.aktuellerPreis = aktuellerPreis;
	}
}
