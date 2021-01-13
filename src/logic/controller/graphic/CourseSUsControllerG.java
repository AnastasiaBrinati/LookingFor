package logic.controller.graphic;

import java.awt.event.ActionListener;

import logic.controller.JoinCourseController;
import logic.model.CourseBean;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.HomeUISUs;
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
		
		ActionListener gestoreHome = e -> {
				view.setVisible(false);
				HomeUISUs homeview = new HomeUISUs();
				HomeControllerGSUs.getInstance(homeview);
		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		
		
		ActionListener gestoreExit = e -> {

			LoginUI loginUI=new LoginUI();
			loginUI.resetForm();
			view.setVisible(false);
			LoginControllerG.getInstance(loginUI);
			
		};
		view.getExitButton().addActionListener(gestoreExit);
	
	
		ActionListener gestoreJoin = e -> {

				JoinCourseController joinCourseController = JoinCourseController.getInstance();
				try {
					if(joinCourseController.join(view.getName(), view.getOrganization())) {
						//wellDoneMessage
						view.disableJoinButton();
					}
					else {
						//
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		};
		view.getJoinButton().addActionListener(gestoreJoin);
		
		
	}

	private static void setCourseCredentials(String courseName,String organizationName) throws Exception {
		CourseBean courseBean = new CourseBean();
		courseBean.setCourse(courseBean, courseName, organizationName);
		view.setCredentials(courseBean.getName(),courseBean.getOrganization(),courseBean.getLessonPrice(),courseBean.getMonthlyPrice(),
				courseBean.getDescription(),courseBean.getInstructorName(),courseBean.getSport());
	}
}