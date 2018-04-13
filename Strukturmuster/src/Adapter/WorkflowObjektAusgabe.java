package Adapter;

public class WorkflowObjektAusgabe extends WorkflowObjekt 
{
	private String ausgabeText;

	public WorkflowObjektAusgabe(String objektId, String ausgabeText) 
	{
		super(objektId);
		this.ausgabeText = ausgabeText;
	}
	
	@Override
	public WorkflowErgebnis ausfuehren()
	{
		WorkflowErgebnis ergebnis = getErgebnisObjekt();
		try
		{
			System.out.println(ausgabeText);
			return super.ausfuehren();
		}
		catch(Exception e)
		{
			ergebnis.setWarErfolgreich(false);
			ergebnis.setFehlermeldung(e.getMessage());
			return ergebnis;
		}
	}
}

