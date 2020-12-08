package coursePage;

import login.LoginUI;
import login.LoginController;
import login.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CourseController{

	private CourseUI vista;

	private static CourseController instance = null;

	private CourseController(CourseUI vista){
		this.vista = vista;
	}

	public synchronized static CourseController getInstance(CourseUI vista){
		if (instance == null) {
			instance = new CourseController(vista);
		}
		return instance;

	}

	public void assegnaGestoriCourse(){

		ActionListener gestoreSignUp = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				// TODO Auto-generated method stub
				vista.setVisible(false);
				LoginUI view = new LoginUI();
				LoginModel model = new LoginModel();
				LoginController control = LoginController.getInstance(view,	model);
			}

		};
		vista.getProfileButton().addActionListener(gestoreSignUp);

	}

}