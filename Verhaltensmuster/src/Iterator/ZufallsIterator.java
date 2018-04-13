package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

public class ZufallsIterator<E> implements Iterator<E> 
{
	private int aktuellePosition;
	private ArrayList<E> list;
	private ArrayList<E> zufallsReihenfolge;

	public ZufallsIterator(ArrayList<E> list)
	{
		this.list = list;
		start();
	}
	
	public void start() 
	{
		zufallsReihenfolge = new ArrayList<E>(list);
		Collections.shuffle(zufallsReihenfolge);
		aktuellePosition = -1;
	}

	public void weiter() 
	{
		if (!istFertig())
			aktuellePosition++;
	}

	@Override
	public boolean istFertig() 
	{
		return aktuellePosition >= (zufallsReihenfolge.size() - 1);
	}

	@Override
	public E aktuellesElement() 
	{
		if (aktuellePosition == -1)
			return null;
		return zufallsReihenfolge.get(aktuellePosition);
	}

	public void iteriere(Consumer<? super E> action) 
	{
		while (!istFertig())
		{
			weiter();
			action.accept(aktuellesElement());
		}
	}
}
