package MVC.View;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;

import MVC.Controller.KompassControllerInterface;
import MVC.Model.KompassModel;

public class SteuerkursView extends KompassView
{
	Label label;
	
	public SteuerkursView(KompassModel kompassModel, KompassControllerInterface controller) 
	{
		super(kompassModel, controller);
		
		Frame frame = new Frame("Kompass GUI");
		
		Button btnMinusFuenfGrad = new Button("-5 Grad");
		btnMinusFuenfGrad.addActionListener(controller);
		btnMinusFuenfGrad.setActionCommand("-5");
		frame.add("North", btnMinusFuenfGrad);
		
		label = new Label();
		label.setAlignment(Label.CENTER);
		frame.add("Center", label);
		
		Button btnPlusFuenfGrad = new Button("+5 Grad");
		btnPlusFuenfGrad.addActionListener(controller);
		btnPlusFuenfGrad.setActionCommand("+5");
		frame.add("South", btnPlusFuenfGrad);
		
		frame.addWindowListener(new CloseListener());
		frame.setSize(200,200);
		frame.setLocation(100,100);
		frame.setVisible(true);
	}

	public void update(Observable obs, Object obj) 
	{
		label.setText("Steuerkurs: "+getKompassModel().getSteuerkurs());
	}

	public void zeigeKurskorrektur(int kursKorrektur) 
	{
		//Tue nichts hier, die grafische Anzeige unterstützt diese Funktion nicht
	}
	
	public static class CloseListener extends WindowAdapter 
	{
		public void windowClosing(WindowEvent e) 
		{
			e.getWindow().setVisible(false);
			System.exit(0);
		} 
	} 	
}
