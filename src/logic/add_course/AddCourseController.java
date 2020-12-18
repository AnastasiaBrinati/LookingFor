package logic.add_course;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.course_page.Course;
import logic.organization_profile.*;

public class AddCourseController {

	 private static AddCourseUI view;
	// private OrganizationProfile model;
	 private OrganizationProfileUI orgview;
	 private static AddCourseController instance = null;
	 private static OrganizationProfile model;
	 
	 private AddCourseController(AddCourseUI view, OrganizationProfile model) {
		 this.view = view;
	 }
	 
	 public static synchronized AddCourseController getInstance(AddCourseUI view, OrganizationProfile model) {
		 if(instance == null) {
			 instance = new AddCourseController(view, model);
			 instance.assegnaGestori();
		 }
		 displayAddCourseView();
		 return instance;
	 }
	 
	 public void assegnaGestori() {
	 		//click on addCourse on AddCourseView
			ActionListener gestoreNewCourse = new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String name = view.getName();
					Double priceForLesson = view.getPriceForLesson();
					Double priceMonthly = view.getPriceMonthly();		
					OrganizationController c = OrganizationController.getInstance(orgview, model);
					c.addCourse(name, priceForLesson, priceMonthly);
					//view.setVisible(false);
					view.getDefaultCloseOperation();
					
				}
			};
			view.getAddCourseButton().addActionListener(gestoreNewCourse);
	 }
	 
	 public static void displayAddCourseView() {
		 view.setVisible(true);
	 }
}
