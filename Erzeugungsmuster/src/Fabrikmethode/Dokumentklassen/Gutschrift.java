package Fabrikmethode.Dokumentklassen;

public class Gutschrift extends Dokument 
{
	private float gutschriftbetrag;

	public float getGutschriftbetrag() {
		return gutschriftbetrag;
	}


	public void setGutschriftbetrag(float gutschriftbetrag) {
		this.gutschriftbetrag = gutschriftbetrag;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid() && (gutschriftbetrag > 0);
	}
}
