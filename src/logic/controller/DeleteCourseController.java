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
	
	public void deleteCourse(DeleteItemBean deleteBean) throws SQLException {
		
		CourseDAO courseDAO=new CourseDAO();
		
		//chiamo il dao per cancellare il corso desiderato
		courseDAO.deleteCourse(deleteBean.getItemName(),deleteBean.getOrganizationName());
		
		//aggiorno il model
		OrganizationProfile.deleteCourse(deleteBean.getItemName());
		System.out.println("Course "+deleteBean.getItemName()+" has been removed from organization "+deleteBean.getOrganizationName());
		System.out.println("All courses:");
		OrganizationProfile.printAllCourses();
		
		//torno al profilo della Organizzazione,cancellando il bottone del vecchio corso
		OrganizationProfileUI view=new OrganizationProfileUI();
		OrganizationControllerG orgController=OrganizationControllerG.getInstance(view);
		orgController.deleteCourseButton(deleteBean.getButtonName());
		
		
	}

}
