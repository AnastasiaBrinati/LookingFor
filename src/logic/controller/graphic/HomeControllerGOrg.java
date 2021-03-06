package logic.controller.graphic;


import java.awt.event.ActionListener;

import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.SettingsUIOrg;



	public class HomeControllerGOrg {

		private static HomeUISUs view;
		private static HomeControllerGOrg instance = null;

		private HomeControllerGOrg(HomeUISUs vista) {
			view = vista;
		}

		public static synchronized  HomeControllerGOrg getInstance(HomeUISUs vista) {
			if (instance == null) {
				instance = new HomeControllerGOrg(vista);
				instance.assegnaGestori();
			}
			showHomepage();
			return instance;

		}

		public void assegnaGestori() {
			
			ActionListener gestoreExit = e -> {

					LoginUI loginUI=new LoginUI();
					loginUI.resetForm();
					view.setVisible(false);
					LoginControllerG.getInstance(loginUI);
				

			};
			view.getExitButton().addActionListener(gestoreExit);

			
			ActionListener gestoreProfile = e -> {
				view.setVisible(false);
				OrganizationProfileUI vista = new OrganizationProfileUI();
				OrganizationControllerG.getInstance(vista);

			};
			view.getProfileButton().addActionListener(gestoreProfile);

			

			ActionListener gestoreSettings = e -> {
				view.setVisible(false);
				SettingsUIOrg vista = new SettingsUIOrg();
				SettingsControllerGOrg.getInstance(vista);

			};
			view.getSettingsButton().addActionListener(gestoreSettings);
			
		
			
			
		}
		
		
		public static void showHomepage() {
			view.setVisible(true);
			view.setLocationRelativeTo(null);
		}

	}