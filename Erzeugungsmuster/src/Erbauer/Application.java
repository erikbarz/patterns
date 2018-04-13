package Erbauer;

import java.util.ArrayList;

import Erbauer.LayoutManager.*;

public class Application 
{
	public static void main( String[] args)
	{
		String widgetHtmlCode = "Widget HTML Code";
		ArrayList<Widget> widgets = new ArrayList<Widget>();
		for (int i=0; i<5; i++)
		{
			widgets.add(new Widget(widgetHtmlCode));
		}
		Layouter layouter = new Layouter(widgets);
		
		layouter.doLayout(new BorderLayoutManager());
		layouter.printLayoutedHtmlCode();
		
		layouter.doLayout(new BoxLayoutManager());
		layouter.printLayoutedHtmlCode();

		layouter.doLayout(new FlowLayoutManager());
		layouter.printLayoutedHtmlCode();
		
	}
}

