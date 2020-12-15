package logic.course_page;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.homepage.*;
import logic.login.*;

public class OrganizationController{

	private static  OrganizationProfileUI organizationProfileView;

	private static OrganizationController instance = null;

	private OrganizationController(OrganizationProfileUI view){
		organizationProfileView = view;
	}

	public synchronized static OrganizationController getInstance(OrganizationProfileUI view){
		if (instance == null) {
			instance = new OrganizationController(view);
			instance.assegnaGestori();
		}
		viewOrganizationProfileUI();
		view.setDescriptionPanelVisible();
		return instance;

	}

	public void assegnaGestori(){

		ActionListener gestoreSignUp = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				organizationProfileView.setVisible(false);
				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController.getInstance(view, model);
			}

		};
		organizationProfileView.getProfileButton().addActionListener(gestoreSignUp);
		
		ActionListener gestoreCourses = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 organizationProfileView.setCoursesPanelVisible();
			 
			}
		};
		organizationProfileView.getCoursesButton().addActionListener(gestoreCourses);
	
		
        ActionListener gestoreCourts = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 organizationProfileView.setCourtsPanelVisible();
			}
		};
		organizationProfileView.getCourtsButton().addActionListener(gestoreCourts);
		
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
	
	public static void viewOrganizationProfileUI() {
		organizationProfileView.setVisible(true);
	}

}