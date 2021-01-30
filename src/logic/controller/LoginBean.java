package logic.controller;


public class LoginBean {
	
	private String email=null;
	private String username;
	private String password;
	
	public LoginBean() {
		//constructor
	}
	
	public void setUsername(String username) {
		if(username.contains("@")) {
				setEmail(username);
				return;
		}
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
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	public static String checkCredentials(LoginBean lb) throws Exception {
		LoginController loginController = LoginController.getInstance();
		return loginController.isAValidUser(lb);
	}
	
}
