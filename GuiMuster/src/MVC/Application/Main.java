package MVC.Application;

import MVC.Controller.KompassController;
import MVC.Model.KompassModel;
import MVC.View.CommandlineView;
import MVC.View.SteuerkursView;

public class Main {

	public static void main(String[] args) 
	{
		KompassModel model = new KompassModel();
		KompassController controller = new KompassController(model);
		CommandlineView view1 = new CommandlineView(model, controller);
		SteuerkursView view2 = new SteuerkursView(model, controller);
		
		controller.initialisiereModell();
		
		model.setzeKompasskurs(175);
		
	}
}
