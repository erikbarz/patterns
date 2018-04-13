package Liskov;

public class Kreis extends Ellipse
{
	public Kreis()
	{
		super();
	}
	
	public void aendereGroesse(int breite, int laenge)
	{
		if (breite != laenge)
			throw new RuntimeException("Die Breite muss der Länge entsprechen");
		super.aendereGroesse(breite, laenge);
	}
}
