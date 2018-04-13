package Adapter;

public class WorkflowErgebnis 
{
	private String objektId;
	private boolean warErfolgreich;
	private String fehlermeldung;
	
	public WorkflowErgebnis(String objektId)
	{
		this.objektId = objektId;
	}

	public boolean isWarErfolgreich() 
	{
		return warErfolgreich;
	}
	public void setWarErfolgreich(boolean warErfolgreich) 
	{
		this.warErfolgreich = warErfolgreich;
	}

	public String getFehlermeldung() 
	{
		return fehlermeldung;
	}

	public void setFehlermeldung(String fehlermeldung) 
	{
		this.fehlermeldung = fehlermeldung;
	}

	public String getObjektId() 
	{
		return objektId;
	}
}
