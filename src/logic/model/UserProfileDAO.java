package logic.model;

public class UserProfileDAO {
	
	private static UserProfile user;
	//connection to DB
	
	public boolean goCheckAndTellMe(String username) {
		
		//connection.createStatement();
		//condition bla bla
		//check DB bla bla
		
		
		String NAME = "Anastasia";
		
		user = new UserProfile();
		if(username.equals(NAME)) {
			user.setUsername(NAME);
			return true;
		}
		return false;
		
	}
	
}
