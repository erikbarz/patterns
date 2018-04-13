package Iterator;

public class MP3Player 
{
	public void spieleAlleTitelZufaellig()
	{
		Musikbibliothek<MP3> bibliothek = new Musikbibliothek<MP3>();
		
		bibliothek.getTitel().add
		(
				new MP3()
				{{
					Titel = "Ghost"; Artist = "Ella Henderson"; Album="Chapter One";
				}}
		);
		
		bibliothek.getTitel().add
		(
				new MP3()
				{{
					Titel = "When the Beat Drops Out"; Artist = "Marlon Roudette"; Album="Electric Soul";
				}}
		);

		bibliothek.getTitel().add
		(
				new MP3()
				{{
					Titel = "Auf uns"; Artist = "Andreas Bourani"; Album="Hey";
				}}
		);
		
		Iterator<MP3> iterator = bibliothek.erzeugeIterator();
		while(!iterator.istFertig())
		{
			iterator.weiter();
			bibliothek.play(iterator.aktuellesElement());
		}
	}
	
	public void SpieleAlleTitelZufaelligIntern()
	{
		Musikbibliothek<MP3> bibliothek = new Musikbibliothek<MP3>();
		
		bibliothek.getTitel().add
		(
				new MP3()
				{{
					Titel = "Ghost"; Artist = "Ella Henderson"; Album="Chapter One";
				}}
		);
		
		bibliothek.getTitel().add
		(
				new MP3()
				{{
					Titel = "When the Beat Drops Out"; Artist = "Marlon Roudette"; Album="Electric Soul";
				}}
		);

		bibliothek.getTitel().add
		(
				new MP3()
				{{
					Titel = "Auf uns"; Artist = "Andreas Bourani"; Album="Hey";
				}}
		);
		
		Iterator<MP3> iterator = bibliothek.erzeugeIterator();
		iterator.iteriere(mp3->bibliothek.play(mp3));
	}
}
