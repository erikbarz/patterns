package TableDataGateway;

public class Produkt 
{
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
}
