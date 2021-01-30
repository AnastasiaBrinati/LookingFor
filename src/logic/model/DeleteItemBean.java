package logic.model;

public class DeleteItemBean {
	private String itemName;
	private String organizationName;
	
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName() {
		this.organizationName = OrganizationProfile.getName();
	}
	

}
