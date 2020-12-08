package homepage;

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

	public synchronized static HomeController getInstance(HomeUI vista) {
		if (instance == null) {
			instance = new HomeController(vista);
		}
		showLoginUI();
		return instance;

	}

	public void assegnaGestori() {

		ActionListener gestoreSignUp = e -> {
			// TODO Auto-generated method stub
			view.setVisible(false);
			LoginUI vista = new LoginUI();
			LoginModel modello = new LoginModel();
			LoginController control = LoginController.getInstance(vista,
					modello);
			

		};
		view.getProfileButton().addActionListener(gestoreSignUp);

	}
	
	
	public static void showLoginUI() {
		view.setVisible(true);
	}

}
