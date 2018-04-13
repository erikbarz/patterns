package TableDataGateway;

import java.sql.*;

public class ProduktGateway 
{
	public Produkt hole(int id)
	{
		String connectionSring = "jdbc:sqlserver://localhost:1433;databaseName=kalimba;integratedSecurity=true;";
		String sql = "SELECT * FROM produkt WHERE ProduktId=?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(connectionSring);
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			return getProduktFromResultSet(rs);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
	         if (rs != null) try { rs.close(); } catch(Exception e) {}
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}
	         if (conn != null) try { conn.close(); } catch(Exception e) {}
		}
		return null;
	}
	
	private Produkt getProduktFromResultSet(ResultSet rs) throws SQLException
	{
		if (rs.next())
		{
			Produkt p = new Produkt();
			p.setProduktId(rs.getInt("ProduktId"));
			p.setProdukt(rs.getString("Produkt"));
			p.setPreis(rs.getFloat("Preis"));
			p.setLagerNo(rs.getInt("LagerNo"));
			p.setBeschreibung(rs.getString("Beschreibung"));
			return p;
		}
		else
			throw new RuntimeException("ID nicht gefunden");
	}
	
	//+ Weitere Methoden zum Hinzufügen, Aktualisieren und Löschen
}
