package Besucher;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Besucher 
{
	public abstract void besucheBuch(Buch buch);
	public abstract void besucheFilm(Film film);
	public abstract void besucheSpiel(Spiel spiel);
	public void besucheDefault(Object object)
	{
		System.out.println(object.toString());
	}
	
	public void besuche(Object object)
	{
		try
		{
			Method method = getClass().getMethod("besuche", new Class[] { object.getClass() });
			if (method == null) 
			{
				besucheDefault(object);
			} else 
			{
				method.invoke(this, new Object[] {object});
			}		
		}
		catch (NoSuchMethodException e)
		{
			this.besucheDefault(object);
		}
		catch (InvocationTargetException e)
		{
			this.besucheDefault(object);
		}   
		catch (IllegalAccessException e)
		{
			this.besucheDefault(object);
		} 		
	}	
}
