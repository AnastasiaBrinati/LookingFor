package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import logic.controller.ProfileBean;
import logic.view.desktop.HomeUI;
import logic.view.desktop.LoginUI;
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
		view.setCredentials(name, surname, username);
	}
	
	public void assegnaGestori(){
		
		ActionListener gestoreExit = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				LoginUI loginUI=new LoginUI();
				loginUI.resetForm();
				view.setVisible(false);
				LoginControllerG loginControllerG=LoginControllerG.getInstance(loginUI);
				
			}

		};
		view.getExitButton().addActionListener(gestoreExit);

		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI vista=new HomeUI();
				HomeControllerGSUs controller = HomeControllerGSUs.getInstance(vista);
							
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

}