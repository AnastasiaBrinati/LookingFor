package logic.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import logic.model.Course;
import logic.model.HomeModel;
import logic.model.LoginModel;
import logic.model.OrganizationProfile;
import logic.view.desktop.AddCourseUI;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.OrganizationProfileUI;

public class OrganizationController{

	private static  OrganizationProfileUI view;
	private static OrganizationProfile orgmodel;
	//private Course course;

	private static OrganizationController instance = null;

	private OrganizationController(OrganizationProfileUI orgview, OrganizationProfile model){
		view = orgview;
		orgmodel = model;
	}

	public synchronized static OrganizationController getInstance(OrganizationProfileUI view, OrganizationProfile model){
		if (instance == null) {
			instance = new OrganizationController(view, model);
			instance.assegnaGestori();
		}
		viewOrganizationProfileUI();
		return instance;

	}

	public void assegnaGestori(){
		
		
		ActionListener gestoreLogin = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController.getInstance(view, model);
			}

		};
		view.getProfileButton().addActionListener(gestoreLogin);
		
		
		//showing CoursesPanel
		ActionListener gestoreCourses = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.setCoursesPanelVisible();
			}
		};
		view.getCoursesButton().addActionListener(gestoreCourses);
		
		
		//click on the add button on the CoursesPanel 
		ActionListener gestoreAddCourse = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddCourseUI addCourseView = new AddCourseUI();
				AddCourseController controller = AddCourseController.getInstance(addCourseView, view, orgmodel);
			}
		};
		view.getAddButton().addActionListener(gestoreAddCourse);
		
		
		//showing CourtsPanel
        ActionListener gestoreCourts = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 view.setCourtsPanelVisible();
			}
		};
		view.getCourtsButton().addActionListener(gestoreCourts);
		
		//showing EventsPanel
        ActionListener gestoreEvents = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 view.setEventsPanelVisible();
			}
		};
		view.getEventsButton().addActionListener(gestoreEvents);
		
        ActionListener gestoreHome = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				HomeUI homeView = new HomeUI();
				HomeModel homeModel = new HomeModel();
				HomeController controller = HomeController.getInstance(homeView, homeModel);
				view.setVisible(false);
			}
		};
		view.getHomeButton().addActionListener(gestoreHome);

	}
	
	
	public static void viewOrganizationProfileUI() {
		view.setVisible(true);
		view.setDescriptionPanelVisible();
	}

}