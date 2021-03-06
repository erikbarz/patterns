package Erbauer;

import java.util.ArrayList;

import Erbauer.LayoutManager.LayoutManager;

public class Layouter 
{
	private ArrayList<Widget> widgets;
	private HtmlPage htmlPage;
	
	public Layouter(ArrayList<Widget> widgets)
	{
		this.widgets = widgets;
	}
	
	public void doLayout(LayoutManager layoutManager)
	{
		for (Widget widget: widgets)
		{
			layoutManager.addWidget(widget);
		}
		layoutManager.render();
		htmlPage = layoutManager.getHtmlPage();
	}
	
	public void printLayoutedHtmlCode()
	{
		System.out.println("HTML: "+htmlPage.getHtmlCode());
	}
}
