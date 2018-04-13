package Fliegengewicht;

import java.util.HashMap;

public class SensorFabrik 
{
	private HashMap<String, Sensor> sensoren;
	
	public SensorFabrik()
	{
		sensoren = new HashMap<String, Sensor>();
	}
	
	public Sensor gibSensor(String id)
	{
		if (!sensoren.containsKey(id))
		{
			Sensor sensor = null;
			switch(id)
			{
				case "TE":
					sensor = new TemperaturSensor(1.012);
					break;
				case "TI":
					sensor = new TemperaturSensor(1.017);
					break;
				case "W":
					sensor = new WindgeschwindigkeitSensor(1.094);
					break;
				case "L":
					sensor = new LuftdruckSensor(0.9912);
				break;
			}
			if (sensor == null)
				throw new RuntimeException("Sensor-ID ist unbekannt");
			sensoren.put(id,  sensor);
		}
		return sensoren.get(id);
	}
}
