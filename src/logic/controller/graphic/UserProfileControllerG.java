package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import logic.controller.ProfileBean;
import logic.model.OrganizationBean;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.EventUISUs;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.UserProfileUI;

public class UserProfileControllerG {
	
	public static UserProfileUI view;
	private static UserProfileControllerG instance = null;

	private UserProfileControllerG(UserProfileUI vista){
		view = vista;
	}

	public static synchronized UserProfileControllerG getInstance(UserProfileUI vista){
		if (instance == null) {
			instance = new UserProfileControllerG(vista);
			instance.assegnaGestori();
			displayCourses();
			displayEvents();
		}
		
		setCredentials();
		showUserProfileUI();
		return instance;

	}
	
	private static void showUserProfileUI() {
		view.setVisible(true);
	}

	public static void setCredentials() {
		ProfileBean profileBean = new ProfileBean();
		ProfileBean.setCredentials(profileBean);
		String name = profileBean.getName();
		String surname = profileBean.getSurname();
		String username = profileBean.getUsername();
		String location = profileBean.getLocation();
		view.setCredentials(name, surname, username,location);
	}
	
	public void assegnaGestori(){
		
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

		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI vista=new HomeUI();
				HomeControllerGSUs.getInstance(vista);
							
			}

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		
		//showing CoursesPanel
		ActionListener gestoreCourses = new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
					view.setCoursesPanelVisible();
			}
		};
		view.getCoursesButton().addActionListener(gestoreCourses);
		
		
		//showing EventsPanel
		ActionListener gestoreEvents = new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
					view.setEventsPanelVisible();
			}
		};
		view.getEventsButton().addActionListener(gestoreEvents);
		
		
		ActionListener gestoreBack = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					view.setDescriptionPanelVisible();
			}
		};
		view.getBackButton().addActionListener(gestoreBack);

	}
	
	private static void displayOneCourse(String courseName, String orgName) {
		
		  view.createCourseFrame(courseName).addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
				
				CourseUISUs courseUI = new CourseUISUs();
					try {
					   CourseSUsControllerG.getInstance(courseUI, courseName, orgName);
					   view.setVisible(false);
					} catch (Exception e1) {
														
					   e1.printStackTrace();
					}
													
		}
		});
	}
	
	private static void displayOneEvent(String eventName, String orgName) {
		
		view.createEventFrame(eventName).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EventUISUs eventUI = new EventUISUs();
				try {
					EventSUsControllerG.getInstance(eventUI, eventName, orgName);
					view.setVisible(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
	}

	private static void displayCourses() {
		
		ProfileBean profileBean = new ProfileBean();
		for(int i=0; i < profileBean.getCourses().size(); i++) {
				String courseName = profileBean.getCourses().get(i).getName();
				String orgName = profileBean.getCourses().get(i).getOrganization();
				displayOneCourse(courseName, orgName);
		}
		
	}
	
	private static void displayEvents() {
		
		ProfileBean profileBean = new ProfileBean();
		for(int i=0; i < profileBean.getEvents().size(); i++) {
				String eventName = profileBean.getEvents().get(i).getName();
				String orgName = profileBean.getEvents().get(i).getOrganization();
				displayOneEvent(eventName, orgName);
		}
		
	}

}