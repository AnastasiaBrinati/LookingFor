package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SignInUI;


import logic.controller.LoginBean;

public class LoginControllerG {
	
	private static LoginUI loginView;
	private static LoginBean loginBean;
	private static LoginControllerG instance = null;
	
	
	private LoginControllerG(LoginUI view) {
		loginView = view;
	}
	
	public static synchronized LoginControllerG getInstance(LoginUI view) {
		if(instance==null) {
			instance = new LoginControllerG(view);
			instance.assegnaGestori();
		}
		showLoginUI();
		return instance;
	}
	
	public static void showLoginUI() {
		loginView.setVisible(true);
	}

	
	public void assegnaGestori(){

		ActionListener gestoreSignUp = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				loginView.setVisible(false);
				SignInUI signInView = new SignInUI();
				
				SignInControllerG.getInstance(signInView);
			}

		};
		loginView.getSignInButton().addActionListener(gestoreSignUp);
		
		ActionListener gestoreLogin = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				loginBean = new LoginBean();
				loginBean.setUsername(loginView.getUsername());
				loginBean.setPassword(loginView.getPassword());
				try {
					String typeOfUser = LoginBean.checkCredentials(loginBean);
					loginView.setVisible(false);
					if(typeOfUser.equals("singleuser")) {
						HomeUI homepageView = new HomeUI();
						HomeControllerGSUs.getInstance(homepageView);
					}
					else if(typeOfUser.equals("organization")) {
						HomeUI homepageView = new HomeUI();
						HomeControllerGOrg.getInstance(homepageView);
						
					}
					else {
						//try again
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		};
		loginView.getLoginButton().addActionListener(gestoreLogin);

	}


}
