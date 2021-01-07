package logic.controller;

import java.sql.SQLException;

import logic.model.OrganizationProfile;
import logic.model.UserProfile;

public class CustomizationController {
	
	//for organization
	//single user
	public void changeCredentialsName(SettingsBean settingBean) throws SQLException {
		if(settingBean.getUsername().equals(UserProfile.getUsername())) {
			UserProfile.changeCredentials(settingBean.getName(), settingBean.getSurname());
		}
		UserProfile.changeCredentials(settingBean.getName(), settingBean.getSurname(), settingBean.getUsername());
	}
	
	
	public void changeCredentialsEmail(SettingsBean settingBean) throws SQLException {
		//cerco conferma se password inserita è uguale
		if(settingBean.getPassword().equals(UserProfile.getPassword())) {
			UserProfile.changeCredentials(settingBean.getEmail());
		}
	}
	
	public void changeCredentialsPassword(SettingsBean settingBean) throws SQLException {
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
