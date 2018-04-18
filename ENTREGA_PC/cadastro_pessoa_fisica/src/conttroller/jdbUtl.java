package conttroller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbUtl {

	
	private static String connectionDriverClass="com.mysql.jdbc.Driver";
	private static String connectionUrl = "jdbc:mysql://localhost/cad_pf";
	private static String connectionUsername="root";
	private static String connectionPassword="";
	private static Connection conn;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
	
		if (jdbUtl.conn != null) {
			return jdbUtl.conn;
		}
		else {
			Class.forName(connectionDriverClass);
			return DriverManager.getConnection(
					jdbUtl.connectionUrl,
					jdbUtl.connectionUsername,
					jdbUtl.connectionPassword);
		}
	}
	
	
}

