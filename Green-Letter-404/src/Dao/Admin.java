package Dao;

public interface Admin {
	
	public boolean loginAdmin(String email,String password);
	
	public void addBus(int busid,String busName,String busType,int seat);
	
	public void deleteBus(int busId);
	
	public void busRout(int rId,int bId,String source,String Destination,String Departure,String Arrival);
	
	public void deleteRoute(int routeId);
	
	public void confirmBooking();
	
	public void viewBuses();
	
	public void timeTable();
	


}
