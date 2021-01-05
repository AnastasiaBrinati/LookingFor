package logic.model;

public class SettingsBean {
	
	private static String name;
	public static String surname;
	public static String username;
	public static String email;
	public static String password;
	
	//just for single user
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		name = nome;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String cognome) {
		surname = cognome;
	}
	
	//both
	public String getUsername() {
		return username;
	}
	public void setUsername(String usern) {
		username= usern;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String iemail) {
		email = iemail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String passwd) {
		password = passwd;
	}
	//img
	
	
	public static void setCredentials(SettingsBean settingBean) {
		name = UserProfile.getName();
		surname = UserProfile.getSurname();
		username = UserProfile.getUsername();
		email = UserProfile.getEmail();
		password = UserProfile.getPassword();
	}
	/*
	public static void setCredentials(SettingsBean settingBean) {
		name = UserProfile.getName();
		email = UserProfile.getEmail();
		password = UserProfile.getPassword();
	}
	*/
}
