package logic.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import logic.model.Course;
import logic.model.CourseDAO;
import logic.model.Court;
import logic.model.CourtDAO;
import logic.model.Event;
import logic.model.EventDAO;

public class FilterController {
	
	private static FilterController instance=null;
	private FilterController() {
		
	}
	public FilterController getInstance() {
		if(instance==null) {
			instance=new FilterController();
		}
		return instance;
	}
	
	public ArrayList<String> applyFilters(String sport,String type) throws Exception {
		
		ArrayList<String> itemThenOrganizationList=new ArrayList<String>();
		
		
		switch(type) {
		
		case "COURSE":
			
			CourseDAO courseDAO=new CourseDAO();
			ArrayList<Course> foundCourses=new ArrayList<Course>();
			foundCourses=courseDAO.retreiveBySport(sport);
			for(int i=0;i<itemThenOrganizationList.size();i++) {
					//posizioni pari inserisco il nome del corso
					itemThenOrganizationList.add(foundCourses.get(i).getName());
				    i++;
					//posizioni dispari insersico nome organizzazione
					itemThenOrganizationList.add(foundCourses.get(i).getOrganization());
				
				
			}
			
			break;
		
		
	    case "EVENT":
	    	EventDAO eventDAO=new EventDAO();
			ArrayList<Event> foundEvents=new ArrayList<Event>();
			foundEvents=eventDAO.retreiveBySport(sport);
			for(int i=0;i<itemThenOrganizationList.size();i++) {
					//posizioni pari inserisco il nome dell'evento
					itemThenOrganizationList.add(foundEvents.get(i).getName());
				    i++;
					//posizioni dispari insersico nome organizzazione
					itemThenOrganizationList.add(foundEvents.get(i).getOrganization());
				
			}	
		    break;
	
	
        case "COURT":
        	CourtDAO courtDAO=new CourtDAO();
			ArrayList<Court> foundCourts=new ArrayList<Court>();
			foundCourts=courtDAO.retreiveBySport(sport);
			for(int i=0;i<itemThenOrganizationList.size();i++) {
					//posizioni pari inserisco il nome dell'evento
					itemThenOrganizationList.add(foundCourts.get(i).getName());
				    i++;
					//posizioni dispari insersico nome organizzazione
					itemThenOrganizationList.add(foundCourts.get(i).getOrganization());
				
			}	
	        break;
	    }
		return itemThenOrganizationList;
		
	}
}
		
	


