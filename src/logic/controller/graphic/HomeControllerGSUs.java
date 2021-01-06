package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.view.desktop.HomeUI;
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

		
		ActionListener gestoreProfile = e -> {
			view.setVisible(false);
			UserProfileUI vista = new UserProfileUI();
			UserProfileControllerG controller = UserProfileControllerG.getInstance(vista);

		};
		view.getProfileButton().addActionListener(gestoreProfile);

		

		ActionListener gestoreSettings = e -> {
			view.setVisible(false);
			SettingsUISUs vista = new SettingsUISUs();
			SettingsControllerGSUs controller = SettingsControllerGSUs.getInstance(vista);

		};
		view.getSettingsButton().addActionListener(gestoreSettings);
		
		
	}
	
	
	public static void showHomepage() {
		view.setVisible(true);
	}

}
