package Befehl;

public class Schachspiel 
{
	Spielfeld spielfeld;
	
	public Schachspiel()
	{
		spielfeld = new Spielfeld();
	}
	
	public void spielfigurGezogen(Spielfigur figur, Position neuePosition)
	{
		Bewege bewege = new Bewege(figur, neuePosition);
		spielfeld.QueueSpielzug(bewege);
		spielfeld.spiele();
	}
	
	public void undo()
	{
		spielfeld.undo();
	}
}
