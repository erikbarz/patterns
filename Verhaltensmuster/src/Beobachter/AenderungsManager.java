package Beobachter;

public abstract class AenderungsManager 
{
	public abstract void meldeAn(Subjekt subjekt, Beobachter beobachter);
	public abstract void meldeAb(Subjekt subjekt, Beobachter beobachter);
	public abstract void benachrichtige();
}
