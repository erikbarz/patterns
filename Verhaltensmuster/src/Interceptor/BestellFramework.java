package Interceptor;

import java.util.Date;

public class BestellFramework 
{
	Dispatcher dispatcher;
	
	public BestellFramework()
	{
		dispatcher = new Dispatcher();
	}
	
	public void bestellEvent(String bestelldaten, boolean isVerschluesselt)
	{
		BestellContext context = new BestellContext(bestelldaten, new Date(), isVerschluesselt);
		dispatcher.dispatch(context);
	}
	
	public Dispatcher getDispatcher()
	{
		return dispatcher;
	}
}
