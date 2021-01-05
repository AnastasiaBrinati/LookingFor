package logic.controller;

public class NewCourseBean {
	private String name;
	private int courseID;
	private String organization;
	private double monthlyPrice;
	private double lessonPrice;
	private String sport;
	private String instructorName;
	private String imgSrc;
	private int avaialbility;
	private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public double getMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(double monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	public double getLessonPrice() {
		return lessonPrice;
	}
	public void setLessonPrice(double lessonPrice) {
		this.lessonPrice = lessonPrice;
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
	public int getAvaialbility() {
		return avaialbility;
	}
	public void setAvaialbility(int avaialbility) {
		this.avaialbility = avaialbility;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addCourse(NewCourseBean bean) throws Exception {
		AddCourseController controller=new AddCourseController();
		controller.addCourse(bean);
	}
	
	

}
