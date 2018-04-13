package Besucher;

public class TextBesucher extends Besucher 
{
	private String text;
	
	public String getText()
	{
		return text;
	}

	public void besucheBuch(Buch buch) 
	{
		text = buch.getTitel()+" Autor: "+buch.Autor;
	}

	public void besucheFilm(Film film) 
	{
		text = film.getTitel()+" Regisseur: "+film.Regisseur;
	}

	public void besucheSpiel(Spiel spiel) 
	{
		text = spiel.getTitel()+" Lizenzschlüssel: "+spiel.lizenzschluessel;
	}
}