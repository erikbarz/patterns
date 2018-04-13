package Singleton;

import java.util.HashMap;

public enum EnumKonfiguration 
{
	INSTANCE;
	
	private HashMap<String, String> keyValuePaare;
	
	private EnumKonfiguration()
	{
		keyValuePaare = new HashMap<String, String>();
		//Lade die Konfiguration aus einer Datei
		System.out.println("Initialisiere");
	}
	
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
