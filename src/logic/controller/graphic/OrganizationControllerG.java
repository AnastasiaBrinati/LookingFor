package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.NewCourseBean;
import logic.model.OrganizationBean;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.SettingsUIOrg;
import logic.view.desktop.LoginUI;
import logic.view.desktop.CourseUISUs;
import logic.view.desktop.HomeUI;
import logic.view.desktop.ItemButton;

public class OrganizationControllerG{

	private static OrganizationProfileUI view;
	private static OrganizationControllerG instance = null;

	private OrganizationControllerG(OrganizationProfileUI orgview){
		OrganizationControllerG.view = orgview;
	}

	public synchronized static OrganizationControllerG getInstance(OrganizationProfileUI view){
		if (instance == null) {
			instance = new OrganizationControllerG(view);
			instance.assegnaGestori();
			displayCourses();
		}
		setCredentials();
		viewOrganizationProfileUI();
		return instance;

	}
	
	public static void setCredentials() {
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		view.setCredentials(OrganizationBean.getName());
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
		
		ActionListener gestoreBack = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					view.setDescriptionPanelVisible();
			}
		};
		view.getBackButton().addActionListener(gestoreBack);
		
		
		
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
		view.getAddCourseButton().addActionListener(gestoreAddCourse);
		
		
		ActionListener gestoreSaveCourse = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NewCourseBean newCourseBean = new NewCourseBean();
				getCredentials(newCourseBean);
				try {
					NewCourseBean.addCourse(newCourseBean);
					view.setCoursesPanelVisible();
					view.createCourseFrame(newCourseBean.getName());
					
				} catch (Exception e1) {
					view.doubleCourseErrorMessage("Course already exists");
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
		
		
		
		///////////////////////////////////////////////////////////////////
		//da qui inizia caso d'uso per aggiungere evento		
		//showing EventsPanel
        ActionListener gestoreEvents = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 view.setEventsPanelVisible();
			}
		};
		view.getEventsButton().addActionListener(gestoreEvents);
		
		//click on the add button on the CoursesPanel 
		ActionListener gestoreAddEvent = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.showNewEventPanel();
			}
		};
		view.getAddEventButton().addActionListener(gestoreAddEvent);
		
		//fine caso d'uso
		///////////////////////////////////////////////////////////////////
		
		
		//assegnaGestoriCorsi();
		
		
        ActionListener gestoreHome = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				HomeUI homeView = new HomeUI();
				HomeControllerGOrg.getInstance(homeView);
				view.setVisible(false);
			}
		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		ActionListener gestoreSettings = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					SettingsUIOrg settingUI = new SettingsUIOrg();
					SettingsControllerGOrg.getInstance(settingUI);
					view.setVisible(false);
				}
			};
			view.getSettingButton().addActionListener(gestoreSettings);

	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	/*
	private static void assegnaGestoriCorsi() {
		if(OrganizationBean.getCourses()!=null){
		for(int i=0; i < OrganizationBean.getCourses().size(); i++) {
			
			String courseName = OrganizationBean.getCourses().get(i).getName();
			ActionListener gestoreCourseFrame = new ActionListener() {
			
				@Override
				public void actionPerformed(ActionEvent e) {
					ItemButton ib = (ItemButton) e.getSource();
					CourseUISUs courseUI = new CourseUISUs();
					//PER ORA 
					try {
						CourseSUsControllerG.getInstance(courseUI, ib.getText(), ib.getOrganizationName());
					} catch (Exception e1) {
						// does whatever
						e1.printStackTrace();
					}
					view.setVisible(false);
				}
			};
			if(view.getFrame(courseName)!=null) {
				view.getFrame(courseName).addActionListener(gestoreCourseFrame);
			}
			
		}
		}
	}
	
	*/
	
	
	
	private static void displayCourses() {
			
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		String orgName = orgBean.getName();
		for(int i=0; i < orgBean.getCourses().size(); i++) {
				String courseName = orgBean.getCourses().get(i).getName();
				System.out.println("nome corso: " + courseName);
				view.createCourseFrame(courseName).addActionListener(new ActionListener() {
														public void actionPerformed(ActionEvent e) {
						
															CourseUISUs courseUI = new CourseUISUs();
															try {
																CourseSUsControllerG.getInstance(courseUI, courseName, orgName);
															} catch (Exception e1) {
																// TODO Auto-generated catch block
																e1.printStackTrace();
															}
															
														}
												});
		}
		
	}
	
	private static void displayEvents() {
		
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		for(int i=0; i < orgBean.getEvents().size(); i++) {
				String eventName = orgBean.getEvents().get(i).getName();
				System.out.println("nome corso: " + eventName);
				view.createEventFrame(eventName);
		}
		
	}
	
	private static void displayCourts() {
		
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		for(int i=0; i < orgBean.getCourts().size(); i++) {
				String courtName = orgBean.getCourts().get(i).getName();
				System.out.println("nome corso: " + courtName);
				view.createCourtFrame(courtName);
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