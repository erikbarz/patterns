package Singleton;

import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public final class Konfiguration 
{
	private HashMap<String, String> keyValuePaare;
	//private static Konfiguration instanz;
	private static Konfiguration instanz = new Konfiguration();
	
	private Konfiguration()
	{
		keyValuePaare = new HashMap<String, String>();
		//Lade die Konfiguration aus einer Datei
	}
	
	
	public static synchronized Konfiguration gibInstanz()
	{
		if (instanz == null)
		{
			synchronized (Konfiguration.class)
			{
				if (instanz == null)
					instanz = new Konfiguration();
			}
		}
		return instanz;
	}
	/*
	
	public static synchronized Konfiguration gibInstanz()
	{
		if (instanz == null)
			instanz = new Konfiguration();
		return instanz;
	}*/
	
	public HashMap<String, String> getWerte()
	{
		return keyValuePaare;
	}
	
	public String getWert(String key)
	{
		if (keyValuePaare.containsKey(key))
			return keyValuePaare.get(key);
		else
			return null;
	}
	
	public void setWert(String key, String value)
	{
		if (keyValuePaare.containsKey(key))
			keyValuePaare.replace(key, value);
		else
			keyValuePaare.put(key, value);
		schreibeKonfiguration();
		
	}
	
	private void schreibeKonfiguration()
	{
		//Konfiguration zurück auf Datenträger schreiben
	}
}
