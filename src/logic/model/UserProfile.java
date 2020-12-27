package logic.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.event.Event;
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
	
	
	public String getName() {
		return name;
	}
	public static void setName(String nome) {
		name = nome;
	}
	public String getSurname() {
		return surname;
	}
	public static void setSurname(String cognome) {
		surname = cognome;
	}
	
	public static void setUsername(String usern) {
		username = usern;
	}
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	public static void setEmail(String iemail) {
		email = iemail;
	}
	
	public String getPassword() {
		return password;
	}
	public static void setPassword(String passwd) {
		password = passwd;
	}
	
	public static boolean checkCredentials() {
		usDAO = new UserProfileDAO();
		if(usDAO.goCheckAndTellMe()) {
			return true;
		}
		return false;
	}
	
	public static void getCredentials(SettingsBean settingsBean) {
		settingsBean.setName(name);
		settingsBean.setSurname(surname);
		settingsBean.setUsername(username);
		settingsBean.setEmail(email);
		settingsBean.setPassword(password);
	}
	
	//Overload
	public void getCredentials() {
		
	}
	

	public List<Course> getCourses() {
		return courses;
	}
	
	public List<Event> getEvents() {
		return events;
	}
	
     
	 

}
