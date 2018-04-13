package Memento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Memento.Spielzug;

public class Spielfeld 
{
	private Queue<Spielzug> spielzuege;
	private Stack<Spielzug> undos;
	private ArrayList<Spielfigur> spielfiguren;

	public Spielfeld()
	{
		spielzuege = new LinkedList<Spielzug>();
		undos = new  Stack<Spielzug>();
		spielfiguren = new ArrayList<Spielfigur>();
	}
	
	public ArrayList<Spielfigur> getSpielfiguren()
	{
		return spielfiguren;
	}
	
	public void queueSpielzug(Spielzug spielzug)
	{
		spielzuege.add(spielzug);
	}
	
	public void spiele()
	{
		System.out.println("Spiele "+spielzuege.size()+" Spielzüge");
		while (!spielzuege.isEmpty())
		{
			Spielzug spielzug = spielzuege.poll();
			spielzug.ausfuehren();
			undos.push(spielzug);
		}
		System.out.println("Spielzüge gespielt");
	}
	
	public void undo()
	{
		if (!undos.isEmpty())
		{
			Spielzug spielzug = undos.pop();
			spielzug.undo();
			System.out.println("Undo ausgeführt");
		}
	}
	
	public Stellung speichereStellung()
	{
		Stellung stellung = new Stellung(spielfiguren);
		return stellung;
	}
	
	public void stellungWiederherstellen(StellungInterface vorherigeStellung)
	{
		if (vorherigeStellung instanceof Stellung )
			spielfiguren = ((Stellung)vorherigeStellung).gibStellung();
	}
	
	private class Stellung implements StellungInterface
	{
		private ArrayList<Spielfigur> spielfiguren;
		
		private Stellung(ArrayList<Spielfigur> stellungFiguren)
		{
			spielfiguren = new ArrayList<Spielfigur>();
			for(Spielfigur figur: stellungFiguren)
				spielfiguren.add(figur.clone());
		}
		
		private ArrayList<Spielfigur> gibStellung()
		{
			return spielfiguren;
		}
	}
}
