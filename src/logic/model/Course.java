
package logic.model;



public class Course {
	
	private String name;
	private String courseID;
	private String organization;
	private String monthlyPrice;
	private String lessonPrice;
	private String sport;
	private String instructorName;
	private String imgSrc;
	private String availability;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getMonthlyPrice() {
		return monthlyPrice;
	}
	public void setMonthlyPrice(String monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	public String getLessonPrice() {
		return lessonPrice;
	}
	public void setLessonPrice(String lessonPrice) {
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
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
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
	
	
	public static Course setCourseCredentials(String courseName,String organizationName) throws Exception {
		CourseDAO courseDAO=new CourseDAO();
		return courseDAO.getCourse(courseName,organizationName);

	}
	
	
}

	

	
	
	
	



	