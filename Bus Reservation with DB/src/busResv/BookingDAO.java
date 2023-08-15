package busResv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookingDAO {

	public int getBookedCount(int busNo,Date date) throws SQLException{
		String query="Select count(PassengerName) from booking where busNo=? and date=?";
		Connection con=DbConnection.getConnection();
		PreparedStatement ps=con.prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		ps.setInt(1, busNo);
		ps.setDate(2, sqldate);
		ResultSet rs=ps.executeQuery();
		rs.next();
		return rs.getInt(1);
		}
	public void addBooking(Booking booking) throws SQLException{
		String query="insert into booking values(?,?,?)";
		Connection con=DbConnection.getConnection();
		java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, booking.passengerName);
		ps.setInt(2, booking.busNo);
		ps.setDate(3, sqldate);
		
		ps.executeUpdate();
	}
}
