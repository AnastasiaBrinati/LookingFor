package logic.controller;

//import logic.view.desktop.LoginUI;

public class LoginBean {
	
	public LoginBean() {
	}
		
	private static String email;
	private String username;
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
	////
	public String getEmail() {
		return email;
	}
	////
	
	public static boolean checkCredentials(LoginBean lb) {
		LoginController loginController = LoginController.getInstance();
		if(loginController.isAValidUser(lb)) {
			return true;
		}
		return false;
	}
	
}
