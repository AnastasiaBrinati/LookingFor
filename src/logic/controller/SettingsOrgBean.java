package logic.controller;

public class SettingsOrgBean {

		private String name;
		private String email;
		private static String oldPassword;
		private static String newPassword;
		
		public SettingsOrgBean() {
		}
		

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return email;
		}
		public void setPassword(String psswd) {
			oldPassword = psswd;
		}
		public String getPassword() {
			return oldPassword;
		}
		
		public void setNewPassword(String newPasswd) {
			newPassword = newPasswd;
		}
		
		public String getNewPassword() {
			return newPassword;
		}
		

		public static void changeName(SettingsOrgBean settingBean) throws Exception {
			CustomizationController customizer =CustomizationController.getInstance();
			customizer.changeName(settingBean);
		}
		
		public static void changeEmail(SettingsOrgBean settingBean) throws Exception {
			CustomizationController customizer =CustomizationController.getInstance();
			customizer.changeEmail(settingBean);
		}
		
		public static void changePassword(SettingsOrgBean settingBean) throws Exception {
			CustomizationController customizer =CustomizationController.getInstance();
			customizer.changePassword(settingBean);
		}
}
