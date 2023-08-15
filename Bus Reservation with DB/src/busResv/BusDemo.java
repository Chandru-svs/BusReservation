package busResv;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		BusDAO busdao=new BusDAO();
		try {
		busdao.displayBusInfo();
		
		int useroption = 1;
		Scanner sc =new Scanner(System.in);
		
		while(useroption==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		useroption=sc.nextInt();
		if(useroption==1) {
			Booking booking =new Booking();
			if(booking.isAvailable()) {
				BookingDAO bkdao=new BookingDAO();
				bkdao.addBooking(booking);
				System.out.println("Your booking is confirmed");
			}
			else {
				System.out.println("Sorry bus is full. Try nother bus or date");
			}
		}
		
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
