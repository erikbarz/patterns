package Memento;

import Memento.Position;
import Memento.Spielfigur;

public class Turm extends Spielfigur 
{
	public Turm(boolean isComputer, Position startPosition) 
	{
		super(isComputer, startPosition);
	}
	
	protected void validiereBewegung(Position neuePosition)
	{
		super.validiereBewegung(neuePosition);
		if (neuePosition.x != getAktuellePosition().x && neuePosition.y != getAktuellePosition().y)
			throw new RuntimeException("Der Turm darf nicht diagonal bewegt werden");
	}
}
