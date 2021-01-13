package logic.controller;

import java.sql.SQLException;

import logic.model.CourseDAO;
import logic.model.OrganizationProfile;


public class DeleteCourseController {
	
	private static DeleteCourseController instance=null;
	
	public static DeleteCourseController getInstance() {
		if(instance==null) {
			instance=new DeleteCourseController();
		}
		return instance;
	}
	
	public void deleteCourse(String courseName) throws SQLException {
		
		String orgName = OrganizationProfile.getName();		
		CourseDAO courseDAO=new CourseDAO();
		
		//chiamo il dao per cancellare il corso desiderato
		courseDAO.deleteCourse(courseName, orgName);

		//aggiorno il model
		OrganizationProfile.deleteCourse(courseName);
		OrganizationProfile.printAllCourses();
		
		
	}

}
