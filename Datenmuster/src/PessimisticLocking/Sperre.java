package PessimisticLocking;

public class Sperre 
{
	private String ressource;
	private String inhaber;
	private Long zeit;
	private long ablauf = -1;
	
	public Sperre(String ressource, String inhaber)
	{
		this.ressource = ressource;
		this.inhaber = inhaber;
		zeit = System.currentTimeMillis();
	}
	
	public Sperre(String ressource, String inhaber, long ablauf)
	{
		this(ressource, inhaber);
		this.ablauf = ablauf;
	}

	public String getRessource() 
	{
		return ressource;
	}

	public String getInhaber() 
	{
		return inhaber;
	}
	
	public boolean istInhaber(String inhaber)
	{
		return (inhaber.equals(inhaber));
	}
	
	public boolean istAbgelaufen()
	{
		if (ablauf == -1)
			return false;
		else
			return ((zeit + ablauf) > System.currentTimeMillis());
	}
}
