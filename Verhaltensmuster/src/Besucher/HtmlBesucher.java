package Besucher;

public class HtmlBesucher extends Besucher 
{
	private String html;
	
	public String getHtml()
	{
		return html;
	}

	public void besucheBuch(Buch buch) 
	{
		html = "<b>"+buch.getTitel()+"</b> Autor: "+buch.Autor;
	}

	public void besucheFilm(Film film) 
	{
		html = "<b>"+film.getTitel()+"</b> Regisseur: "+film.Regisseur;
	}

	public void besucheSpiel(Spiel spiel) 
	{
		html = "<b>"+spiel.getTitel()+"</b> Lizenzschlüssel: "+spiel.lizenzschluessel;
	}
}
