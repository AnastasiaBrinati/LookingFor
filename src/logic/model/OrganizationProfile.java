package logic.model;

import java.util.ArrayList;

public class OrganizationProfile {
	
<<<<<<< .mine
	private static String name;
	private static String email;
	private static String password;
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<SportEvent> events = new ArrayList<SportEvent>();
||||||| .r155
	private String name;
	private String email;
	private String password;
	private ArrayList<Course> courses = new ArrayList<Course>();
	private ArrayList<SportEvent> events=new ArrayList<SportEvent>();
=======
	private static  String name;
	private static String email;
	private static String password;
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<SportEvent> events=new ArrayList<SportEvent>();
>>>>>>> .r159
	
	
	public OrganizationProfile() {
		//String name, String username
		//se credenziali ok
		//inizializzo l'array di corsi dal db		
		//esempio
	}
	
	public static void addCourse(Course course) {
		courses.add(course);
	}
<<<<<<< .mine
	public static String getName() {
||||||| .r155

	public String getName() {
=======

	public static String getName() {
>>>>>>> .r159
		return name;
	}
<<<<<<< .mine
	public static void setName(String nm) {
		name = nm;
||||||| .r155

	public void setName(String name) {
		this.name = name;
=======

	public static void setName(String name) {
		name = name;
>>>>>>> .r159
	}
<<<<<<< .mine
	public static String getEmail() {
||||||| .r155

	public String getEmail() {
=======

	public static String getEmail() {
>>>>>>> .r159
		return email;
	}
<<<<<<< .mine
	public static void setEmail(String theemail) {
		email = theemail;
||||||| .r155

	public void setEmail(String email) {
		this.email = email;
=======

	public static void setEmail(String email) {
		email = email;
>>>>>>> .r159
	}
<<<<<<< .mine
	public static String getPassword() {
||||||| .r155

	public String getPassword() {
=======

	public static String getPassword() {
>>>>>>> .r159
		return password;
	}
<<<<<<< .mine
	public static void setPassword(String psswd) {
		password = psswd;
||||||| .r155

	public void setPassword(String password) {
		this.password = password;
=======

	public static void setPassword(String password) {
		password = password;
>>>>>>> .r159
	}
<<<<<<< .mine
	public static ArrayList<Course> getCourses() {
		return courses;
	}
	public static ArrayList<SportEvent> getEvents() {
||||||| .r155

	public ArrayList<SportEvent> getEvents() {
=======

	public static ArrayList<SportEvent> getEvents() {
>>>>>>> .r159
		return events;
	}

	
}