package logic.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SignInUI;

import logic.model.HomeModel;
import logic.model.LoginModel;
import logic.model.SignInModel;

public class LoginController {
	
	private static LoginUI loginView;
	private static LoginModel loginModel;
	private static LoginController instance = null;
	
	
	
	private LoginController(LoginUI view, LoginModel model) {
		loginView = view;
		loginModel = model;
	}
	
	public static synchronized LoginController getInstance(LoginUI view, LoginModel model) {
		if(instance==null) {
			instance = new LoginController(view, model);
			instance.assegnaGestori();
		}
		showSignInUI();
		return instance;
	}
	
	public static void showSignInUI() {
		loginView.setVisible(true);
	}

	
	public void assegnaGestori(){

		ActionListener gestoreSignUp = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				loginView.setVisible(false);
				SignInUI signInView = new SignInUI();
				SignInModel model = new SignInModel();
				SignInController.getInstance(signInView, model);
			}

		};
		loginView.getSignInButton().addActionListener(gestoreSignUp);
		
		ActionListener gestoreLogin = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				loginView.setVisible(false);
				HomeUI homepageView = new HomeUI();
				HomeModel model = new HomeModel();
				HomeController.getInstance(homepageView, model);
			}

		};
		loginView.getLoginButton().addActionListener(gestoreLogin);

	}


}

