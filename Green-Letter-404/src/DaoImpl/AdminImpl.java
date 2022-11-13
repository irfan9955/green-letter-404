package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Dao.Admin;
import Utility.ProvideConnection;

public class AdminImpl implements Admin{

	@Override
	public boolean loginAdmin(String email,String password) {
		// TODO Auto-generated method stub
		
		try(Connection con = ProvideConnection.connected()){
			PreparedStatement ps = con.prepareStatement("select email,password,Name from adminlogin where email = ? and password = ?");
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
			
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}

	@Override
	public void addBus(int busid,String busName,String busType,int seat) {
		// TODO Auto-generated method stub
		try(Connection con = ProvideConnection.connected()){
			PreparedStatement ps = con.prepareStatement("Insert into bus values(?,?,?,?)");
			ps.setInt(1, busid);
			ps.setString(2, busName);
			ps.setString(3, busType);
			ps.setInt(4, seat);
			
			int res =ps.executeUpdate();
			
			if(res>=1) {
				System.out.println(busName +" Successfully Inserted.....\n\n\n");
				
			}
			else {
//				throw SQLException;
				System.out.println("Not Inserted");
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
	}

	@Override
	public void deleteBus(int busId) {
		// TODO Auto-generated method stub
		
		try(Connection con = ProvideConnection.connected()){
			
			PreparedStatement ps2 = con.prepareStatement("DELETE FROM Bus WHERE BusId = ?");
			ps2.setInt(1, busId);
			int id  = ps2.executeUpdate();
			
			
			if(id>=1) {
				System.out.println(id +" Successfully Deleted.....\n\n\n");
				
			}
			else {
//				throw SQLException;
				System.out.println("Bus Not found....");
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
	}

	@Override
	public void busRout(int rId,int bId,String source,String Destination,String Departure,String Arrival) {
		// TODO Auto-generated method stub
		

		try(Connection con = ProvideConnection.connected()){
			PreparedStatement ps = con.prepareStatement("Insert into busRoute values(?,?,?,?,?,?)");
			
			ps.setInt(1, rId);
			ps.setInt(2, bId);
			ps.setString(3, source);
			ps.setString(4, Destination);
			ps.setString(5, Departure);
			ps.setString(6, Arrival);
			
			int res =ps.executeUpdate();
			
			if(res>=1) {
				System.out.println(source +" to "+ Destination +" Successfully Inserted.....\n\n\n");
				
			}
			else {
//				throw SQLException;
				System.out.println("Not Inserted");
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

		@Override
		public void deleteRoute(int routeId) {
		// TODO Auto-generated method stub
            try(Connection con = ProvideConnection.connected()){
			
			PreparedStatement ps = con.prepareStatement("DELETE FROM BusRoute WHERE RouteId = ?");
			ps.setInt(1, routeId);
			int id  = ps.executeUpdate();
			
			
			if(id>=1) {
				System.out.println(id +" Row Successfully Deleted.....\n\n\n");
				
			}
			else {
//				throw SQLException;
				System.out.println("Bus Not found....");
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		
	}

		@Override
		public void confirmBooking() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void viewBuses() {
			// TODO Auto-generated method stub
			
			try(Connection con = ProvideConnection.connected()){
				PreparedStatement ps = con.prepareStatement("Select * from bus");
				
				
				
				ResultSet res =ps.executeQuery();
				
				while(res.next()) {
					System.out.println("\n\n====================================================================");
					int id = res.getInt("BusId");
					String bname = res.getString("BusName");
					String type = res.getString("BusType");
					int Seat = res.getInt("seat");
					
					System.out.println("BusId = "+id+", BusName = "+bname+", Type = "+type+",  Seat = "+Seat);
					System.out.println("=====================================================================\n\n");
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}
			
			
			
			
		}

		@Override
		public void timeTable() {
			// TODO Auto-generated method stub
			try(Connection con = ProvideConnection.connected()){
				PreparedStatement ps = con.prepareStatement("Select * from bus");
				
				
				
				ResultSet res =ps.executeQuery();
				
				while(res.next()) {
					System.out.println("\n\n====================================================================");
					int id = res.getInt("BusId");
					String bname = res.getString("BusName");
					String type = res.getString("BusType");
					int Seat = res.getInt("seat");
					
					System.out.println("BusId = "+id+", BusName = "+bname+", Type = "+type+",  Seat = "+Seat);
					System.out.println("=====================================================================\n\n");
				}
				
			}
			catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				
			}	
			
			
		}

}
