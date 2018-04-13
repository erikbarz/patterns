package Zustaendigkeitskette;

public class Devenv 
{
	Command firstEngine;
	
	public Devenv()
	{
		firstEngine = new BuildEngine();
		DebugEngine debugEngine = new DebugEngine();
		firstEngine.nextCommand(debugEngine);
	}
	
	public void commandInputHandler(String commandText)
	{
		firstEngine.processCommand(commandText);
	}
}
