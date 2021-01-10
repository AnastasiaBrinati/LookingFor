package logic.model;

import java.awt.Color;

import javax.swing.JButton;

public class EventBean {

	private String name;
	private String date;
	private String imgSrc;
	private String description;
	private String organization;
	private String sport;
	private float availability;
	private float price;
	
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
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.sport = organization;
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
	
	
	public static void setEvent(EventBean eventBean,String eventName,String organizationName) throws Exception {
		// TODO Auto-generated method stub
		Event event=new Event();
		event=Event.setEventCredentials(eventName,organizationName);
		eventBean.setName(event.getName());
		eventBean.setPrice(event.getPrice());
		eventBean.setDate(event.getDate());
		eventBean.setSport(event.getSport());
		eventBean.setAvailability(event.getAvailability());
		eventBean.setDescription(event.getDescription());
		eventBean.setOrganization(event.getOrganization());
	}
		
}
