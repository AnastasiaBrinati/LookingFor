package logic.model;



public class Course {
	
	private String name;
	private Double priceForLesson;
	private Double priceMonthly;
	private String description;
	private String organizationName;

	

	
	
	
	public Course(String name, Double priceForLesson, Double priceMonthly) {
		this.setName(name);
		this.setPriceForLesson(priceForLesson);
		this.setPriceMonthly(priceMonthly);
	}



	public String getOrganizationName() {
		return organizationName;
	}



	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Double getPriceForLesson() {
		return priceForLesson;
	}



	public void setPriceForLesson(Double priceForLesson) {
		this.priceForLesson = priceForLesson;
	}



	public Double getPriceMonthly() {
		return priceMonthly;
	}



	public void setPriceMonthly(Double priceMonthly) {
		this.priceMonthly = priceMonthly;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
}
