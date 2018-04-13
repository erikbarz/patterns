package Zustand;

public enum Zustand 
{
	Eingegangen(new Eingegangen()),
	Unvollstaendig(new Unvollstaendig()),
	Interviewt(new Interviewt()),
	Abgesagt(new Abgesagt()),
	Eingestellt(new Eingestellt()),
	Talentpool(new Talentpool()),
	Eingeladen(new Eingeladen());

	private ZustandInterface zustandsObjekt;
	
	Zustand(ZustandInterface zustandsObjekt)
	{
		this.zustandsObjekt = zustandsObjekt;
	}
	
	public ZustandInterface objekt()
	{
		return zustandsObjekt;
	}
}
