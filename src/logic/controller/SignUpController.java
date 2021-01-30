package logic.controller;

import java.sql.SQLException;

import logic.model.UserProfile;

public class SignUpController {
	
	private static SignUpController instance=null;
	
	private SignUpController() {
		//constructor
	}
	
	public static synchronized SignUpController getInstance() {
		if(instance==null) {
			instance=new SignUpController();
		}
		return instance;
	}
	
	public void signUpUser(SignUpBean signUpBean) throws SQLException {
		
		UserProfile.createNewProfile(signUpBean.getName(),signUpBean.getSurname(),signUpBean.getUsername(),signUpBean.getEmail(),signUpBean.getPassword(),signUpBean.getType(),signUpBean.getLocation());
		
	}

}
