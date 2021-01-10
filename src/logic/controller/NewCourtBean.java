package logic.controller;

public class NewCourtBean {
	private String name;
	private float price;
	private String sport;
	private String imgSrc;
	private float availability;
	private String description;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return String.valueOf(availability);
	}
	public void setAvailability(String availability) {
		this.availability = Float.parseFloat(availability);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public static void addCourt(NewCourtBean bean) throws Exception {
		AddCourtController addCourtController=new AddCourtController();
		addCourtController.addCourt(bean);
	}
	

}
