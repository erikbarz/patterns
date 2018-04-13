package Befehl;

public abstract class Spielfigur 
{
	private boolean isComputer;
	private Position aktuellePosition;
	
	public Spielfigur(boolean isComputer, Position startPosition)
	{
		this.setComputer(isComputer);
		setAktuellePosition(startPosition);
	}
	
	public void bewege(Position neuePosition)
	{
		validiereBewegung(neuePosition);
		aktuellePosition = neuePosition;
	}
	
	protected void validiereBewegung(Position neuePosition)
	{
		if (neuePosition.x < 1 || neuePosition.x > 8)
			throw new RuntimeException("Die neue X-Positon muss zwischen 1 und 8 sein");
		if (neuePosition.y < 1 || neuePosition.y > 8)
			throw new RuntimeException("Die neue Y-Positon muss zwischen 1 und 8 sein");
	}

	public boolean isComputer() 
	{
		return isComputer;
	}
	public void setComputer(boolean isComputer) 
	{
		this.isComputer = isComputer;
	}

	public Position getAktuellePosition() 
	{
		return aktuellePosition;
	}
	public void setAktuellePosition(Position aktuellePosition) 
	{
		this.aktuellePosition = aktuellePosition;
	} 
}
