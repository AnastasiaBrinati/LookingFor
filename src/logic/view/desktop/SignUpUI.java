package logic.view.desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
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
	JButton btnNewButton1 = new JButton("");
	JButton btnNewButton2 = new JButton("");
	JLabel lblAlternative = new JLabel("Or sign up with:");
	JLabel lblOr = new JLabel("Or");
	JRadioButton singleUserRadioButton = new JRadioButton("Single User");
	JRadioButton organizationRadioButton = new JRadioButton("Organization");
	ButtonGroup group=new ButtonGroup();
	private JTextField locationTextField;


	// Create the frame.
	public SignUpUI() {
		
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
		
		
		btnLogin.setBounds(199, 559, 74, 22);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.GRAY);
		
		separator4.setBackground(Color.GRAY);
		separator4.setBounds(104, 179, 289, 2);
		
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(61, 93, 33, 14);

		textFieldName = new JTextField();
		textFieldName.setBounds(104, 93, 289, 20);
		textFieldName.setColumns(10);
		
		separator5.setBackground(Color.GRAY);
		separator5.setBounds(104, 128, 289, 8);
	
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBackground(Color.WHITE);
		lblSurname.setBounds(37, 154, 118, 14);

		textFieldSurname = new JTextField();
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(104, 148, 289, 20);
		
		separator2.setBackground(Color.GRAY);
		separator2.setBounds(406, 363, 362, -9);
		
		lblUsername.setBounds(37, 198, 118, 14);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.WHITE);
		
		separator3.setBackground(Color.GRAY);
		separator3.setBounds(104, 316, 289, 2);

		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(104, 192, 289, 20);
		
		lblEmail.setBounds(48, 244, 46, 14);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		
		separator.setBackground(Color.GRAY);
		separator.setBounds(104, 272, 289, 2);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(104, 241, 289, 20);
		textFieldEmail.setColumns(10);
		
		lblPassword.setBounds(26, 291, 94, 14);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.WHITE);
		
		separator1.setBackground(Color.GRAY);
		separator1.setBounds(104, 223, 289, 2);

		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(104, 285, 289, 20);
		textFieldPassword.setColumns(10);
		
		btnNewButton1.setIcon(new ImageIcon(""));
		btnNewButton1.setBounds(189, 480, 40, 40);
		
		btnNewButton2.setIcon(new ImageIcon(""));
		btnNewButton2.setBounds(239, 480, 40, 40);
		
		lblAlternative.setForeground(Color.WHITE);
		lblAlternative.setBounds(189, 455, 90, 14);
		
		lblOr.setForeground(Color.WHITE);
		lblOr.setBounds(227, 531, 46, 14);
		resetButton.setForeground(Color.WHITE);
		
		

		resetButton.setBackground(Color.GRAY);
		resetButton.setBounds(199, 421, 89, 23);

		signUpButton.setBackground(new Color(255, 99, 71));
		signUpButton.setBounds(298, 421, 89, 23);

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
		contentPane.add(btnNewButton1);
		contentPane.add(btnNewButton2);
		contentPane.add(lblAlternative);
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
		
		
		singleUserRadioButton.setBounds(104, 365, 109, 23);
		contentPane.add(singleUserRadioButton);
		
		
		organizationRadioButton.setBounds(104, 391, 109, 23);
		contentPane.add(organizationRadioButton);
		
		JLabel lblNewLabel = new JLabel("Sportee");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 74));
		lblNewLabel.setBounds(104, 11, 289, 82);
		contentPane.add(lblNewLabel);
		
		locationTextField = new JTextField();
		locationTextField.setColumns(10);
		locationTextField.setBounds(104, 329, 289, 20);
		contentPane.add(locationTextField);
		
		JLabel lblLocation = new JLabel("LOCATION");
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setBackground(Color.WHITE);
		lblLocation.setBounds(26, 329, 94, 14);
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