package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProvideConnection {

	public static Connection connected() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/BTRS";
		
		try {
			conn =DriverManager.getConnection(url, "root", "root");
			
			
			
//			System.out.println(conn);
//			
//			System.out.println("connected.....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return conn;
	}
//	public static void main(String[] args) {
//		connected();
//	}
	
}
