package logic.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {

	public static ResultSet checkSignedUser(Statement stmt, String username, String password) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM singleUser WHERE username = '" + username + "';";
		
        System.out.println(sql);
        return stmt.executeQuery(sql);
		
	}

}
