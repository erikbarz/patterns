package Fabrikmethode;

import Fabrikmethode.Dokumentklassen.*;
import Fabrikmethode.Erzeugerklassen.*;


public class Application 
{
	public static void main( String[] args)
	{
		MyObject parameterlosesObjekt = MyObject.getFactory().create();
		MyObject objektMitParameter = MyObject.getFactory().create("einParameter");
		
		MyFactory factory = new MyFactory("eine Default-Eigenschaft");
		MyObject objektMitDefaultParameter = factory.create();
		
	}
}
