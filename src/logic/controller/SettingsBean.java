package logic.controller;

public class SettingsBean {
	
	//1
	private String name;
	private String surname;
	private String username;
	
	//2
	private String email;
	private static String password;
	private static String confirmPassword;
	
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
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public void setConfirmPassword(String confPassword) {
		confirmPassword = confPassword;
	}
	
	
	public static void changeCredentials(SettingsBean settingBean) throws Exception {
		CustomizationController customizer = new CustomizationController();
		customizer.changeCredentials(settingBean);
	}
}
