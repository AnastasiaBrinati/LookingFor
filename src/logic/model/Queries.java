package logic.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {

	//query to check if a user is signed or not 
	public static ResultSet checkSignedUser(Statement stmt, String username, String password) throws SQLException {
		
		String sql = "SELECT * FROM singleUser WHERE username = '" + username + "';";
		
        System.out.println(sql);
        return stmt.executeQuery(sql);
		
	}
	
	//query to add a new Course to the DB
	public static int addCourse(Statement stmt, Course course) throws SQLException  {
        String insertStatement = String.format("INSERT INTO courses ( name , organization , sport , instructorName , description ) VALUES (%s,%s,%s,%s,%s,%s)",course.getName(),
        		course.getOrganization(),course.getSport(),course.getInstructorName(),
        		course.getDescription());
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
    }
	
}
