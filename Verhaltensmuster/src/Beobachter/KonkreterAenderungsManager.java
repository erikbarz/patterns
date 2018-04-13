package Beobachter;

import java.util.ArrayList;
import java.util.HashMap;

public class KonkreterAenderungsManager extends AenderungsManager 
{
	private HashMap<Subjekt,ArrayList<Beobachter>> anmeldungen; 
	
	public KonkreterAenderungsManager()
	{
		anmeldungen = new HashMap<Subjekt,ArrayList<Beobachter>>();
	}

	public void meldeAn(Subjekt subjekt, Beobachter beobachter) 
	{
		if (!anmeldungen.containsKey(subjekt))
			anmeldungen.put(subjekt, new ArrayList<Beobachter>());
		
		ArrayList<Beobachter> beobachterListe = anmeldungen.get(subjekt);
		if (!beobachterListe.contains(beobachter))
			beobachterListe.add(beobachter);
	}

	public void meldeAb(Subjekt subjekt, Beobachter beobachter) 
	{
		if (anmeldungen.containsKey(subjekt))
		{
			ArrayList<Beobachter> beobachterListe = anmeldungen.get(subjekt);
			if (beobachterListe.contains(beobachter))
				beobachterListe.remove(beobachter);
		}
	}

	public void benachrichtige() 
	{
		//Je nach Benachrichtigungslogik
	}
}
