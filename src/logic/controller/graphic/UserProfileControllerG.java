package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import logic.controller.ProfileBean;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.EventUISUs;
import logic.view.desktop.HomeUISUs;
import logic.view.desktop.LoginUI;
import logic.view.desktop.SettingsUISUs;
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
		}
		displayCourses();
		displayEvents();
		
		setCredentials();
		showUserProfileUI();
		return instance;

	}
	
	private static void showUserProfileUI() {
		view.setVisible(true);
	}

	public static void setCredentials() {
		ProfileBean profileBean = new ProfileBean();
		String name = profileBean.getName();
		String surname = profileBean.getSurname();
		String username = profileBean.getUsername();
		String location = profileBean.getLocation();
		view.setCredentials(name, surname, username,location);
	}
	
	public void assegnaGestori(){
		
		ActionListener gestoreExit = e -> {

				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG.getInstance(loginUI);
				
		};
		view.getExitButton().addActionListener(gestoreExit);

		
		ActionListener gestoreHome = e -> {

				view.setVisible(false);
				HomeUISUs vista=new HomeUISUs();
				HomeControllerGSUs.getInstance(vista);

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		ActionListener gestoreSetting = e -> {

				view.setVisible(false);
				SettingsUISUs view = new SettingsUISUs();
				SettingsControllerGSUs.getInstance(view);

		};
		view.getHomeButton().addActionListener(gestoreSetting);
		
		
		//showing CoursesPanel
		ActionListener gestoreCourses = e -> {
		
					view.setCoursesPanelVisible();

		};
		view.getCoursesButton().addActionListener(gestoreCourses);
		
		
		//showing EventsPanel
		ActionListener gestoreEvents = e -> {
					
					view.setEventsPanelVisible();
		};
		view.getEventsButton().addActionListener(gestoreEvents);
		
		
		ActionListener gestoreBack = e -> {
			
					view.setDescriptionPanelVisible();

		};
		view.getBackButton().addActionListener(gestoreBack);
		
		/*
		ActionListener gestoreSearch = e -> {
			
			String item = view.getSearchText();
			ResearchController researchController = ResearchController.getInstance();
			//ResearchBean researchBean = new ResearchBean();
			String result = researchController.research(item);
			//
			view.setVisible(false);
			HomeUISUs vista=new HomeUISUs();
			HomeControllerGSUs homeControllerG = HomeControllerGSUs.getInstance(vista);
			homeControllerG.displayResearch(result);

		};
		view.getSearchButton().addActionListener(gestoreSearch);
		*/
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
		view.resetCoursePanel();
		ProfileBean profileBean = new ProfileBean();
		for(int i=0; i < profileBean.getCourses().size(); i++) {
				System.out.println("course" + i + ":" + profileBean.getCourses().get(i).getName());
				String courseName = profileBean.getCourses().get(i).getName();
				String orgName = profileBean.getCourses().get(i).getOrganization();
				displayOneCourse(courseName, orgName);
		}
		
	}
	
	private static void displayEvents() {
		view.resetEventPanel();
		ProfileBean profileBean = new ProfileBean();
		for(int i=0; i < profileBean.getEvents().size(); i++) {
				String eventName = profileBean.getEvents().get(i).getName();
				String orgName = profileBean.getEvents().get(i).getOrganization();
				displayOneEvent(eventName, orgName);
		}
		
	}

}