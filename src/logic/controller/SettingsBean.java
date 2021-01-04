package logic.controller;

public class SettingsBean {
	
	private String name;
	private String surname;
	private String username;
	
	public SettingsBean() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public String getUsername() {
		return username;
	}
	
	public static void changeCredentials(SettingsBean settingBean) throws Exception {
		//lancia exception
		CustomizationController customizer = new CustomizationController();
		customizer.changeCredentials(settingBean);
		
	}
}
