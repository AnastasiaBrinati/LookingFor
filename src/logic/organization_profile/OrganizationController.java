package logic.organization_profile;

import logic.course_page.AddCourseUI;
import logic.course_page.Course;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.homepage.*;
import logic.login.*;

public class OrganizationController{

	private static  OrganizationProfileUI organizationProfileView;
	private static AddCourseUI addCourseView;
	private OrganizationProfile orgmodel;
	private Course course;

	private static OrganizationController instance = null;

	private OrganizationController(OrganizationProfileUI view, AddCourseUI view2){
		organizationProfileView = view;
		addCourseView = view2;
	}

	public synchronized static OrganizationController getInstance(OrganizationProfileUI view, AddCourseUI view2){
		if (instance == null) {
			instance = new OrganizationController(view, view2);
			instance.assegnaGestori();
		}
		viewOrganizationProfileUI();
		view.setDescriptionPanelVisible();
		return instance;

	}

	public void assegnaGestori(){
		
		
		ActionListener gestoreLogin = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				organizationProfileView.setVisible(false);
				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController.getInstance(view, model);
			}

		};
		//profileButton???
		organizationProfileView.getProfileButton().addActionListener(gestoreLogin);
		
		//showing CoursesPanel
		ActionListener gestoreCourses = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				organizationProfileView.setCoursesPanelVisible();
			 
			}
		};
		organizationProfileView.getCoursesButton().addActionListener(gestoreCourses);
		
		
		//click on the add button on the CoursesPanel 
		ActionListener gestoreAddCourse = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				addCourseView.setVisible(true);
			 
			}
		};
		organizationProfileView.getAddButton().addActionListener(gestoreAddCourse);
		
		//showing CourtsPanel
        ActionListener gestoreCourts = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 organizationProfileView.setCourtsPanelVisible();
			}
		};
		organizationProfileView.getCourtsButton().addActionListener(gestoreCourts);
		
		//showing EventsPanel
        ActionListener gestoreEvents = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 organizationProfileView.setEventsPanelVisible();
			}
		};
		organizationProfileView.getEventsButton().addActionListener(gestoreEvents);
		
         ActionListener gestoreHome = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				HomeUI homeView = new HomeUI();
				HomeModel homeModel = new HomeModel();
				HomeController controller = HomeController.getInstance(homeView, homeModel);
				organizationProfileView.setVisible(false);
			 
			}
		};
		organizationProfileView.getHomeButton().addActionListener(gestoreHome);
		
		//click on addCourse on AddCourseView
		ActionListener gestoreNewCourse = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addCourseView.setVisible(false);
				String name = addCourseView.getName();
				Double priceForLesson = addCourseView.getPriceForLesson();
				Double priceMonthly = addCourseView.getPriceMonthly();
				course = new Course(name, priceForLesson, priceMonthly);
				orgmodel.addCourse(course);
				organizationProfileView.addCourse(name);
			}
		};
		addCourseView.getAddCourseButton().addActionListener(gestoreNewCourse);
		

	}
	
	public static void viewOrganizationProfileUI() {
		organizationProfileView.setVisible(true);
	}

}