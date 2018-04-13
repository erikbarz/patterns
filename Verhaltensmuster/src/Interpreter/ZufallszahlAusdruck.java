package Interpreter;

public class ZufallszahlAusdruck extends TestdatenAusdruck 
{
	public String interpretiere(Kontext kontext) 
	{
		int zufallszahl = (int) (Math.random() * 10);
		return Integer.toString(zufallszahl);
	}
}
