package Memento;

import Memento.Position;
import Memento.Spielfigur;
import Memento.Spielzug;

public class Bewege extends Spielzug 
{
	private Position neuePosition;
	private StellungInterface vorherigeStellung;

	public Bewege(Spielfeld spielfeld, Spielfigur figur, Position neuePosition) 
	{
		super(spielfeld, figur);
		this.neuePosition = neuePosition;
	}
	
	@Override
	public void ausfuehren() 
	{
		vorherigeStellung = spielfeld.speichereStellung();
		getFigur().bewege(neuePosition);
		//Hier müsste geprüft werden, ob eine Spielfigur geschlagen wurde
		//Und das Spielfeld müsste die Figur dann aus ihrer Liste der Spielfiguren entfernen
	}

	@Override
	public void undo() 
	{
		spielfeld.stellungWiederherstellen(vorherigeStellung);
	}
}
