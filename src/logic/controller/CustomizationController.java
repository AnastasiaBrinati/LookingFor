package logic.controller;

import logic.model.OrganizationProfile;
import logic.model.UserProfile;

public class CustomizationController {
	
	//for organization
	//single user
	public void changeCredentialsName(SettingsBean settingBean) {
		UserProfile.changeCredentials(settingBean.getName(), settingBean.getSurname(), settingBean.getUsername());
	}
	
	public void changeCredentialsEmail(SettingsBean settingBean) {
		if(settingBean.getPassword().equals(UserProfile.getPassword())) {
		UserProfile.changeCredentials(settingBean.getEmail());
		}
	}
	
	
	//organization
	public void changeNameLocation(SettingsBean settingBean) throws Exception {
		
		if(!OrganizationProfile.changeUsername(settingBean.getName())) {
			//va male
		}
		
	}
	
	public void changeEmailPassword(SettingsBean settingBean) throws Exception {
		
		if(!OrganizationProfile.changeEmail(settingBean.getEmail())) {
			//va male
		}
	}
	
	//for single user
	public void changeCredentials(SettingsBean settingBean) {
		
		
	}

}
