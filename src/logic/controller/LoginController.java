package logic.controller;

import logic.model.UserProfile;

public class LoginController {
	
	//private static LoginUI loginView;
	private static UserProfile model;
	private static LoginController instance = null;
	
	private LoginController() {
	}
	
	public static synchronized LoginController getInstance() {
		if(instance==null) {
			instance = new LoginController();
			//instance.assegnaGestori();
		}
	
		return instance;
	}
	
	
	public boolean isAValidUser(LoginBean loginBean) {
		
		model = new UserProfile();
		if(model.checkCredentials(loginBean.getUsername())) {
			return true;
		}

		return false;
		
	}
	
	
	
	
	
}
