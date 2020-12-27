package logic.controller;

import logic.model.UserProfile;

public class LoginController {
	
	//private static LoginUI loginView;
	private static UserProfile userProfile;
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
		
		userProfile = new UserProfile();
		userProfile.setUsername(loginBean.getUsername());
		userProfile.setPassword(loginBean.getPassword());
		userProfile.setEmail(loginBean.getEmail());
		if(userProfile.checkCredentials(userProfile)) {
			return true;
		}

		return false;
		
	}
	
	
	
	
	
}
