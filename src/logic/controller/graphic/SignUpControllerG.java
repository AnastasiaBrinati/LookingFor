package logic.controller.graphic;


import logic.controller.SignUpBean;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SignUpUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class SignUpControllerG {

	private static SignUpUI view;
	private static SignUpControllerG instance = null;

	private SignUpControllerG(SignUpUI vista) {
		view = vista;
		
	}

	public static synchronized SignUpControllerG getInstance(SignUpUI vista) {
		if (instance == null) {
			instance = new SignUpControllerG(vista);
			instance.assegnaGestori();
		}
		showSignUpUI();
		return instance;
	}

	public void assegnaGestori() {

		
		//gestore per registrarsi nel sistema
		ActionListener gestoreSignUp = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {

				SignUpBean bean=new SignUpBean();
				bean.setName(view.getName());
				bean.setSurname(view.getSurname());
				bean.setEmail(view.getEmail());
				bean.setPassword(view.getPassword());
				bean.setType(view.getUserType());
				bean.setUsername(view.getUsername());
				bean.setLocation(view.getUserLocation());
				
				try {
					SignUpBean.signUpUser(bean);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				LoginUI loginView = new LoginUI();
				LoginControllerG.getInstance(loginView);

				view.setVisible(false);
				view.resetForm();
			}
		};
		view.getSignUpButton().addActionListener(gestoreSignUp);

		
		ActionListener gestoreDelete = e -> {
			
				view.resetForm();

		};
		view.getDeleteButton().addActionListener(gestoreDelete);
		
		
		
		
		ActionListener gestoreLogin = e -> {
			
				
				LoginUI loginView = new LoginUI();
				LoginControllerG.getInstance(loginView);
				
				
				view.resetForm();
				view.setVisible(false);

		};
		view.getLoginButton().addActionListener(gestoreLogin);
		

	}
	public static void showSignUpUI() {
		view.setVisible(true);
	}

}