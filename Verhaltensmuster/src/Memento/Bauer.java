package Memento;

import Memento.Position;
import Memento.Spielfigur;

public class Bauer extends Spielfigur 
{

	public Bauer(boolean isComputer, Position startPosition) 
	{
		super(isComputer, startPosition);
	}
	protected void validiereBewegung(Position neuePosition)
	{
		super.validiereBewegung(neuePosition);
		//Validierungen f�r das Bewegen des Bauers
	}	

}
