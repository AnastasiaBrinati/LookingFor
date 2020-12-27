package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.SignInController;
import logic.model.SettingsBean;
import logic.model.SignInModel;
import logic.view.desktop.HomeUI;
import logic.view.desktop.SettingsUI;
import logic.view.desktop.SignInUI;

public class SettingsControllerG {
	
	private static SettingsUI view;
	private static SettingsControllerG instance = null;
	
	private SettingsControllerG(SettingsUI settingsview) {
		view = settingsview;
	}
	
	public synchronized static SettingsControllerG getInstance(SettingsUI view) {
		if(instance == null) {
			instance = new SettingsControllerG(view);
		}

		showSettingsView();
		return instance;
	}
	
	private static void showSettingsView() {
		view.setVisible(true);
	}
	
	public static void setCredentials(SettingsBean settingsBean) {
		String name = settingsBean.getName();
		String surname = settingsBean.getSurname();
		String username = settingsBean.getUsername();
		String email = settingsBean.getEmail();
		String password = settingsBean.getPassword();
		System.out.println(name + surname + username + email + password);
		view.setCredentials(name, surname, username, email, password);
	}
	
	public void assegnaGestori() {
		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI homeview = new HomeUI();
				HomeControllerG.getInstance(homeview);
			}

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		
		ActionListener gestoreCredentials = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setNamePanelVisible();
			}

		};
		view.getCredentialsButton().addActionListener(gestoreCredentials);
		
		
		ActionListener gestoreSecurity = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setEmailPanelVisible();
			}

		};
		view.getSecurityButton().addActionListener(gestoreSecurity);
	}
}
