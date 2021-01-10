package logic.controller;

import java.sql.SQLException;

import logic.model.OrganizationProfile;
import logic.model.UserProfile;

public class CustomizationController {
	

	//single user
	public void changeCredentialsName(SettingsSUsBean settingBean) throws SQLException {
		if(settingBean.getUsername().equals(UserProfile.getUsername())) {
			UserProfile.changeCredentials(settingBean.getName(), settingBean.getSurname());
		}
		if(!UserProfile.changeCredentials(settingBean.getName(), settingBean.getSurname(), settingBean.getUsername())) {
			//return "username already in use";
		}
	}
	
	
	public void changeCredentialsEmail(SettingsSUsBean settingBean) throws SQLException {
		//cerco conferma se password inserita è uguale
		if(settingBean.getPassword().equals(UserProfile.getPassword())) {
			UserProfile.changeCredentials(settingBean.getEmail());
		}
	}
	
	
	public void changeCredentialsPassword(SettingsSUsBean settingBean) throws SQLException {
		if(settingBean.getPassword().equals(UserProfile.getPassword())) {
			UserProfile.changePassword(settingBean.getNewPassword());
		}
	}
	
	
	
	
	//organization
	public void changeName(SettingsOrgBean settingBean) throws Exception {
		
		if(settingBean.getName().equals(OrganizationProfile.getName())) {
			OrganizationProfile.changeUsername(settingBean.getName());
		}
		
	}
	
	public void changeEmail(SettingsOrgBean settingBean) throws Exception {
		
		if(settingBean.getPassword().equals(OrganizationProfile.getPassword())) {
			OrganizationProfile.changeEmail(settingBean.getEmail());
		}
	}
	

	public void changePassword(SettingsOrgBean settingBean) throws Exception {
		if(settingBean.getPassword().equals(OrganizationProfile.getPassword())) {
			OrganizationProfile.changePassword(settingBean.getPassword());
		}
		
	}


}
