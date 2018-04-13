package Zustaendigkeitskette;

import java.util.Arrays;
import java.util.List;

public class DebugEngine extends Engine 
{
	@Override
	protected List<String> getSupportedCommands() 
	{
		return Arrays.asList("debug","debugwindow");
	}

	@Override
	protected void executeCommand(String command) 
	{
		System.out.println("Command executed: "+command);
	}

}
