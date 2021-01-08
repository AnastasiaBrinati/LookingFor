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
	
	//query to check if an organization is signed or not
    public static ResultSet checkSignedOrganization(Statement stmt, String username, String password) throws SQLException {
		
		String sql = "SELECT * FROM users WHERE name = '" + username + "';";
		
        System.out.println(sql);
        return stmt.executeQuery(sql);
		
	}
    
    public static ResultSet getCourses(Statement stmt,String username) throws SQLException {
		
		String sql="SELECT * FROM courses WHERE organization = '" + username + "';";
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
	
	public static int addEvent(Statement stmt, Course course) throws SQLException  {
        String insertStatement = String.format("INSERT INTO `courses`(organization,name,sport,description,instructorName,lessonPrice,monthlyPrice,availability) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')",
        course.getOrganization(),course.getName(),course.getSport(),course.getDescription(),course.getInstructorName(),String.valueOf(course.getLessonPrice()),String.valueOf(course.getMonthlyPrice()),String.valueOf(course.getAvailability()));
        
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
        
        
    }
	
	/*public static int addCourt(Statement stmt, Court court) throws SQLException  {
    String insertStatement = String.format("INSERT INTO `courses`(organization,name,sport,description,instructorName,lessonPrice,monthlyPrice,availability) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')",
    		court.getOrganization(),court.getName(),court.getSport(),court.getDescription(),court.getInstructorName(),String.valueOf(court.getLessonPrice()),String.valueOf(court.getMonthlyPrice()),String.valueOf(course.getAvailability()));
    
    System.out.println(insertStatement);
    return stmt.executeUpdate(insertStatement);
    
    
}
*/
	//query to insert a new user
	public static int addProfile(Statement stmt,String name, String surname, String username, String email,String password,String type) throws SQLException  {
        String insertStatement = String.format("INSERT INTO `users`(name,surname,username,email,password,type) VALUES ('%s','%s','%s','%s','%s','%s')", name,surname,username,email,password,type);
        System.out.println("in Queries ho:" + username);
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
        
        
    }
	
	public static ResultSet doesThisUsernameAlreadyExist(Statement stmt, String username) throws SQLException {
		
		String sql = "SELECT * FROM users WHERE username = '" + username + "';";
		
        System.out.println(sql);
        return stmt.executeQuery(sql);
	}
	
	public static ResultSet doesThisEmailAlreadyExist(Statement stmt, String email) throws SQLException {
		
		String sql = "SELECT * FROM users WHERE email = '" + email + "';";
		
        System.out.println(sql);
        return stmt.executeQuery(sql);
	}
	
	//per il singolo utente
	public static int updateCredentials(Statement stmt, String newName,String newSurname,String newUsername,String oldUsername) throws SQLException  {
        String updateStatement = String.format("UPDATE  users set name='%s', surname='%s', username=%s WHERE username = %s", newName,newSurname,newUsername,oldUsername);
        System.out.println(updateStatement);
        return stmt.executeUpdate(updateStatement);
    }
	
	public static int updateCredentialsNoUsername(Statement stmt, String newName,String newSurname,String oldUsername) throws SQLException  {
        String updateStatement = String.format("UPDATE  users set name='%s', surname='%s' WHERE username = %s", newName,newSurname,oldUsername);
        System.out.println(updateStatement);
        return stmt.executeUpdate(updateStatement);
    }

	public static int updateEmail(Statement stmt,String newEmail,String username) throws SQLException {
		String updateStatement = String.format("UPDATE  users set email='%s' WHERE username = %s",newEmail,username);
        System.out.println(updateStatement);
        return stmt.executeUpdate(updateStatement);

	}
	
	public static int updatePassword(Statement stmt,String newPassword,String username) throws SQLException {
		String updateStatement = String.format("UPDATE  users set password='%s' WHERE username = %s",newPassword,username);
        System.out.println(updateStatement);
        return stmt.executeUpdate(updateStatement);

	}
	
	
	
}

