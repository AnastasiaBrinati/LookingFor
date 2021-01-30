package logic.controller;

import logic.model.UserProfile;

public class LoginController {

	private static LoginController instance = null;
	
	private LoginController() {
		//constuctor
	}
	
	public static synchronized LoginController getInstance() {
		if(instance==null) {
			instance = new LoginController();
		}
	
		return instance;
	}
	
	
	public String isAValidUser(LoginBean loginBean) throws Exception {
		if(loginBean.getEmail()==null) {
			return UserProfile.checkCredentials(loginBean.getUsername(), loginBean.getPassword(), "username"); 
		}
		return UserProfile.checkCredentials(loginBean.getEmail(), loginBean.getPassword(), "email");
	
	}
	
}
