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
	private JPanel panel = new JPanel();
	private JLabel leftSideImage = new JLabel("");
	private JLabel lblusername = new JLabel("USERNAME\\E-MAIL");
	private JLabel Alternative = new JLabel("Or");
	private JLabel lblpassword = new JLabel("PASSWORDeeee");
	private JTextField textFieldusername;
	private JButton btnLogin = new JButton("Login");
	private JButton btnSignUp = new JButton("Sign Up ");
	private final JLabel lblTitle = new JLabel("Sportee");
	private JPasswordField textFieldpassword;

	private final JLabel label = new JLabel("");


	

	// Create the frame.
	public LoginUI()  {
	
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

		panel.setBounds(0, 0, 401, 514);

		panel.setBounds(0, 0, 401, 500);

		panel.setLayout(null);
		label.setBounds(10, 0, 46, 14);
		
		panel.add(label);
		leftSideImage.setBounds(226, 12, 0, 0);
		panel.add(leftSideImage);
		contentPane.add(panel);

		leftSideImage.setIcon(new ImageIcon("C:\\Users\\biril\\Downloads\\Sports-Wallpapers-and-Backgrounds-HD-by-Pocket-Books.jpg"));
	
		//user credentials
		lblusername.setForeground(Color.WHITE);
		lblusername.setBounds(450, 164, 140, 15);
		contentPane.add(lblusername);
	
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		textFieldusername.setBounds(450, 196, 290, 20);
		contentPane.add(textFieldusername);
	
		JSeparator separator = new JSeparator();
		separator.setBounds(451, 237, 289, 2);
		contentPane.add(separator);
	
		lblpassword.setForeground(Color.WHITE);
		lblpassword.setBounds(449, 249, 90, 15);
		contentPane.add(lblpassword);

		//alternative button
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(SystemColor.textInactiveText);
		btnSignUp.setBounds(545, 388, 108, 42);
		Image img2=new ImageIcon(this.getClass().getResource("/028-upload.png")).getImage();
		btnSignUp.setIcon(new ImageIcon(img2));
		contentPane.add(btnSignUp);

		Alternative.setForeground(Color.WHITE);
		Alternative.setBounds(585, 364, 21, 14);
		contentPane.add(Alternative);

		lblTitle.setForeground(Color.BLACK);
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 70));
		lblTitle.setBounds(470, 51, 263, 103);

		btnLogin.setForeground(SystemColor.info);
		btnLogin.setBackground(SystemColor.textInactiveText);

		contentPane.add(lblTitle);

		textFieldpassword = new JPasswordField();
		textFieldpassword.setBounds(450, 274, 290, 20);
		contentPane.add(textFieldpassword);

	
		btnLogin.setBounds(526, 312, 140, 42);
		contentPane.add(btnLogin);
		
		//Image img4=new ImageIcon(this.getClass().getResource("/001-download.png")).getImage();
		btnLogin.setIcon(null);

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