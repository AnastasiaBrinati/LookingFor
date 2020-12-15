package logic.user_profile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.homepage.*;
import logic.login.*;
import logic.course_page.AddCourseUI;
import logic.organization_profile.OrganizationController;
import logic.organization_profile.OrganizationProfileUI;
import logic.sign_in.SignInController;
import logic.sign_in.SignInUI;

public class UserProfileController {
	
	public static UserProfileUI view;
	
	private static UserProfileController instance = null;

	private UserProfileController(UserProfileUI vista){
		view = vista;
	}

	public static synchronized UserProfileController getInstance(UserProfileUI vista){
		if (instance == null) {
			instance = new UserProfileController(vista);
			instance.assegnaGestori();
		}
		
		showUserProfileUI();
		return instance;

	}
	
	public static void showUserProfileUI() {
		view.setVisible(true);
	}

	
	public void assegnaGestori(){

		ActionListener gestoreCourses = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setPanel4Visible();
							
			}

		};
		view.getbtnCourses().addActionListener(gestoreCourses);
		
		ActionListener gestoreEvents = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setPanel5Visible();
							
			}

		};
		view.getbtnEvents().addActionListener(gestoreEvents);
		
		ActionListener gestoreHome = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				HomeUI vista=new HomeUI();
				HomeModel homeModel = new HomeModel();
				HomeController controller=HomeController.getInstance(vista, homeModel);
							
			}

		};
		view.getHomeButton().addActionListener(gestoreHome);
		
		ActionListener gestoreExit = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				LoginUI view=new LoginUI();
				LoginModel model=new LoginModel();
				LoginController controller=LoginController.getInstance(view, model);
				view.setVisible(false);
							
			}

		};
		view.getExitButton().addActionListener(gestoreExit);
		
		ActionListener gestoreOrganizations = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				
				OrganizationProfileUI vista=new OrganizationProfileUI();
				AddCourseUI view2 = new AddCourseUI();
				OrganizationController controller=OrganizationController.getInstance(vista, view2);
				controller.assegnaGestori();
				view.setVisible(false);
							
			}

		};
		view.getOrganizationsButton().addActionListener(gestoreOrganizations);

	}

}
