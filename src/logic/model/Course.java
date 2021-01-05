
package logic.model;



public class Course {
	
	private String name;
	private int courseID;
	private String organization;
	private float monthlyPrice;
	private float lessonPrice;
	private String sport;
	private String instructorName;
	private String imgSrc;
	private float availability;
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
	public void setMonthlyPrice(float monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
	}
	public float getLessonPrice() {
		return lessonPrice;
	}
	public void setLessonPrice(float lessonPrice) {
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
	public float getAvailability() {
		return availability;
	}
	public void setAvailability(float availability) {
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

	

	
	
	
	



	