package MVC.Controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import MVC.Model.KompassModel;
import MVC.View.KompassView;

public class KompassController implements KompassControllerInterface
{
	private KompassModel kompassModel;
	private ArrayList<KompassView> views;
	
	public KompassController(KompassModel kompassModel)
	{
		this.kompassModel = kompassModel;
		views = new ArrayList<KompassView>();
	}
	
	public void addView(KompassView view)
	{
		views.add(view);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getActionCommand().equals("-5"))
		{
			kompassModel.setzeSteuerkurs(kompassModel.getSteuerkurs() - 5);
			informiereUeberKurskorrektur(-5);
		}
		if (e.getActionCommand().equals("+5"))
		{
			kompassModel.setzeSteuerkurs(kompassModel.getSteuerkurs() + 5);
			informiereUeberKurskorrektur(5);
		}
	}
	
	private void informiereUeberKurskorrektur(int kurskorrektur)
	{
		for(KompassView view : views)
			view.zeigeKurskorrektur(kurskorrektur);
	}
	
	public void initialisiereModell()
	{
		kompassModel.setzeKompasskurs(0);
		kompassModel.setzeSteuerkurs(0);
	}
}
