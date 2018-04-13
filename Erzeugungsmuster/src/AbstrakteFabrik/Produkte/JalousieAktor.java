package AbstrakteFabrik.Produkte;

public abstract class JalousieAktor 
{
	private float aktuelleStellung;
	
	public float getAktuelleStellung()
	{
		return aktuelleStellung;
	}
	
	public void auf(float wert)
	{
		float zielWert = aktuelleStellung - wert;
		if (aktuelleStellung < 0)
			aktuelleStellung = 0;
		//interne Methode aufrufen
	}
	
	public void ab(float wert)
	{
		float zielWert = aktuelleStellung + wert;
		if (aktuelleStellung > 100)
			aktuelleStellung = 100;
		//Interne Methode aufrufen
	}
}
