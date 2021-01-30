package logic.controller;

import logic.model.CourseDAO;
import logic.model.UserProfile;

public class JoinCourseController {
	
	private static JoinCourseController instance;
	
	private JoinCourseController() {
		//constructor
	}
		
	public static synchronized JoinCourseController getInstance() {
		if(instance==null) {
			instance = new JoinCourseController();
		}
	
		return instance;
	}
	
	public boolean join(String courseName, String orgName) throws Exception {
		
		PaymentController paymentController = PaymentController.getInstance();
		if(paymentController.simulatePayment()) {
			CourseDAO courseDAO = new CourseDAO();
			UserProfile.addCourse(courseDAO.getCourse(courseName, orgName));
			//incremento partecipanti corso
			//diminuiscoAvailability
			return true;
			
		}
		return false;
		
	}
	
}