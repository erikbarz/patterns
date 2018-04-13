package Zustand;

public class Bewerbung 
{
	private Zustand zustand;
	
	public Bewerbung()
	{
		zustand = Zustand.Eingegangen;
	}
	
	public Zustand getZustand()
	{
		return zustand;
	}
	
	public void setZustand(Zustand neuerZustand)
	{
		if (neuerZustand != zustand)
		{
			if (!istZustandErlaubt(neuerZustand))
				System.out.println("Diese Zustandsänderung ist nicht erlaubt");
			else
				zustand = neuerZustand;
		}
	}
	
	private boolean istZustandErlaubt(Zustand neuerZustand)
	{
		switch(zustand)
		{
			case Eingegangen: return neuerZustand == Zustand.Unvollstaendig || neuerZustand == Zustand.Interviewt;
			case Unvollstaendig: return neuerZustand == Zustand.Abgesagt || neuerZustand == Zustand.Eingegangen;
			case Interviewt: return neuerZustand == Zustand.Abgesagt || neuerZustand == Zustand.Eingeladen;
			case Abgesagt: return false;
			case Eingeladen: return neuerZustand == Zustand.Talentpool || neuerZustand == Zustand.Eingestellt || neuerZustand == Zustand.Abgesagt;
			case Talentpool: return false;
			case Eingestellt: return false;
		}
		return false;
	}
	
	public void Benachrichtige()
	{
		zustand.objekt().benachrichtige();
	}
	
	public void Verarbeite()
	{
		zustand.objekt().verarbeite();
	}
}
