
package logic.controller;


import logic.model.HomeModel;
import logic.model.LoginModel;
import logic.model.SignInModel;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SignInUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignInController {

	private static SignInUI view;
	private static SignInModel model;
	private static SignInController instance = null;

	private SignInController(SignInUI vista, SignInModel modello) {
		view = vista;
		
	}

	public static synchronized SignInController getInstance(SignInUI vista, SignInModel model) {
		if (instance == null) {
			instance = new SignInController(vista, model);
			instance.assegnaGestori();
		}
		showLoginUI();
		return instance;
	}

	public void assegnaGestori() {

		ActionListener gestoreSignUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e2) {

				HomeUI homeView = new HomeUI();
				HomeModel homeModel = new HomeModel();
				HomeController  homeController = HomeController.getInstance(homeView, homeModel);
				homeController.assegnaGestori();

				view.setVisible(false);
				view.resetForm();

			}

		};

		view.getSignUpButton().addActionListener(gestoreSignUp);

		ActionListener gestoreDelete = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.resetForm();

			}

		};
		view.getDeleteButton().addActionListener(gestoreDelete);
		
		
		ActionListener gestoreLogin = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				LoginUI loginView = new LoginUI();
				LoginModel loginModel = new LoginModel();
				LoginController  loginController = LoginController.getInstance(loginView, loginModel);
				loginController.assegnaGestori();
				
				view.resetForm();
				view.setVisible(false);
			}

		};
		view.getLoginButton().addActionListener(gestoreLogin);
		

	}
	public static void showLoginUI() {
		view.setVisible(true);
	}

}