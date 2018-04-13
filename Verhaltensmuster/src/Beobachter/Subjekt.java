package Beobachter;

import java.util.ArrayList;

public abstract class Subjekt 
{
	private ArrayList<Beobachter> beobachter;

	public Subjekt()
	{
		beobachter = new ArrayList<Beobachter>();
	}
	
	public void meldeAn(Beobachter b)
	{
		if (!beobachter.contains(b))
			beobachter.add(b);
	}
	
	public void meldeAb(Beobachter b)
	{
		if (beobachter.contains(b))
			beobachter.remove(b);
	}
	
	public void benachrichtige()
	{
		for (Beobachter b : beobachter)
			b.aktualisiere();
	}
}
