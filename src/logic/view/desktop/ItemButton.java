package logic.view.desktop;

import javax.swing.JButton;

public class ItemButton extends JButton {
	
	private String organizationName;
	
	public ItemButton(String orgName) {
		this.organizationName=orgName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	
}
