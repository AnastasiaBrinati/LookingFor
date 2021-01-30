package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.model.CourtBean;
import logic.view.desktop.CourtUISUs;
import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUISUs;
import logic.view.desktop.UserProfileUI;

public class CourtSUsControllerG {
	
	private static CourtUISUs view;
	private static CourtSUsControllerG instance=null;
	
	private CourtSUsControllerG(CourtUISUs view) {
		CourtSUsControllerG.view = view;
	}
	
	public static synchronized CourtSUsControllerG getInstance(CourtUISUs view, String courtName, String orgName) throws Exception {
		if(instance==null) {
			instance = new CourtSUsControllerG(view);
			instance.assegnaGestori();
		}
		
		showCourseUI();
		setCourtCredentials(courtName, orgName);
		return instance;
	}
	
	private static void showCourseUI() {
		view.setVisible(true);
		view.setLocationRelativeTo(null);
	}
	
	public void assegnaGestori() {
		
		ActionListener gestoreHome = e -> {

				view.setVisible(false);
				HomeUISUs homeview = new HomeUISUs();
				HomeControllerGSUs.getInstance(homeview);
			

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		
		
		
		ActionListener gestoreExit = e -> {

			LoginUI loginUI=new LoginUI();
			loginUI.resetForm();
			view.setVisible(false);
			LoginControllerG.getInstance(loginUI);
	

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		ActionListener gestoreProfile = e -> {

				UserProfileUI profileUI=new UserProfileUI();
				view.setVisible(false);
				UserProfileControllerG.getInstance(profileUI);
		

		};
		view.getProfileButton().addActionListener(gestoreProfile);
		
		
	}

	private static void setCourtCredentials(String courtName,String organizationName) throws Exception {
		CourtBean courtBean = new CourtBean();
		CourtBean.setCourt(courtBean, courtName, organizationName);
		view.setCredentials(courtBean.getName(), courtBean.getPrice(),courtBean.getSport(),courtBean.getAvailability(),courtBean.getDescription(),courtBean.getType());
	}
}