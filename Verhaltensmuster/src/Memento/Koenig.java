package Memento;

import Memento.Position;
import Memento.Spielfigur;

public class Koenig extends Spielfigur 
{
	public Koenig(boolean isComputer, Position startPosition) 
	{
		super(isComputer, startPosition);
	}
	
	protected void validiereBewegung(Position neuePosition)
	{
		super.validiereBewegung(neuePosition);
		//Validierungen des Königs
	}	
}
