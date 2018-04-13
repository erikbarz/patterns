package AbstrakteFabrik.Fabriken;

import AbstrakteFabrik.Produkte.JalousieAktor;
import AbstrakteFabrik.Produkte.TemperaturSensor;

public interface HeimautomationFabrikInterface 
{
	public TemperaturSensor ErzeugeTemperaturSensor();
	public JalousieAktor ErzeugeJalousieAktor();
}
