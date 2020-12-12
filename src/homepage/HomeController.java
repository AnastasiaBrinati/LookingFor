package homepage;

import user_profile.UserProfileController;
import user_profile.UserProfileUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import login.LoginModel;
import login.LoginUI;
import login.LoginController;

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

		ActionListener gestoreEsc = e -> {
			view.setVisible(false);
			LoginUI vista = new LoginUI();
			LoginModel modello = new LoginModel();
			LoginController.getInstance(vista,modello);

		};
		view.getEscButton().addActionListener(gestoreEsc);

	
		ActionListener gestoreProfile = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.setVisible(false);
				UserProfileUI upView = new UserProfileUI();
				UserProfileController.getInstance(upView);
			}

		};
		view.getProfileButton().addActionListener(gestoreProfile);

}
	
	public static void showLoginUI() {
		view.setVisible(true);
	}

}