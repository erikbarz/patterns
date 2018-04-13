package Multiton;

import java.util.HashMap;

public class DbPoolConnection 
{
	private static HashMap<Integer, DbPoolConnection> instanzen = new HashMap<Integer, DbPoolConnection>(); 

	private DatabaseConnection dbConnection;
	private DbPoolConnection()
	{
		dbConnection = new DatabaseConnection("Ein Connection-String");
		dbConnection.Open();
	}
	
	public DatabaseConnection getDatabaseConnection()
	{
		return dbConnection;
	}
	
	public static DbPoolConnection gibInstanz(Integer key)
	{
		synchronized(instanzen)
		{
			DbPoolConnection instanz = instanzen.get(key);
			if (instanz == null)
			{
				instanz = new DbPoolConnection();
				instanzen.put(key, instanz);
			}
			return instanz;
		}
	}
}
