package logic.controller;

import java.util.ArrayList;

import logic.model.Course;
import logic.model.Court;
import logic.model.Event;
import logic.model.UserProfile;

public class ProfileBean {
	
	private static String name;
	public static String surname;
	public static String username;
	public static String email;
	public static String password;
	private static String location;
	
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Event> events=new ArrayList<Event>();
	private static ArrayList<Court> courts = new ArrayList<Court>();
	
	public ProfileBean() {
		//costruttore
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		name = nome;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String cognome) {
		surname = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String usern) {
		username= usern;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		ProfileBean.location = location;
	}
	
	public ArrayList<Course> getCourses() {
		return UserProfile.getCourses();
	}
	
	public ArrayList<Event> getEvents() {
		return UserProfile.getEvents();
	}
	
	public ArrayList<Court> getCourt() {
		return UserProfile.getCourts();
	}
	
	
	
	public static void setCredentials(ProfileBean profileBean) {
		profileBean.setName(UserProfile.getName());
		profileBean.setSurname(UserProfile.getSurname());
		profileBean.setUsername(UserProfile.getUsername());
		profileBean.setEmail(UserProfile.getEmail());
		profileBean.setPassword(UserProfile.getPassword());
		profileBean.setLocation(UserProfile.getLocation());
	}

}
