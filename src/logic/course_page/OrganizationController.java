package logic.course_page;

import logic.login.LoginUI;
import logic.login.LoginController;
import logic.login.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OrganizationController{

	private static  OrganizationProfileUI vista;

	private static OrganizationController instance = null;

	private OrganizationController(OrganizationProfileUI vista){
		this.vista = vista;
	}

	public synchronized static OrganizationController getInstance(OrganizationProfileUI vista){
		if (instance == null) {
			instance = new OrganizationController(vista);
		}
		viewOrganizationProfileUI();
		vista.setDescriptionPanelVisible();
		return instance;

	}

	public void assegnaGestori(){

		ActionListener gestoreSignUp = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				vista.setVisible(false);
				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController.getInstance(view,	model);
			}

		};
		vista.getProfileButton().addActionListener(gestoreSignUp);
		
		ActionListener gestoreCourses =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 vista.setCoursesPanelVisible();
			}
		};
		vista.getCoursesButton().addActionListener(gestoreCourses);
		
        ActionListener gestoreCourts =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 vista.setCourtsPanelVisible();
			}
		};
		vista.getCourtsButton().addActionListener(gestoreCourts);
		
        ActionListener gestoreEvents =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 vista.setEventsPanelVisible();
			}
		};
		vista.getEventsButton().addActionListener(gestoreEvents);

	}
	
	public static void viewOrganizationProfileUI() {
		vista.setVisible(true);
	}

}