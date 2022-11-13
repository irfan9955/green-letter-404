package Main_Panel;

import java.util.Scanner;

import Dao.Admin;
import Dao.User;
import DaoImpl.AdminImpl;
import DaoImpl.UserImpl;

public class Main_Methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Bus Reservation System \n\n\nEnter 1 for admin  \n\nEnter 2 for User ");
		int condition = sc.nextInt();
		
		if(condition == 1) {
			boolean flag=false;
			
				Admin admin = new AdminImpl();
				
				System.out.println("Enter your Email : ");
				String email = sc.next();
				System.out.println("Enter your Password : ");
				String pass = sc.next();
				
				flag = admin.loginAdmin(email, pass);
				
			
			
			while(flag) {
				
				System.out.println("Enter 1 for Create bus : ");
				System.out.println("Enter 2 for remove bus : ");
				System.out.println("Enter 3 for create busroute : ");
				System.out.println("Enter 4 for remove busroute : ");
				System.out.println("Enter 5 for confirm booking : ");
				System.out.println("Enter 6 for View all bus : ");
				System.out.println("Enter 7 for view bus time table : ");
				System.out.println("Enter 0 for exit : ");
				
				int check = sc.nextInt();
				
				if(check==1) {
					
					
					System.out.println("Enter BusId in Integer format : ");
					int id = sc.nextInt();
					sc.nextLine();
					
					System.out.println("Enter BusName in String Fromat : ");
					String busName = sc.nextLine();
					
					System.out.println("Enter 1 for ac 2 for non/ac : ");
					int acNonAc = sc.nextInt();
					String fil = "";
					
					if(acNonAc == 1) {
						fil = "Ac";
					}
					else if(acNonAc == 2) {
						fil = "Non-Ac";
					}
					else {
						fil = "Non-Ac";
					}
					
					System.out.println("Enter total Number of seats : ");
					int seat = sc.nextInt();
					
				   admin.addBus(id, busName, fil,seat);
				   
				   
					
				}
				else if(check == 2) {
					System.out.println("Enter BusId To Delete Bus from DataBase : ");
					int id = sc.nextInt();
					admin.deleteBus(id);
					
					
				}
				else if(check == 3) {
					
					System.out.println("Enter Bus route in int formte : ");
					int routeId = sc.nextInt();
					
					System.out.println("Enter BusId : ");
					int busId = sc.nextInt();
					
					System.out.println("Enter Source or Starting point : ");
					String source = sc.next();
					
					System.out.println("Enter Destination : ");
					String des = sc.next();
					
					System.out.println("Enter Departure Time in String  hh:mm:ss ");
					String depar = sc.next();
					
					System.out.println("Enter Arival Time in String hh:mm:ss ");
					String ari =  sc.next();
					
					
					
					
					
					
					admin.busRout(routeId, busId, source, des, depar, ari);
					
					
				}
				else if(check == 4) {
					
					System.out.println("Enter RouteId To Delete  Route from DataBase : ");
					int id = sc.nextInt();
					admin.deleteRoute(id);
					
					
				}
				else if(check == 5) {
					
				}
				else if(check == 6) {
					admin.viewBuses();
					
				}
				else if(check == 7) {
					
				}
				else if(check == 0) {
					return;
				}
				else {
					System.out.println("plese enter valid Creadiential....");
				}
				
				
				
			}
			
			
			
			
		}
		else if(condition == 2) {
			
			User us = new UserImpl();
			
			System.out.println("Press 1 for Signup : \n");
			System.out.println("Press 2 for login : \n");
			System.out.println("Press 0 for exit : \n");
			
			int check = sc.nextInt();
			
			
			if(check == 1) {
				System.out.println("Enter Your Name : ");
				String name = sc.next();
				
				System.out.println("Enter Your Mobile No : ");
				String mobNo = sc.next();
				
				System.out.println("Enter Your Email Id : ");
				String email = sc.next();
				
				System.out.println("Enter Your Password : ");
				String pass  = sc.next();
				
				
				us.register(name, mobNo, email, pass);
				
//				us.register( "Rahul", "999243243", "rahul123@gmail.com", "rahul123");
				
				
			}
			else if(check == 2) {
				
				System.out.println("Enter Your Email Id : ");
				
				String email = sc.next();
				
				System.out.println("Enter Your Password : ");
				
				String pass = sc.next();
				
				boolean flag = us.login(email, pass);
			    
				
				while(true ) {
					System.out.println("Enter 1 for BookTicket : ");
					System.out.println("Enter 2 for cancelTicket : ");
					System.out.println("Enter 0 for exit : ");
					int x  = sc.nextInt();
//				    int x = 1;
					
					if(x ==  1) {
						
						
						System.out.println("Enter Starting point : ");
						String sou = sc.nextLine();
						
						System.out.println("Enter Ending Poing : ");
						String des = sc.nextLine();
						
						
						us.bookTicket(sou, des);
						
					}
					else if(x == 2) {
						
					}
					else if(x == 0) {
						return ;
					}
					else {
						System.out.println("please valid number......");
					}
					
				}
				
			}
			else if(check == 0) {
				return ;
			}
		    else {
			System.out.println("Please Enter valid Number : ");
			}
			
			
			

			
			
		}
		else {
			System.out.println("Plese Enter Valid Input......");
		}
		
		
		sc.close();
	}

}
