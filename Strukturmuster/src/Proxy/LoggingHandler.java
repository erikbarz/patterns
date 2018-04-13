package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandler implements InvocationHandler 
{
	private Object object;
	
	public LoggingHandler(Object object)
	{
		this.object = object;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable 
	{
		System.out.println("Starte Operation");
		Object result = method.invoke(this.object, args);
		System.out.println("Operation beendet");
		return result;
	}
}
