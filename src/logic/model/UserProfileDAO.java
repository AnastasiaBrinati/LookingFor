package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import logic.model.Course;
import logic.controller.Queries;



public class UserProfileDAO {
	
	
	private static String USER = "d0cl8zm89gc67d2t";
    private static String PASS = "n1161ldsuifnjou5";
    private static String DB_URL = "jdbc:mysql://d0cl8zm89gc67d2t:n1161ldsuifnjou5@r6ze0q02l4me77k3.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/w2l441mj7t77vuhd";
    private static String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    

   
	
	public boolean goCheckAndTellMe(String username,String password) throws Exception {
		
		//dichiarazioni 
		Statement stmt=null;
		Connection conn=null;
		
		try {
			//step2: loading dinamico driver mysql
			
			Class.forName(DRIVER_CLASS_NAME);
			
			//step3: apertura connessione
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
						//step4: creazione ed esecuzione query 
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs = Queries.checkSignedUser(stmt, username,password);
			
			if (!rs.first()){ // rs empty
            	Exception e = new Exception("No username Found matching with username: "+username);
            	throw e;
            }
            
            // riposizionamento del cursore
            rs.first();
            do{
            	String foundPassword=rs.getString("password");
            	if(foundPassword.equals(password)) {
            		System.out.println("Correct password!");
            		return true;
            	}
                

            }while(rs.next());
            
            
            return false;
		}finally {
			
			// STEP 5.2: Clean-up dell'ambiente
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
