package AbstrakteFabrik.Produkte;

public class ProbusJalousieAktor extends JalousieAktor 
{
	@Override
	public void auf(float wert)
	{
		//Mit Hardware kommunizieren
		super.auf(wert);
	}
	
	@Override
	public void ab(float wert)
	{
		//Mit Hardware kommunizieren
		super.ab(wert);
	}
}
