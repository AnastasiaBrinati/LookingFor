package logic.controller;

import java.util.ArrayList;

import logic.model.Course;
import logic.model.Court;
import logic.model.Event;
import logic.model.UserProfile;

public class ProfileBean {
	
	public ProfileBean() {
		//constructor
	}
	
	
	public String getName() {
		return UserProfile.getName();
	}
	
	public String getSurname() {
		return UserProfile.getSurname();
	}
	
	public String getUsername() {
		return UserProfile.getUsername();
	}
	
	public String getEmail() {
		return UserProfile.getEmail();
	}
	
	public String getPassword() {
		return UserProfile.getPassword();
	}
	
	public String getLocation() {
		return UserProfile.getLocation();
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
	
	
}
