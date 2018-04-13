package start;

import java.io.Console;

import Befehl.*;

public class Application 
{
	public static void main( String[] args)
	{
		Schachspiel schachspiel = new Schachspiel();
		Turm turm = new Turm(false, new Position(){{
		x = 1;
		y = 1;
		}});
		schachspiel.spielfigurGezogen(turm, new Position()
		{{
		x = 4;
		y = 1;
		}});
		schachspiel.spielfigurGezogen(turm, new Position()
		{{
		x = 6;
		y = 1;
	    }});
		
		schachspiel.undo();
		schachspiel.undo();
	}
	
}
 
