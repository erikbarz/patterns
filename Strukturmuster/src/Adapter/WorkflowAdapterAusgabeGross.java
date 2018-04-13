package Adapter;

public class WorkflowAdapterAusgabeGross extends WorkflowObjekt 
{
	private WorkflowObjektAusgabeGross instanz;

	public WorkflowAdapterAusgabeGross(String objektId, String ausgabeText) 
	{
		super(objektId);
		instanz = new WorkflowObjektAusgabeGross(ausgabeText);
	}
	
	@Override
	public WorkflowErgebnis ausfuehren()
	{
		WorkflowErgebnis ergebnis = getErgebnisObjekt();
		
		WorkflowErgebnisB ergebnisB = instanz.starten();
		if (ergebnisB.getErgebnis() > 0)
			ergebnis.setWarErfolgreich(true);
		else
		{
			ergebnis.setWarErfolgreich(false);
			ergebnis.setFehlermeldung("n/a");
		}
		if (ergebnis.isWarErfolgreich())
			return super.ausfuehren();
		else
			return ergebnis;
	}
}
