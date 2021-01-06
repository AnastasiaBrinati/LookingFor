package logic.model;

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
	
	public static boolean canIChange(String username) throws Exception{
		/*
		usDAO = new UserProfileDAO();

		if(usDAO.changingData(username)) {
			return true;
			
			//se username è unique o uguale a prima
		}
		return false;
		*/
		
		return true;
	}
	
	public static void change(String credential1, String credential2, int x) {
		
		/*
		usDAO = new UserProfileDAO();
		
		if(x==1) {
			//credential1=name
			//credential2=surname
			usDAO.goChangeAndTellMe(credential1,credential2);
		}
		else if(x==2) {
			//credential1=email
			//credential2=password
			usDAO.goChangeAndTellMe(credential1,credential2);
		}
		*/
		
		
		//simulazione
		name = credential1;
		surname = credential2;

	}
	

	public List<Course> getCourses() {
		return courses;
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
     
	 

}
