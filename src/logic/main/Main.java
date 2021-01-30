package logic.main;

import javax.swing.SwingUtilities;

import logic.controller.graphic.LoginControllerG;
import logic.view.desktop.LoginUI;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				LoginUI view = new LoginUI();
				view.setLocationRelativeTo(null);
				LoginControllerG.getInstance(view);

			}
		});
	}

}
