package logic.homepage;

import java.awt.event.ActionListener;

import logic.login.LoginModel;
import logic.login.LoginUI;
import logic.course_page.OrganizationController;
import logic.course_page.OrganizationProfileUI;
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
			OrganizationProfileUI vista = new OrganizationProfileUI();
			OrganizationController controller=OrganizationController.getInstance(vista);
			controller.assegnaGestori();

		};
		view.getProfileButton().addActionListener(gestoreProfile);

	}
	
	
	public static void showLoginUI() {
		view.setVisible(true);
	}

}