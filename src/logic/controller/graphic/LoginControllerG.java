package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SignInUI;

import logic.model.HomeModel;
import logic.model.SignInModel;

import logic.controller.LoginBean;
import logic.controller.LoginController;

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
				SignInModel model = new SignInModel();
				SignInControllerG.getInstance(signInView, model);
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
					if(LoginBean.checkCredentials(loginBean)) {
						loginView.setVisible(false);
						HomeUI homepageView = new HomeUI();
						HomeControllerG.getInstance(homepageView);
					}
					/*else {
						loginView.WrongUsername();
					}*/
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		};
		loginView.getLoginButton().addActionListener(gestoreLogin);

	}


}

