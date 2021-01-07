package logic.view.desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.JPasswordField;

import javax.swing.JButton;
import java.awt.SystemColor;

public class LoginUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblusername = new JLabel("USERNAME\\E-MAIL");
	private JLabel Alternative = new JLabel("Or");
	private JLabel lblpassword = new JLabel("PASSWORD");
	private JTextField textFieldusername;
	private JButton btnLogin = new JButton("Login");
	private JButton btnSignUp = new JButton("Sign Up ");
	private final JLabel lblTitle = new JLabel("Sportee");
	private JPasswordField textFieldpassword;


	

	// Create the frame.
	public LoginUI()  {
	
		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\biril\\Downloads\\loginIcon.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 437, 539);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		//user credentials
		lblusername.setForeground(Color.WHITE);
		lblusername.setBounds(57, 162, 140, 15);
		contentPane.add(lblusername);
	
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		textFieldusername.setBounds(57, 188, 290, 20);
		contentPane.add(textFieldusername);
		
	
		JSeparator separator = new JSeparator();
		separator.setBounds(57, 219, 289, 2);
		contentPane.add(separator);
	
		lblpassword.setForeground(Color.WHITE);
		lblpassword.setBounds(57, 232, 90, 15);
		contentPane.add(lblpassword);

		//alternative button
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(SystemColor.textInactiveText);
		btnSignUp.setBounds(144, 427, 108, 42);
		//Image img2=new ImageIcon(this.getClass().getResource("/028-upload.png")).getImage();
		//btnSignUp.setIcon(new ImageIcon(img2));
		contentPane.add(btnSignUp);

		Alternative.setForeground(Color.WHITE);
		Alternative.setBounds(192, 402, 21, 14);
		contentPane.add(Alternative);

		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 70));
		lblTitle.setBounds(84, 34, 263, 103);

		btnLogin.setForeground(SystemColor.info);
		btnLogin.setBackground(new Color(255, 99, 71));

		contentPane.add(lblTitle);

		textFieldpassword = new JPasswordField();
		textFieldpassword.setBounds(57, 258, 290, 20);
		contentPane.add(textFieldpassword);

	
		btnLogin.setBounds(128, 329, 140, 42);
		contentPane.add(btnLogin);
		
		//Image img4=new ImageIcon(this.getClass().getResource("/001-download.png")).getImage();
		btnLogin.setIcon(null);

	}
	
	public void resetForm() {
		textFieldusername.setText("");
		textFieldpassword.setText("");
	}
	

	public String getUsername() {
		return textFieldusername.getText();
	}
	
	/*public void WrongUsername() {
		textFieldusername.setText("WRONG!");
	}*/
	
	
	
	
	
	@SuppressWarnings("deprecation")
	public String getPassword() {
		return textFieldpassword.getText();
	}

	public JButton getLoginButton() {
		return btnLogin;
	}
	
	public JButton getSignInButton() {
		return btnSignUp;
	}
}