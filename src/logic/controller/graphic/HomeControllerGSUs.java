package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUISUs;
import logic.view.desktop.UserProfileUI;

public class HomeControllerGSUs {

	private static HomeUI view;
	private static HomeControllerGSUs instance = null;

	private HomeControllerGSUs(HomeUI vista) {
		view = vista;
	}

	public static synchronized  HomeControllerGSUs getInstance(HomeUI vista) {
		if (instance == null) {
			instance = new HomeControllerGSUs(vista);
			instance.assegnaGestori();
		}
		showHomepage();
		return instance;
	}

	private void assegnaGestori() {
		
		ActionListener gestoreExit = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);
				
			}

		};
		view.getExitButton().addActionListener(gestoreExit);
		

		
		ActionListener gestoreProfile = e -> {
			view.setVisible(false);
			UserProfileUI vista = new UserProfileUI();
			UserProfileControllerG.getInstance(vista);

		};
		view.getProfileButton().addActionListener(gestoreProfile);

		

		ActionListener gestoreSettings = e -> {
			view.setVisible(false);
			SettingsUISUs vista = new SettingsUISUs();
			SettingsControllerGSUs.getInstance(vista);

		};
		view.getSettingsButton().addActionListener(gestoreSettings);
		
		
	}
	
	
	public static void showHomepage() {
		view.setVisible(true);
	}

}
