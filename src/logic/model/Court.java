package logic.model;

public class Court {
	
	private String name;
	private String imgSrc;
	private String description;
	private String sport;
	private String availability;
	private String price;
	private String type;
	private String organization;
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getImgSrc() {
		return imgSrc;
	}
	public void setImgSrc(String imgSrc) {
		this.imgSrc = imgSrc;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void addCourt(Court newCourt) throws Exception {
		CourtDAO courtDAO=new CourtDAO();
		courtDAO.addCourt(newCourt);
		
	}
	
	public static Court setCourtCredentials(String courtName,String organizationName) throws Exception {
		CourtDAO courtDAO=new CourtDAO();
		return courtDAO.getCourt(courtName,organizationName);

	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	

}
