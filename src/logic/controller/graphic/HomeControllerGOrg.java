package logic.controller.graphic;


import java.awt.event.ActionListener;

import logic.view.desktop.HomeUI;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.SettingsUIOrg;
import logic.view.desktop.SettingsUISUs;


	public class HomeControllerGOrg {

		private static HomeUI view;
		private static HomeControllerGOrg instance = null;

		private HomeControllerGOrg(HomeUI vista) {
			view = vista;
		}

		public static synchronized  HomeControllerGOrg getInstance(HomeUI vista) {
			if (instance == null) {
				instance = new HomeControllerGOrg(vista);
				instance.assegnaGestori();
			}
			showHomepage();
			return instance;

		}

		public void assegnaGestori() {

			
			ActionListener gestoreProfile = e -> {
				view.setVisible(false);
				OrganizationProfileUI vista = new OrganizationProfileUI();
				OrganizationControllerG controller = OrganizationControllerG.getInstance(vista);

			};
			view.getProfileButton().addActionListener(gestoreProfile);

			

			ActionListener gestoreSettings = e -> {
				view.setVisible(false);
				SettingsUIOrg vista = new SettingsUIOrg();
				SettingsControllerGOrg controller = SettingsControllerGOrg.getInstance(vista);

			};
			view.getSettingsButton().addActionListener(gestoreSettings);
			
			
		}
		
		
		public static void showHomepage() {
			view.setVisible(true);
		}

	}

