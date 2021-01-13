package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CourtDAO {

	
		private static String USER = "u0uxwvy2unqsxnql";
	    private static String PASS = "nH1ORFX9CBydKKphGtBO";
	    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nh1orfx9cbydkkphgtbo@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
	    
	    
	    
		
	    public void addCourt(Court newCourt) throws Exception {
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
	            int result = Queries.addCourt(stmt, newCourt);
	            
	            // STEP 5.1: Clean-up dell'ambiente
	            
	 
	        } finally {
	            // STEP 5.2: Clean-up dell'ambiente        	
	                if (stmt != null)
	                    stmt.close();
	                if (conn != null)
	                    conn.close();
	        }
	    
		}
	    
	    public Court getCourt(String courtName,String organizationName) throws Exception {
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
	            ResultSet rs = Queries.getUserCourt(stmt, courtName,organizationName);
	            if (!rs.first()){				
					Exception e = new Exception("No court Found matching with username: "  + organizationName);
	            	throw e;
			    }
			
	            rs.first();
	            Court court = new Court();
	            court.setName(rs.getString("name"));
	        	court.setPrice(rs.getString("price"));
	        	court.setSport(rs.getString("sport"));
	        	court.setType(rs.getString("type"));
	        	court.setAvailability(rs.getString("availability"));
	        	court.setDescription(rs.getString("description"));
	        	rs.close();
	        	return court;
	        	
	        	
	        	
	        	
	        	
	        	
	            
	            
	            // STEP 5.1: Clean-up dell'ambiente
	            
	        } finally {
	            // STEP 5.2: Clean-up dell'ambiente        	
	                if (stmt != null)
	                    stmt.close();
	                if (conn != null)
	                    conn.close();
	        }
	    }

		public ArrayList<Court> retreiveBySport(String sport) {
			Statement stmt = null;
	        Connection conn = null;
	        ArrayList<Court> foundCourts = new ArrayList<Court>();
	        
	        try {
	            
	            try {
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
				} catch (SQLException e1) {
					
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
	            	String price=rs.getString("price");
	            	String availability=rs.getString("availability");
	            	String description = rs.getString("description");
	            	String date=rs.getString("date");
	            	Court foundCourt=new Court();
	            	foundCourt.setName(rs.getString("name"));
		        	foundCourt.setPrice(rs.getString("price"));
		        	foundCourt.setSport(rs.getString("sport"));
		        	foundCourt.setType(rs.getString("type"));
		        	foundCourt.setAvailability(rs.getString("availability"));
		        	foundCourt.setDescription(rs.getString("description"));
	                foundCourts.add(foundCourt);
	
	            }while(rs.next());
	            
	           
	            rs.close();
	        } catch (Exception e1) {
				
				e1.printStackTrace();
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
	
	        return foundCourts;
			
		}

		

}