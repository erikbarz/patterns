package Interceptor;

import java.util.Date;

public class BestellContext 
{
	private String bestelldaten;
	private Date dateTimeStamp;
	private boolean isVerschluesselt;

	public BestellContext(String bestelldaten, Date dateTimeStamp, boolean isVerschluesselt)
	{
		this.bestelldaten = bestelldaten;
		this.dateTimeStamp = dateTimeStamp;
		this.isVerschluesselt = isVerschluesselt;
	}
	
	public void setBestelldaten(String bestelldaten)
	{
		this.bestelldaten = bestelldaten;
	}
	public String getBestelldaten()
	{
		return bestelldaten;
	}
	
	public Date getDateTimeStamp()
	{
		return dateTimeStamp;
	}
	public boolean benoetigtEntschluesselung()
	{
		return isVerschluesselt;
	}
}
