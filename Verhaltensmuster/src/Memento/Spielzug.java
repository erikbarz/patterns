package Memento;

import Memento.Spielfigur;

public abstract class Spielzug 
{
	private Spielfigur figur;
	protected Spielfeld spielfeld;
	
	public Spielzug(Spielfeld spielfeld, Spielfigur figur)
	{
		this.figur = figur;
		this.spielfeld = spielfeld;
	}
	
	public Spielfigur getFigur()
	{
		return figur;
	}
	
	public abstract void ausfuehren();
	public abstract void undo();
}
