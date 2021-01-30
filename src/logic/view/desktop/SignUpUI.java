package logic.view.desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpUI extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JTextField textFieldName;
	private JTextField textFieldSurname;
	private JTextField textFieldUsername;
	private JTextField textFieldEmail;
	private JTextField textFieldPassword;
	
	JButton resetButton = new JButton("Reset");
	JButton signUpButton = new JButton("Sign Up");
	Button btnLogin = new Button("Login");
	JSeparator separator4 = new JSeparator();
	JLabel lblName = new JLabel("NAME");
	JLabel lblSurname = new JLabel("SURNAME");
	JLabel lblUsername = new JLabel("USERNAME");
	JSeparator separator = new JSeparator();
	JSeparator separator5 = new JSeparator();
	JSeparator separator1 = new JSeparator();
	JSeparator separator3 = new JSeparator();
	JLabel lblEmail = new JLabel("E-MAIL");
	JSeparator separator2 = new JSeparator();
	JLabel lblPassword = new JLabel("PASSWORD");
	JLabel lblOr = new JLabel("Or");
	JRadioButton singleUserRadioButton = new JRadioButton("Single User");
	JRadioButton organizationRadioButton = new JRadioButton("Organization");
	ButtonGroup group=new ButtonGroup();
	private JTextField locationTextField;


	// Create the frame.
	public SignUpUI() {
		
		this.setLocationRelativeTo(null);
		
		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		group.add(singleUserRadioButton);
		group.add(organizationRadioButton);
		
		
		btnLogin.setBounds(183, 527, 74, 22);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.GRAY);
		
		separator4.setBackground(Color.GRAY);
		separator4.setBounds(104, 208, 289, 2);
		
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(20, 131, 68, 18);

		textFieldName = new JTextField();
		textFieldName.setBounds(104, 131, 289, 20);
		textFieldName.setColumns(10);
		
		separator5.setBackground(Color.GRAY);
		separator5.setBounds(104, 161, 289, 8);
	
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBackground(Color.WHITE);
		lblSurname.setBounds(20, 180, 68, 14);

		textFieldSurname = new JTextField();
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(104, 178, 289, 20);
		
		separator2.setBackground(Color.GRAY);
		separator2.setBounds(406, 363, 362, -9);
		
		lblUsername.setBounds(20, 222, 74, 14);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.WHITE);
		
		separator3.setBackground(Color.GRAY);
		separator3.setBounds(104, 334, 289, 2);

		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(104, 220, 289, 20);
		
		lblEmail.setBounds(20, 264, 46, 14);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		
		separator.setBackground(Color.GRAY);
		separator.setBounds(104, 292, 289, 2);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(104, 262, 289, 20);
		textFieldEmail.setColumns(10);
		
		lblPassword.setBounds(20, 304, 94, 18);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.WHITE);
		
		separator1.setBackground(Color.GRAY);
		separator1.setBounds(104, 250, 289, 2);

		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(104, 304, 289, 20);
		textFieldPassword.setColumns(10);
		
		lblOr.setForeground(Color.WHITE);
		lblOr.setBounds(211, 502, 46, 14);
		resetButton.setForeground(Color.WHITE);
		
		

		resetButton.setBackground(Color.GRAY);
		resetButton.setBounds(95, 456, 118, 36);

		signUpButton.setBackground(new Color(255, 99, 71));
		signUpButton.setBounds(237, 456, 128, 36);

		// adding stuff to content pane
		contentPane.add(separator);
		contentPane.add(separator1);
		contentPane.add(separator2);
		contentPane.add(separator3);
		contentPane.add(separator4);
		contentPane.add(separator5);
		
		contentPane.add(lblName);
		contentPane.add(lblPassword);
		contentPane.add(lblUsername);
		contentPane.add(lblEmail);
		contentPane.add(lblSurname);
		contentPane.add(textFieldName);
		contentPane.add(textFieldSurname);
		contentPane.add(textFieldUsername);
		contentPane.add(textFieldEmail);
		contentPane.add(textFieldPassword);
		contentPane.add(btnLogin);
		contentPane.add(lblOr);
		contentPane.add(resetButton);
		contentPane.add(signUpButton);
		
		
		singleUserRadioButton.addActionListener(new ActionListener() {
		
			
		public void actionPerformed(ActionEvent arg0) {
			
				organizationRadioButton.setSelected(false);
				singleUserRadioButton.setSelected(true);
			
			}
		});
		singleUserRadioButton.setForeground(Color.WHITE);
		
		singleUserRadioButton.setContentAreaFilled(false);
		
		
		organizationRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					singleUserRadioButton.setSelected(false);
					organizationRadioButton.setSelected(true);
					
				}
			
		});
		
		organizationRadioButton.setForeground(Color.WHITE);
		organizationRadioButton.setContentAreaFilled(false);
		
		
		singleUserRadioButton.setBounds(104, 383, 109, 23);
		contentPane.add(singleUserRadioButton);
		
		
		organizationRadioButton.setBounds(104, 408, 109, 23);
		contentPane.add(organizationRadioButton);
		
		JLabel lblNewLabel = new JLabel("Sportee");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 74));
		lblNewLabel.setBounds(104, 28, 289, 82);
		contentPane.add(lblNewLabel);
		
		locationTextField = new JTextField();
		locationTextField.setColumns(10);
		locationTextField.setBounds(104, 346, 289, 20);
		contentPane.add(locationTextField);
		
		JLabel lblLocation = new JLabel("LOCATION");
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setBackground(Color.WHITE);
		lblLocation.setBounds(20, 346, 94, 14);
		contentPane.add(lblLocation);
	}

	
	
	
	public JButton getDeleteButton() {
		return resetButton;
	}
	public Button getLoginButton() {
		return btnLogin;
	}
	public JButton getSignUpButton() {
		return signUpButton;
	}
	public void resetForm() {
		textFieldPassword.setText(" ");
		textFieldEmail.setText(" ");
		textFieldName.setText(" ");
		textFieldSurname.setText(" ");
		textFieldUsername.setText(" ");
		organizationRadioButton.setSelected(false);
		singleUserRadioButton.setSelected(false);
	}
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public String getUserLocation() {
		return locationTextField.getText();
	}
	
	public String getPassword() {
		return textFieldPassword.getText();
	}
	public String getEmail() {
		return textFieldEmail.getText();
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
	public String getUserType() {
		if(organizationRadioButton.isSelected()) {
			return "organization";
		}else {
			return "singleuser";
		}
		
	}
}