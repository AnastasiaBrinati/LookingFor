package logic.model;


public class UserProfileDAO {
	
	private static UserProfile user;
	
	//connection to DB

	
	public boolean goCheckAndTellMe(UserProfile user) {
		
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
		
		
		//user = new UserProfile();
		if((user.getUsername().equals(USERNAME) || user.getEmail().equals(EMAIL)) && user.getPassword().equals(PASSWORD)) {
			user.setUsername(USERNAME);
			user.setPassword(PASSWORD);
			user.setName(NAME);
			user.setSurname(COGNOME);
			user.setEmail(EMAIL);
			return true;
		}
		return false;
		
	}
	
}
