package Proxy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MailerProxy implements MailerInterface 
{
	private Mailer mailer;
	private ArrayList<String> log; 
	private ArrayList<MailAnfrage> mailQueue;
	
	public MailerProxy()
	{
		mailer = new Mailer();
		log = new ArrayList<String>();
		mailQueue = new ArrayList<MailAnfrage>();
	}
	
	public void sendMail(String empfaenger, String absender, String subject, String body) 
	{
		Calendar calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		
		if (hour < 7 || hour > 18)
		{
			MailAnfrage mailAnfrage = new MailAnfrage();
			mailAnfrage.empfaenger = empfaenger;
			mailAnfrage.absender = absender;
			mailAnfrage.subject = subject;
			mailAnfrage.body = body;
			mailQueue.add(mailAnfrage);
		}
		else
		{
			mailer.sendMail(empfaenger, absender, subject, body);
			log.add("... E-Mail versendet ...");
			if (mailQueue.size() > 0)
			{
				for(MailAnfrage mailAnfrage : mailQueue)
				{
					mailer.sendMail(mailAnfrage.empfaenger, mailAnfrage.absender, mailAnfrage.subject, mailAnfrage.body);
					log.add("... E-Mail versendet ...");
				}
				mailQueue.clear();
			}
		}
	}
}
