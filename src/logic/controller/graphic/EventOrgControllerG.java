package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.model.EventBean;
import logic.view.desktop.EventUIOrg;
import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.SettingsUIOrg;

public class EventOrgControllerG {
	
	private static EventUIOrg view;
	private static EventOrgControllerG instance=null;
	
	private EventOrgControllerG(EventUIOrg view) {
		EventOrgControllerG.view = view;
	}
	
	public static synchronized EventOrgControllerG getInstance(EventUIOrg view, String eventName, String orgName) throws Exception {
		if(instance==null) {
			instance = new EventOrgControllerG(view);
			instance.assegnaGestori();
		}
		
		showEventUI();
		setEventCredentials(eventName, orgName);
		return instance;
	}
	
	private static void showEventUI() {
		view.setVisible(true);
		view.setLocationRelativeTo(null);
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

	private static void setEventCredentials(String eventName,String organizationName) throws Exception {
		EventBean eventBean = new EventBean();
		EventBean.setEvent(eventBean, eventName, organizationName);
		view.setCredentials(eventBean.getName(),eventBean.getDate(), eventBean.getPrice(), eventBean.getDescription(), eventBean.getSport(), eventBean.getOrganization(), eventBean.getAvailability());
	}
}