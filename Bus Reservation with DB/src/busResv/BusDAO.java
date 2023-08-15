package busResv;

import java.sql.*;
import java.sql.SQLException;

public class BusDAO {

	public void displayBusInfo() throws SQLException{
		String query="Select * from bus";
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Bus No "+rs.getInt(1));
			
			if(rs.getBoolean(2)) {
				System.out.println("Yes this is ac bus");
			}
			else {
				System.out.println("Not a ac bus");
			}
			
			System.out.println("Capacity "+rs.getInt(3));
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
	public int getCapacity(int id) throws SQLException {
		String query="Select Capacity from bus where busNo=" +id;
		Connection con=DbConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);

	}
}
