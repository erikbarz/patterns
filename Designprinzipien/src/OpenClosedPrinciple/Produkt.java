package OpenClosedPrinciple;

public class Produkt 
{
	public float ErmittleMwstSatz(int produktArt)
	{
		switch(produktArt)
		{
			case 1:
			case 2:
			case 3:
			return 19;
			
			case 4:
			case 5:
				return 7;
				
			default:
				return -1;
		}
	}
}
