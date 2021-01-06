package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.NewCourseBean;
import logic.controller.ProfileBean;
import logic.model.OrganizationBean;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.LoginUI;
import logic.view.desktop.HomeUI;

public class OrganizationControllerG{

	private static OrganizationProfileUI view;
	private static OrganizationControllerG instance = null;

	private OrganizationControllerG(OrganizationProfileUI orgview){
		view = orgview;
	}

	public synchronized static OrganizationControllerG getInstance(OrganizationProfileUI view){
		if (instance == null) {
			instance = new OrganizationControllerG(view);
			instance.assegnaGestori();
		}
		setCredentials();
		viewOrganizationProfileUI();
		return instance;

	}
	
	public static void setCredentials() {
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		String name = orgBean.getName();
		String email = orgBean.getEmail();
		String password = orgBean.getPassword();
		view.setCredentials(name, email, password);
	}

	public void assegnaGestori(){
		
		//trasformare in uscita
		ActionListener gestoreLogin = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				LoginUI view = new LoginUI();
				LoginControllerG.getInstance(view);
			}
		};
		view.getProfileButton().addActionListener(gestoreLogin);
		
		////////////////////////////////////////////////////////////////////////
		//Da qui inizia la sequenza di bottoni per il caso d'uso new course
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
				view.showNewCoursePanel();
			}
		};
		view.getAddButton().addActionListener(gestoreAddCourse);
		
		
		ActionListener gestoreSaveCourse = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NewCourseBean newCourseBean = new NewCourseBean();
				getCredentials(newCourseBean);
				try {
					NewCourseBean.addCourse(newCourseBean);
					displayCourses();
					view.setCoursesPanelVisible();
					view.repaint();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		};
		view.getSaveButton().addActionListener(gestoreSaveCourse);		
		//fine caso d'uso new course
		//////////////////////////////////////////////////////////////////
		
		
		
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
				HomeControllerGSUs controller = HomeControllerGSUs.getInstance(homeView);
				view.setVisible(false);
			}
		};
		view.getHomeButton().addActionListener(gestoreHome);

	}
	
	private static void displayCourses() {
		
		for(int i=0; i < OrganizationBean.getCourses().size(); i++) {
			String name = OrganizationBean.getCourses().get(i).getName();
			view.createCourseFrame(name);
		}
		
	}
	
	private void getCredentials(NewCourseBean newCourseBean){
		newCourseBean.setName(view.getName());
		newCourseBean.setMonthlyPrice(view.getMonthlyPrice());
		newCourseBean.setLessonPrice(view.getPriceForLesson());
		newCourseBean.setDescription(view.getDescription());
		newCourseBean.setSport(view.getSport());
		newCourseBean.setInstructorName(view.getInstructorName());

	}
	
	
	public static void viewOrganizationProfileUI() {
		view.setVisible(true);
		view.setDescriptionPanelVisible();
	}

}