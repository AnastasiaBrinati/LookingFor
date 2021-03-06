package logic.view.desktop;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SettingsUISUs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;
	private JPanel headerPanel = new JPanel();

	private JLabel lblTitle = new JLabel("Sportee");
	private JButton homeButton = new JButton("\u2302");
	
	private final JPanel panel = new JPanel();
	private final JButton credentialsButton = new JButton("Name");
	private final JButton securityButton = new JButton("E-Mail");
	private final JButton passwordButton = new JButton("Password");
	
	private final JPanel subtitlePanel = new JPanel();
	private final JLabel subtitlelbl = new JLabel("Settings");
	
	private JPanel namePanel = new JPanel();
	private final JTextField textFieldSurname = new JTextField();
	private JLabel nameLbl = new JLabel("Name");
	private final JTextField textFieldName = new JTextField();
	private final JLabel usernamelbl = new JLabel("Username");
	private final JTextField textFieldUsername = new JTextField();

	
	private final JButton saveButton = new JButton("Save");
	private final JButton cancelButton = new JButton("Cancel");
	private JButton saveButton2 = new JButton("SAVE");
	private JButton cancelButton2 = new JButton("Cancel");
	private JButton saveButton3 = new JButton("SAVE");
	private JButton cancelButton3 = new JButton("Cancel");
	
	private final JPanel emailPanel = new JPanel();
	private final JLabel emaillbl = new JLabel("Email");
	private final JLabel lblPassword = new JLabel("Insert your password");
	private JTextField textFieldEmail;
	private final JPasswordField confirmPasswordField = new JPasswordField();
	private final JLabel pencilLbl1 = new JLabel("");
	private final JLabel pencilLbl2 = new JLabel("");
	private final JLabel pencilLbl3 = new JLabel("");
	private final JLabel pencilLbl4 = new JLabel("");
	private final JLabel pencilLbl5 = new JLabel("");
	private final JLabel pencilLbl6 = new JLabel("");
	private final JButton exitButton = new JButton("\u2398");
	
	private JPanel passwordPanel = new JPanel();
	private JTextField textFieldNewPassword;
	private JTextField textFieldOldPassword;
	private final JButton searchButton = new JButton("\uD83D\uDD0D");

	public SettingsUISUs() {
		this.setLocationRelativeTo(null);

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		textFieldName.setBounds(223, 111, 241, 25);
		textFieldName.setColumns(10);
		namePanel.setBounds(305, 168, 992, 573);
		
		contentPane.add(namePanel);
		namePanel.setLayout(null);
		
		nameLbl.setFont(new Font("Arial", Font.PLAIN, 18));
		nameLbl.setBounds(49, 107, 116, 29);
		namePanel.add(nameLbl);
		
		namePanel.add(textFieldName);
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(223, 180, 241, 25);
		
		namePanel.add(textFieldSurname);
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(223, 252, 241, 25);
		
		namePanel.add(textFieldUsername);
		usernamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		usernamelbl.setBounds(49, 250, 134, 25);
		
		namePanel.add(usernamelbl);
		saveButton.setBackground(new Color(255, 99, 71));
		saveButton.setBounds(262, 355, 158, 38);
		
		namePanel.add(saveButton);
		cancelButton.setBounds(94, 355, 158, 38);
		namePanel.add(cancelButton);
		pencilLbl1.setBounds(474, 39, 46, 44);
		
		namePanel.add(pencilLbl1);
		pencilLbl2.setBounds(474, 128, 46, 44);
		
		namePanel.add(pencilLbl2);
		pencilLbl3.setBounds(474, 233, 46, 44);
		
		namePanel.add(pencilLbl3);
		
		JLabel changeYourNamelbl = new JLabel("Change your name");
		changeYourNamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		changeYourNamelbl.setBounds(49, 39, 260, 29);
		namePanel.add(changeYourNamelbl);
		
		JLabel surnamelbl = new JLabel("Name");
		surnamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		surnamelbl.setBounds(49, 180, 116, 29);
		namePanel.add(surnamelbl);
		
		
		
		
		
		emailPanel.setBounds(305, 168, 1003, 491);
		contentPane.add(emailPanel);
		emailPanel.setLayout(null);
		
				emaillbl.setFont(new Font("Arial", Font.PLAIN, 18));
				emaillbl.setBounds(53, 159, 116, 29);
				
				emailPanel.add(emaillbl);
				lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
				lblPassword.setBounds(53, 250, 189, 29);
				
				emailPanel.add(lblPassword);
				
				textFieldEmail = new JTextField();
				textFieldEmail.setColumns(10);
				textFieldEmail.setBounds(308, 163, 241, 25);
				emailPanel.add(textFieldEmail);
				confirmPasswordField.setBounds(308, 254, 241, 25);
				
				emailPanel.add(confirmPasswordField);
				pencilLbl4.setBounds(559, 41, 46, 44);
				
				emailPanel.add(pencilLbl4);
				pencilLbl5.setBounds(559, 118, 46, 44);
				
				emailPanel.add(pencilLbl5);
				pencilLbl6.setBounds(559, 200, 46, 44);
				
				emailPanel.add(pencilLbl6);
				/*
				pencilLbl4.setIcon(new ImageIcon(img4));
				pencilLbl5.setIcon(new ImageIcon(img5));
				pencilLbl6.setIcon(new ImageIcon(img6));
				*/
				
				saveButton2.setBackground(new Color(255, 99, 71));
				saveButton2.setBounds(308, 343, 158, 38);
				emailPanel.add(saveButton2);
				
				cancelButton2.setBackground(new Color(255, 99, 71));
				cancelButton2.setBounds(129, 343, 158, 38);
				emailPanel.add(cancelButton2);
				
				JLabel changeYourEmaillbl = new JLabel("Change your email");
				changeYourEmaillbl.setFont(new Font("Arial", Font.PLAIN, 18));
				changeYourEmaillbl.setBounds(53, 65, 328, 29);
				emailPanel.add(changeYourEmaillbl);
		
		passwordPanel.setBounds(305, 168, 992, 491);
		contentPane.add(passwordPanel);
		passwordPanel.setLayout(null);
		
		cancelButton3.setBackground(UIManager.getColor("Button.background"));
		cancelButton3.setBounds(108, 377, 158, 38);
		passwordPanel.add(cancelButton3);
		
		JLabel changeYourPasswordlbl = new JLabel("Change your password");
		changeYourPasswordlbl.setFont(new Font("Arial", Font.PLAIN, 18));
		changeYourPasswordlbl.setBounds(32, 57, 328, 29);
		passwordPanel.add(changeYourPasswordlbl);
		
		JLabel lblNewPassword = new JLabel("new Password");
		lblNewPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewPassword.setBounds(36, 153, 328, 29);
		passwordPanel.add(lblNewPassword);
		
		JLabel oldPasswordlbl = new JLabel("old Password");
		oldPasswordlbl.setFont(new Font("Arial", Font.PLAIN, 18));
		oldPasswordlbl.setBounds(36, 222, 139, 29);
		passwordPanel.add(oldPasswordlbl);
		
		saveButton3.setBackground(new Color(255, 99, 71));
		saveButton3.setBounds(298, 377, 158, 38);
		passwordPanel.add(saveButton3);
		
		textFieldNewPassword = new JTextField();
		textFieldNewPassword.setColumns(10);
		textFieldNewPassword.setBounds(222, 152, 241, 25);
		passwordPanel.add(textFieldNewPassword);
		
		textFieldOldPassword = new JTextField();
		textFieldOldPassword.setColumns(10);
		textFieldOldPassword.setBounds(222, 226, 241, 25);
		passwordPanel.add(textFieldOldPassword);
				/*
				Image img1=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
				
				Image img2=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
				
				Image img3=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
				
				Image img4=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
				
				Image img5=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
				
				Image img6=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
				
				Image img7=new ImageIcon(this.getClass().getResource("/016-trash bin.png")).getImage();
				*/
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		

		//exitButton.setIcon(new ImageIcon(img7));
		exitButton.setContentAreaFilled(false);

		subtitlePanel.setBackground(new Color(192, 192, 192));
		subtitlePanel.setBounds(305, 54, 992, 115);

		contentPane.add(subtitlePanel);
		subtitlePanel.setLayout(null);
		subtitlelbl.setFont(new Font("Arial Black", Font.PLAIN, 20));
		subtitlelbl.setBounds(50, 35, 185, 43);

				

		subtitlePanel.add(subtitlelbl);

		//header
		headerPanel.setBackground(new Color(255, 0, 0));
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1297, 54);
		headerPanel.setLayout(null);
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("Arial Black", Font.PLAIN, 60));

		homeButton.setBounds(357, -16, 58, 70);
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);

		searchBar = new JTextField();
		searchBar.setBounds(422, 12, 343, 30);
		searchBar.setColumns(10);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);

		contentPane.add(headerPanel);
														
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 54, 307, 687);
		panel.setLayout(null);
		credentialsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		credentialsButton.setForeground(Color.WHITE);
		credentialsButton.setBackground(new Color(204, 0, 0));
		credentialsButton.setBounds(10, 79, 287, 57);
		panel.add(credentialsButton);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(Color.WHITE);
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		securityButton.setForeground(Color.WHITE);
		securityButton.setBackground(new Color(204, 0, 0));
		securityButton.setBounds(10, 137, 287, 57);
		
		panel.add(securityButton);
		passwordButton.setForeground(Color.WHITE);
		passwordButton.setBackground(new Color(204, 0, 0));
		passwordButton.setBounds(10, 195, 287, 57);
		
		panel.add(passwordButton);
		
				//Image img8=new ImageIcon(this.getClass().getResource("/003-home.png")).getImage();
				//homeButton.setIcon(new ImageIcon(img8));
				homeButton.setContentAreaFilled(false);
				exitButton.setBounds(1166, 0, 71, 67);
				
				headerPanel.add(exitButton);
				searchButton.setBackground(Color.DARK_GRAY);
				searchButton.setForeground(Color.WHITE);
				searchButton.setVerticalAlignment(SwingConstants.TOP);
				searchButton.setHorizontalAlignment(SwingConstants.LEADING);
				searchButton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 25));
				searchButton.setBounds(764, 12, 71, 31);
				
				headerPanel.add(searchButton);
				/*
				pencilLbl1.setIcon(new ImageIcon(img1));
				pencilLbl2.setIcon(new ImageIcon(img2));
				pencilLbl3.setIcon(new ImageIcon(img3));
				*/
				
				//Image img9=new ImageIcon(this.getClass().getResource("/002-settings.png")).getImage();
	}
	
	public JButton getHomeButton() {
		return homeButton;
	}
	
	public JButton getCredentialsButton() {
		return credentialsButton;
	}
	
	public JButton getCancelButton() {
		return cancelButton;
	}
	
	public JButton getSaveButton() {
		return saveButton;
	}
	
	public JButton getCancelButton2() {
		return cancelButton2;
	}
	
	public JButton getSaveButton2() {
		return saveButton2;
	}
	
	public JButton getCancelButton3() {
		return cancelButton3;
	}
	
	public JButton getSaveButton3() {
		return saveButton3;
	}
	
	public JButton getSecurityButton() {
		return securityButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	
	public JButton getPasswordButton() {
		return passwordButton;
	}
	
		
	public void setNamePanelVisible() {
		namePanel.setVisible(true);
		emailPanel.setVisible(false);
		passwordPanel.setVisible(false);
		
		credentialsButton.setBackground(new Color(139,0,0));
		securityButton.setBackground(new Color(204, 0, 0));
		passwordButton.setBackground(new Color(204, 0, 0));
		
	}
	
	public void setEmailPanelVisible() {
		namePanel.setVisible(false);
		emailPanel.setVisible(true);
		passwordPanel.setVisible(false);
		
		credentialsButton.setBackground(new Color(204, 0, 0));
		securityButton.setBackground(new Color(139,0,0));
		passwordButton.setBackground(new Color(204, 0, 0));
		
	}
	
	public void setPasswordPanelVisible() {
		namePanel.setVisible(false);
		emailPanel.setVisible(false);
		passwordPanel.setVisible(true);
		
		credentialsButton.setBackground(new Color(204, 0, 0));
		securityButton.setBackground(new Color(204, 0, 0));
		passwordButton.setBackground(new Color(139,0,0));
		
	}
	
	
	
	
	
	public String getName() {
		return textFieldName.getText();
	}
	
	public String getSurname() {
		return textFieldSurname.getText();
	}
	
	public String getUsername() {
		return textFieldUsername.getText();
	}
	
	public String getEmail() {
		return textFieldEmail.getText();
	}
	@SuppressWarnings("deprecation")
	public String getPassword() {
		return confirmPasswordField.getText();
	}
	
	public String getNewPassword() {
		return textFieldNewPassword.getText();
	}
	
	public String getOldPassword() {
		return 	textFieldOldPassword.getText();
	}
	
	public void setCredentials(String name, String surname, String username, String email) {
		
		textFieldName.setText(name);
		textFieldSurname.setText(surname);
		textFieldUsername.setText(username);
		textFieldEmail.setText(email);
		confirmPasswordField.setText("");
		textFieldNewPassword.setText("");
		textFieldOldPassword.setText("");
		
	}
	
	public void showErrorMessage(String error) {
		textFieldName.setText(error);
	}
	public void showErrorMessage2(String error) {
		textFieldEmail.setText(error);
	}
	public JButton getSearchButton() {
		return searchButton;
	}
}
