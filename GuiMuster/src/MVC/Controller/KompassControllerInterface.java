package MVC.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MVC.View.KompassView;


public interface KompassControllerInterface extends ActionListener
{
	//public void actionPerformed(ActionEvent e);
	public void addView(KompassView view);
}
