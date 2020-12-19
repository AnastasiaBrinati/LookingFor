

package logic.main;

import javax.swing.SwingUtilities;

import logic.controller.LoginController;
import logic.login.*;
import logic.model.LoginModel;
import logic.view.desktop.LoginUI;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController control = LoginController.getInstance(view, model);
				control.assegnaGestori();

			}
		});
	}

}
