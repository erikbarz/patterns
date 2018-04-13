package Proxy;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

public class Mailer implements MailerInterface 
{
	public void sendMail(String empfaenger, String absender, String subject, String body) 
	{
		String host = "localhost";
		
		Properties properties = System.getProperties();
		properties.setProperty("mail.smtp.host", host);
		
		Session session = Session.getDefaultInstance(properties);
		try
		{
			MimeMessage message = new MimeMessage(session); 
			message.setFrom(new InternetAddress(absender));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(empfaenger));
			message.setSubject(subject);
			message.setText(body);
			Transport.send(message);
		}
		catch(MessagingException e)
		{
			e.printStackTrace();
		}
	}
}
