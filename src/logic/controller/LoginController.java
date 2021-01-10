package logic.controller;

import logic.model.UserProfile;

public class LoginController {

	private static LoginController instance = null;
	
	private LoginController() {
	}
	
	public static synchronized LoginController getInstance() {
		if(instance==null) {
			instance = new LoginController();
		}
	
		return instance;
	}
	
	
	public String isAValidUser(LoginBean loginBean) throws Exception {
		//or email
		return UserProfile.checkCredentials(loginBean.getUsername(), loginBean.getPassword()); 
		
	
	}
	
}
