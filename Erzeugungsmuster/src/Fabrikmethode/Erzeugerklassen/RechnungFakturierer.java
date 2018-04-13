package Fabrikmethode.Erzeugerklassen;

import Fabrikmethode.Dokumentklassen.*;

public class RechnungFakturierer extends Fakturierer
{

	@Override
	public Dokument erzeugeDokument() 
	{
		return new Rechnung();
	}
	
	public Rechnung erzeugeRechnung(Rechnungstyp rechnungstyp)
	{
		switch (rechnungstyp)
		{
			case NACHNAHMERECHNUNG:
				return new Nachnahmerechnung();
				
			case TEILZAHLUNGSRECHNUNG:
				return new Teilzahlungsrechnung();
				
			case VORAUSRECHNUNG:
				return new Vorausrechnung();
				
			default:
				return new Rechnung();
		}
	}
}
