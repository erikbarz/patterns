package Besucher;

public abstract class Element 
{
	private int anzahl;
	private float preis;
	private String titel;
	
	public Element(int anzahl, float preis, String titel)
	{
		this.anzahl = anzahl;
		this.preis = preis;
		this.titel = titel;
	}
	
	public void aendereStueckzahl(int neueAnzahl)
	{
		anzahl = neueAnzahl;
	}
	
	public int getStueckzahl(){
		return anzahl;
	}
	public float getPreis(){
		return preis;
	}
	public String getTitel(){
		return titel;
	}
	
	public abstract void nimmEntgegen(Besucher besucher);
}
