package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import logic.controller.DeleteCourseController;
import logic.model.CourseBean;
import logic.model.DeleteItemBean;
import logic.view.desktop.CourseUIOrg;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.OrganizationProfileUI;

public class CourseOrgControllerG {
	
	private static CourseUIOrg view;
	private static CourseOrgControllerG instance=null;
	//bean 
	
	private CourseOrgControllerG(CourseUIOrg view) {
		CourseOrgControllerG.view = view;
	}
	
	public static synchronized CourseOrgControllerG getInstance(CourseUIOrg view, String courseName, String orgName) throws Exception {
		if(instance==null) {
			instance = new CourseOrgControllerG(view);
			instance.assegnaGestori();
		}
		
		showCourseUI();
		setCourseCredentials(courseName, orgName);
		return instance;
	}
	
	private static void showCourseUI() {
		view.setVisible(true);
	}
	
	public void assegnaGestori() {
		
		
		
        ActionListener gestoreHome = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				HomeUI homeView = new HomeUI();
				HomeControllerGOrg.getInstance(homeView);
				view.setVisible(false);
			}
		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		//gestore per tornare indietro dal corso alla sezione corsi della organizzazione
		ActionListener gestoreBack = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				OrganizationProfileUI profileView = new OrganizationProfileUI();
				OrganizationControllerG.getInstance(profileView);
			}

		};
		view.getBackButton().addActionListener(gestoreBack);
		
		ActionListener gestoreExit = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);
			}

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		ActionListener gestoreDeleteCourse = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				DeleteItemBean deleteBean=new DeleteItemBean();
				setDeleteItemCredentials(deleteBean);
				DeleteCourseController controller=DeleteCourseController.getInstance();
				try {
					controller.deleteCourse(deleteBean);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

			

		};
		view.getDeleteButton().addActionListener(gestoreDeleteCourse);
		
		
	}

	private void setDeleteItemCredentials(DeleteItemBean bean) {
		bean.setItemName(view.getCourseName());
		bean.setOrganizationName();
		
		
	}
	
	private static void setCourseCredentials(String courseName,String organizationName) throws Exception {
		CourseBean courseBean = new CourseBean();
		courseBean.setCourse(courseBean, courseName, organizationName);
		view.setCredentials(courseBean.getName(),courseBean.getOrganization(),courseBean.getLessonPrice(),courseBean.getMonthlyPrice(),
				courseBean.getDescription(),courseBean.getInstructorName(),courseBean.getSport());
	}
}