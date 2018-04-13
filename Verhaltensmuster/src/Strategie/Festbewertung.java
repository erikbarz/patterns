package Strategie;

public class Festbewertung extends Bewertung 
{
	public float bewerte(Lager lager) 
	{
		return super.berechneAktuellenBestand(lager) * lager.getAktuellerPreis();
	}
}
