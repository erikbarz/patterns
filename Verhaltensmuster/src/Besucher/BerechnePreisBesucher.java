package Besucher;

public class BerechnePreisBesucher extends Besucher 
{
	private float preis;
	
	public BerechnePreisBesucher()
	{
		preis = 0;
	}
	
	public float getPreis()
	{
		return preis;
	}
	
	public void besucheBuch(Buch buch) 
	{
		preis += buch.getPreis() * buch.getStueckzahl();
	}

	public void besucheFilm(Film film) 
	{
		preis += film.getPreis() * film.getStueckzahl();
	}

	public void besucheSpiel(Spiel spiel) 
	{
		preis += spiel.getPreis() * spiel.getStueckzahl();
	}
	
	public void besuche(Musik musik)
	{
		System.out.println("Besucht");
	}
}
