package Erbauer.LayoutManager;

import Erbauer.Widget;

public class FlowLayoutManager extends LayoutManager 
{
	@Override
	public void addWidget(Widget widget)
	{
		getHtmlPage().getWidgets().add(widget);
	}
	
	@Override
	public void render() 
	{
		getHtmlPage().setHtmlCode(renderHtmlFromWidgets());
	}
	
	private String renderHtmlFromWidgets()
	{
		return "HTML-Code f�r FlowLayout";
	}
}
