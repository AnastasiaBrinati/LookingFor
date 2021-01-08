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
    
    public void changeUsername(String newUsername, String oldUsername) {
    	Statement stmt=null;
		
		Connection conn=null;
		
		try {
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			if(Queries.doesThisUsernameAlreadyExist(stmt, oldUsername)==null) {
				Queries.updateCredentials(stmt, "", "", newUsername, oldUsername);
				OrganizationProfile.setName(newUsername);
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

    }
    
    
    
	
    public boolean changeEmail(String newEmail,String username) throws SQLException {
		
    	Statement stmt=null;
		Connection conn=null;
		
		
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			if(Queries.doesThisEmailAlreadyExist(stmt, newEmail)!=null) {
				Queries.updateEmail(stmt,newEmail,username);
				OrganizationProfile.setEmail(newEmail);
				return true;	
			}
			return false;	
		
	}
    
    public boolean changePassword(String newPassword,String username) throws SQLException {
		
		Statement stmt=null;
		Connection conn=null;
		
		
			
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			Queries.updatePassword(stmt,newPassword,username);
			OrganizationProfile.setPassword(newPassword);
			return true;	
		
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
