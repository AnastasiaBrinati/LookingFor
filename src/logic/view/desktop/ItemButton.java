package logic.view.desktop;

import javax.swing.JButton;

public class ItemButton extends JButton {
	
	private static String organizationName;
	
	public ItemButton(String orgName) {
		organizationName=orgName;
	}

	public  String getOrganizationName() {
		return organizationName;
	}

	
}
