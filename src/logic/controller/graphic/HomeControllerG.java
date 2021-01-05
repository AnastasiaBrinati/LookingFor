package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.view.desktop.HomeUI;
import logic.view.desktop.SettingsUI;
import logic.view.desktop.UserProfileUI;

public class HomeControllerG {

	private static HomeUI view;
	private static HomeControllerG instance = null;

	private HomeControllerG(HomeUI vista) {
		view = vista;
	}

	public static synchronized  HomeControllerG getInstance(HomeUI vista) {
		if (instance == null) {
			instance = new HomeControllerG(vista);
			instance.assegnaGestori();
		}
		showHomepage();
		return instance;

	}

	public void assegnaGestori() {

		
		ActionListener gestoreProfile = e -> {
			view.setVisible(false);
			UserProfileUI vista = new UserProfileUI();
			UserProfileControllerG controller=UserProfileControllerG.getInstance(vista);

		};
		view.getProfileButton().addActionListener(gestoreProfile);

		

		ActionListener gestoreSettings = e -> {
			view.setVisible(false);
			SettingsUI vista = new SettingsUI();
			SettingsControllerG controller = SettingsControllerG.getInstance(vista);
			controller.assegnaGestori();

		};
		view.getSettingsButton().addActionListener(gestoreSettings);
		
		
	}
	
	
	public static void showHomepage() {
		view.setVisible(true);
	}

}
