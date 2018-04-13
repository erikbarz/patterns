package Prototyp;

import org.w3c.dom.*;

public class Urlaub extends DienstplanObjekt
{
	private boolean istBezahlt;
	
	private void setIstBezahlt(boolean istBezahlt)
	{
		this.istBezahlt = istBezahlt;
	}
	public boolean getIstBezahlt()
	{
		return istBezahlt;
	}
	
	@Override
	public Urlaub klone() 
	{
		return (Urlaub) super.clone();
	}

	public static Urlaub erzeugeVonXML(Element element) 
	{
		Urlaub urlaub = new Urlaub();
		String name = element.getAttribute("name");
		urlaub.setObjektName(name);
		urlaub.setDauer(Float.parseFloat(element.getChildNodes().item(0).getNodeValue()));
		urlaub.istBezahlt = Boolean.parseBoolean(element.getAttribute("bezahlt"));
		return urlaub;
	}
}
