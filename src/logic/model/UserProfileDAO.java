package logic.model;


public class UserProfileDAO {
	
	//private static UserProfile user;
	
	//connection to DB

	
	public boolean goCheckAndTellMe() {
		
		//connection to DB
		//connection.createStatement();
		//condition bla bla
		//check DB bla bla
		
		
		String USERNAME = "PinkiePie";
		String NAME = "Anastasia";
		String COGNOME = "Brinati";
		String EMAIL = "xx@xx.com";
		String PASSWORD = "loki";
		
		
		//close connection
		
		UserProfile up = new UserProfile();
		if((up.getUsername().equals(USERNAME) || up.getEmail().equals(EMAIL)) && up.getPassword().equals(PASSWORD)) {
			UserProfile.setUsername(USERNAME);
			UserProfile.setName(NAME);
			UserProfile.setSurname(COGNOME);
			UserProfile.setEmail(EMAIL);
			return true;
		}
		return false;
		
	}
	
}
