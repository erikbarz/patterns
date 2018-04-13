package Dekorierer;

import java.util.Date;

public class KaufVertrag extends Vertrag 
{
	@Override
	public void freigeben() 
	{
		setFreigegeben(istGueltigIrgendeineLogik());
	}

	@Override
	public void kuendigen(Date kuendigungsDatum) 
	{
		if (kuendigungsDatum.after(getVertragsbeginn()))
			setVertragsende(kuendigungsDatum);
	}
	
	private boolean istGueltigIrgendeineLogik()
	{
		//Prüfe Vertrag nach verschiedenen Kriterien
		return true;
	}
}
