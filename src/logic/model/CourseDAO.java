package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CourseDAO {
	
	
	private static String USER = "u0uxwvy2unqsxnql";
    private static String PASS = "nH1ORFX9CBydKKphGtBO";
    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nH1ORFX9CBydKKphGtBO@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
    
    
    
	
    public static void addCourse(Course course) throws Exception {
        // STEP 1: dichiarazioni
        Statement stmt = null;
        Connection conn = null;
        
        try {
            // STEP 2: loading dinamico del driver mysql
            

            // STEP 3: apertura connessione
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            // STEP 4.2: creazione ed esecuzione della query
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            int result = Queries.addCourse(stmt, course);
            
            // STEP 5.1: Clean-up dell'ambiente
            
 
        } finally {
            // STEP 5.2: Clean-up dell'ambiente        	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
    }
    
    public Course getCourse(String courseName,String organizationName) throws Exception {
        // STEP 1: dichiarazioni
        Statement stmt = null;
        Connection conn = null;
        
        try {
            // STEP 2: loading dinamico del driver mysql
            

            // STEP 3: apertura connessione
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            // STEP 4.2: creazione ed esecuzione della query
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = Queries.getUserCourse(stmt, courseName,organizationName);
            if (!rs.first()){				
				Exception e = new Exception("No course Found matching with username: "  + organizationName);
            	throw e;
		    }
		
            rs.first();
            Course course = new Course();
            course.setName(rs.getString("name"));
        	course.setMonthlyPrice(rs.getString("monthlyPrice"));
        	course.setLessonPrice(rs.getString("lessonPrice"));
        	course.setSport(rs.getString("sport"));
        	course.setInstructorName(rs.getString("instructorName"));
        	course.setAvailability(rs.getString("availability"));
        	course.setDescription(rs.getString("description"));
        	rs.close();
        	return course;
        	
        	
        	
        	
        	
        	
            
            
            // STEP 5.1: Clean-up dell'ambiente
            
        } finally {
            // STEP 5.2: Clean-up dell'ambiente        	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
    }

	public void deleteCourse(String itemName, String organizationName) throws SQLException {
		Statement stmt = null;
        Connection conn = null;
        try {
        	 conn = DriverManager.getConnection(DB_URL, USER, PASS);
        	 stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_READ_ONLY);
             Queries.deleteCourse(stmt,itemName,organizationName);
        	
        	
        }finally {
            // STEP 5.2: Clean-up dell'ambiente        	
            if (stmt != null)
                stmt.close();
            if (conn != null)
                conn.close();
    }
	
        
}

	public ArrayList<Course> retreiveBySport(String sport) throws Exception {
		
	        Statement stmt = null;
	        Connection conn = null;
	        ArrayList<Course> foundCourses = new ArrayList<Course>();
	        
	        try {
	            
	            try {
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	            
	            ResultSet rs = Queries.selectCourseBySport(stmt,sport);

	            if (!rs.first()){ // rs empty
	            	Exception e = new Exception("No results were found");
	            	throw e;
	            }
	            
	            rs.first();
	            do{
	              
	            	String name=rs.getString("name");
	            	String organization=rs.getString("organization");
	            	String lessonPrice=rs.getString("lessonPrice");
	            	String monthlyPrice=rs.getString("monthlyPrice");
	            	String instructorName=rs.getString("instructorName");
	            	String availability=rs.getString("availability");
	            	String description = rs.getString("description");
	            	Course foundCourse=new Course();
	            	foundCourse.setName(name);
	            	foundCourse.setOrganization(organization);
	            	foundCourse.setLessonPrice(lessonPrice);
	                foundCourse.setMonthlyPrice(monthlyPrice);
	                foundCourse.setInstructorName(instructorName);
	                foundCourse.setAvailability(availability);
	                foundCourse.setDescription(description);
	               
	                foundCourses.add(foundCourse);

	            }while(rs.next());
	            
	           
	            rs.close();
	        } finally {
	            
	            try {
	                if (stmt != null)
	                    stmt.close();
	            } catch (SQLException se2) {
	            }
	            try {
	                if (conn != null)
	                    conn.close();
	            } catch (SQLException se) {
	                se.printStackTrace();
	            }
	        }

	        return foundCourses;
	    }
}