package Besucher;

public class Spiel extends Element 
{
	public int Konsolentyp;
	public String lizenzschluessel;
	
	public Spiel(int anzahl, float preis, String titel) 
	{
		super(anzahl, preis, titel);
	}

	public void nimmEntgegen(Besucher besucher) 
	{
		besucher.besucheSpiel(this);
	}
}
