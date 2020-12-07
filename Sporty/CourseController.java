package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.LoginModel;
import views.CourseUI;
import views.LoginUI;

public class CourseController {

	private static CourseUI view;

	private static CourseController instance = null;

	private CourseController(CourseUI vista) {
		this.view = vista;
	}

	public synchronized static CourseController getInstance(CourseUI vista) {
		if (instance == null) {
			instance = new CourseController(vista);
		}
		showLoginUI();
		return instance;

	}

	public void assegnaGestoriCourse() {

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
