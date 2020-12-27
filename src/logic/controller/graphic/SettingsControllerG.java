package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.model.SettingsBean;
import logic.view.desktop.HomeUI;
import logic.view.desktop.SettingsUI;


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
		
		setCredentials();
		showSettingsView();
		return instance;
	}
	
	private static void showSettingsView() {
		view.setVisible(true);
	}
	
	private static void setCredentials() {
		SettingsBean settingsBean = new SettingsBean();
		SettingsBean.setCredentials(settingsBean);
		String name = settingsBean.getName();
		String surname = settingsBean.getSurname();
		String username = settingsBean.getUsername();
		String email = settingsBean.getEmail();
		String password = settingsBean.getPassword();
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
		
		ActionListener gestoreCancel = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				setCredentials();
			}

		};
		view.getCancelButton().addActionListener(gestoreCancel);
		
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
