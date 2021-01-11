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
		
		String orgName = OrganizationProfile.getName();		
		CourseDAO courseDAO=new CourseDAO();
		
		//chiamo il dao per cancellare il corso desiderato
<<<<<<< .mine
		courseDAO.deleteCourse(courseName, orgName);
||||||| .r298
		courseDAO.deleteCourse(deleteBean.getItemName(),deleteBean.getOrganizationName());
=======
		courseDAO.deleteCourse(courseName,OrganizationProfile.getName());
>>>>>>> .r305
		
		//aggiorno il model
<<<<<<< .mine
		OrganizationProfile.deleteCourse(courseName);
		System.out.println("Course "+courseName+" has been removed from organization "+orgName);
||||||| .r298
		OrganizationProfile.deleteCourse(deleteBean.getItemName());
		System.out.println("Course "+deleteBean.getItemName()+" has been removed from organization "+deleteBean.getOrganizationName());
=======
		OrganizationProfile.deleteCourse(courseName);
		System.out.println("Course "+courseName+" has been removed from organization "+OrganizationProfile.getName());
>>>>>>> .r305
		System.out.println("All courses:");
		OrganizationProfile.printAllCourses();
<<<<<<< .mine
				
||||||| .r298
		
		//torno al profilo della Organizzazione,cancellando il bottone del vecchio corso
		OrganizationProfileUI view=new OrganizationProfileUI();
		OrganizationControllerG orgController=OrganizationControllerG.getInstance(view);
		orgController.deleteCourseButton(deleteBean.getButtonName());
		
		
=======
		
		
		
>>>>>>> .r305
	}

}
