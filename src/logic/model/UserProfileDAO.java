package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserProfileDAO {
	
	
	private static String USER = "u0uxwvy2unqsxnql";
    private static String PASS = "nH1ORFX9CBydKKphGtBO";
    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nh1orfx9cbydkkphgtbo@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
    //private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    
   //MANCA LA REFLECTION
    
	
	public String goCheckAndTellMe(String username,String password) throws Exception {
		
		//dichiarazioni 
		Statement stmt=null;
		Statement stmtCourses = null;
		Statement stmtEvents = null;
		Statement stmtCourts = null;
		Connection conn=null;
		String type=null;
		
		try {
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = Queries.checkSignedUser(stmt, username);
			
			if (!rs.first()){				
					Exception e = new Exception("No username Found matching with username: "+username);
	            	throw e;
			}
			
            rs.first();
            do{
            	//verificare se la password è corretta
            	String foundPassword=rs.getString("password");
            	if(foundPassword.equals(password)) {
            		 type = rs.getString("type");
            		if(type.equals("singleuser")) {
            	
            			    //setting the user profile 
            		   		String nome = rs.getString("name");
            		   		String cognome = rs.getString("surname");
            		   		String email = rs.getString("email");
            		   		UserProfile.setName(nome);
            		   		UserProfile.setSurname(cognome);
            		   		UserProfile.setEmail(email);
            		
            		   		UserProfile.setUsername(username);
            		   		UserProfile.setPassword(password);
            		
            		   		System.out.println(type);
            		   		
            		      	//get list of courses
            		   		stmtCourses = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            		   		
            		   		ResultSet tupleCourses=Queries.getCourses(stmtCourses, username);
            		   		if(tupleCourses.first()) {
            		   			while(tupleCourses.next()) {
            		   				OrganizationProfile.addCourse(courseRetreiver(tupleCourses));
            		   			}
            		   			tupleCourses.close();
            		   		}
            		   		
            		   		//get list of events
            		   		stmtEvents = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            		   		ResultSet tupleEvents=Queries.getEvents(stmtEvents, username);
            		   		if(tupleEvents.first()) {
            		   			while(tupleEvents.next()) {
            		   				OrganizationProfile.addEvent(eventRetreiver(tupleEvents));
            		   			}
            		   			tupleEvents.close();
            		   		}
            		   		
            		   	    //get list of courts
            		   		stmtCourts = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            		   		ResultSet tupleCourts=Queries.getCourts(stmtCourts, username);
            		   		if(tupleCourts.first()) {
            		   			while(tupleCourts.next()) {
            		   				OrganizationProfile.addCourt(courtRetreiver(tupleCourts));
            		   			}
            		   			tupleCourts.close();
            		   		}
            		   		
            		   		type="singleuser";
            		   		return type;
            		}
            		else {
            			
            			//being an organization,I set the org profile
        		   		OrganizationProfile.setName(username);
        		   		//null:OrganizationProfile.setSurname(cognome);
        		   		OrganizationProfile.setEmail(rs.getString("email"));
        		   		//OrganizationProfile.setUsername(username);
        		   		OrganizationProfile.setPassword(password);
        		   		
        		   		
        		   		
        		   		//get list of courses
        		   		stmtCourses = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        		   		
        		   		ResultSet tupleCourses=Queries.getCourses(stmtCourses, username);
        		   		if(tupleCourses.first()) {
        		   			while(tupleCourses.next()) {
        		   				OrganizationProfile.addCourse(courseRetreiver(tupleCourses));
        		   			}
        		   			tupleCourses.close();
        		   		}
        		   		
        		   		//get list of events
        		   		stmtEvents = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        		   		ResultSet tupleEvents=Queries.getEvents(stmtEvents, username);
        		   		if(tupleEvents.first()) {
        		   			while(tupleEvents.next()) {
        		   				OrganizationProfile.addEvent(eventRetreiver(tupleEvents));
        		   			}
        		   			tupleEvents.close();
        		   		}
        		   		
        		   	    //get list of courts
        		   		stmtCourts = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        		   		ResultSet tupleCourts=Queries.getCourts(stmtCourts, username);
        		   		if(tupleCourts.first()) {
        		   			while(tupleCourts.next()) {
        		   				OrganizationProfile.addCourt(courtRetreiver(tupleCourts));
        		   			}
        		   			tupleCourts.close();
        		   		}
        		   		
        		   		type="organization";

        		   		
        		   		
        		   		
            		}
            		
            	}
                

            }while(rs.next());
            
            
           return type;            
            
		}finally {
			
			
            try {
                if (stmt != null)
                    stmt.close();
                if (stmtCourses != null)
                    stmtCourses.close();
                if (stmtCourts != null)
                    stmtCourts.close();
                if (stmtEvents != null)
                    stmtEvents.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
			
		}
		
			
	}

	public static void addNewProfile(String name, String surname, String username, String email, String password,String type) throws SQLException {
		Statement stmt=null;
		
		Connection conn=null;
		
		try {
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Queries.addProfile(stmt, name, surname, username, email, password,type);
		}
			catch (SQLException se) {
                se.printStackTrace();
			}
           
			
            
		finally {
			
			
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
		
	}
	
	public static boolean updateCredentials(String newName,String newSurname,String newUsername,String oldUsername) throws SQLException {
		Statement stmt=null;
		
		Connection conn=null;
		
		try {
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			if(Queries.doesThisUsernameAlreadyExist(stmt, newUsername)==null) {
				Queries.updateCredentials(stmt, newName, newSurname, newUsername, oldUsername);
				UserProfile.setName(newName);
				UserProfile.setSurname(newSurname);
				UserProfile.setUsername(newUsername);
				return true;
			}
		}
			catch (SQLException se) {
                se.printStackTrace();
                
			}
           
			
            
		finally {
			
			
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
		return false;
		
	}
	
	public static boolean updateCredentialsWithoutUsername(String newName,String newSurname,String oldUsername) throws SQLException {
		Statement stmt=null;
		Connection conn=null;
		
		try {
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Queries.updateCredentialsNoUsername(stmt, newName, newSurname, oldUsername);
			UserProfile.setName(newName);
			UserProfile.setSurname(newSurname);
			return true;
			
		}
			catch (SQLException se) {
                se.printStackTrace();
                
			}
           
			
            
		finally {
			
			
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
		return false;
		
	}
	
	public static boolean updateEmail(String newEmail,String username) throws SQLException {
		
		Statement stmt=null;
		Connection conn=null;

		
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			if(Queries.doesThisEmailAlreadyExist(stmt, newEmail)!=null) {
				Queries.updateEmail(stmt,newEmail,username);
				UserProfile.setEmail(newEmail);
				return true;	
			}
			return false;
	
		
	}
	
	public Event eventRetreiver(ResultSet tupleEvents ) throws SQLException {
		    String name=tupleEvents.getString("name");
			String organization=tupleEvents.getString("organization");
			String imgSrc=tupleEvents.getString("imgSrc");
			String date=tupleEvents.getString("date");
			String price=tupleEvents.getString("price");
			String sport=tupleEvents.getString("sport");
			
			String availability=tupleEvents.getString("availability");
			String description=tupleEvents.getString("description");
			
			Event event=new Event();
			event.setName(name);
			event.setOrganization(organization);
			event.setImgSrc(imgSrc);
			event.setDate(date);
			event.setPrice(price);
			event.setSport(sport);
			event.setAvailability(availability);
			event.setDescription(description);
			return event;
	}
	
	public Course courseRetreiver(ResultSet tupleCourses) throws SQLException {
		    String name=tupleCourses.getString("name");
			String organization=tupleCourses.getString("organization");
			String lessonPrice=tupleCourses.getString("lessonPrice");
			String monthlyPrice=tupleCourses.getString("monthlyPrice");
			String sport=tupleCourses.getString("sport");
			String instructorName=tupleCourses.getString("instructorName");
			String availability=tupleCourses.getString("availability");
			String description=tupleCourses.getString("description");
			
			Course course=new Course();
			course.setName(name);
			course.setOrganization(organization);
			course.setLessonPrice(lessonPrice);
			course.setMonthlyPrice(monthlyPrice);
			course.setSport(sport);
			course.setInstructorName(instructorName);
			course.setAvailability(availability);
			course.setDescription(description);
			
			return course;
	}
	
	public Court courtRetreiver(ResultSet tupleCourts) throws SQLException {
		    String name=tupleCourts.getString("name");
			String organization=tupleCourts.getString("organization");
			String price=tupleCourts.getString("price");
			String sport=tupleCourts.getString("sport");
			String availability=tupleCourts.getString("availability");
			String description=tupleCourts.getString("description");
			
			Court court=new Court();
			court.setName(name);
			court.setOrganization(organization);
			
			court.setSport(sport);
			
			court.setAvailability(availability);
			court.setDescription(description);
			return court;
	}
	
	
	public static boolean updatePassword(String newPassword,String username) throws SQLException {
		
		Statement stmt=null;
		Connection conn=null;
		
		
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Queries.updatePassword(stmt,newPassword,username);
			UserProfile.setPassword(newPassword);
			return true;	
		
	}
	
	
	
}