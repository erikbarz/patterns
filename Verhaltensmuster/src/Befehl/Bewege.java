package Befehl;

public class Bewege extends Spielzug 
{
	private Position neuePosition;
	private Position altePosition;

	public Bewege(Spielfigur figur, Position neuePosition) 
	{
		super(figur);
		this.neuePosition = neuePosition;
	}
	
	@Override
	public void ausfuehren() 
	{
		this.altePosition = getFigur().getAktuellePosition();
		System.out.println("Bewege gleich die Spielfigur. Alte Position: "+altePosition.x+"/"+altePosition.y);
		getFigur().bewege(neuePosition);
		System.out.println("Spielfigur bewegt. Neue Position: "+getFigur().getAktuellePosition().x+"/"+getFigur().getAktuellePosition().y);
	}

	@Override
	public void undo() 
	{
		System.out.println("Bewege gleich die Spielfigur zurück. Alte Position: "+getFigur().getAktuellePosition().x+"/"+getFigur().getAktuellePosition().y);
		getFigur().bewege(altePosition);
		System.out.println("Spielfigur zurück bewegt. Neue Position: "+getFigur().getAktuellePosition().x+"/"+getFigur().getAktuellePosition().y);
	}
}
