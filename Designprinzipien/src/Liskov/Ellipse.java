package Liskov;

public class Ellipse 
{
	protected int breite;
	protected int laenge;
	
	public Ellipse()
	{
		this.breite = 0;
		this.laenge = 0;
	}
	
	public void aendereGroesse(int breite, int laenge)
	{
		if (breite < 0 || laenge < 0)
			throw new RuntimeException("Breite und Länge müsse größer als Null sein");
		this.breite = breite;
		this.laenge = laenge;
	}
}
