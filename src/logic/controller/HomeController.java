package logic.controller;

import java.awt.event.ActionListener;


import logic.model.HomeModel;
import logic.view.desktop.HomeUI;
import logic.view.desktop.UserProfileUI;

public class HomeController {

	private static HomeUI view;
	private static HomeModel model;
	private static HomeController instance = null;

	private HomeController(HomeUI vista,HomeModel model) {
		view = vista;
	}

	public static synchronized  HomeController getInstance(HomeUI vista, HomeModel model) {
		if (instance == null) {
			instance = new HomeController(vista, model);
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

	}
	
	
	public static void showHomepage() {
		view.setVisible(true);
	}

}
