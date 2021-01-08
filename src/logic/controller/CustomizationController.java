package logic.controller;

import java.sql.SQLException;

import logic.model.OrganizationBean;
import logic.model.OrganizationProfile;
import logic.model.UserProfile;

public class CustomizationController {
	

	//single user
	public String changeCredentialsName(SettingsSingleUserBean settingBean) throws SQLException {
		if(settingBean.getUsername().equals(UserProfile.getUsername())) {
			UserProfile.changeCredentials(settingBean.getName(), settingBean.getSurname()));
		}
		if(!UserProfile.changeCredentials(settingBean.getName(), settingBean.getSurname(), settingBean.getUsername())) {
			return "username already in use";
		}
	}
	
	
	public void changeCredentialsEmail(SettingsSingleUserBean settingBean) throws SQLException {
		//cerco conferma se password inserita è uguale
		if(settingBean.getPassword().equals(UserProfile.getPassword())) {
			UserProfile.changeCredentials(settingBean.getEmail());
		}
	}
	
	
	public void changeCredentialsPassword(SettingsSingleUserBean settingBean) throws SQLException {
		if(settingBean.getPassword().equals(UserProfile.getPassword())) {
			UserProfile.changePassword(settingBean.getNewPassword());
		}
	}
	
	
	
	
	//organization
	public void changeName(SettingsOrgBean settingBean) throws Exception {
		
		if(!OrganizationProfile.changeUsername(settingBean.getName())) {
			//va male
		}
		
	}
	
	public void changeEmail(SettingsOrgBean settingBean) throws Exception {
		
		if(settingBean.getPassword().equals(OrganizationProfile.getPassword())) {
			//fai il metodo
		}
	}
	

	public void changePassword(SettingsOrgBean settingBean) {
		if(settingBean.getPassword().equals(OrganizationProfile.getPassword())) {
			OrganizationProfile.changeCredentials(settingBean.getEmail());
		}
		
	}


}
