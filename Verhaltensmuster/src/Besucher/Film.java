package Besucher;

public class Film extends Element 
{
	public Film(int anzahl, float preis, String titel) 
	{
		super(anzahl, preis, titel);
	}

	public int Laenge;
	public boolean IstHd;
	public String Regisseur;
	
	public void nimmEntgegen(Besucher besucher) 
	{
		besucher.besucheFilm(this);
	}
}
