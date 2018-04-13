package Befehl;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Spielfeld 
{
	private Queue<Spielzug> spielzuege;
	private Stack<Spielzug> undos;
	
	public Spielfeld()
	{
		spielzuege = new LinkedList<Spielzug>();
		undos = new  Stack<Spielzug>();
	}
	
	public void QueueSpielzug(Spielzug spielzug)
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
}
