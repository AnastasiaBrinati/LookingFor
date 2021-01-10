package logic.model;

import java.util.ArrayList;

public class OrganizationBean {
	
	private static String name;
	private static String email;
	private static String password;
	private static String location;
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Event> events = new ArrayList<Event>();
	private static ArrayList<Court> courts = new ArrayList<Court>();
	
	public OrganizationBean() {
		//constructor
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
	public  void setPassword(String passwd) {
		password = passwd;
	}
	
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		OrganizationBean.location = location;
	}
	
	public  void setCourses(ArrayList<Course> courseslist) {
		courses = courseslist;
	}
	
	public ArrayList<Course> getCourses(){
		
		return courses;
	}
	
	public void setEvents(ArrayList<Event> eventslist) {
		events = eventslist;
	}
	
	public ArrayList<Event> getEvents(){
		return events;
	}
	
	public  void setCourts(ArrayList<Court> courtslist) {
		courts = courtslist;
	}
	

	public ArrayList<Court> getCourts(){
		return courts;
	}
	
	public static void setCredentials(OrganizationBean orgBean) {
		orgBean.setName(OrganizationProfile.getName());
		orgBean.setEmail(OrganizationProfile.getEmail());
		orgBean.setPassword(OrganizationProfile.getPassword());
		orgBean.setCourses(OrganizationProfile.getCourses());
		orgBean.setEvents(OrganizationProfile.getEvents());
		orgBean.setCourts(OrganizationProfile.getCourts());
		orgBean.setLocation(OrganizationProfile.getLocation());
	}


}
