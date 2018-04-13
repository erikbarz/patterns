package Interpreter;

import java.util.ArrayList;

public class ZusammengesetzterAusdruck extends TestdatenAusdruck 
{
	private ArrayList<TestdatenAusdruck> ausdruecke;
	
	public ZusammengesetzterAusdruck()
	{
		ausdruecke = new ArrayList<TestdatenAusdruck>();
	}
	
	public void ausdruckHinzufuegen(TestdatenAusdruck ausdruck)
	{
		ausdruecke.add(ausdruck);
	}
	
	public ArrayList<TestdatenAusdruck> getAusdruecke()
	{
		return ausdruecke;
	}

	public String interpretiere(Kontext kontext) 
	{
		StringBuilder stringBuilder = new StringBuilder();
		for (TestdatenAusdruck ausdruck: ausdruecke)
		{
			stringBuilder.append(ausdruck.interpretiere(kontext));
		}
		return stringBuilder.toString();
	}
}
