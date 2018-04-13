package Besucher;

public class Buch extends Element 
{
	public Buch(int anzahl, float preis, String titel) 
	{
		super(anzahl, preis, titel);
	}

	public String Isbn;
	public String Autor;
	public String Verlag;
	
	public void nimmEntgegen(Besucher besucher) 
	{
		besucher.besucheBuch(this);
	}
}
