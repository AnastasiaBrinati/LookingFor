package main;
import javax.swing.SwingUtilities;

import controllers.LoginController;
import models.LoginModel;
import views.LoginUI;
public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController control = LoginController.getInstance(view,
						model);
				control.assegnaGestori();
				view.setVisible(true);

			}
		});
	}

}
