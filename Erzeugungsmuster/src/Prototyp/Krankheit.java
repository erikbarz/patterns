package Prototyp;

public class Krankheit extends DienstplanObjekt 
{

	@Override
	public DienstplanObjekt klone() 
	{
		return (Krankheit) super.clone();
	}
	
	//Weitere Methoden und Felder

}
