package Fassade;

public class SnailMailSendungsverfolgung 
{
	private SnailMailSendungsverfolgung()
	{
		throw new AssertionError();
	}
	
	public static SnailMailEnum verfolge(int lieferNummer)
	{
		if (lieferNummer<100000)
			return SnailMailEnum.Undefiniert;
		//Abrufen
		return SnailMailEnum.Zugestellt;
	}
}
