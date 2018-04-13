package Adapter;

import java.util.ArrayList;

public class WorkflowEngine 
{
	ArrayList<WorkflowObjekt> workflowObjekte;
	
	public WorkflowEngine()
	{
		workflowObjekte = new ArrayList<WorkflowObjekt>();
	}
	
	public void addWorkflowObjekt(WorkflowObjekt workflowObjekt)
	{
		workflowObjekte.add(workflowObjekt);
	}
	
	public WorkflowErgebnis alleWorkflowsAusfuehren()
	{
		for (WorkflowObjekt workflowObjekt: workflowObjekte)
		{
			WorkflowErgebnis ergebnis = workflowObjekt.ausfuehren();
			if (!ergebnis.isWarErfolgreich())
				return ergebnis;
		}
		WorkflowErgebnis gesamtErgebnis = new WorkflowErgebnis("engine");
		gesamtErgebnis.setWarErfolgreich(true);
		return gesamtErgebnis;
	}
}
