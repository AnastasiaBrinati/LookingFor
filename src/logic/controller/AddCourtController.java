package logic.controller;


import logic.model.Court;
import logic.model.Event;
import logic.model.OrganizationProfile;

public class AddCourtController {
	
	private static AddCourtController instance;
	
	public AddCourtController() {
		//costruttore
	}
		
	public static synchronized AddCourtController getInstance() {
		if(instance==null) {
			instance = new AddCourtController();
		}
	
		return instance;
	}
	
	public void addCourt(NewCourtBean bean) throws Exception {
		
		Court newCourt = new Court();
		
		newCourt.setAvailability(bean.getAvailability());
		newCourt.setDescription(bean.getDescription());
		newCourt.setImgSrc(bean.getImgSrc());
		newCourt.setPrice(bean.getPrice());
		
		newCourt.setName(bean.getName());
		newCourt.setSport(bean.getSport());
		newCourt.setOrganization(OrganizationProfile.getName());
		

		//chiamo il model per mandarlo in persistenza sul DB
		newCourt.addEvent(newCourt);
		
		//aggiungo l'evento al model
		OrganizationProfile.addEvent(newCourt);
	}

}