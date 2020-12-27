package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.view.desktop.AddCourseUI;
import logic.controller.OrganizationController;
import logic.model.HomeModel;
import logic.model.OrganizationProfile;
import logic.view.desktop.HomeUI;
import logic.view.desktop.OrganizationProfileUI;
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
		
		showUserProfileUI();
		return instance;

	}
	
	private static void showUserProfileUI() {
		view.setVisible(true);
	}

	
	public void assegnaGestori(){

		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI vista=new HomeUI();
				HomeControllerG controller = HomeControllerG.getInstance(vista);
							
			}

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		
		ActionListener gestoreOrganizations = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				
				OrganizationProfileUI vista=new OrganizationProfileUI();
				AddCourseUI view2 = new AddCourseUI();
				OrganizationProfile orgmodel = new OrganizationProfile();
				OrganizationController controller=OrganizationController.getInstance(vista, orgmodel);
				controller.assegnaGestori();
				view.setVisible(false);
							
			}

		};
		view.getOrganizationsButton().addActionListener(gestoreOrganizations);
		
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
		
		ActionListener gestoreWorkout = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					view.setWorkoutPanelVisible();
			}
		};
		view.getWorkoutButton().addActionListener(gestoreWorkout);
		
		ActionListener gestoreAddWorkoutRoutine = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					view.enableNewWorkoutPanel();
			}
		};
		view.getWorkoutButton().addActionListener(gestoreAddWorkoutRoutine);
		
		ActionListener gestoreBack = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					view.setDescriptionPanelVisible();
			}
		};
		view.getBackButton().addActionListener(gestoreBack);

	}

}