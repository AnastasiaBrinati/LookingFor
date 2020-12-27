package logic.view.desktop;

import java.awt.Button;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


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
	private JButton btnLogin = new JButton("");
	private Button btnSignUp = new Button("Sign Up");
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
		panel.setLayout(null);
		label.setBounds(10, 0, 46, 14);
		
		panel.add(label);
		leftSideImage.setBounds(226, 12, 0, 0);
		panel.add(leftSideImage);
		contentPane.add(panel);

		leftSideImage.setIcon(new ImageIcon("C:\\Users\\biril\\Downloads\\Sports-Wallpapers-and-Backgrounds-HD-by-Pocket-Books.jpg"));
	
		//user credentials
		lblusername.setForeground(Color.WHITE);
		lblusername.setBounds(450, 140, 140, 15);
		contentPane.add(lblusername);
	
		textFieldusername = new JTextField();
		textFieldusername.setColumns(10);
		textFieldusername.setBounds(450, 165, 290, 20);
		contentPane.add(textFieldusername);
	
		JSeparator separator = new JSeparator();
		separator.setBounds(450, 205, 289, 2);
		contentPane.add(separator);
	
		lblpassword.setForeground(Color.WHITE);
		lblpassword.setBounds(450, 220, 90, 15);
		contentPane.add(lblpassword);
	
		textFieldpassword = new JTextField();
		textFieldpassword.setColumns(10);
		textFieldpassword.setBounds(449, 245, 290, 20);
		contentPane.add(textFieldpassword);
	
		//alternative button
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBackground(Color.GRAY);
		btnSignUp.setBounds(558, 422, 70, 22);
		contentPane.add(btnSignUp);

		Alternative.setForeground(Color.WHITE);
		Alternative.setBounds(586, 370, 46, 14);
		contentPane.add(Alternative);
		
		
		btnLogin.setBounds(526, 303, 126, 36);
		contentPane.add(btnLogin);
		
		Image img=new ImageIcon(this.getClass().getResource("/button.png")).getImage();
		btnLogin.setIcon(new ImageIcon(img));
		btnLogin.setContentAreaFilled(false);
	}
	

	public String getUsername() {
		return textFieldusername.getText();
	}
	
	/*public void WrongUsername() {
		textFieldusername.setText("WRONG!");
	}*/
	
	
	
	
	
	
	
	
	public String getPassword() {
		return textFieldpassword.getText();
	}

	public JButton getLoginButton() {
		return btnLogin;
	}
	
	public Button getSignInButton() {
		return btnSignUp;
	}
}