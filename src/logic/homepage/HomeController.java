package logic.homepage;

import java.awt.event.ActionListener;

import logic.login.LoginModel;
import logic.login.LoginUI;
import logic.login.LoginController;

public class HomeController {

	private static HomeUI view;
	private static HomeController instance = null;

	private HomeController(HomeUI vista) {
		view = vista;
	}

	public static synchronized  HomeController getInstance(HomeUI vista) {
		if (instance == null) {
			instance = new HomeController(vista);
		}
		showLoginUI();
		return instance;

	}

	public void assegnaGestori() {

		ActionListener gestoreSignUp = e -> {
			view.setVisible(false);
			LoginUI vista = new LoginUI();
			LoginModel modello = new LoginModel();
			 LoginController.getInstance(vista,
					modello);

		};
		view.getProfileButton().addActionListener(gestoreSignUp);

	}
	
	
	public static void showLoginUI() {
		view.setVisible(true);
	}

}