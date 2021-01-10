package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourtDAO {

	
		private static String USER = "u0uxwvy2unqsxnql";
	    private static String PASS = "nH1ORFX9CBydKKphGtBO";
	    private static String DB_URL = "jdbc:mysql://u0uxwvy2unqsxnql:nH1ORFX9CBydKKphGtBO@b2wbztxcuqyvqxgg5qkl-mysql.services.clever-cloud.com:3306/b2wbztxcuqyvqxgg5qkl";
	    
	    
	    
		
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

}
