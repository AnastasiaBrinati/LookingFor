package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.controller.UserProfileController;
import logic.model.HomeModel;
import logic.model.SettingsBean;
import logic.view.desktop.HomeUI;
import logic.view.desktop.SettingsUI;
import logic.view.desktop.UserProfileUI;

public class HomeControllerG {

	private static HomeUI view;
	//private static HomeModel model;
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
			UserProfileController controller=UserProfileController.getInstance(vista);
			controller.assegnaGestori();

		};
		view.getProfileButton().addActionListener(gestoreProfile);

		

		ActionListener gestoreSettings = e -> {
			view.setVisible(false);
			SettingsUI vista = new SettingsUI();
			SettingsBean settingsBean = new SettingsBean();
			SettingsControllerG controller = SettingsControllerG.getInstance(vista);
			SettingsBean.setCredentials(settingsBean);
			SettingsControllerG.setCredentials(settingsBean);
			controller.assegnaGestori();

		};
		view.getSettingsButton().addActionListener(gestoreSettings);
		
		
	}
	
	
	public static void showHomepage() {
		view.setVisible(true);
	}

}
