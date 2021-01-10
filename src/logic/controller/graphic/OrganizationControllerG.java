package logic.controller.graphic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.controller.NewCourseBean;
import logic.controller.NewCourtBean;
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
	
	public static void setCredentials() {
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		view.setCredentials(orgBean.getName(),orgBean.getLocation());
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
					view.createCourseFrame(newCourseBean.getName());
					
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
				NewCourtBean newCourseBean = new NewCourtBean();
				getNewCourtCredentials(newCourtBean);
					try {
						NewCourtBean.addCourse(newCourtBean);
						view.setCourtsPanelVisible();
						view.createCourtFrame(newCourtBean.getName());
							
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
				getNewCourtCredentials(newEventBean);
					try {
						NewEventBean.addCourse(newEventBean);
						view.setEventsPanelVisible();
						view.createEventFrame(newEventBean.getName());
							
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
	
		
	
	private static void displayCourses() {
		
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		String orgName = orgBean.getName();
		for(int i=0; i < orgBean.getCourses().size(); i++) {
				String courseName = orgBean.getCourses().get(i).getName();
				System.out.println("nome corso: " + courseName);
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
		
	}
	
	private static void displayEvents() {
		
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		String orgName = orgBean.getName();
		for(int i=0; i < orgBean.getEvents().size(); i++) {
				String eventName = orgBean.getEvents().get(i).getName();
				System.out.println("nome evento: " + eventName);
				view.createCourtFrame(eventName).addActionListener(new ActionListener() {
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
		
	}
	
	private static void displayCourts() {
		
		OrganizationBean orgBean = new OrganizationBean();
		OrganizationBean.setCredentials(orgBean);
		String orgName = orgBean.getName();
		for(int i=0; i < orgBean.getCourts().size(); i++) {
				String courtName = orgBean.getCourts().get(i).getName();
				System.out.println("nome campo: " + courtName);
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
		
	}
	
	private void getNewCourseCredentials(NewCourseBean newCourseBean){
		
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