package logic.controller;

public class NewCourseBean {
	private String name;
	private double courseID;
	private String organization;
	private double monthlyPrice;
	private double lessonPrice;
	private String sport;
	private String instructorName;
	private String imgSrc;
	private double avaialbility;
	private String description;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCourseID() {
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
	public void setMonthlyPrice(String monthlyPrice) {
		
		this.monthlyPrice = Double.parseDouble(monthlyPrice);
	}
	public double getLessonPrice() {
		return lessonPrice;
	}
	public void setLessonPrice(String lessonPrice) {
		this.lessonPrice = Double.parseDouble(lessonPrice);;
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
	public double getAvaialbility() {
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
	
	public static void addCourse(NewCourseBean bean) throws Exception {
		AddCourseController controller=new AddCourseController();
		controller.addCourse(bean);
	}
	
	

}
