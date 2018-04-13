package Fliegengewicht;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MessStation 
{
	public void ladeMesswerteVonCSV(String csvDateiname)
	{
		try
		{		
			BufferedReader br = new BufferedReader(new FileReader(csvDateiname));
			String line = "";
			SensorFabrik sensorFabrik = new SensorFabrik();
			while((line = br.readLine()) != null)
			{
				String[] messwertEintrag = line.split(";");
				Sensor sensor = sensorFabrik.gibSensor(messwertEintrag[0]);
				sensor.schreibe(Double.parseDouble(messwertEintrag[1]));
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
