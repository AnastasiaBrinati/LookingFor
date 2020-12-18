package logic.course_page;

import com.sun.prism.Image;

public class Course {
	
	String name;
	Double priceForLesson;
	Double priceMonthly;
	//Image img;
	
	
	public String getCourseName() {
		return name;
	}
	
	public Course(String name, Double priceForLesson, Double priceMonthly) {
		this.name = name;
		this.priceForLesson = priceForLesson;
		this.priceMonthly = priceMonthly;
	}
}
