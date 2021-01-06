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
		
		String sql="SELECT * FROM courses WHERE organization = '" + username + "';";
		System.out.println(sql);
		return stmt.executeQuery(sql);
		
	}

	//query to ckeck if an organization is signed or not
    public static ResultSet checkSignedOrganization(Statement stmt, String username, String password) throws SQLException {
		
		String sql = "SELECT * FROM users WHERE name = '" + username + "';";
		
        System.out.println(sql);
        return stmt.executeQuery(sql);
		
	}

    public static ResultSet getEvents(Statement stmt,String username) throws SQLException {
		
		String sql="SELECT * FROM events WHERE organization = '" + username + "';";
		System.out.println(sql);
		return stmt.executeQuery(sql);
		
	}

    public static ResultSet getCourts(Statement stmt,String username) throws SQLException {
	
	String sql="SELECT * FROM courts WHERE organization = '" + username + "';";
	System.out.println(sql);
	return stmt.executeQuery(sql);
	
}
	
	
	//query to add a new Course to the DB
	public static int addCourse(Statement stmt, Course course) throws SQLException  {
        String insertStatement = String.format("INSERT INTO `courses`(organization,name,sport,description,instructorName,lessonPrice,monthlyPrice,availability) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')",
        course.getOrganization(),course.getName(),course.getSport(),course.getDescription(),course.getInstructorName(),String.valueOf(course.getLessonPrice()),String.valueOf(course.getMonthlyPrice()),String.valueOf(course.getAvailability()));
        
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
        
        
    }
	
	public static int addProfile(Statement stmt,String name, String surname, String username, String email,String password,String type) throws SQLException  {
        String insertStatement = String.format("INSERT INTO `users`(name,surname,username,email,password,type) VALUES ('%s','%s','%s','%s','%s','%s')", name,surname,username,email,password,type);
        System.out.println("in Queries ho:" + username);
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
        
        
    }
	
	
	
	
}

