package logic.controller.graphic;


import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SignInUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpControllerG {

	private static SignInUI view;
	private static SignUpControllerG instance = null;

	private SignUpControllerG(SignInUI vista) {
		view = vista;
		
	}

	public static synchronized SignUpControllerG getInstance(SignInUI vista) {
		if (instance == null) {
			instance = new SignUpControllerG(vista);
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
				HomeControllerGSUs  homeController = HomeControllerGSUs.getInstance(homeView);

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
				LoginControllerG  loginController = LoginControllerG.getInstance(loginView);
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