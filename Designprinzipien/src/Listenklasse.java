import java.util.ArrayList;


public class Listenklasse<T> 
{
	ArrayList<T> elemente;
	
	public Listenklasse()
	{
		elemente = new ArrayList<T>();
	}
	
	public void elementHinzufuegen(T element)
	{
		elemente.add(element);
	}
	
	public void elementHinzufuegen(int index, T element)
	{
		elemente.add(index, element);
	}
}
