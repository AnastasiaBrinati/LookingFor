package logic.controller;

import java.util.ArrayList;

import logic.model.Course;
import logic.model.CourseDAO;
import logic.model.CourtDAO;
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
	
	public void applyFilters(String city,String sport,String type) {
		switch(type) {
		
		case "COURSE":
			CourseDAO courseDAO=new CourseDAO();
			ArrayList<Course> foundCourses=new ArrayList<Course>();
			courseDAO.retreiveByCityAndSport(city,sport);
			break;
		
		
	    case "EVENT":
		    EventDAO eventDAO=new EventDAO();
		    ArrayList<Event> foundEvents=new ArrayList<Event>();
		    eventDAO.retreiveByCityAndSport(city,sport);
		    break;
	
	
        case "COURT":
	        CourtDAO courtDAO=new CourtDAO();
	        ArrayList<Court> foundCourts=new ArrayList<Court>();
	        courtDAO.retreiveByCityAndSport(city,sport);
	        break;
	    }
		
	}
}
		
	


