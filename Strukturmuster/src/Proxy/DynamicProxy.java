package Proxy;

import java.lang.reflect.Proxy;

public class DynamicProxy 
{
	public void Starte()
	{
		Mailer mailer = new Mailer();
		ClassLoader loader = mailer.getClass().getClassLoader();
		Class[] interfaces = new Class[] { MailerInterface.class };
		LoggingHandler loggingHandler = new LoggingHandler(mailer);
		
		MailerInterface mailerProxy = (MailerInterface) Proxy.newProxyInstance(loader, interfaces, loggingHandler);
		mailerProxy.sendMail("john@empfaenger.com", "alice@kalimba.com", "Betreff", "Nachricht");
	}
}
