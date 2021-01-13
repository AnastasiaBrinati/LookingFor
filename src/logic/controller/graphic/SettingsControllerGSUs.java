package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.ProfileBean;
import logic.controller.SettingsSUsBean;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUISUs;


public class SettingsControllerGSUs {
	
	private static SettingsUISUs view;
	private static SettingsControllerGSUs instance = null;
	
	private SettingsControllerGSUs(SettingsUISUs settingsview) {
		SettingsControllerGSUs.view = settingsview;
	}
	
	public static synchronized SettingsControllerGSUs getInstance(SettingsUISUs view) {
		if(instance == null) {
			instance = new SettingsControllerGSUs(view);
			assegnaGestori();
		}
		setCredentials();
		showSettingsView();
		return instance;
	}
	
	private static void showSettingsView() {
		view.setVisible(true);
	}
	
	private static void setCredentials() {
		ProfileBean profileBean = new ProfileBean();
		ProfileBean.setCredentials(profileBean);
		String name = profileBean.getName();
		String surname = profileBean.getSurname();
		String username = profileBean.getUsername();
		String email = profileBean.getEmail();
		view.setCredentials(name, surname, username, email);
	}
	
	private static void assegnaGestori() {
		
		ActionListener gestoreHome = e -> {

				view.setVisible(false);
				HomeUI homeview = new HomeUI();
				HomeControllerGSUs.getInstance(homeview);
	
		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		ActionListener gestoreCancel = e -> {

				setCredentials();

		};
		view.getCancelButton().addActionListener(gestoreCancel);
		
		ActionListener gestoreCancel2 = e -> {

				setCredentials();
		
		};
		view.getCancelButton2().addActionListener(gestoreCancel2);
		
		ActionListener gestoreCancel3 = e -> {

				setCredentials();

		};
		view.getCancelButton3().addActionListener(gestoreCancel3);
		
		ActionListener gestoreExit = e -> {

				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		ActionListener gestoreCredentials = e -> {

				view.setNamePanelVisible();

		};
		view.getCredentialsButton().addActionListener(gestoreCredentials);
		
		
		ActionListener gestoreSecurity = e -> {

		
				view.setEmailPanelVisible();

		};
		view.getSecurityButton().addActionListener(gestoreSecurity);
		
		ActionListener gestorePassword = e -> {

				view.setPasswordPanelVisible();

		};
		view.getPasswordButton().addActionListener(gestorePassword);
		
		ActionListener gestoreSave = e -> {
			
				SettingsSUsBean settingBean = new SettingsSUsBean();
				settingBean.setUsername(view.getUsername());
				settingBean.setName(view.getName());
				settingBean.setSurname(view.getSurname());
				
				try {
					SettingsSUsBean.changeUCredentialsName(settingBean);
				} catch (Exception e1) {
					view.showErrorMessage("username already in use");
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();

		};
		view.getSaveButton().addActionListener(gestoreSave);
		
		
		ActionListener gestoreSave2 = e -> {

				SettingsSUsBean settingBean = new SettingsSUsBean();
				settingBean.setEmail(view.getEmail());
				settingBean.setPassword(view.getPassword());
				
				try {
					SettingsSUsBean.changeUCredentialsEmail(settingBean);
					
				} catch (Exception e1) {
					view.showErrorMessage2("either one your email or password is incorrect");
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
				

		};
		view.getSaveButton2().addActionListener(gestoreSave2);
		
		ActionListener gestoreSave3 = e -> {

				SettingsSUsBean settingBean = new SettingsSUsBean();
				settingBean.setNewPassword(view.getNewPassword());
				settingBean.setPassword(view.getOldPassword());
				
				try {
					SettingsSUsBean.changeUCredentialsPassword(settingBean);
					System.out.println("Changing credentials");
				} catch (Exception e1) {
					view.showErrorMessage2("wrong password");
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
				


		};
		view.getSaveButton3().addActionListener(gestoreSave3);
	}
}