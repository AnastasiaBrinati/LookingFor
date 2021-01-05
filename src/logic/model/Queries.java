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
        String insertStatement = String.format("INSERT INTO `courses`\r\n"
        		+ "	(`name`,\r\n"
        		+ "	`courseID`,\r\n"
        		+ "	`organization`,\r\n"
        		+ "	`monthlyPrice`,\r\n"
        		+ "	`lessonPrice`,\r\n"
        		+ "	`sport`,\r\n"
        		+ "	`instructorName`,\r\n"
        		+ "	`imgSrc`,\r\n"
        		+ "	`availability`,\r\n"
        		+ "	`description`)  VALUES (%s,'%d','%s','%d','%d','%s','%s','%s','%d','%s')",course.getName(),course.getCourseID(),
        		course.getOrganization(),course.getMonthlyPrice(),course.getLessonPrice(),course.getSport(),course.getInstructorName(),
        		course.getImgSrc(),course.getAvailability(),course.getDescription());
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
    }
	
}
