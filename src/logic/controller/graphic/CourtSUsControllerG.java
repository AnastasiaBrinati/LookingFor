package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.model.CourseBean;
import logic.model.CourtBean;
import logic.view.desktop.CourtUISUs;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;

public class CourtSUsControllerG {
	
	private static CourtUISUs view;
	private static CourtSUsControllerG instance=null;
	//bean 
	
	private CourtSUsControllerG(CourtUISUs view) {
		CourtSUsControllerG.view = view;
	}
	
	public static synchronized CourtSUsControllerG getInstance(CourtUISUs view, String courseName, String orgName) throws Exception {
		if(instance==null) {
			instance = new CourtSUsControllerG(view);
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
		CourtBean courtBean = new CourtBean();
		CourtBean.setCourt(courtBean, courseName, organizationName);
		view.setCredentials(courtBean.getName(),courtBean.getOrganization(),courtBean.getLessonPrice(),courtBean.getMonthlyPrice(),
				courtBean.getDescription(),courtBean.getInstructorName(),courtBean.getSport());
	}
}
