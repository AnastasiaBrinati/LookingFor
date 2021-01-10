package logic.controller.graphic;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.SettingsUIOrg;



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
			
			ActionListener gestoreExit = new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e){
					LoginUI loginUI=new LoginUI();
					loginUI.resetForm();
					view.setVisible(false);
					LoginControllerG.getInstance(loginUI);
					
				}

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
		}

	}