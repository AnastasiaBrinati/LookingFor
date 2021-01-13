package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SignUpUI;
import logic.controller.LoginBean;

public class LoginControllerG {
	
	private static LoginUI loginView;
	private static LoginBean loginBean;
	private static LoginControllerG instance = null;
	
	
	private LoginControllerG(LoginUI view) {
		LoginControllerG.loginView = view;
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
		loginView.resetForm();
		loginView.setVisible(true);
	}

	
	public void assegnaGestori(){

		ActionListener gestoreSignUp = e -> {
			
				loginView.setVisible(false);
				SignUpUI signInView = new SignUpUI();		
				SignUpControllerG.getInstance(signInView);

		};
		loginView.getSignInButton().addActionListener(gestoreSignUp);
		
		ActionListener gestoreLogin = e -> {
				
				loginBean = new LoginBean();
				loginBean.setUsername(loginView.getUsername());
				loginBean.setPassword(loginView.getPassword());
				try {
					String typeOfUser = LoginBean.checkCredentials(loginBean);
					loginView.setVisible(false);
					if(typeOfUser!=null) {
						System.out.println("typeOfUser:"+ typeOfUser);
					 if(typeOfUser.equals("singleuser")) {
						HomeUISUs homepageView = new HomeUISUs();
						HomeControllerGSUs.getInstance(homepageView);
					 }
					 else if(typeOfUser.equals("organization")) {
						HomeUISUs homepageView = new HomeUISUs();
						HomeControllerGOrg.getInstance(homepageView);
						
					 }
					}
					else {
						//try again
						System.out.println("typeOfUser found results to be null...");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

		};
		loginView.getLoginButton().addActionListener(gestoreLogin);

	}


}