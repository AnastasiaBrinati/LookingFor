package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.SettingsOrgBean;
import logic.controller.SettingsSUsBean;
import logic.model.OrganizationBean;
import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUIOrg;


public class SettingsControllerGOrg {

	private static SettingsUIOrg view;
	private static SettingsControllerGOrg instance = null;
	
	private SettingsControllerGOrg(SettingsUIOrg settingsview) {
		SettingsControllerGOrg.view = settingsview;
	}
	
	public synchronized static SettingsControllerGOrg getInstance(SettingsUIOrg view) {
		if(instance == null) {
			instance = new SettingsControllerGOrg(view);
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
		OrganizationBean orgBean = new OrganizationBean();
		String name = orgBean.getName();
		String email = orgBean.getEmail();
		view.setCredentials(name, email);
	}
	
	private static void assegnaGestori() {
		
		ActionListener gestoreExit = e -> {

				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);
				

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		
		ActionListener gestoreHome = e -> {

				view.setVisible(false);
				HomeUISUs homeview = new HomeUISUs();
				HomeControllerGOrg.getInstance(homeview);

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
		
		
		
		ActionListener gestoreName = e -> {

				view.setNamePanelVisible();

		};
		view.getNameButton().addActionListener(gestoreName);
		
		
		ActionListener gestoreEmail = e -> {

				view.setEmailPanelVisible();

		};
		view.getEmailButton().addActionListener(gestoreEmail);
		
		ActionListener gestorePassword = e -> {

				view.setPasswordPanelVisible();

		};
		view.getPasswordButton().addActionListener(gestorePassword);
		
		
		
		ActionListener gestoreSave = e -> {

		
				SettingsOrgBean settingBean = new SettingsOrgBean();
				settingBean.setName(view.getName());
				
				try {
					SettingsOrgBean.changeName(settingBean);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
		

		};
		view.getSaveButton().addActionListener(gestoreSave);
		
		ActionListener gestoreSave2 = e -> {

				SettingsOrgBean settingBean = new SettingsOrgBean();
				settingBean.setEmail(view.getEmail());
				settingBean.setPassword(view.getPassword());

				try {
					SettingsOrgBean.changeEmail(settingBean);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
		

		};
		view.getSaveButton2().addActionListener(gestoreSave2);
		
		ActionListener gestoreSave3 = e -> {

				SettingsOrgBean settingBean = new SettingsOrgBean();
				settingBean.setNewPassword(view.getNewPassword());
				settingBean.setPassword(view.getOldPassword());

				try {
					SettingsOrgBean.changeEmail(settingBean);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setCredentials();
				view.repaint();
		

		};
		view.getSaveButton3().addActionListener(gestoreSave3);
	}
}