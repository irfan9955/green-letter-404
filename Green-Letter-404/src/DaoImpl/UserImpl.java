package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

import Dao.User;
import Utility.ProvideConnection;

public class UserImpl implements User{

	@Override
	public void register(String name, String mobNo, String email, String password) {
		
		try (Connection con = ProvideConnection.connected()){
			PreparedStatement ps =con.prepareStatement("Insert into CustomerSignup(Name,MobNo,Email,Password) values(?,?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, mobNo);
			ps.setString(3, email);
			ps.setString(4, password);
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Registered successfully......");
			}
			else {
//				throw SQLException;
				System.out.println("Not Registred....");
				
				
			}
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
			
			
		}
		
		
	}

	@Override
	public boolean login(String email, String password) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		try (Connection con = ProvideConnection.connected()){
			PreparedStatement ps =con.prepareStatement("Select * from customerSignup where Email = ? AND Password = ?");
			
			
			ps.setString(1, email);
			ps.setString(2, password);
			
            ResultSet res =ps.executeQuery();
			
			
			
			if(res.next()) {
				System.out.println("welcome "+res.getString("Name"));
				return true;
			}
			else {
//				throw SQLException;
				System.out.println("Invalid User Id OR Password.....");
				return false;
				
				
			}
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			e.getMessage();
			return false;
		}
		
	}

	@Override
	public void bookTicket(String Source, String Destination) {
		
		try(Connection con = ProvideConnection.connected()){
			PreparedStatement  ps =con.prepareStatement("Select seat form bus where busId =(Select BusId from BusRoute where source = ? and Destination = ?");
            ps.setString(1, Source);		       
			ps.setString(2, Destination);
			
			ResultSet  res= ps.executeQuery();
			
			System.out.println("Total seats available are"+ res.getInt("seat"));
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		
		
		
		
	}

}
