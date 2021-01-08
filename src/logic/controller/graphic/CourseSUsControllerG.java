package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import logic.controller.SignUpBean;
import logic.model.CourseBean;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;

public class CourseSUsControllerG {
	
	private static CourseUISUs view;
	private static CourseSUsControllerG instance=null;
	//bean 
	
	private CourseSUsControllerG() {
		
	}
	
	public static synchronized CourseSUsControllerG getInstance(CourseUISUs view) {
		if(instance==null) {
			instance = new LoginControllerG(view);
			instance.assegnaGestori();
		}
		
		//showLoginUI();
		setCourseCredentials();
		return instance;
	}
	
	public void assegnaGestori() {
		ActionListener gestoreSignUp = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {

				
			}
		};
		//view.getSignUpButton().addActionListener(gestoreSignUp);

	}
	
	private static void setCourseCredentials(String courseName,String organizationName) {
		CourseBean courseBean = new CourseBean();
		CourseBean.setCourse(courseBean, courseName, organizationName);
		view.setCredentials(courseBean.getName(),courseBean.getOrganization(),courseBean.getLessonPrice(),courseBean.getMonthlyPrice(),
				courseBean.getDescription(),courseBean.getInstructorName(),courseBean.getSport());
		
	}

}
