package logic.model;

public class LoginModel {

	private String name;
	private String surname;
	private String username;
	private String email;
	private String password;
	
	//getters
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
