package Interceptor;

public class EntschluesselungInterceptor extends Interceptor 
{
	public void handleEvent(BestellContext context)
	{
		if (context.benoetigtEntschluesselung())
		{
			System.out.println("Chiffre: "+context.getBestelldaten());
			String klartext = new StringBuffer(context.getBestelldaten()).reverse().toString();
			context.setBestelldaten(klartext);  
			System.out.println("Klartext: "+context.getBestelldaten());
		}
	}
}
