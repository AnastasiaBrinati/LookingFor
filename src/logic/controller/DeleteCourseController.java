package logic.controller;

import java.sql.SQLException;

import logic.controller.graphic.CourseOrgControllerG;
import logic.controller.graphic.OrganizationControllerG;
import logic.model.CourseDAO;
import logic.model.DeleteItemBean;
import logic.model.OrganizationProfile;
import logic.view.desktop.OrganizationProfileUI;

public class DeleteCourseController {
	
	private static DeleteCourseController instance=null;
	
	public static DeleteCourseController getInstance() {
		if(instance==null) {
			instance=new DeleteCourseController();
		}
		return instance;
	}
	
	public void deleteCourse(String courseName) throws SQLException {
		
		CourseDAO courseDAO=new CourseDAO();
		
		//chiamo il dao per cancellare il corso desiderato
		courseDAO.deleteCourse(courseName,OrganizationProfile.getName());
		
		//aggiorno il model
		OrganizationProfile.deleteCourse(courseName);
		System.out.println("Course "+courseName+" has been removed from organization "+OrganizationProfile.getName());
		System.out.println("All courses:");
		OrganizationProfile.printAllCourses();
		
		
		
	}

}
