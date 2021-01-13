package logic.controller;

import java.sql.SQLException;

import logic.model.CourtDAO;
import logic.model.EventDAO;
import logic.model.OrganizationProfile;

public class DeleteEventController {
	
	private static DeleteEventController instance=null;
	
	private DeleteEventController() {
		
	}
	public static synchronized DeleteEventController getInstance() {
		if(instance==null) {
			instance=new DeleteEventController();
		}
		return instance;
	}
	
	public void deleteEvent(String eventName) throws SQLException {
		String orgName = OrganizationProfile.getName();		
		EventDAO eventDAO=new EventDAO();
		
		//chiamo il dao per cancellare il campo desiderato
		eventDAO.deleteEvent(eventName, orgName);

		//aggiorno il model
		OrganizationProfile.deleteEvent(eventName);
		OrganizationProfile.printAllCourses();
		
	}

}
