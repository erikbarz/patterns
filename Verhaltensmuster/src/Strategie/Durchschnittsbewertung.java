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
			if (bewegung.Menge > 0) //Nur Zugänge, keine Abgänge
			{
				wert += bewegung.Menge * bewegung.Preis;
				gesamtmenge += bewegung.Menge;
			}
		}
		return aktuellerBestand * (wert / gesamtmenge);
	}
}
