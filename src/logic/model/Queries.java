package logic.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {

	//query to check if a user is signed or not 
	public static ResultSet checkSignedUser(Statement stmt, String username) throws SQLException {
		
		String sql = "SELECT * FROM users WHERE username = '" + username + "';";
		
        System.out.println(sql);
        return stmt.executeQuery(sql);
		
	}
	
	public static ResultSet getCourses(Statement stmt,String username) throws SQLException {
		
		String sql="SELECT * FROM courses WHERE username = '" + username + "';";
		System.out.println(sql);
		return stmt.executeQuery(sql);
		
	}
	
public static ResultSet getEvents(Statement stmt,String username) throws SQLException {
		
		String sql="SELECT * FROM events WHERE username = '" + username + "';";
		System.out.println(sql);
		return stmt.executeQuery(sql);
		
	}

public static ResultSet getCourts(Statement stmt,String username) throws SQLException {
	
	String sql="SELECT * FROM courts WHERE username = '" + username + "';";
	System.out.println(sql);
	return stmt.executeQuery(sql);
	
}
	
	
	//query to add a new Course to the DB
	public static int addCourse(Statement stmt, Course course) throws SQLException  {
        String insertStatement = String.format("INSERT INTO `courses`(name,sport,description,instructorName,lessonPrice,monthlyPrice,availability) VALUES ('%s','%s','%s','%s','%s','%s','%s')",
        course.getName(),course.getSport(),course.getDescription(),course.getInstructorName(),String.valueOf(course.getLessonPrice()),String.valueOf(course.getMonthlyPrice()),String.valueOf(course.getAvailability()));
        
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
        
        
    }
	
	
	
	
}

