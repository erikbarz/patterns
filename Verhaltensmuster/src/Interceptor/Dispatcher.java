package Interceptor;

import java.util.ArrayList;

public class Dispatcher 
{
	private ArrayList<Interceptor> interceptors;
	
	public Dispatcher()
	{
		interceptors = new ArrayList<Interceptor>();
	}
	
	public void registriere(Interceptor interceptor)
	{
		if (!interceptors.contains(interceptor))
			interceptors.add(interceptor);
	}
	
	public void entferne(Interceptor interceptor)
	{
		if (interceptors.contains(interceptors))
			interceptors.remove(interceptor);
	}
	
	public void dispatch(BestellContext context)
	{
		for (Interceptor interceptor: interceptors)
		{
			interceptor.handleEvent(context);
		}
	}
}
