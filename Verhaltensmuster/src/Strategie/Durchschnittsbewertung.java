package Strategie;

public class Durchschnittsbewertung extends Bewertung 
{
	public float bewerte(Lager lager) 
	{
		float aktuellerBestand = super.berechneAktuellenBestand(lager);
		float wert = 0;
		int gesamtmenge = 0;
		
		for(Bewegung bewegung : lager.getLagerbestand())
		{
			if (bewegung.Menge > 0) //Nur Zug�nge, keine Abg�nge
			{
				wert += bewegung.Menge * bewegung.Preis;
				gesamtmenge += bewegung.Menge;
			}
		}
		return aktuellerBestand * (wert / gesamtmenge);
	}
}
