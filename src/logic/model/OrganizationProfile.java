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
		//String name, String username
		//se credenziali ok
		//inizializzo l'array di corsi dal db		
		//esempio
	}
	
	public static void addCourse(Course course) {
		courses.add(course);
		OrganizationBean.setCourses(courses);
	}
	
	public static void addEvent(Event event) {
		events.add(event);
		OrganizationBean.setEvents(events);
	}
	
	public static void addCourt(Court court) {
		courts.add(court);
		OrganizationBean.setCourts(courts);
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
	
	
	public static boolean changeUsername(String username) throws Exception{
		
		OrganizationDAO orgDAO = new OrganizationDAO();
		if(orgDAO.usernameAlreadyExists(username)) {
			return false;
		}
		orgDAO.changeUsername(username);
		return true;
		
	}

	
	public static boolean changeEmail(String email) throws Exception {
		
		OrganizationDAO orgDAO = new OrganizationDAO();
		if(orgDAO.emailAlreadyExists(email, name)) {
			return false;
		}
		orgDAO.changeUsername(email);
		return true;
		
	}

	
}