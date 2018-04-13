package Interpreter;

public class WiederholungAusdruck extends TestdatenAusdruck 
{
	TestdatenAusdruck ausdruck;
	int anzWiederholung;
	
	public WiederholungAusdruck(TestdatenAusdruck ausdruck, int anzWiederholung)
	{
		this.ausdruck = ausdruck;
		this.anzWiederholung = anzWiederholung;
	}
	
	public String interpretiere(Kontext kontext) 
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (int i= 0; i<anzWiederholung; i++)
		{
			stringBuilder.append(ausdruck.interpretiere(kontext));
		}
		return stringBuilder.toString();
	}
}
