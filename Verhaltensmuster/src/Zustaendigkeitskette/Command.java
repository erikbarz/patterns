package Zustaendigkeitskette;

public interface Command 
{
	public void processCommand(String commandText);
	public void nextCommand(Command nextCommand);
}
