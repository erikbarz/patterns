package Fassade;

public class LieferFixSendungsverfolgung 
{
	public LieferFixEnum pruefeSendestatus(String sendungsNummer)
	{
		if (sendungsNummer.length() != 9)
			throw new RuntimeException("Die Sendungsnummer ist falsch");
		//Auslesen aus Datenbank
		return LieferFixEnum.InZustellzentrum;
	}
}
