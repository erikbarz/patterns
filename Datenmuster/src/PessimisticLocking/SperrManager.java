package PessimisticLocking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SperrManager 
{
	private final long STANDARD_ABLAUF = 600000;
	private final Map<String, Sperre> sperren = new HashMap<String, Sperre>();
	
	
	public Sperre erteileSperre(String ressource, String inhaber) throws LockException
	{
		return erteileSperre(ressource, inhaber, STANDARD_ABLAUF);
	}
	
	public Sperre erteileSperre(String ressource, String inhaber, long ablauf) throws LockException
	{
		synchronized(sperren)
		{
			Sperre sperre = sperren.get(ressource);
			if (sperre != null && !sperre.istAbgelaufen())
			{
				if (sperre.istInhaber(inhaber))
					return sperre;
				else
					throw new LockException("Ein anderer Anwender hat eine gültige Sperre");
			}
			else
			{
				//Sperre war nicht vorhanden oder ist schon abgelaufen
				sperre = new Sperre(ressource, inhaber, ablauf);
				sperren.put(ressource,  sperre);
				return sperre;
			}
		}
	}
	
	public Sperre entsperre(String ressource, String inhaber) throws LockException
	{
		synchronized(sperren)
		{
			Sperre sperre = sperren.get(ressource);
			if (sperre != null && sperre.istInhaber(inhaber))
				return sperren.remove(ressource);
			else
				throw new LockException("Es gibt keine Sperre für diese Ressourcen und diesen Inhaber");
		}
	}
	
	public Sperre entsperre(String ressource) throws LockException
	{
		synchronized(sperren)
		{
			Sperre sperre = sperren.get(ressource);
			if (sperre != null)
				return sperren.remove(ressource);
			else
				throw new LockException("Es gibt keine Sperre für diese Ressourcen");
		}
	}
	
	public void entferneAbgelaufeneSperren()
	{
		synchronized(sperren)
			{
			Iterator<String> iter = sperren.keySet().iterator();
			while(iter.hasNext())
			{
				String ressource = iter.next();
				Sperre sperre = sperren.get(ressource);
				if (sperre.istAbgelaufen())
					iter.remove();
			}
		}
	}	
}
