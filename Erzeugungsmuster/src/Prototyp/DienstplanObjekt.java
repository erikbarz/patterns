package Prototyp;

import org.w3c.dom.*;

public abstract class DienstplanObjekt implements Cloneable 
{
	private String objektName;
	private float dauer;
	
	public String getObjektName()
	{
		return objektName;
	}
	protected void setObjektName(String objektName)
	{
		this.objektName = objektName;
	}
	
	public float getDauer()
	{
		return dauer;
	}
	protected void setDauer(float dauer)
	{
		this.dauer = dauer;
	}
	
	public Object clone() 
	{
		Object clone = null;
		try 
		{
			clone = super.clone();
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
		return clone;
	}
	
	public abstract DienstplanObjekt klone();
}
