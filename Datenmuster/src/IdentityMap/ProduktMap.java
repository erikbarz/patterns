package IdentityMap;

import java.util.HashMap;
import java.util.Map;

public class ProduktMap 
{
	private static Map<Integer, ProduktGateway> map = new HashMap<Integer, ProduktGateway>();
	
	public static ProduktGateway hole(int produktId)
	{
		return map.get(produktId);
	}
	
	public static void fuegeHinzu(ProduktGateway pg)
	{
		if (!map.containsKey(pg.getProduktId()))
			map.put(pg.getProduktId(), pg);
	}
	
	public static void ueberschreibe(ProduktGateway pg)
	{
		map.put(pg.getProduktId(), pg);
	}
	
	public static void loesche(ProduktGateway pg)
	{
		map.remove(pg.getProduktId());
	}
	
	public static void loesche(int produktId)
	{
		map.remove(produktId);
	}	
}
