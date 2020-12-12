package course_page;

import login.LoginUI;
import login.LoginController;
import login.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CourseController{

	private CourseUI view;

	private static CourseController instance = null;

	private CourseController(CourseUI vista){
		this.view = vista;
	}

	public synchronized static CourseController getInstance(CourseUI vista){
		if (instance == null) {
			instance = new CourseController(vista);
		}
		return instance;

	}

	public void assegnaGestori(){

		ActionListener gestoreSignUp = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				view.setVisible(false);
				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController.getInstance(view, model);
			}

		};
		view.getProfileButton().addActionListener(gestoreSignUp);

	}

}