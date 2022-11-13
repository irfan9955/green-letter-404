package Dao;

public interface User {
	
	public void register(String name,String mobNo,String email,String password);
	
	public boolean login(String email,String password);
	
	public void bookTicket(String Source,String Destination);
	
	
	

}
