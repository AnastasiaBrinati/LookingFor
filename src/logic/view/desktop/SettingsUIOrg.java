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
import javax.swing.SwingConstants;


public class SettingsUIOrg extends JFrame {

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
	private final JButton nameButton = new JButton("Name");
	private final JButton emailButton = new JButton("E-Mail");
	private final JButton passwordButton = new JButton("Password");
	
	private final JPanel subtitlePanel = new JPanel();
	private final JLabel subtitlelbl = new JLabel("SETTINGS");
	
	private JPanel namePanel = new JPanel();
	private JLabel nameLbl = new JLabel("Name");
	private final JTextField textFieldName = new JTextField();

	
	private final JButton saveButton = new JButton("Save");
	private final JButton cancelButton = new JButton("Cancel");
	
	private final JPanel emailPanel = new JPanel();
	private final JLabel emaillbl = new JLabel("Email");
	private final JLabel lblPassword = new JLabel("Password");
	private final JLabel changeYourEmaillbl = new JLabel("Change your email");
	private JTextField textFieldEmail;
	private final JPasswordField confirmPasswordTextField = new JPasswordField();
	private JButton cancelButton_2 = new JButton("Cancel");
	private JButton SaveButton_2 = new JButton("SAVE");
	private final JLabel pencilTextField2 = new JLabel("");
	private final JLabel pencilTextField5 = new JLabel("");
	private final JLabel pencilTextField4 = new JLabel("\u270E");
	private final JButton exitButton = new JButton("\u2398");
	
	private final JPanel passwordPanel = new JPanel();
	private final JButton cancelButton3 = new JButton("Cancel");
	private final JButton saveButton3 = new JButton("SAVE");
	private final JLabel changeYourPasswordlbl = new JLabel("Change your password");
	private final JLabel lblNewPassword = new JLabel("New Password");
	private final JLabel oldPasswordlbl = new JLabel("Old Password");
	private final JTextField textFieldNewPassword = new JTextField();
	private final JTextField textFieldOldPassword = new JTextField();
	private final JButton searchButton = new JButton("\uD83D\uDD0D");
	

	public SettingsUIOrg() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
							
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 54, 307, 605);
		panel.setLayout(null);
		
		nameButton.setForeground(Color.WHITE);
		nameButton.setBackground(new Color(139, 0, 0));
		nameButton.setBounds(10, 163, 287, 57);
		panel.add(nameButton);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		exitButton.setForeground(Color.WHITE);
		
		//Image img5=new ImageIcon(this.getClass().getResource("/016-trash bin.png")).getImage();
		//exitButton.setIcon(new ImageIcon(img5));
		exitButton.setContentAreaFilled(false);
		
		//Image img3=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		//pencilTextField2.setIcon(new ImageIcon(img3));
		
		
		
		emailPanel.setBounds(315, 179, 993, 480);
		contentPane.add(emailPanel);
		emailPanel.setLayout(null);
		
				emaillbl.setFont(new Font("Arial", Font.PLAIN, 18));
				emaillbl.setBounds(53, 155, 116, 29);
				
				emailPanel.add(emaillbl);
				lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
				lblPassword.setBounds(53, 241, 116, 29);
				
				emailPanel.add(lblPassword);
				changeYourEmaillbl.setFont(new Font("Arial", Font.PLAIN, 18));
				changeYourEmaillbl.setBounds(53, 41, 154, 29);
				
				emailPanel.add(changeYourEmaillbl);
				
				textFieldEmail = new JTextField();
				textFieldEmail.setColumns(10);
				textFieldEmail.setBounds(308, 159, 241, 25);
				emailPanel.add(textFieldEmail);
				confirmPasswordTextField.setBounds(308, 245, 241, 25);
				
				emailPanel.add(confirmPasswordTextField);
				
				cancelButton_2.setBounds(122, 395, 158, 38);
				emailPanel.add(cancelButton_2);
				SaveButton_2.setBackground(Color.ORANGE);
				SaveButton_2.setBounds(323, 395, 158, 38);
				emailPanel.add(SaveButton_2);
				pencilTextField5.setFont(new Font("Tahoma", Font.PLAIN, 20));
				pencilTextField5.setBounds(559, 152, 44, 38);
				
				emailPanel.add(pencilTextField5);
				pencilTextField4.setBounds(559, 238, 44, 38);
				
				emailPanel.add(pencilTextField4);
				passwordPanel.setBounds(315, 179, 982, 480);
				contentPane.add(passwordPanel);
				passwordPanel.setLayout(null);
				cancelButton3.setBounds(126, 397, 158, 38);
				
				passwordPanel.add(cancelButton3);
				saveButton3.setBackground(Color.ORANGE);
				saveButton3.setBounds(310, 397, 158, 38);
				
				passwordPanel.add(saveButton3);
				changeYourPasswordlbl.setFont(new Font("Arial", Font.PLAIN, 18));
				changeYourPasswordlbl.setBounds(50, 54, 284, 29);
				
				passwordPanel.add(changeYourPasswordlbl);
				lblNewPassword.setFont(new Font("Arial", Font.PLAIN, 18));
				lblNewPassword.setBounds(50, 162, 147, 29);
				
				passwordPanel.add(lblNewPassword);
				oldPasswordlbl.setFont(new Font("Arial", Font.PLAIN, 18));
				oldPasswordlbl.setBounds(50, 246, 132, 29);
				
				passwordPanel.add(oldPasswordlbl);
				textFieldNewPassword.setColumns(10);
				textFieldNewPassword.setBounds(227, 166, 241, 25);
				
				passwordPanel.add(textFieldNewPassword);
				textFieldOldPassword.setColumns(10);
				textFieldOldPassword.setBounds(227, 246, 241, 25);
				
				passwordPanel.add(textFieldOldPassword);
				
						
				textFieldName.setBounds(223, 105, 241, 25);
				textFieldName.setColumns(10);
				namePanel.setBounds(315, 179, 982, 480);
				contentPane.add(namePanel);
				namePanel.setLayout(null);
				
				nameLbl.setFont(new Font("Arial", Font.PLAIN, 18));
				nameLbl.setBounds(49, 101, 116, 29);
				namePanel.add(nameLbl);
				
				namePanel.add(textFieldName);
				saveButton.setBackground(new Color(255, 99, 71));
				saveButton.setBounds(262, 355, 158, 38);
				
				namePanel.add(saveButton);
				cancelButton.setBounds(94, 355, 158, 38);
				namePanel.add(cancelButton);
				
				JLabel imglbl = new JLabel("Image");
				imglbl.setFont(new Font("Arial", Font.PLAIN, 18));
				imglbl.setBounds(49, 183, 116, 29);
				namePanel.add(imglbl);
				
				JLabel lblNewLabel = new JLabel("New label");
				lblNewLabel.setBounds(223, 175, 241, 151);
				namePanel.add(lblNewLabel);
				
				pencilTextField2.setBounds(474, 51, 44, 38);
				
				namePanel.add(pencilTextField2);
				
				JLabel changeYourNamelbl = new JLabel("Change Your Name");
				changeYourNamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
				changeYourNamelbl.setBounds(49, 38, 253, 29);
				namePanel.add(changeYourNamelbl);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(255, 255, 255));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		emailButton.setForeground(Color.WHITE);
		emailButton.setBackground(new Color(204, 0, 0));
		emailButton.setBounds(10, 219, 287, 57);
		panel.add(emailButton);
		passwordButton.setForeground(Color.WHITE);
		passwordButton.setBackground(new Color(204, 0, 0));
		passwordButton.setBounds(10, 274, 287, 57);
		
		panel.add(passwordButton);
					
							//header
							headerPanel.setBackground(new Color(255, 0, 0));
							headerPanel.setForeground(new Color(255, 165, 0));
							headerPanel.setBounds(0, 0, 1297, 54);
							headerPanel.setLayout(null);
									homeButton.setForeground(Color.WHITE);
									homeButton.setFont(new Font("Arial Black", Font.PLAIN, 60));
							
									homeButton.setBounds(357, -12, 58, 63);
									homeButton.setBorder(null);
									homeButton.setContentAreaFilled(false);
									
											searchBar = new JTextField();
											searchBar.setBounds(422, 12, 343, 30);
											searchBar.setColumns(10);
											
													headerPanel.add(homeButton);
													headerPanel.add(searchBar);
													
															contentPane.add(headerPanel);
															
															homeButton.setContentAreaFilled(false);
															homeButton.setContentAreaFilled(false);
															
															homeButton.setContentAreaFilled(false);
															exitButton.setBounds(1219, 0, 78, 72);
															
															headerPanel.add(exitButton);
															searchButton.setVerticalAlignment(SwingConstants.TOP);
															searchButton.setHorizontalAlignment(SwingConstants.LEADING);
															searchButton.setForeground(Color.WHITE);
															searchButton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 25));
															searchButton.setBackground(Color.DARK_GRAY);
															searchButton.setBounds(764, 12, 71, 31);
															
															headerPanel.add(searchButton);
			
					subtitlePanel.setBackground(new Color(192, 192, 192));
					subtitlePanel.setBounds(305, 54, 992, 115);
					
							contentPane.add(subtitlePanel);
							subtitlePanel.setLayout(null);
							subtitlelbl.setFont(new Font("Segoe Script", Font.PLAIN, 30));
							subtitlelbl.setBounds(50, 35, 185, 43);
							
											
							
									subtitlePanel.add(subtitlelbl);
					/*
		Image img1=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		
		Image img2=new ImageIcon(this.getClass().getResource("/003-home.png")).getImage();
		
		Image img9=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilTextField3.setIcon(new ImageIcon(img9));
		
		Image img4=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilTextField4.setIcon(new ImageIcon(img4));
		
		
		Image img6=new ImageIcon(this.getClass().getResource("/049-edit.png")).getImage();
		pencilTextField5.setIcon(new ImageIcon(img5));
		
				Image img7=new ImageIcon(this.getClass().getResource("/003-home.png")).getImage();
				
				Image img8=new ImageIcon(this.getClass().getResource("/002-settings.png")).getImage();
				*/
	}
	
	public JButton getHomeButton() {
		return homeButton;
	}
	
	public JButton getNameButton() {
		return nameButton;
	}
		
	public JButton getEmailButton() {
		return emailButton;
	}
	
	public JButton getPasswordButton() {
		return passwordButton;
	}
	
		
	public void setNamePanelVisible() {
		namePanel.setVisible(true);
		emailPanel.setVisible(false);
		passwordPanel.setVisible(false);
		
		nameButton.setBackground(new Color(139, 0, 0));
		emailButton.setBackground(Color.RED);
		passwordButton.setBackground(Color.RED);
	}
	
	public void setEmailPanelVisible() {
		namePanel.setVisible(false);
		emailPanel.setVisible(true);
		passwordPanel.setVisible(false);
		
		nameButton.setBackground(Color.RED);
		emailButton.setBackground(new Color(139, 0, 0));
		passwordButton.setBackground(Color.RED);
	}
	
	public void setPasswordPanelVisible() {
		namePanel.setVisible(false);
		emailPanel.setVisible(false);
		passwordPanel.setVisible(true);
		
		nameButton.setBackground(Color.RED);
		emailButton.setBackground(Color.RED);
		passwordButton.setBackground(new Color(139, 0, 0));
	}
	
	
	
	
	
	public String getName() {
		return textFieldName.getText();
	}
	
	public String getEmail() {
		return textFieldEmail.getText();
	}
	
	@SuppressWarnings("deprecation")
	public String getPassword() {
		return confirmPasswordTextField.getText();
	}

	public String getNewPassword() {
		return textFieldNewPassword.getText();
	}
	public String getOldPassword() {
		return textFieldOldPassword.getText();
	}
	
	
	
	public JButton getCancelButton() {
		return cancelButton;
	}
	
	public JButton getSaveButton() {
		return saveButton;
	}
	
	public JButton getSaveButton2() {
		return SaveButton_2;
	}
	
	public JButton getCancelButton2() {
		return cancelButton_2;
	}
	
	public JButton getSaveButton3() {
		return saveButton3;
	}
	
	public JButton getCancelButton3() {
		return cancelButton3;
	}
	
	public void setCredentials(String name, String email) {
		
		textFieldName.setText(name);
		textFieldEmail.setText(email);
		confirmPasswordTextField.setText("");
		textFieldNewPassword.setText("");
		textFieldOldPassword.setText("");
		
		
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	public JButton getSearchButton() {
		return searchButton;
	}
}