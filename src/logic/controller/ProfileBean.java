package logic.controller;

import logic.model.UserProfile;

public class ProfileBean {
	
	private static String name;
	public static String surname;
	public static String username;
	public static String email;
	public static String password;
	
	public ProfileBean() {
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
	
	public static void setCredentials(ProfileBean profileBean) {
		name = UserProfile.getName();
		surname = UserProfile.getSurname();
		username = UserProfile.getUsername();
		email = UserProfile.getEmail();
		password = UserProfile.getPassword();
	}
}
