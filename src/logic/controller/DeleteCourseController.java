package logic.controller;

import java.sql.SQLException;

import logic.model.CourseDAO;
import logic.model.DeleteItemBean;
import logic.model.OrganizationProfile;

public class DeleteCourseController {
	
	private static DeleteCourseController instance=null;
	
	public static DeleteCourseController getInstance() {
		if(instance==null) {
			instance=new DeleteCourseController();
		}
		return instance;
	}
	
	public void deleteCourse(DeleteItemBean deleteBean) throws SQLException {
		
		CourseDAO courseDAO=new CourseDAO();
		
		//chiamo il dao per cancellare il corso desiderato
		courseDAO.deleteCourse(deleteBean.getItemName(),deleteBean.getOrganizationName());
		
		//aggiorno il model
		OrganizationProfile.deleteCourse(deleteBean.getItemName());
		System.out.println("Course "+deleteBean.getItemName()+" has been removed from organization "+deleteBean.getOrganizationName());
		System.out.println("All courses:");
		OrganizationProfile.printAllCourses();
		
	}

}
