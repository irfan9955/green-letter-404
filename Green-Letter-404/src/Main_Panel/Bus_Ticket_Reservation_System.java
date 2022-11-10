package Main_Panel;

import java.util.Scanner;

public class Bus_Ticket_Reservation_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Bus Reservation System \n\n\nEnter 1 for admin  \n\nEnter 2 for User ");
		int condition = sc.nextInt();
		
		if(condition == 1) {
			
		}
		else if(condition == 2) {
			
		}
		else {
			System.out.println("Plese Enter Valid Input......");
		}
		
		sc.close();
	}

}
