package user_profile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfileController {
	
	public static UserProfileUI view;
	
	private static UserProfileController instance = null;

	private UserProfileController(UserProfileUI vista){
		view = vista;
	}

	public synchronized static UserProfileController getInstance(UserProfileUI vista){
		if (instance == null) {
			instance = new UserProfileController(vista);
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

	}

}

