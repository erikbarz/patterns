package AbstrakteFabrik.Produkte;

public class ProbusTemperaturSensor extends TemperaturSensor 
{
	@Override
	public float holeTemperatur() 
	{
		//Mit Hardware kommunizieren, Wert abrufen und zurückgeben
		float temperatur = 24;
		setAktuelleTemperatur(temperatur);
		return 24;
	}
}
