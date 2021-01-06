package logic.model;

import java.util.ArrayList;

public class OrganizationBean {
	
	private static String name;
	public static String email;
	public static String password;
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Event> events = new ArrayList<Event>();
	private static ArrayList<Court> courts = new ArrayList<Court>();
	
	public OrganizationBean() {
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		name = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String iemail) {
		email = iemail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String passwd) {
		password = passwd;
	}
	
	public static void setCourses(ArrayList<Course> courseslist) {
		courses = courseslist;
	}
	
	public static ArrayList<Course> getCourses(){
		return courses;
	}
	
	public static void setEvents(ArrayList<Event> eventslist) {
		events = eventslist;
	}
	
	public static ArrayList<Event> getEvents(){
		return events;
	}
	
	public static void setCourts(ArrayList<Court> courtslist) {
		courts = courtslist;
	}
	
	public static ArrayList<Court> getCourts(){
		return courts;
	}
	
	public static void setCredentials(OrganizationBean orgBean) {
		name = OrganizationProfile.getName();
		email = OrganizationProfile.getEmail();
		password = OrganizationProfile.getPassword();
	}
}
