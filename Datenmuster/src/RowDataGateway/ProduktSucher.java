package RowDataGateway;

import java.util.ArrayList;

public class ProduktSucher 
{
	public static ProduktGateway hole(int id)
	{
		ProduktGateway g = new ProduktGateway();
		//SELECT feldliste FROM produkt WHERE ProduktId=?
		//Parameter setzen auf id
		//SQL ausf�hren und Felder auf Objekt mappen
		return g;
	}
	
	public static ArrayList<ProduktGateway> suche(String text)
	{
		ArrayList<ProduktGateway> gws = new ArrayList<ProduktGateway>();
		//SELECT feldliste FROM produkt WHERE Produkt like '%?%'
		//Parameter setzen auf text, besser allerdings. Volltextsuche verwenden
		//Resultset Zeile f�r Zeile durchgehen und ProduktGateways daraus bauen und der Liste hinzuf�gen
		//Siehe Methode getProduktFromResultSet des TableDataGateway-Musters
		return gws;
	}
}
