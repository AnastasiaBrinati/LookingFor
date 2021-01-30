package logic.controller;

public class NewEventBean {
	
	private String name;
	private String date;
	private float price;
	private String sport;
	private String imgSrc;
	private float avaialbility;
	private String description;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getPrice() {
		return String.valueOf(price);
	}
	public void setPrice(String price) {
		
		this.price = Float.parseFloat(price);
	}

	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public String getAvailability() {
		return String.valueOf(avaialbility);
	}
	public void setAvailability(String availability) {
		this.avaialbility = Float.parseFloat(availability);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public static void addEvent(NewEventBean bean) throws Exception {
		AddEventController addEventController=AddEventController.getInstance();
		addEventController.addEvent(bean);
	}
	
	

}
