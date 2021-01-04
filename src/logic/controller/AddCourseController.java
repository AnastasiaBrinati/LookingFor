package logic.controller;

import logic.model.Course;

public class AddCourseController {
	
	private static AddCourseController instance;
	private AddCourseController() {
		}
		
	public static synchronized AddCourseController getInstance() {
		if(instance==null) {
			instance = new AddCourseController();
		}
	
		return instance;
	}
	
	public void addCourse(NewCourseBean bean) {
		Course newCourse=new Course();
		newCourse.setAvailability(bean.getAvaialbility());
		newCourse.setCourseID(0);
		newCourse.setDescription(bean.getDescription());
		newCourse.setImgSrc(bean.getImgSrc());
		newCourse.setInstructorName(bean.getInstructorName());
		newCourse.setLessonPrice(bean.getLessonPrice());
		newCourse.setMonthlyPrice(bean.getMonthlyPrice());
		newCourse.setName(bean.getName());
		newCourse.setOrganization(bean.getOrganization());
		newCourse.setSport(bean.getSport());
		
		try {
			newCourse.addCourse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
