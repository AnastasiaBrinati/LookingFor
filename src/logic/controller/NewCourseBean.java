package logic.controller;

public class NewCourseBean {
	private String name;
	private int courseID;
	private String organization;
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
	public float getCourseID() {
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
	public float getMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(String monthlyPrice) {
		
		this.monthlyPrice = Float.parseFloat(monthlyPrice);
	}
	public float getLessonPrice() {
		return lessonPrice;
	}
	public void setLessonPrice(String lessonPrice) {
		this.lessonPrice = Float.parseFloat(lessonPrice);;
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
	public float getAvaialbility() {
		return avaialbility;
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
		AddCourseController controller=new AddCourseController();
		controller.addCourse(bean);
	}
	
	

}
