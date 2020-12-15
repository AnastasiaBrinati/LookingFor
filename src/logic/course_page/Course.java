package logic.course_page;

import com.sun.prism.Image;

public class Course {
	
	String name;
	Double pricForLesson;
	Double priceMonthly;
	Image img;
	
	
	public String getCourseName() {
		return name;
	}
	
	public Course(String name, Double priceForLesson, Double priceMonthly) {
		Course course = new Course(name, priceForLesson, priceMonthly);
	}
}
