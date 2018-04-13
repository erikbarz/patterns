package Interpreter;

public class Parser 
{
	public TestdatenAusdruck parse(String ausdruckString)
	{
		if (ausdruckString.length() == 0)
			throw new RuntimeException("Leerer Ausdruck");
		ZusammengesetzterAusdruck ausdruck = new ZusammengesetzterAusdruck();
		StringBuilder literal = new StringBuilder();
		for (int i=0; i<ausdruckString.length(); i++)
		{
			char c = ausdruckString.charAt(i);
			switch(c)
			{
				case '#':
					literalAusdruckHinzufuegen(literal, ausdruck);
					ausdruck.ausdruckHinzufuegen(new ZufallszahlAusdruck());
					break;
				case '<':
					literalAusdruckHinzufuegen(literal, ausdruck);
					String variable = delimitedString(ausdruckString.substring(i), '<', '>');
					ausdruck.ausdruckHinzufuegen(new VariableAusdruck(variable));
					i = i + variable.length()+1;
					continue;
				case '[':
					literalAusdruckHinzufuegen(literal, ausdruck);
					String wdhString = delimitedString(ausdruckString.substring(i), '[', ']');
					int kommaPosition = wdhString.indexOf(',');
					if (kommaPosition == -1)
						throw new RuntimeException("Kein Komma vorhanden, dass die Wiederholung vom Ausdruck trennt");
					int anzWiederholung = Integer.parseInt(wdhString.substring(0, kommaPosition));
					String ausdruckWiederholung = wdhString.substring(kommaPosition+1);
					ausdruck.ausdruckHinzufuegen(new WiederholungAusdruck(parse(ausdruckWiederholung),anzWiederholung));
					i = i + wdhString.length()+1;
					break;
				default:
					literal.append(c);
					break;
			}
		}
		literalAusdruckHinzufuegen(literal, ausdruck);
		if (ausdruck.getAusdruecke().size() == 0)
			return null;
		else if (ausdruck.getAusdruecke().size() == 1)
			return ausdruck.getAusdruecke().get(0);
		else
			return ausdruck;
	}
	
	private String delimitedString(String ausdruckString, char startDelimiter, char endDelimiter)
	{
		int delimiterCounter = 0;
		for (int i=1; i<ausdruckString.length(); i++)
		{
			if (ausdruckString.charAt(i) == startDelimiter)
			{
				delimiterCounter += 1;
				continue;
			}
			
			if (ausdruckString.charAt(i) == endDelimiter)
				if (delimiterCounter == 0)
					return ausdruckString.substring(1, i);
				else
					delimiterCounter = delimiterCounter - 1;
		}
		throw new RuntimeException("Kein schließendes Element");
	}
	
	private void literalAusdruckHinzufuegen(StringBuilder literal, ZusammengesetzterAusdruck ausdruck)
	{
		if (literal.length() > 0)
		{
			ausdruck.ausdruckHinzufuegen(new LiteralAusdruck(literal.toString()));
			literal.setLength(0);
		}
	}
}
