package logic.controller;

public class NewCourseBean {
	private String name;
	private int courseID;
	
	private float monthlyPrice;
	private float lessonPrice;
	private String sport;
	private String instructorName;
	private String imgSrc;
	private float avaialbility;
	private String description;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseID() {
		return String.valueOf(courseID);
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	public String getMonthlyPrice() {
		return String.valueOf(monthlyPrice);
	}
	public void setMonthlyPrice(String monthlyPrice) {
		
		this.monthlyPrice = Float.parseFloat(monthlyPrice);
	}
	public String getLessonPrice() {
		return String.valueOf(lessonPrice);
	}
	public void setLessonPrice(String lessonPrice) {
		this.lessonPrice = Float.parseFloat(lessonPrice);
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public String getAvaialbility() {
		return String.valueOf(avaialbility);
	}
	public void setAvaialbility(int availability) {
		this.avaialbility = availability;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public static void addCourse(NewCourseBean bean) throws Exception {
		AddCourseController addCourseController = AddCourseController.getInstance();
		addCourseController.addCourse(bean);
	}
	
	

}
