package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.AddCourseController;
import logic.model.OrganizationProfile;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.AddCourseUI;
import logic.view.desktop.HomeUI;

public class OrganizationControllerG{

	private static  OrganizationProfileUI view;
	private static OrganizationProfile orgmodel;
	//private Course course;

	private static OrganizationControllerG instance = null;

	private OrganizationControllerG(OrganizationProfileUI orgview, OrganizationProfile model){
		view = orgview;
		orgmodel = model;
	}

	public synchronized static OrganizationControllerG getInstance(OrganizationProfileUI view, OrganizationProfile model){
		if (instance == null) {
			instance = new OrganizationControllerG(view, model);
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
				LoginControllerG.getInstance(view);
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
				HomeControllerG controller = HomeControllerG.getInstance(homeView);
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