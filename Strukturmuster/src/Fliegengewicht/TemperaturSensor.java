package Fliegengewicht;

public class TemperaturSensor extends Sensor 
{
	public TemperaturSensor(double kalibrierFaktor) 
	{
		super(kalibrierFaktor);
	}
	
	protected double rechneUm(double messwert)
	{
		return messwert - 273.15;
	}
}
