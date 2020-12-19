package logic.model;

import java.util.ArrayList;

public class OrganizationProfile {
	
	private String name;
	private String email;
	private String password;
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<SportEvent> events=new ArrayList<SportEvent>();
	
	
	public OrganizationProfile() {
		//String name, String username
		//se credenziali ok
		//inizializzo l'array di corsi dal db		
		
		//esempio
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public ArrayList<SportEvent> getEvents() {
		return events;
	}
	
}