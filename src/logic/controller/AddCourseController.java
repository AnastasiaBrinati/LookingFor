package logic.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import logic.model.Course;
import logic.model.OrganizationProfile;
import logic.view.desktop.AddCourseUI;
import logic.view.desktop.OrganizationProfileUI;

public class AddCourseController {

	 private static AddCourseUI view;
	 private static OrganizationProfileUI orgview;
	 private static AddCourseController instance = null;
	 private static OrganizationProfile model;
	 
	 private AddCourseController(AddCourseUI addCourseView, OrganizationProfileUI organizationView, OrganizationProfile orgModel) {
		 view = addCourseView;
		 orgview = organizationView;
		 model = orgModel;
	 }
	 
	 public static synchronized AddCourseController getInstance(AddCourseUI view, OrganizationProfileUI orgview, OrganizationProfile model) {
		 if(instance == null) {
			 instance = new AddCourseController(view, orgview, model);
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
					addCourse(name, priceForLesson, priceMonthly);
					view.setVisible(false);
					//view.getDefaultCloseOperation();
					
				}
			};
			view.getAddCourseButton().addActionListener(gestoreNewCourse);
	 }
	 
	 public static void addCourse(String name, Double x, Double y) {
			
			Course c = new Course(name, x , y);
			model.addCourse(c);
			orgview.createFrame(name);
			
	}
	 
	 public static void displayAddCourseView() {
		 view.setVisible(true);
	 }
}