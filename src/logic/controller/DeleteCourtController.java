package logic.controller;

import java.sql.SQLException;

import logic.model.CourtDAO;
import logic.model.OrganizationProfile;

public class DeleteCourtController {
	
	private static DeleteCourtController instance=null;
	
	private DeleteCourtController() {
		
	}
	public static synchronized DeleteCourtController getInstance() {
		if(instance==null) {
			instance=new DeleteCourtController();
		}
		return instance;
	}
	
	public void deleteCourt(String courtName) throws SQLException {
		String orgName = OrganizationProfile.getName();		
		CourtDAO courtDAO=new CourtDAO();
		
		//chiamo il dao per cancellare il campo desiderato
		courtDAO.deleteCourt(courtName, orgName);

		//aggiorno il model
		OrganizationProfile.deleteCourt(courtName);
		OrganizationProfile.printAllCourses();
		
	}

}
