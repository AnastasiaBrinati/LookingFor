package logic.homepage;

import java.awt.event.ActionListener;

import logic.login.LoginModel;
import logic.login.LoginUI;
import user_profile.UserProfileController;
import user_profile.UserProfileUI;
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

		ActionListener gestoreExit = e -> {
			view.setVisible(false);
			LoginUI vista = new LoginUI();
			LoginModel modello = new LoginModel();
			 LoginController.getInstance(vista,
					modello);

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		ActionListener gestoreProfile= e -> {
			view.setVisible(false);
			UserProfileUI vista = new UserProfileUI();
			UserProfileController controller=UserProfileController.getInstance(vista);
			controller.assegnaGestori();
			

		};
		view.getProfileButton().addActionListener(gestoreProfile);

	}
	
	
	public static void showLoginUI() {
		view.setVisible(true);
	}

}