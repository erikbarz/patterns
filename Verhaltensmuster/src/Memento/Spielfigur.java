package Memento;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import Memento.Position;

public abstract class Spielfigur 
{
	private boolean isComputer;
	private Position aktuellePosition;
	
	@Override
	public Spielfigur clone()
	{
		try 
		{
			Position posCopy = new Position();
			posCopy.x = aktuellePosition.x;
			posCopy.y = aktuellePosition.y;
			Constructor c = this.getClass().getConstructor(boolean.class, Position.class);
			Spielfigur spielfigur = (Spielfigur) c.newInstance(isComputer, posCopy);
			return spielfigur;
		} 
		catch (InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | 
				IllegalArgumentException | InvocationTargetException e) 
		{
			return null;
		}
	}
	
	public Spielfigur()
	{
		
	}
	
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
