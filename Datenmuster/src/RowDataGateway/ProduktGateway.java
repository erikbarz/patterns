package RowDataGateway;

import java.sql.SQLException;

public class ProduktGateway 
{
	private boolean isDeleted = false;
	
	private int produktId;
	private String produkt;
	private int lagerNo;
	private float preis;
	private String beschreibung;
	public int getProduktId() {
		return produktId;
	}
	public void setProduktId(int produktId) {
		this.produktId = produktId;
	}
	public String getProdukt() {
		return produkt;
	}
	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}
	public int getLagerNo() {
		return lagerNo;
	}
	public void setLagerNo(int lagerNo) {
		this.lagerNo = lagerNo;
	}
	public float getPreis() {
		return preis;
	}
	public void setPreis(float preis) {
		this.preis = preis;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	public static ProduktGateway hinzufuegen(String produkt, int lagerNo, float preis, String beschreibung)
	{
		//INSERT INTO produkt ... ausführen
		//produktId abholen, wenn sie über ein Autoinkrement-Feld erzeugt wurde
		int produktId=1;
		//Gateway erzeugen. Alternativ: Den Finder benutzen um den Datensatz zu lesen
		ProduktGateway g = new ProduktGateway();
		g.setProdukt(produkt);
		g.setLagerNo(lagerNo);
		g.setPreis(preis);
		g.setBeschreibung(beschreibung);
		g.setProduktId(produktId);
		return g;
	}
	
	public void loeschen() throws SQLException
	{
		if (isDeleted)
			throw new SQLException("Der Datensatz ist schon gelöscht und kann nicht erneut gelöscht werden");
		//DELETE FROM produkt WHERE ProduktId=getProduktId()
		isDeleted = true;
	}
	
	public void aktualisieren() throws SQLException
	{
		if (isDeleted)
			throw new SQLException("Der Datensatz ist schon gelöscht und kann nicht mehr verändert werden");
		//UPDATE produkt set Produkt=?, LagerNo=?, Preis=?, Beschreibung=? WHERE ProduktId=?
		//Parameter aus aktuellem Datensatz setzen und Befehl ausführen
	}
}
