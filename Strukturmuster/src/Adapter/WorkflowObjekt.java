package Adapter;

import java.util.ArrayList;

public abstract class WorkflowObjekt 
{
	private ArrayList<WorkflowObjekt> workflowObjekte;
	private String objektId;
	
	public WorkflowObjekt(String objektId)
	{
		workflowObjekte = new ArrayList<WorkflowObjekt>();
		this.objektId = objektId;
	}
	
	public void addWorkflowObjekt(WorkflowObjekt workflowObjekt)
	{
		workflowObjekte.add(workflowObjekt);
	}
	
	protected WorkflowErgebnis getErgebnisObjekt()
	{
		WorkflowErgebnis ergebnis = new WorkflowErgebnis(objektId);
		return ergebnis;
	}
	
	public WorkflowErgebnis ausfuehren()
	{
		WorkflowErgebnis ergebnis = getErgebnisObjekt();
		for (WorkflowObjekt workflowObjekt: workflowObjekte)
		{
			try
			{
				WorkflowErgebnis ergebnisKindObjekt = workflowObjekt.ausfuehren();
				if (!ergebnisKindObjekt.isWarErfolgreich())
					return ergebnisKindObjekt;
			}
			catch(Exception e)
			{
				ergebnis.setWarErfolgreich(false);
				ergebnis.setFehlermeldung(e.getMessage());
				return ergebnis;
			}
		}
		ergebnis.setWarErfolgreich(true);
		return ergebnis;
	}
}
