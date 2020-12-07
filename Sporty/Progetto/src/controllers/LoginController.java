package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.LoginModel;
import views.CourseUI;
import views.LoginUI;

public class LoginController {

	private LoginUI vista;
	private LoginModel model;
	private static LoginController instance = null;

	private LoginController(LoginUI vista, LoginModel modello) {
		this.vista = vista;
		this.model = modello;
	}

	public synchronized static LoginController getInstance(LoginUI vista,
			LoginModel model) {
		if (instance == null) {
			instance = new LoginController(vista, model);
		}
		return instance;
	}

	public void assegnaGestori() {

		ActionListener gestoreSignUp = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e2) {
				// TODO Auto-generated method stub
				if (vista.getName() == " ") {

					vista.displayErrorMessage("Empty fields found!");

				} else {
					CourseUI courseView = new CourseUI();
					courseView.setVisible(true);

					CourseController courseController = CourseController
							.getInstance(courseView);
					courseController.assegnaGestoriCourse();

					vista.setVisible(false);

				}

			}

		};

		vista.getSignUpButton().addActionListener(gestoreSignUp);

		ActionListener gestoreDelete = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				vista.resetForm();

			}

		};
		vista.getDeleteButton().addActionListener(gestoreDelete);

	}

}
