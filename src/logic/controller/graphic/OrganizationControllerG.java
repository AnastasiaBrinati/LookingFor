package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import logic.controller.NewCourseBean;
import logic.controller.NewCourtBean;
import logic.controller.NewEventBean;
import logic.model.OrganizationBean;
import logic.view.desktop.OrganizationProfileUI;
import logic.view.desktop.SettingsUIOrg;
import logic.view.desktop.LoginUI;
import logic.view.desktop.CourseUIOrg;
import logic.view.desktop.CourtUIOrg;
import logic.view.desktop.EventUIOrg;
import logic.view.desktop.HomeUI;

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
			displayEvents();
			displayCourts();
		}
		setCredentials();
		viewOrganizationProfileUI();
		
		return instance;

	}
	
	public static void viewOrganizationProfileUI() {
		view.setVisible(true);
		view.setDescriptionPanelVisible();
	}
	
	public static void setCredentials() {
		OrganizationBean orgBean = new OrganizationBean();
		view.setCredentials(orgBean.getName(),orgBean.getLocation());
	}

	/////////////////////////////////////////////////////////////////////////////////////////
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
		
		
		ActionListener gestoreCancelCourse = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.resetNewCourseForm();
			}
		};
		view.getCancelCourseButton().addActionListener(gestoreCancelCourse);
		
		
		ActionListener gestoreSaveCourse = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NewCourseBean newCourseBean = new NewCourseBean();
				getNewCourseCredentials(newCourseBean);
				try {
					NewCourseBean.addCourse(newCourseBean);
					view.setCoursesPanelVisible();
					OrganizationBean orgBean = new OrganizationBean();
					String orgName = orgBean.getName();
					displayOneCourse(newCourseBean.getName(), orgName);
					
				} catch (Exception e1) {
					view.doubleCourseErrorMessage("Course already exists");
					e1.printStackTrace();
				}
				
			}
		};
		view.getSaveCourseButton().addActionListener(gestoreSaveCourse);		
		//fine caso d'uso new course
		/////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////
		//showing CourtsPanel
        ActionListener gestoreCourts = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 view.setCourtsPanelVisible();
			}
		};
		view.getCourtsButton().addActionListener(gestoreCourts);
		
		
		//click on the add button on the CourtsPanel 
		ActionListener gestoreAddCourt = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					view.showNewCourtPanel();
			}
		};
		view.getAddCourtButton().addActionListener(gestoreAddCourt);
		
		
		ActionListener gestoreCancelCourt = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.resetNewCourtForm();
			}
		};
		view.getCancelCourtButton().addActionListener(gestoreCancelCourt);
				
				
		ActionListener gestoreSaveCourt = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NewCourtBean newCourtBean = new NewCourtBean();
				getNewCourtCredentials(newCourtBean);
					try {
						NewCourtBean.addCourt(newCourtBean);
						view.setCourtsPanelVisible();
						OrganizationBean orgBean = new OrganizationBean();
						String orgName = orgBean.getName();
						displayOneCourt(newCourtBean.getName(), orgName);
							
					} catch (Exception e1) {
							view.doubleCourtErrorMessage("Court already exists");
							e1.printStackTrace();
						}
						
			}
		};
		view.getSaveCourtButton().addActionListener(gestoreSaveCourt);		
		//fine caso d'uso new court
		///////////////////////////////////////////////////////////////////
		
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
		
		
		ActionListener gestoreCancelEvent = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				view.resetNewEventForm();
			}
		};
		view.getCancelEventButton().addActionListener(gestoreCancelEvent);
				
				
		ActionListener gestoreSaveEvent = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				NewEventBean newEventBean = new NewEventBean();
				getNewEventCredentials(newEventBean);
					try {
						NewEventBean.addEvent(newEventBean);
						view.setEventsPanelVisible();
						OrganizationBean orgBean = new OrganizationBean();
						String orgName = orgBean.getName();
						displayOneEvent(newEventBean.getName(), orgName);
							
					} catch (Exception e1) {
							view.doubleEventErrorMessage("event already exists");
							e1.printStackTrace();
						}
						
			}
		};
		view.getSaveEventButton().addActionListener(gestoreSaveEvent);
		
		//fine caso d'uso
		///////////////////////////////////////////////////////////////////
		
	
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
	//fine gestori
	
	
	private static void displayOneCourse(String courseName, String orgName) {
			
			  view.createCourseFrame(courseName).addActionListener(new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
					
					CourseUIOrg courseUI = new CourseUIOrg();
						try {
						   CourseOrgControllerG.getInstance(courseUI, courseName, orgName);
						   view.setVisible(false);
						} catch (Exception e1) {
															
						   e1.printStackTrace();
						}
														
			}
			});
	}
	
	private static void displayOneCourt(String courtName, String orgName) {
			
			view.createCourtFrame(courtName).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CourtUIOrg courtUI = new CourtUIOrg();
				try {
					CourtOrgControllerG.getInstance(courtUI, courtName, orgName);
					view.setVisible(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
	
	private static void displayOneEvent(String eventName, String orgName) {
			
			view.createEventFrame(eventName).addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				EventUIOrg eventUI = new EventUIOrg();
				try {
					EventOrgControllerG.getInstance(eventUI, eventName, orgName);
					view.setVisible(false);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
	});
	}
	
	
	private static void displayCourses() {
		
		OrganizationBean orgBean = new OrganizationBean();
		String orgName = orgBean.getName();
		for(int i=0; i < orgBean.getCourses().size(); i++) {
				String courseName = orgBean.getCourses().get(i).getName();
				displayOneCourse(courseName, orgName);
		}
		
	}
	
	private static void displayEvents() {
		
		OrganizationBean orgBean = new OrganizationBean();
		String orgName = orgBean.getName();
		for(int i=0; i < orgBean.getEvents().size(); i++) {
				String eventName = orgBean.getEvents().get(i).getName();
				displayOneEvent(eventName, orgName);
		}
		
	}
	
	private static void displayCourts() {

		
		OrganizationBean orgBean = new OrganizationBean();
		String orgName = orgBean.getName();
		for(int i=0; i < orgBean.getCourts().size(); i++) {
				String courtName = orgBean.getCourts().get(i).getName();
				displayOneCourt(courtName, orgName);
		}
		
	}
	
	
	private void getNewCourseCredentials(NewCourseBean newCourseBean){
		
		newCourseBean.setName(view.getName());
		newCourseBean.setMonthlyPrice(view.getMonthlyPrice());
		newCourseBean.setLessonPrice(view.getPriceForLesson());
		newCourseBean.setDescription(view.getDescription());
		newCourseBean.setSport(view.getSport());
		newCourseBean.setInstructorName(view.getInstructorName());

	}
	
	private void getNewEventCredentials(NewEventBean newEventBean){
		
		newEventBean.setName(view.getEventName());
		newEventBean.setDate(view.getEventDate());
		newEventBean.setSport(view.getEventSport());
		newEventBean.setDescription(view.getEventDescription());
		newEventBean.setPrice(view.getEventPrice());
		newEventBean.setAvailability(view.getEventAvailability());

	}

	private void getNewCourtCredentials(NewCourtBean newCourtBean){
	
		newCourtBean.setName(view.getCourtName());
		newCourtBean.setPrice(view.getCourtPrice());
		newCourtBean.setDescription(view.getCourtDescription());
		newCourtBean.setSport(view.getSport());
		newCourtBean.setAvailability(view.getEventAvailability());

	}

	public void deleteCourseButton(String buttonName) {
		JPanel coursesPanel=view.getCoursesPanel();
		
	
	}
	

}