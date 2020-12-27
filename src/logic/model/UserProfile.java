package logic.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.jdi.event.Event;
import logic.model.UserProfileDAO;


public class UserProfile {
	
	private String name;
	private String surname;
	private String username;
	private String email;
	private String password;
	private List<Course> courses = new ArrayList<>();
	private List<Event> events=new ArrayList<>();
	 
	private UserProfileDAO usDAO;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean checkCredentials(UserProfile user) {
		usDAO = new UserProfileDAO();
		if(usDAO.goCheckAndTellMe(user)) {
			return true;
		}
		return false;
	}
	
	public void getCredentials(SettingsBean settingsBean) {
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
