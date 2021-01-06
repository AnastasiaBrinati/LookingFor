package logic.controller;

import java.sql.SQLException;

import logic.model.UserProfile;

public class SignUpController {
	
	public void signUpUser(SignUpBean signUpBean) throws SQLException {
		UserProfile.createNewProfile(signUpBean.getName(),signUpBean.getSurname(),signUpBean.getUsername(),signUpBean.getEmail(),signUpBean.getPassword(),signUpBean.getType());
		
		
	}

}
