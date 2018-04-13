package Fabrikmethode.Erzeugerklassen;

import Fabrikmethode.Dokumentklassen.Dokument;

public abstract class Fakturierer 
{
	public abstract Dokument erzeugeDokument();
	
	public void fakturiereDokument()
	{
		Dokument dokument = erzeugeDokument();
		if (!dokument.isValid())
			throw new IllegalArgumentException("Das zu verarbeitende Dokument ist nicht g�ltig");
		
		//if (!IsValid(dokument))
		//	throw new IllegalArgumentException("Das zu verarbeitende Dokument ist nicht g�ltig");
	}
	
	public boolean isValid(Dokument dokument)
	{
		if (dokument.getBelegnummer() == 0)
			return false;
		return true;
	}
}
