package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.model.CourtBean;
import logic.view.desktop.CourtUIOrg;
import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.SettingsUIOrg;


public class CourtOrgControllerG {
	
	private static CourtUIOrg view;
	private static CourtOrgControllerG instance=null;
	
	private CourtOrgControllerG(CourtUIOrg view) {
		CourtOrgControllerG.view = view;
	}
	
	public static synchronized CourtOrgControllerG getInstance(CourtUIOrg view, String courtName, String orgName) throws Exception {
		if(instance==null) {
			instance = new CourtOrgControllerG(view);
			instance.assegnaGestori();
		}
		
		showCourseUI();
		setCourtCredentials(courtName, orgName);
		return instance;
	}
	
	private static void showCourseUI() {
		view.setVisible(true);
	}
	
	public void assegnaGestori() {
		
		
		
		ActionListener gestoreHome = e -> {
			
				view.setVisible(false);
				HomeUISUs homeview = new HomeUISUs();
				HomeControllerGOrg.getInstance(homeview);

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

			OrganizationProfileUI profileUI=new OrganizationProfileUI();
			view.setVisible(false);
			OrganizationControllerG.getInstance(profileUI);
	

		};
		view.getProfileButton().addActionListener(gestoreProfile);
		
		
	}

	private static void setCourtCredentials(String courtName,String organizationName) throws Exception {
		CourtBean courtBean = new CourtBean();
		CourtBean.setCourt(courtBean, courtName, organizationName);
		view.setCredentials(courtBean.getName(), courtBean.getPrice(),courtBean.getSport(),courtBean.getAvailability(),courtBean.getDescription(),courtBean.getType());
	}
}