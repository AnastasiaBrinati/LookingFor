package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.model.CourseBean;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;

public class CourseSUsControllerG {
	
	private static CourseUISUs view;
	private static CourseSUsControllerG instance=null;
	//bean 
	
	private CourseSUsControllerG(CourseUISUs view) {
		CourseSUsControllerG.view = view;
	}
	
	public static synchronized CourseSUsControllerG getInstance(CourseUISUs view, String courseName, String orgName) throws Exception {
		if(instance==null) {
			instance = new CourseSUsControllerG(view);
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
		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI homeview = new HomeUI();
				HomeControllerGSUs.getInstance(homeview);
			}

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
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
		
		
	}

	private static void setCourseCredentials(String courseName,String organizationName) throws Exception {
		CourseBean courseBean = new CourseBean();
		CourseBean.setCourse(courseBean, courseName, organizationName);
		view.setCredentials(courseBean.getName(),courseBean.getOrganization(),courseBean.getLessonPrice(),courseBean.getMonthlyPrice(),
				courseBean.getDescription(),courseBean.getInstructorName(),courseBean.getSport());
	}
}
