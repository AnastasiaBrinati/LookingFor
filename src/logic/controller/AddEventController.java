package logic.controller;


import logic.model.Event;
import logic.model.OrganizationProfile;

public class AddEventController {
	
	private static AddEventController instance;
	
	public AddEventController() {
		//costruttore
	}
		
	public static synchronized AddEventController getInstance() {
		if(instance==null) {
			instance = new AddEventController();
		}
	
		return instance;
	}
	
	public void addEvent(NewEventBean bean) throws Exception {
		
		Event newEvent = new Event();
		
		newEvent.setAvailability(bean.getAvailability());
		newEvent.setDescription(bean.getDescription());
		newEvent.setImgSrc(bean.getImgSrc());
		newEvent.setPrice(bean.getPrice());
		
		newEvent.setName(bean.getName());
		newEvent.setSport(bean.getSport());
		newEvent.setOrganization(OrganizationProfile.getName());
		

		//chiamo il model per mandarlo in persistenza sul DB
		newEvent.addEvent(newEvent);
		
		//aggiungo l'evento al model
		OrganizationProfile.addEvent(newEvent);
	}

}