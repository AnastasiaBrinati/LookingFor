package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.model.EventBean;
import logic.view.desktop.EventUIOrg;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;

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
	}
	
	public void assegnaGestori() {
		
		ActionListener gestoreHome = e -> {

				view.setVisible(false);
				HomeUI homeview = new HomeUI();
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
		
		
	}

	private static void setEventCredentials(String eventName,String organizationName) throws Exception {
		EventBean eventBean = new EventBean();
		EventBean.setEvent(eventBean, eventName, organizationName);
		view.setCredentials(eventBean.getName(),eventBean.getDate(), eventBean.getPrice(), eventBean.getDescription(), eventBean.getSport(), eventBean.getOrganization(), eventBean.getAvailability());
	}
}