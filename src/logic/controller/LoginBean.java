package logic.controller;


public class LoginBean {
	
	private static String email;
	private String username;
	private String password;
	
	public LoginBean() {
	}
	
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
	
	public static boolean checkCredentials(LoginBean lb) throws Exception {
		LoginController loginController = LoginController.getInstance();
		if(loginController.isAValidUser(lb)) {
			return true;
		}
		return false;
	}
	
}
