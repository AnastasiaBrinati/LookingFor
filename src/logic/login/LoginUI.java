package logic.login;

import java.awt.Button;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginUI extends JFrame {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel leftSideImage = new JLabel("");
	private JLabel lblusername = new JLabel("USERNAME\\E-MAIL");
	private JLabel Alternative = new JLabel("Or");
	private JLabel lblpassword = new JLabel("PASSWORD");
	private JTextField textFieldusername;
	private JTextField textFieldpassword;
	private Button btnLogin = new Button("Login");
	private Button btnSignUp = new Button("Sign Up");
	

	// Create the frame.
	public LoginUI() {
	
		setTitle("LOGIN");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\biril\\Downloads\\loginIcon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 539);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, -10, 401, 524);
		panel.add(leftSideImage);
		contentPane.add(panel);

		leftSideImage.setIcon(new ImageIcon("C:\\Users\\biril\\Downloads\\Sports-Wallpapers-and-Backgrounds-HD-by-Pocket-Books.jpg"));
	
		//user credentials
		lblusername.setForeground(Color.WHITE);
		lblusername.setBounds(450, 140, 140, 15);
		contentPane.add(lblusername);
	
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		textFieldusername.setBounds(450, 235, 290, 20);
		contentPane.add(textFieldusername);
	
		JSeparator separator = new JSeparator();
		separator.setBounds(450, 205, 289, 2);
		contentPane.add(separator);
	
		lblpassword.setForeground(Color.WHITE);
		lblpassword.setBounds(450, 220, 90, 15);
		contentPane.add(lblpassword);
	
		textFieldpassword = new JTextField();
		textFieldpassword.setColumns(10);
		textFieldpassword.setBounds(450, 155, 290, 20);
		contentPane.add(textFieldpassword);
	
		//login button
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(210, 105, 30));
		btnLogin.setBounds(503, 289, 171, 42);
		contentPane.add(btnLogin);
	
		//alternative button
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(Color.GRAY);
		btnSignUp.setBounds(558, 422, 70, 22);
		contentPane.add(btnSignUp);

		Alternative.setForeground(Color.WHITE);
		Alternative.setBounds(586, 370, 46, 14);
		contentPane.add(Alternative);
	}

	public String getUsername() {
		return textFieldusername.getText();
	}
	
	public String getPassword() {
		return textFieldpassword.getText();
	}

	public Button getLoginButton() {
		return btnLogin;
	}
	
	public Button getSignInButton() {
		return btnSignUp;
	}
	

}