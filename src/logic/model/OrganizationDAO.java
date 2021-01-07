package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class OrganizationDAO {
		

	private static String USER = "u0uxwvy2unqsxnql";
    private static String PASS = "nH1ORFX9CBydKKphGtBO";
    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nH1ORFX9CBydKKphGtBO@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
    //private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    
   //MANCA LA REFLECTION
    
    public void changeUsername(String username) {
    	
    }
	public Boolean usernameAlreadyExists(String username) throws Exception {
		
		//dichiarazioni 
		Statement stmt=null;
		Connection conn=null;
		
		try {
			//step2: loading dinamico driver mysql
			//Class.forName(DRIVER_CLASS_NAME);
			
			//step3: apertura connessione
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			//step4: creazione ed esecuzione query 
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = Queries.doesThisUsernameAlreadyExist(stmt, username);
			
			if (rs.first()){				
					Exception e = new Exception("Username Found matching with username: "+username);
	            	throw e;
			}
			return false;
            
            
		}finally {
			
			
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
	
	public Boolean emailAlreadyExists(String email, String username) throws Exception {
		
		//dichiarazioni 
		Statement stmt=null;
		Connection conn=null;
		
		try {
			//step2: loading dinamico driver mysql
			//Class.forName(DRIVER_CLASS_NAME);
			
			//step3: apertura connessione
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			//step4: creazione ed esecuzione query 
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = Queries.doesThisEmailAlreadyExist(stmt, email);
			
			if (rs.first()){
				
					Exception e = new Exception("Email Found matching with email: "+email);
	            	throw e;
			}
			return false;
            
            
		}finally {
			
			
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
	
	
	
}
