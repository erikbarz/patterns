package Erbauer;

import java.util.ArrayList;

public class HtmlPage 
{
	private ArrayList<Widget> widgets = new ArrayList<Widget>();
	
	private String htmlCode;
	
	public ArrayList<Widget> getWidgets()
	{
		return widgets;
	}

	public String getHtmlCode() 
	{
		return htmlCode;
	}
	
	public void setHtmlCode(String htmlCode) 
	{
		this.htmlCode = htmlCode;
	}
}
