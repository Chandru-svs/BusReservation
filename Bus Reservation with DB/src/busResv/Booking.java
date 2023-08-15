package busResv;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {

	
	
	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName=scanner.next();
		System.out.println("Enter bus no: ");
		busNo=scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput=scanner.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateformat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean isAvailable() throws SQLException{
	
		BusDAO busdao=new BusDAO();
		BookingDAO bkdao=new BookingDAO();
		
		int capacity=busdao.getCapacity(busNo);
		int booked=bkdao.getBookedCount(busNo,date);
		
		return booked<capacity;
	}
}
