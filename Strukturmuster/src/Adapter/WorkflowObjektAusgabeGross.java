package Adapter;

public class WorkflowObjektAusgabeGross 
{
	private String ausgabeText;
	
	public WorkflowObjektAusgabeGross(String ausgabeText)
	{
		this.ausgabeText = ausgabeText;
	}
	
	public WorkflowErgebnisB starten()
	{
		Integer i = 5;

		System.out.println(ausgabeText.toUpperCase());
		WorkflowErgebnisB ergebnis = new WorkflowErgebnisB();
		ergebnis.setErgebnis(1);
		return ergebnis;
	}
}
