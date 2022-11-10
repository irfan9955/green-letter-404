package Main_Panel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Exception.CustomerException;
import Utility.ProvideConnection;

public class User {

	public static void userLogin(String username,String Password) {
		
//		String sql = "Insert into CustomerSignup(Name,MobNo,Emil,Password) value(?,?,?,?)";		
		ProvideConnection db = new ProvideConnection();
		
	    try(Connection con=db.connected()){
	    	
	    }
	    catch (CustomerException e) {
			// TODO: handle exception
	    	e.printStackTrace();
	    	System.out.println(e.getMessage());
		}
		
	}
		
}
