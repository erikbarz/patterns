package Memento;

import Memento.Bewege;
import Memento.Position;
import Memento.Spielfeld;
import Memento.Spielfigur;

public class Schachspiel 
{
	Spielfeld spielfeld;
	
	public Schachspiel()
	{
		spielfeld = new Spielfeld();
	}
	
	public Spielfeld getSpielfeld()
	{
		return this.spielfeld;
	}
	
	public void SpielfigurGezogen(Spielfigur figur, Position neuePosition)
	{
		Bewege bewege = new Bewege(spielfeld, figur, neuePosition);
		spielfeld.queueSpielzug(bewege);
		spielfeld.spiele();
	}
	
	public void undo()
	{
		spielfeld.undo();
	}
}