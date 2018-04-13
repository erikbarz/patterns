package Fabrikmethode.Erzeugerklassen;

import Fabrikmethode.Dokumentklassen.*;

public class GutschriftFakturierer extends Fakturierer 
{
	@Override
	public Dokument erzeugeDokument()
	{
		return new Gutschrift();
	}
	
	@Override
	public boolean isValid(Dokument dokument)
	{
		return super.isValid(dokument) && ((Gutschrift)dokument).getGutschriftbetrag() > 0;
	}
}
