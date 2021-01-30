package logic.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Queries {

//query to check if a user is signed or not
  public static ResultSet checkSignedUserByUsername(Statement stmt, String username) throws SQLException {

    String sql = "SELECT * FROM users WHERE username = '" + username + "';";

    System.out.println(sql);
    return stmt.executeQuery(sql);

  }

public static ResultSet checkSignedUserByEmail(Statement stmt, String email) throws SQLException {

String sql = "SELECT * FROM users WHERE email = '" + email + "';";

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

public static ResultSet getUsers(Statement stmt,String name) throws SQLException {

String sql="SELECT * FROM users WHERE name = '" + name + "';";
System.out.println(sql);
return stmt.executeQuery(sql);

}


//query to add a new Course to the DB
public static int addCourse(Statement stmt, Course course) throws SQLException {
String insertStatement = String.format("INSERT INTO `courses`(organization,name,sport,description,instructorName,lessonPrice,monthlyPrice,availability) VALUES ('%s','%s','%s','%s','%s','%s','%s','%s')",
course.getOrganization(),course.getName(),course.getSport(),course.getDescription(),course.getInstructorName(),String.valueOf(course.getLessonPrice()),String.valueOf(course.getMonthlyPrice()),String.valueOf(course.getAvailability()));

System.out.println(insertStatement);
return stmt.executeUpdate(insertStatement);


}

public static int addEvent(Statement stmt, Event newEvent) throws SQLException {
String insertStatement = String.format("INSERT INTO `events`(organization,name,sport,description,price,availability) VALUES ('%s','%s','%s','%s','%s','%s')",
newEvent.getOrganization(),newEvent.getName(),newEvent.getSport(),newEvent.getDescription(),String.valueOf(newEvent.getPrice()),String.valueOf(newEvent.getAvailability()));

System.out.println(insertStatement);
return stmt.executeUpdate(insertStatement);


}

public static int addCourt(Statement stmt, Court court) throws SQLException {
String insertStatement = String.format("INSERT INTO `courses`(organization,name,sport,description,price,availability,type) VALUES ('%s','%s','%s','%s','%s','%s','%s')",
court.getName(),court.getSport(),court.getDescription(),String.valueOf(court.getPrice()),String.valueOf(court.getAvailability()),court.getType());

System.out.println(insertStatement);
return stmt.executeUpdate(insertStatement);


}

//query to insert a new user
public static int addProfile(Statement stmt,String name, String surname, String username, String email,String password,String type,String location) throws SQLException {
String insertStatement = String.format("INSERT INTO `users`(name,surname,username,email,password,type,location) VALUES ('%s','%s','%s','%s','%s','%s','%s')", name,surname,username,email,password,type,location);
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
public static int updateCredentials(Statement stmt, String newName,String newSurname,String newUsername,String oldUsername) throws SQLException {
String updateStatement = String.format("UPDATE users set name='%s', surname='%s', username='%s' WHERE username = '%s' ", newName,newSurname,newUsername,oldUsername);
System.out.println(updateStatement);
return stmt.executeUpdate(updateStatement);
}

public static int updateCredentialsNoUsername(Statement stmt, String newName,String newSurname,String oldUsername) throws SQLException {
String updateStatement = String.format("UPDATE users set name='%s', surname='%s' WHERE username = '%s' ", newName,newSurname,oldUsername);
System.out.println(updateStatement);
return stmt.executeUpdate(updateStatement);
}

public static int updateEmail(Statement stmt,String newEmail,String username) throws SQLException {
String updateStatement = String.format("UPDATE users set email='%s' WHERE username = '%s' ",newEmail,username);
System.out.println(updateStatement);
return stmt.executeUpdate(updateStatement);

}

public static int updatePassword(Statement stmt,String newPassword,String username) throws SQLException {
String updateStatement = String.format("UPDATE users set password='%s' WHERE username = '%s' ",newPassword,username);
System.out.println(updateStatement);
return stmt.executeUpdate(updateStatement);

}

public static ResultSet getUserCourse(Statement stmt, String courseName, String organizationName) throws SQLException {

String sql = "SELECT * FROM courses WHERE organization= '" + organizationName + "' AND name = '" + courseName + "';";

System.out.println(sql);
return stmt.executeQuery(sql);
}

public static ResultSet getUserCourt(Statement stmt, String courtName, String organizationName) throws SQLException {

String sql = "SELECT * FROM courts WHERE organization= '" + organizationName + "' AND name = '" + courtName + "';";

System.out.println(sql);
return stmt.executeQuery(sql);
}

public static ResultSet getUserEvent(Statement stmt, String eventName, String organizationName) throws SQLException {

String sql = "SELECT * FROM events WHERE organization= '" + organizationName + "' AND name = '" + eventName + "';";

System.out.println(sql);
return stmt.executeQuery(sql);
}

public static int deleteCourse(Statement stmt, String itemName, String organizationName) throws SQLException {
{
String deleteStatement = String.format("DELETE FROM courses WHERE name = '%s' AND organization = '%s' ", itemName,organizationName);
System.out.println(deleteStatement);
return stmt.executeUpdate(deleteStatement);
}

}

public static int deleteCourt(Statement stmt, String itemName, String organizationName) throws SQLException {

String deleteStatement = String.format("DELETE FROM courts WHERE name = '%s' AND organization = '%s' ", itemName,organizationName);
System.out.println(deleteStatement);
return stmt.executeUpdate(deleteStatement);


}


public static int deleteEvent(Statement stmt, String itemName, String organizationName) throws SQLException {

String deleteStatement = String.format("DELETE FROM events WHERE name = '%s' AND organization = '%s' ", itemName,organizationName);
System.out.println(deleteStatement);
return stmt.executeUpdate(deleteStatement);

}

//retreiving all courses from DB by a filter "sport"
public static ResultSet selectCourseBySport(Statement stmt, String sport) throws SQLException {
String selectStatement = "SELECT * FROM courses where sport = '" + sport + "';";
System.out.println(selectStatement);
return stmt.executeQuery(selectStatement);
}

//retreiving all events from DB by a filter "sport"
public static ResultSet selectEventBySport(Statement stmt, String sport) throws SQLException {
String selectStatement = "SELECT * FROM events where sport = '" + sport + "';";
System.out.println(selectStatement);
return stmt.executeQuery(selectStatement);
}

//retreiving all courts from DB by a filter "sport"
public static ResultSet selectCourtBySport(Statement stmt, String sport) throws SQLException {
String selectStatement = "SELECT * FROM courts where sport = '" + sport + "';";
System.out.println(selectStatement);
return stmt.executeQuery(selectStatement);
}

//retreiving all courses where user is subscribed
public static ResultSet getAllSubbedCourses(Statement stmt, String username) throws SQLException {
String selectStatement = "SELECT * FROM joinedCourses where username = '" + username + "';";
System.out.println(selectStatement);
return stmt.executeQuery(selectStatement);
}
//retreiving all events where user is subscribed
public static ResultSet getAllSubbedEvents(Statement stmt, String username) throws SQLException {
String selectStatement = "SELECT * FROM joinedEvents where username = '" + username + "';";
System.out.println(selectStatement);
return stmt.executeQuery(selectStatement);
}
//retreiving all courts where user is subscribed
public static ResultSet getAllBookedCourts(Statement stmt, String username) throws SQLException {
String selectStatement = "SELECT * FROM bookedCourts where username = '" + username + "';";
System.out.println(selectStatement);
return stmt.executeQuery(selectStatement);
}






}