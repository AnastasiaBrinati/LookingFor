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
		/*
		UserProfile.setUsername(loginBean.getUsername());
		UserProfile.setPassword(loginBean.getPassword());
		UserProfile.setEmail(loginBean.getEmail());
		*/
		return UserProfile.checkCredentials(loginBean.getUsername(), loginBean.getPassword()); 
		
	
	}
	
}
