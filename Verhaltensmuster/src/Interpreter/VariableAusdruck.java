package Interpreter;

public class VariableAusdruck extends TestdatenAusdruck 
{
	private String variable;
	
	public VariableAusdruck(String variable)
	{
		this.variable = variable;
	}
	
	public String interpretiere(Kontext kontext) 
	{
		if (kontext.getVariablen().containsKey(variable))
			return kontext.getVariablen().get(variable);
		else
			return "ERROR";
	}
}
