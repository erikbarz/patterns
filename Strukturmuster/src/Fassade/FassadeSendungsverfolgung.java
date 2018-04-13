package Fassade;

public class FassadeSendungsverfolgung 
{
	public static FassadeEnum verfolge(String sendungsNummer)
	{
		int length = sendungsNummer.length();
		
		switch(length)
		{
			case 6: //SnailMail
				SnailMailEnum snailMailStatus = SnailMailSendungsverfolgung.verfolge(Integer.parseInt(sendungsNummer));
				return snailMailStatus2FassadeStatus(snailMailStatus);
				
			case 9: //LieferFix
				try
				{
					LieferFixEnum lieferFixEnum = new LieferFixSendungsverfolgung().pruefeSendestatus(sendungsNummer);
					return lieferFixStatus2FassadeStatus(lieferFixEnum);
				}
				catch(RuntimeException e)
				{
					return FassadeEnum.Undefiniert;
				}
				
			default:
				return FassadeEnum.Undefiniert;
		}
	}
	
	private static FassadeEnum lieferFixStatus2FassadeStatus(LieferFixEnum lieferFixStatus)
	{
		//Umsetzung hier
		return FassadeEnum.Erhalten;
	}
	
	private static FassadeEnum snailMailStatus2FassadeStatus(SnailMailEnum snailMailStatus)
	{
		//Umsetzung hier
		return FassadeEnum.Verpackt;
	}
}
