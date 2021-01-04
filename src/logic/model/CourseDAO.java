package logic.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import logic.model.Course;



public class CourseDAO {
	
	
	private static String USER = "d0cl8zm89gc67d2t";
    private static String PASS = "n1161ldsuifnjou5";
    private static String DB_URL = "jdbc:mysql://d0cl8zm89gc67d2t:n1161ldsuifnjou5@r6ze0q02l4me77k3.chr7pe7iynqr.eu-west-1.rds.amazonaws.com:3306/w2l441mj7t77vuhd";
    
    
    
	
    public static void addCourse(Course course) throws Exception {
       
        Statement stmt = null;
        Connection conn = null;
        
        try {
            
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            int rs = Queries.addCourse(stmt, course);
            
            
           
            stmt.close();

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            int result = Queries.addCourse(stmt, course);
            
          
            
        } finally {
            	
                if (stmt != null)
                    stmt.close();
                if (conn != null)
                    conn.close();
        }
    }
}