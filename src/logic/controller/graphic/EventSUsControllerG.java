package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.model.EventBean;
import logic.view.desktop.EventUISUs;
import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;

public class EventSUsControllerG {
	
	private static EventUISUs view;
	private static EventSUsControllerG instance=null;
	
	private EventSUsControllerG(EventUISUs view) {
		EventSUsControllerG.view = view;
	}
	
	public static synchronized EventSUsControllerG getInstance(EventUISUs view, String eventName, String orgName) throws Exception {
		if(instance==null) {
			instance = new EventSUsControllerG(view);
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
		
		
	}

	private static void setEventCredentials(String eventName,String organizationName) throws Exception {
		EventBean eventBean = new EventBean();
		EventBean.setEvent(eventBean, eventName, organizationName);
		view.setCredentials(eventBean.getName(),eventBean.getDate(), eventBean.getPrice(), eventBean.getDescription(), eventBean.getSport(), eventBean.getOrganization(), eventBean.getAvailability());
	}
}