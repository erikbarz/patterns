package Iterator;

import java.util.function.Consumer;

public interface Iterator<E> 
{
	void start();
	void weiter();
	boolean istFertig();
	E aktuellesElement();
	void iteriere(Consumer<? super E> action);
}
