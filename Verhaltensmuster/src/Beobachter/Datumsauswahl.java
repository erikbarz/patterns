package Beobachter;

import java.util.Date;

public class Datumsauswahl extends Subjekt 
{
	private Date aktuellesDatum; 
	
	public void setAktuellesDatum(Date aktuellesDatum)
	{
		this.aktuellesDatum = aktuellesDatum;
		benachrichtige();
	}
	
	public Date getAktuellesDatum()
	{
		return aktuellesDatum;
	}
}
