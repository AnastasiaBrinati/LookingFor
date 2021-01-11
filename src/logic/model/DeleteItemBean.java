package logic.model;

public class DeleteItemBean {
	private String itemName;
	private String organizationName;
	private String buttonName;
	
	
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
	public String getButtonName() {
		return buttonName;
		
	}
	public void setButtonName(String buttonCode) {
		this.buttonName = buttonCode;
	}

}
