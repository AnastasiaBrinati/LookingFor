package logic.model;

import java.util.ArrayList;

public class OrganizationBean {
	
	private String name;
	private String email;
	private static String password;
	private static String location;
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Event> events = new ArrayList<Event>();
	private static ArrayList<Court> courts = new ArrayList<Court>();
	
	public OrganizationBean() {
		//constructor
	}
	
	public String getName() {
		return OrganizationProfile.getName();
	}
	public void setName(String nome) {
		this.name = nome;
	}
	public String getEmail() {
		return OrganizationProfile.getEmail();
	}
	public void setEmail(String iemail) {
		email = iemail;
	}
	public String getPassword() {
		return OrganizationProfile.getPassword();
	}
	public void setPassword(String passwd) {
		password = passwd;
	}
	
	public String getLocation() {
		return OrganizationProfile.getName();
	}


	public void setLocation(String location) {
		OrganizationBean.location = location;
	}
	
	public  void setCourses(ArrayList<Course> courseslist) {
		courses = courseslist;
	}
	
	public ArrayList<Course> getCourses(){
		
		return OrganizationProfile.getCourses();
	}
	
	public void setEvents(ArrayList<Event> eventslist) {
		events = eventslist;
	}
	
	public ArrayList<Event> getEvents(){
		return OrganizationProfile.getEvents();
	}
	
	public  void setCourts(ArrayList<Court> courtslist) {
		courts = courtslist;
	}
	
	public ArrayList<Court> getCourts(){
		return OrganizationProfile.getCourts();
	}
	

}
