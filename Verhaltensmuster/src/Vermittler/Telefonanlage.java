package Vermittler;

public class Telefonanlage implements Switch 
{
	public void verbinde(Teilnehmer teilnehmer, Teilnehmer gegenstelle)
			throws SwitchException 
	{
		if (gegenstelle.istBelegt())
			throw new SwitchException("Der Teilnehmer: "+gegenstelle.getRufnummer()+" ist belegt");
		teilnehmer.verbinde(gegenstelle);
	}

	public void konferenz(Teilnehmer teilnehmer, Teilnehmer[] gegenstellen)
			throws SwitchException 
	{
		if (gegenstellen.length == 0 || gegenstellen.length > 4)
			throw new SwitchException("Konferenz nur zwischen 2 und 5 Teilnehmern möglich");
		for (int i=0; i<gegenstellen.length; i++)
		{
			if (gegenstellen[i].istBelegt())
				throw new SwitchException("Der Konferenzteilnehmer: "+gegenstellen[i].getRufnummer()+" ist belegt");
			teilnehmer.verbinde(gegenstellen[i]);
		}
	}

	public void trenne(Teilnehmer teilnehmer, Teilnehmer gegenstelle)
			throws SwitchException 
	{
		if (!teilnehmer.istBelegt())
			throw new SwitchException("Der Teilnehmer "+teilnehmer.getRufnummer()+" hat schon aufgelegt");
		else
			teilnehmer.auflegen();
		if (gegenstelle.istBelegt())
			gegenstelle.auflegen();
	}
}
