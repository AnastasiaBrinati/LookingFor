package logic.controller;

import java.sql.SQLException;

public class SettingsBean {
	
	//1
	private String name;
	private String surname;
	private String username;
	
	//2
	private String email;
	private static String oldPassword;
	private static String newPassword;
	
	public SettingsBean() {
	}
	
	//just for single user
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	//for both users
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPassword(String psswd) {
		oldPassword = psswd;
	}
	public String getPassword() {
		return oldPassword;
	}
	
	public void setNewPassword(String newPasswd) {
		newPassword = newPasswd;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	
	
	
	//single user
	public static void changeUCredentialsName(SettingsBean settingBean) throws SQLException {
		CustomizationController customizer=new CustomizationController();
		customizer.changeCredentialsName(settingBean);
	}
	
	public static void changeUCredentialsEmail(SettingsBean settingBean) throws SQLException {
		CustomizationController customizer=new CustomizationController();
		customizer.changeCredentialsEmail(settingBean);
	}
	
	public static void changeUCredentialsPassword(SettingsBean settingBean) throws SQLException {
		CustomizationController customizer=new CustomizationController();
		customizer.changeCredentialsPassword(settingBean);
	}
	
	//organization
	public static void changeName(SettingsBean settingBean) throws Exception {
		CustomizationController customizer = new CustomizationController();
		customizer.changeName(settingBean);
	}
	
	public static void changeEmail(SettingsBean settingBean) throws Exception {
		CustomizationController customizer = new CustomizationController();
		customizer.changeEmail(settingBean);
	}
	
	public static void changePassword(SettingsBean settingBean) throws Exception {
		CustomizationController customizer = new CustomizationController();
		customizer.changePassword(settingBean);
	}
}
