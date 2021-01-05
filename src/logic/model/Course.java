
package logic.model;



public class Course {
	
	private String name;
	private double courseID;
	private String organization;
	private double monthlyPrice;
	private double lessonPrice;
	private String sport;
	private String instructorName;
	private String imgSrc;
	private double availability;
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
	public void setCourseID(double courseID) {
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
	public double getAvailability() {
		return availability;
	}
	public void setAvailability(double availability) {
		this.availability = availability;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void addCourse(Course course) throws Exception {
		
		CourseDAO.addCourse(course);
	}
}

	

	
	
	
	



	