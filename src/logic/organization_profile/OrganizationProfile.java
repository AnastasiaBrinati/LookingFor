package logic.organization_profile;

import java.util.ArrayList;

import logic.course_page.Course;

public class OrganizationProfile {
	
	private String name;
	private String email;
	private String password;
	
	private Course c;
	private static ArrayList<Course> courses;
	
	public OrganizationProfile() {
		//String name, String username
		//se credenziali ok
		//inizializzo l'array di corsi dal db		
		
		//esempio
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	
	
	

}