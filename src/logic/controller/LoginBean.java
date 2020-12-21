package logic.controller;

//import logic.view.desktop.LoginUI;

public class LoginBean {
	
	//private LoginUI view;
	
	public LoginBean() {
		
	}
	private static String email;
	private static String username;
	private String password;
	
	
	//////
	public void setUsername(String un) {
		username = un;
	}
	public String getUsername() {
		return username;
	}
	//////
	
	
	
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
}
