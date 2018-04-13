package Interpreter;

public class LiteralAusdruck extends TestdatenAusdruck 
{
	private String literal;
	
	public LiteralAusdruck(String literal)
	{
		this.literal = literal;
	}
	
	public String interpretiere(Kontext kontext) 
	{
		return literal;
	}
}
