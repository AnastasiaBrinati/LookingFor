package logic.model;

import java.util.ArrayList;

public class OrganizationProfile {

	private static String name;
	private static String email;
	private static String password;
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Event> events = new ArrayList<Event>();
	private static ArrayList<Court> courts = new ArrayList<Court>();

	
	public OrganizationProfile() {
		//constructor
	}
	
	public static void addCourse(Course course) {
		courses.add(course);
	}
	
	public static void addEvent(Event event) {
		events.add(event);
	}
	
	public static void addCourt(Court court) {
		courts.add(court);
	}


	public static String getName() {

		return name;
	}
	
	public static void setName(String nm) {
		name = nm;
	}

	public static String getEmail() {

		return email;
	}

	public static void setEmail(String theemail) {
		email = theemail;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String psswd) {
		password = psswd;
	}
	
	public static ArrayList<Course> getCourses() {
		return courses;
	}
	
	public static ArrayList<Event> getEvents() {
		return events;
	}
	
	public static ArrayList<Court> getCourts() {
		return courts;
	}
	
	public static void changeUsername(String newUsername) throws Exception{
		
		OrganizationDAO orgDAO = new OrganizationDAO();
		orgDAO.changeUsername(newUsername, name);
		
	}

	
	public static void changeEmail(String newEmail) throws Exception {
		
		OrganizationDAO orgDAO = new OrganizationDAO();
		if(!orgDAO.changeEmail(newEmail, name)) {
			//handle failure
			return;
		}
		
	}
	
	public static void changePassword(String newPassword) throws Exception {
		
		OrganizationDAO orgDAO = new OrganizationDAO();
		if(!orgDAO.changePassword(newPassword, name)) {
			//handle failure
			return;
		}

		
	}

	
}