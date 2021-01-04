package logic.controller;

import logic.model.UserProfile;

public class CustomizationController {
	
	
	public void changeCredentials(SettingsBean settingBean) throws Exception {
		
		if(UserProfile.canIChange(settingBean.getUsername())) {
			UserProfile.change(settingBean.getName(), settingBean.getSurname(), 1);
		}
		
		
	}
}
