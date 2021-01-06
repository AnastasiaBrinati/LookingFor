package logic.model;

public class OrganizationBean {
	
	private static String name;
	public static String surname;
	public static String username;
	public static String email;
	public static String password;
	
	public OrganizationBean() {
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		name = nome;
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
	
	
	public static void setCredentials(OrganizationBean orgBean) {
		name = OrganizationProfile.getName();
		email = OrganizationProfile.getEmail();
		password = OrganizationProfile.getPassword();
	}
}
