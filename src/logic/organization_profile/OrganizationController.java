package logic.organization_profile;

import logic.add_course.AddCourseController;
import logic.add_course.AddCourseUI;
import logic.course_page.Course;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.homepage.*;
import logic.login.*;

public class OrganizationController{

	private static  OrganizationProfileUI organizationProfileView;
	private static OrganizationProfile orgmodel;
	private Course course;

	private static OrganizationController instance = null;

	private OrganizationController(OrganizationProfileUI view, OrganizationProfile model){
		organizationProfileView = view;
		orgmodel = model;
	}

	public synchronized static OrganizationController getInstance(OrganizationProfileUI view, OrganizationProfile model){
		if (instance == null) {
			instance = new OrganizationController(view, model);
			instance.assegnaGestori();
		}
		viewOrganizationProfileUI();
		//view.setDescriptionPanelVisible();
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
				AddCourseUI addCourseView = new AddCourseUI();
				AddCourseController controller = AddCourseController.getInstance(addCourseView, orgmodel);
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
		

	}
	
	public static void addCourse(String name, Double x, Double y) {
		
		//Course c = new Course(name, x , y);
		//orgmodel.addCourse(c);
		organizationProfileView.createFrame(name);
		
	}
	
	public static void viewOrganizationProfileUI() {
		organizationProfileView.setVisible(true);
	}

}