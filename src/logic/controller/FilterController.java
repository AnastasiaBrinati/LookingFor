package logic.controller;

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
		//constructor
	}
	
	public static synchronized FilterController getInstance() {
		if(instance==null) {
			instance=new FilterController();
		}
		return instance;
	}
	
	public ArrayList<String> applyFilters(String sport,String type) throws Exception {
		
		String castedType = "";
		ArrayList<String> itemThenOrganizationList=new ArrayList<String>();
		CourseDAO courseDAO=new CourseDAO();
		EventDAO eventDAO=new EventDAO();
		CourtDAO courtDAO=new CourtDAO();
		
		switch(type) {
		
		case "ALL":
			
			castedType = "all";
			type = "COURSE";
			
		case "COURSE":
			
			ArrayList<Course> foundCourses=new ArrayList<Course>();
			foundCourses=courseDAO.retreiveBySport(sport);
			for(int i=0;i<itemThenOrganizationList.size();i++) {
				
					itemThenOrganizationList.add("COURSE");
					i++;
					itemThenOrganizationList.add(foundCourses.get(i).getName());
				    i++;
					itemThenOrganizationList.add(foundCourses.get(i).getOrganization());
					if(castedType.equals("all")) {
						type="EVENT";
					}
				
			}
					
		
	    case "EVENT":
	    	
			ArrayList<Event> foundEvents=new ArrayList<Event>();
			foundEvents=eventDAO.retreiveBySport(sport);
			for(int i=0;i<itemThenOrganizationList.size();i++) {
					
					itemThenOrganizationList.add("EVENT");
					i++;
					itemThenOrganizationList.add(foundEvents.get(i).getName());
					i++;
					itemThenOrganizationList.add(foundEvents.get(i).getOrganization());

					
					if(castedType.equals("all")) {
						type="COURT";
					}

			}	
		  
        case "COURT":
        	
			ArrayList<Court> foundCourts=new ArrayList<Court>();
			foundCourts=courtDAO.retreiveBySport(sport);
			for(int i=0;i<itemThenOrganizationList.size();i++) {
						
					itemThenOrganizationList.add("COURT");
					i++;
					itemThenOrganizationList.add(foundCourts.get(i).getName());
				    i++;
					itemThenOrganizationList.add(foundCourts.get(i).getOrganization());
				
			}	
	        break;
	    }
		return itemThenOrganizationList;
		
	}
}
		
	


