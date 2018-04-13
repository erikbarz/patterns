package Iterator;

import java.util.ArrayList;

public class Musikbibliothek<E> implements Playlist<E> 
{
	ArrayList<E> titel;
	
	public Musikbibliothek()
	{
		titel = new ArrayList<E>();
	}
	
	public ArrayList<E> getTitel()
	{
		return titel;
	}
	
	public Iterator<E> erzeugeIterator() 
	{
		ZufallsIterator<E> iterator = new ZufallsIterator<E>(titel);
		return iterator;
	}
	
	public void play(E titel)
	{
		System.out.println("Spiele Titel: "+titel.toString());
		//Titel abspielen
	}
}
