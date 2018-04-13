package Interpreter;

import java.util.HashMap;

public class Kontext 
{
	private HashMap<String, String> variablen;
	
	public Kontext()
	{
		variablen = new HashMap<String, String>();
	}
	
	public HashMap<String, String> getVariablen()
	{
		return variablen;
	}
}
