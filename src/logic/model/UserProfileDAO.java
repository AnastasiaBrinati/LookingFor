package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserProfileDAO {
	
	
	private static String USER = "u0uxwvy2unqsxnql";
    private static String PASS = "nH1ORFX9CBydKKphGtBO";
    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nH1ORFX9CBydKKphGtBO@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
    //private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    
   //MANCA LA REFLECTION
    
    public void goChangeAndTellMe(String a, String b) {
    	
    }
	
	public String goCheckAndTellMe(String username,String password) throws Exception {
		
		//dichiarazioni 
		Statement stmt=null;
		Statement stmtCourses = null;
		Statement stmtEvents = null;
		Statement stmtCourts = null;
		Connection conn=null;
		
		try {
			//step2: loading dinamico driver mysql
			//Class.forName(DRIVER_CLASS_NAME);
			
			//step3: apertura connessione
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			//step4: creazione ed esecuzione query 
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = Queries.checkSignedUser(stmt, username);
			
			if (!rs.first()){				
					Exception e = new Exception("No username Found matching with username: "+username);
	            	throw e;
			}
			
            rs.first();
            do{
            	String foundPassword=rs.getString("password");
            	if(foundPassword.equals(password)) {
            		String type = rs.getString("type");
            		if(type.equals("singleuser")) {
            	
            		   		String nome = rs.getString("name");
            		   		String cognome = rs.getString("surname");
            		   		String email = rs.getString("email");
            		   		UserProfile.setName(nome);
            		   		UserProfile.setSurname(cognome);
            		   		UserProfile.setEmail(email);
            		
            		   		UserProfile.setUsername(username);
            		   		UserProfile.setPassword(password);
            		
            		   		System.out.println(type);
            		   		return type;
            		}
            		else {
            			
        		   		OrganizationProfile.setName(username);
        		   		//null:OrganizationProfile.setSurname(cognome);
        		   		OrganizationProfile.setEmail(rs.getString("email"));
        		   		//OrganizationProfile.setUsername(username);
        		   		OrganizationProfile.setPassword(password);
        		   		
        		   		
        		   		
        		   		//get list of courses
        		   		stmtCourses = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        		   		ResultSet tupleCourses = Queries.getCourses(stmtCourses, username);
        		   		//scorrere tuple ed aggiungerle all'organizationProfile
        		   		if(!tupleCourses.first()) {
        		   			Exception e = new Exception("No username Found matching with username: "+username);
        	            	throw e;
        		   			
        		   		}
        		   		tupleCourses.first();
        		   		do {
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
        		   			
        		   			OrganizationProfile.addCourse(course);
        		   			
        		   		}while(tupleCourses.next());

        		   		
        		   		//get list of events
        		   		stmtEvents = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        		   		ResultSet tupleEvents = Queries.getEvents(stmtEvents, username);
        		   		//scorrere tuple ed aggiungerle all'organizationProfile
        		   		if(!tupleCourses.first()) {
        		   			Exception e = new Exception("No username Found matching with username: "+username);
        	            	throw e;
        		   			
        		   		}
        		   		tupleEvents.first();
        		   		do {
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
        		   			
        		   			OrganizationProfile.addEvent(event);
        		   			
        		   		}while(tupleEvents.next());

        		   		
        		   		//get list of courts
        		   		stmtCourts = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        		   		ResultSet tupleCourts = Queries.getCourts(stmtCourts, username);
        		   		//scorrere tuple ed aggiungerle all'organizationProfile
        		   		if(!tupleCourses.first()) {
        		   			Exception e = new Exception("No username Found matching with username: "+username);
        	            	throw e;
        		   			
        		   		}
        		   		tupleCourts.first();
        		   		do {
        		   			String name=tupleCourts.getString("name");
        		   			String organization=tupleCourts.getString("organization");
        		   			String price=tupleCourts.getString("price");
        		   			String sport=tupleCourts.getString("sport");
        		   			String instructorName=tupleCourts.getString("instructorName");
        		   			String availability=tupleCourts.getString("availability");
        		   			String description=tupleCourts.getString("description");
        		   			
        		   			Court court=new Court();
        		   			court.setName(name);
        		   			court.setOrganization(organization);
        		   			
        		   			court.setSport(sport);
        		   			
        		   			court.setAvailability(availability);
        		   			court.setDescription(description);
        		   			
        		   			OrganizationProfile.addCourt(court);
        		   			
        		   		}while(tupleCourses.next());

        		   		
        		   		//System.out.println(type);
        		   		return type;
            		}
            		
            	}
                

            }while(rs.next());
            
            
            return "null";
            
            
		}finally {
			
			//STEP 5.2: Clean-up dell'ambiente
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
	
	
	
}