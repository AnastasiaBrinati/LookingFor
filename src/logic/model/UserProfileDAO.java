package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import logic.model.Course;



public class UserProfileDAO {
	
	
	private static String USER = "u0uxwvy2unqsxnql";
    private static String PASS = "nH1ORFX9CBydKKphGtBO";
    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nH1ORFX9CBydKKphGtBO@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
    //private static String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    
   //MANCA LA REFLECTION
    
    public void goChangeAndTellMe(String a, String b) {
    	
    }
	
	public boolean goCheckAndTellMe(String username,String password) throws Exception {
		
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
			ResultSet rs = Queries.checkSignedUser(stmt, username,password);
			
			if (!rs.first()){ // rs empty
            	Exception e = new Exception("No username Found matching with username: "+username);
            	throw e;
            }
           
            //riposizionamento del cursore
            rs.first();
            do{
            	String foundPassword=rs.getString("password");
            	if(foundPassword.equals(password)) {
            		//System.out.println("Correct password!");
            		
            		String nome = rs.getString("name");
            		String cognome = rs.getString("surname");
            		String email = rs.getString("email");
            		UserProfile.setName(nome);
            		UserProfile.setSurname(cognome);
            		UserProfile.setEmail(email);
            		
            		return true;
            	}
                

            }while(rs.next());
            
            
            return false;
            
            
		}finally {
			
			//STEP 5.2: Clean-up dell'ambiente
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
