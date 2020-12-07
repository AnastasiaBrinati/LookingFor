package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.LoginModel;
import views.HomeUI;
import views.LoginUI;

public class HomeController {

	private static HomeUI view;

	private static HomeController instance = null;

	private HomeController(HomeUI vista) {
		this.view = vista;
	}

	public synchronized static HomeController getInstance(HomeUI vista) {
		if (instance == null) {
			instance = new HomeController(vista);
		}
		showLoginUI();
		return instance;

	}

	public void assegnaGestori() {

		ActionListener gestoreSignUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController control = LoginController.getInstance(view,
						model);

			}

		};
		view.getProfileButton().addActionListener(gestoreSignUp);

	}
	public static void showLoginUI() {
		view.setVisible(true);
	}

}
