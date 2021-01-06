package logic.view.desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JRadioButtonMenuItem;

public class SignInUI extends JFrame {
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


	// Create the frame.
	public SignInUI() {
		
		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnLogin.setBounds(194, 459, 74, 22);
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(Color.GRAY);
		
		separator4.setBackground(Color.GRAY);
		separator4.setBounds(104, 124, 289, 2);
		
		lblName.setForeground(Color.WHITE);
		lblName.setBackground(Color.WHITE);
		lblName.setBounds(61, 52, 33, 14);

		textFieldName = new JTextField();
		textFieldName.setBounds(104, 49, 289, 20);
		textFieldName.setColumns(10);
		
		separator5.setBackground(Color.GRAY);
		separator5.setBounds(104, 80, 289, 2);
	
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBackground(Color.WHITE);
		lblSurname.setBounds(39, 93, 118, 14);

		textFieldSurname = new JTextField();
		textFieldSurname.setColumns(10);
		textFieldSurname.setBounds(104, 93, 289, 20);
		
		separator2.setBackground(Color.GRAY);
		separator2.setBounds(406, 363, 362, -9);
		
		lblUsername.setBounds(39, 141, 118, 14);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.WHITE);
		
		separator3.setBackground(Color.GRAY);
		separator3.setBounds(104, 255, 289, 2);

		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(104, 137, 289, 20);
		
		lblEmail.setBounds(48, 180, 46, 14);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBackground(Color.WHITE);
		
		separator.setBackground(Color.GRAY);
		separator.setBounds(104, 210, 289, 2);

		textFieldEmail = new JTextField();
		textFieldEmail.setBounds(104, 179, 289, 20);
		textFieldEmail.setColumns(10);
		
		lblPassword.setBounds(39, 223, 92, 14);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.WHITE);
		
		separator1.setBackground(Color.GRAY);
		separator1.setBounds(104, 166, 289, 2);

		textFieldPassword = new JTextField();
		textFieldPassword.setBounds(104, 223, 289, 20);
		textFieldPassword.setColumns(10);
		
		btnNewButton1.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\Facebook_logo_(square) (1).png"));
		btnNewButton1.setBounds(194, 388, 40, 40);
		
		btnNewButton2.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\219-2197783_training-documents-google-logo-icon-png (1).png"));
		btnNewButton2.setBounds(240, 388, 40, 40);
		
		lblAlternative.setForeground(Color.WHITE);
		lblAlternative.setBounds(206, 363, 74, 14);
		
		lblOr.setForeground(Color.WHITE);
		lblOr.setBounds(227, 439, 46, 14);

		resetButton.setBackground(Color.GRAY);
		resetButton.setBounds(205, 320, 89, 23);

		signUpButton.setBackground(new Color(255, 99, 71));
		signUpButton.setBounds(304, 320, 89, 23);

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
		singleUserRadioButton.setForeground(Color.WHITE);
		
		singleUserRadioButton.setContentAreaFilled(false);
		organizationRadioButton.setForeground(Color.WHITE);
		organizationRadioButton.setContentAreaFilled(false);
		
		
		singleUserRadioButton.setBounds(104, 264, 109, 23);
		contentPane.add(singleUserRadioButton);
		
		
		organizationRadioButton.setBounds(104, 290, 109, 23);
		contentPane.add(organizationRadioButton);
		
		JLabel lblNewLabel = new JLabel("Sportee");
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 74));
		lblNewLabel.setBounds(121, 510, 289, 70);
		contentPane.add(lblNewLabel);
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
	}
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public String getName() {
		return textFieldPassword.getText();
	}
	public String getSurname() {
		return textFieldEmail.getText();
	}
	public String getUsername() {
		return textFieldName.getText();
	}
	public String getEmail() {
		return textFieldSurname.getText();
	}
	public String getPassword() {
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