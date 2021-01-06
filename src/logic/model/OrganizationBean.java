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
	
	
	public static void setCredentials(OrganizationBean orgBean) {
		name = OrganizationProfile.getName();
		email = OrganizationProfile.getEmail();
		password = OrganizationProfile.getPassword();
	}
}
