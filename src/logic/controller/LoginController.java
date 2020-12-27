package logic.controller;

import logic.model.UserProfile;

public class LoginController {

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
	
	
	public boolean isAValidUser(LoginBean loginBean) throws Exception {
		
		UserProfile.setUsername(loginBean.getUsername());
		UserProfile.setPassword(loginBean.getPassword());
		UserProfile.setEmail(loginBean.getEmail());
		if(UserProfile.checkCredentials(loginBean)) {
			return true;
		}

		return false;
		
	}
	
	
	
	
	
}