package logic.model;

import java.sql.SQLException;
import java.util.ArrayList;



public class UserProfile {
	
	private static String name;
	private static String surname;
	private static String username;
	private static String email;
	private static String password;
	private static String location;

	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Event> events=new ArrayList<Event>();
	private static ArrayList<Court> courts = new ArrayList<Court>();

	 
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
	
	public static String getLocation() {
		return location;
	}
	public static void setLocation(String location) {
		UserProfile.location = location;
	} 	
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public ArrayList<Event> getEvents() {
		return events;
	}
	
	public ArrayList<Court> getCourt() {
		return courts;
	}
	
	
	
	
	public static String checkCredentials(String username, String password) throws Exception {
		usDAO = new UserProfileDAO();

		String result = usDAO.goCheckAndTellMe(username,password); 
		return result;
		
	}
	
	
	public static void addCourse(Course newCourse) {
		courses.add(newCourse);
	}
	
	public static void addEvent(Event newEvent) {
		events.add(newEvent);
	}
	
	public static void addCourt(Court newCourt) {
		courts.add(newCourt);
	}
		
	//from sign up use case
	public static void createNewProfile(String name, String surname, String username, String email,String password,String type,String location) throws SQLException {
		UserProfileDAO.addNewProfile(name,surname,username,email,password,type,location);
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