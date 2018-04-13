package PessimisticLocking;

public class LockException extends Exception 
{
	public LockException(String text)
	{
		super(text);
	}
}
