import IdentityMap.*;


public class Application {

	public static void main(String[] args) 
	{
		ProduktGateway pg = new ProduktGateway();
		pg.setProduktId(100);
		ProduktMap.fuegeHinzu(pg);
		ProduktGateway result = ProduktMap.hole(100);
	}

}
