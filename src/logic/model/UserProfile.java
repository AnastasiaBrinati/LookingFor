package logic.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.event.Event;

import logic.controller.LoginBean;
import logic.model.UserProfileDAO;


public class UserProfile {
	
	private static String name;
	private static String surname;
	private static String username;
	private static String email;
	private static String password;
	private List<Course> courses = new ArrayList<>();
	private List<Event> events=new ArrayList<>();
	 
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
	public static void setPassword(String passwd) {
		password = passwd;
	}
	
	public static boolean checkCredentials() throws Exception {
		usDAO = new UserProfileDAO();

		if(usDAO.goCheckAndTellMe(username,password)) {
			return true;
		}
		return false;
	}
	
	public static boolean applyChange() throws Exception{
		//if DAO says ok its ok
		return true;
	}
	

	public List<Course> getCourses() {
		return courses;
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
     
	 

}
