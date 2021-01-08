package logic.model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.event.Event;


public class UserProfile {
	
	private static String name;
	private static String surname;
	private static String username;
	private static String email;
	private static String password;
	private List<Course> courses = new ArrayList<Course>();
	private List<Event> events=new ArrayList<Event>();
	 
	private static UserProfileDAO usDAO;
	
	
	public static String getName() {
		return name;
	}
	public static void setName(String nome) {
		name = nome;
	}
	
	public static String getSurname() {
		return surname;
	}
	public static void setSurname(String cognome) {
		surname = cognome;
	}
	
	public static void setUsername(String usern) {
		username = usern;
	}
	public static String getUsername() {
		return username;
	}
	
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String iemail) {
		email = iemail;
	}
	
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String psswd) {
		password = psswd;
	}
	
	public static String checkCredentials(String username, String password) throws Exception {
		usDAO = new UserProfileDAO();

		String result = usDAO.goCheckAndTellMe(username,password); 
		return result;
		
	}
	

	public List<Course> getCourses() {
		return courses;
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
	
	public static void createNewProfile(String name, String surname, String username, String email,String password,String type) throws SQLException {
		
		UserProfileDAO.addNewProfile(name,surname,username,email,password,type);
		
	}
	
	
	//UPDATES
	//changing name, surname and username
	public static boolean changeCredentials(String newName,String newSurname,String newUsername) throws SQLException {
		
			if(UserProfileDAO.updateCredentials(newName, newSurname, newUsername, username)) {
				return true;
			}
			return false;	
	}
	
	//changing only name and surname
	public static void changeCredentials(String newName,String newSurname) throws SQLException {
		
		if(UserProfileDAO.updateCredentialsWithoutUsername(newName, newSurname, username)) {
			return;
		}
	}
	
public static void changeCredentials(String newEmail) throws SQLException {
		
		if(UserProfileDAO.updateEmail(newEmail,username)) {
			return;	
		}
	} 
	
	public static void changePassword(String newPassword) throws SQLException {
		
		if(UserProfileDAO.updatePassword(newPassword ,username)) {
			return;
		}
	} 
	
	
	
     
	 

}
