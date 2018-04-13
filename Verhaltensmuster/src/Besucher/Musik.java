package Besucher;

public class Musik extends Element 
{

	public Musik(int anzahl, float preis, String titel) 
	{
		super(anzahl, preis, titel);
	}

	public void nimmEntgegen(Besucher besucher) 
	{
		besucher.besuche(this);
	}
}
