package logic.settings;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SettingsUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;
	private JPanel headerPanel = new JPanel();
	
	private JPanel namePanel = new JPanel();
	private JLabel lblTitle = new JLabel("Sportee");
	private JButton homeButton = new JButton("");
	private JButton settingsButton = new JButton("Settings");
	private final JLabel surnamelbl = new JLabel("Surname");
	private final JPanel panel = new JPanel();
	private final JButton credentialsButton = new JButton("Name");
	private JLabel nameLbl = new JLabel("Name");
	private final JButton securityButton = new JButton("email and password");
	private final JButton coursesButton_2 = new JButton("Courses");
	private final JButton coursesButton_3 = new JButton("Courses");
	private final JButton coursesButton_4 = new JButton("Courses");
	private final JButton coursesButton_5 = new JButton("Courses");
	private final JTextField txtSvvv = new JTextField();
	private final JTextField txtBrinati = new JTextField();
	private final JTextField txtPinkiepie = new JTextField();
	private final JLabel usernamelbl = new JLabel("Username");
	private final JButton saveButton = new JButton("Save");
	private final JButton cancelButton = new JButton("Cancel");
	private final JPanel subtitlePanel = new JPanel();
	private final JLabel subtitlelbl = new JLabel("Settings");
	private final JPanel namePanel_1 = new JPanel();
	private final JLabel surnamelbl_1 = new JLabel("Surname");
	private final JLabel nameLbl_1 = new JLabel("Name");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JLabel usernamelbl_1 = new JLabel("Username");
	private final JButton saveButton_1 = new JButton("Save");
	private final JButton cancelButton_1 = new JButton("Cancel");
	private final JPanel emailPanel = new JPanel();
	private final JTextField textField_3 = new JTextField();
	private final JTextField textFieldPsswd = new JTextField();
	private final JTextField confirmPsswdtextField = new JTextField();
	private final JLabel emaillbl = new JLabel("Email");
	private final JLabel lblPassword = new JLabel("Password");
	private final JLabel lblConfirmPassword = new JLabel("Confirm Password");

	public SettingsUI() {
		txtSvvv.setText("Anastasia");
		txtSvvv.setBounds(223, 58, 241, 25);
		txtSvvv.setColumns(10);

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		emailPanel.setBounds(305, 168, 992, 477);
		contentPane.add(emailPanel);
		emailPanel.setLayout(null);
		textField_3.setText("Brinati");
		textField_3.setColumns(10);
		textField_3.setBounds(308, 57, 241, 25);
		
		emailPanel.add(textField_3);
		textFieldPsswd.setText("***");
		textFieldPsswd.setColumns(10);
		textFieldPsswd.setBounds(308, 137, 241, 25);
		
		emailPanel.add(textFieldPsswd);
		confirmPsswdtextField.setText("***");
		confirmPsswdtextField.setColumns(10);
		confirmPsswdtextField.setBounds(308, 219, 241, 25);
		
		emailPanel.add(confirmPsswdtextField);
		emaillbl.setFont(new Font("Arial", Font.PLAIN, 18));
		emaillbl.setBounds(53, 53, 116, 29);
		
		emailPanel.add(emaillbl);
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPassword.setBounds(53, 133, 116, 29);
		
		emailPanel.add(lblPassword);
		lblConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		lblConfirmPassword.setBounds(53, 215, 154, 29);
		
		emailPanel.add(lblConfirmPassword);
		
		//header
		headerPanel.setBackground(new Color(0, 139, 139));
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1297, 51);
		headerPanel.setLayout(null);

		homeButton.setBounds(367, 0, 48, 51);
		homeButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\home-3-32.png"));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);

		searchBar = new JTextField();
		searchBar.setBounds(416, 11, 349, 31);
		searchBar.setColumns(10);

		settingsButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\gear-2-32.png"));
		settingsButton.setBounds(10, 0, 55, 51);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);
		headerPanel.add(settingsButton);

		contentPane.add(headerPanel);

		namePanel.setBounds(305, 168, 992, 477);
		namePanel.setLayout(null);
		surnamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		surnamelbl.setBounds(49, 146, 134, 25);
		namePanel.add(surnamelbl);
		
		contentPane.add(namePanel);
		
		nameLbl.setFont(new Font("Arial", Font.PLAIN, 18));
		nameLbl.setBounds(49, 54, 116, 29);
		namePanel.add(nameLbl);
		
		namePanel.add(txtSvvv);
		txtBrinati.setText("Brinati");
		txtBrinati.setColumns(10);
		txtBrinati.setBounds(223, 148, 241, 25);
		
		namePanel.add(txtBrinati);
		txtPinkiepie.setText("PinkiePie");
		txtPinkiepie.setColumns(10);
		txtPinkiepie.setBounds(223, 252, 241, 25);
		
		namePanel.add(txtPinkiepie);
		usernamelbl.setFont(new Font("Arial", Font.PLAIN, 18));
		usernamelbl.setBounds(49, 250, 134, 25);
		
		namePanel.add(usernamelbl);
		saveButton.setBackground(new Color(218, 165, 32));
		saveButton.setBounds(262, 355, 158, 38);
		
		namePanel.add(saveButton);
		cancelButton.setBounds(94, 355, 158, 38);
		
		namePanel.add(cancelButton);
		namePanel_1.setLayout(null);
		namePanel_1.setBounds(0, 0, 992, 477);
		
		namePanel.add(namePanel_1);
		surnamelbl_1.setFont(new Font("Arial", Font.PLAIN, 18));
		surnamelbl_1.setBounds(49, 146, 134, 25);
		
		namePanel_1.add(surnamelbl_1);
		nameLbl_1.setFont(new Font("Arial", Font.PLAIN, 18));
		nameLbl_1.setBounds(49, 54, 116, 29);
		
		namePanel_1.add(nameLbl_1);
		textField.setText("Anastasia");
		textField.setColumns(10);
		textField.setBounds(223, 58, 241, 25);
		
		namePanel_1.add(textField);
		textField_1.setText("Brinati");
		textField_1.setColumns(10);
		textField_1.setBounds(223, 148, 241, 25);
		
		namePanel_1.add(textField_1);
		textField_2.setText("PinkiePie");
		textField_2.setColumns(10);
		textField_2.setBounds(223, 252, 241, 25);
		
		namePanel_1.add(textField_2);
		usernamelbl_1.setFont(new Font("Arial", Font.PLAIN, 18));
		usernamelbl_1.setBounds(49, 250, 134, 25);
		
		namePanel_1.add(usernamelbl_1);
		saveButton_1.setBackground(new Color(218, 165, 32));
		saveButton_1.setBounds(262, 355, 158, 38);
		
		namePanel_1.add(saveButton_1);
		cancelButton_1.setBounds(94, 355, 158, 38);
		
		namePanel_1.add(cancelButton_1);
		
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 51, 307, 594);
		panel.setLayout(null);
		credentialsButton.setBackground(new Color(0, 128, 128));
		credentialsButton.setBounds(10, 79, 287, 57);
		panel.add(credentialsButton);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		securityButton.setBackground(new Color(0, 128, 128));
		securityButton.setBounds(10, 137, 287, 57);
		
		panel.add(securityButton);
		coursesButton_2.setBackground(new Color(0, 128, 128));
		coursesButton_2.setBounds(10, 195, 287, 57);
		
		panel.add(coursesButton_2);
		coursesButton_3.setBackground(new Color(0, 128, 128));
		coursesButton_3.setBounds(10, 253, 287, 57);
		
		panel.add(coursesButton_3);
		coursesButton_4.setBackground(new Color(0, 128, 128));
		coursesButton_4.setBounds(10, 311, 287, 57);
		
		panel.add(coursesButton_4);
		coursesButton_5.setBackground(new Color(0, 128, 128));
		coursesButton_5.setBounds(10, 369, 287, 57);
		
		panel.add(coursesButton_5);
		subtitlePanel.setBackground(new Color(192, 192, 192));
		subtitlePanel.setBounds(305, 51, 992, 117);
		
		contentPane.add(subtitlePanel);
		subtitlePanel.setLayout(null);
		subtitlelbl.setFont(new Font("Arial Black", Font.PLAIN, 20));
		subtitlelbl.setBounds(50, 35, 185, 43);
		
		subtitlePanel.add(subtitlelbl);
		
	}
	
}
