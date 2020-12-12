package logic.user_profile;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;

public class UserProfileUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;
	private JButton settingsButton = new JButton("");
	private JPanel headerPanel = new JPanel();
	
	private JPanel panel1 = new JPanel();
	private JLabel lblImg = new JLabel("img");
	private TextArea textArea = new TextArea();
	private JLabel lblTitle = new JLabel("Sportee");
	private JButton homeButton = new JButton("");
	private final JButton exitButton = new JButton("");
	private final JPanel panel2 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("About me");
	//non penso servirà più
	private JPanel panel3 = new JPanel();
	private JButton btnNewButton = new JButton("New button");
	private JButton btnNewButton1 = new JButton("New button");
	private JButton btnNewButton2 = new JButton("New button");
	private JButton btnNewButton3 = new JButton("New button");
	
	//profilo
	private final JLabel lblUsername = new JLabel("username");
	private final JLabel name = new JLabel("AnastasiaBR");
	private final JPanel panel = new JPanel();
	private final JButton btnCourses = new JButton("Courses");
	private final JButton btnEvents = new JButton("Events");
	private final JButton btnHelp = new JButton("Help");
	private final JButton btnSettings = new JButton("Settings");
	private final JPanel panelSettings = new JPanel();
	private final JPanel panel4 = new JPanel();
	private JPanel panel5 = new JPanel();
	private final JButton btnProva1 = new JButton("Hello4!!!!");
	private final JButton btnProva2 = new JButton("HELLO5!!!");
	private final JButton organizationsButton = new JButton("Organizations");

	public UserProfileUI() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1333, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel5.setBounds(306, 51, 1011, 673);
		contentPane.add(panel5);
		panel5.setLayout(null);
		btnProva2.setBounds(463, 5, 266, 124);
		
		panel5.add(btnProva2);
		panel4.setBounds(305, 51, 1012, 674);
		
		contentPane.add(panel4);
		panel4.setLayout(null);
		btnProva1.setBounds(165, 96, 85, 21);
		
		panel4.add(btnProva1);
		
		//header
		headerPanel.setBackground(Color.ORANGE);
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1317, 51);
		headerPanel.setLayout(null);

		homeButton.setBounds(370, 0, 45, 42);
		homeButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\home-3-32.png"));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);	

		exitButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\contacts-32.png"));
		exitButton.setContentAreaFilled(false);
		exitButton.setBorder(null);
		exitButton.setBounds(1262, 0, 42, 42);

		searchBar = new JTextField();
		searchBar.setBounds(416, 11, 349, 31);
		searchBar.setColumns(10);

		settingsButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\gear-2-32.png"));
		settingsButton.setBounds(10, 0, 55, 51);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		exitButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\exit-32.png"));
		exitButton.setContentAreaFilled(false);
		exitButton.setBorder(null);
		exitButton.setBounds(1269, 0, 38, 42);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);
		headerPanel.add(exitButton);
		headerPanel.add(settingsButton);
		headerPanel.add(exitButton);

		contentPane.add(headerPanel);

		panel1.setBounds(305, 51, 1012, 674);
		panel1.setLayout(null);
		panel1.add(panel2);
		lblImg.setBounds(29, 27, 174, 153);
		panel1.add(lblImg);
		lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 23));
		lblUsername.setBounds(274, 27, 134, 25);
		panel1.add(lblUsername);
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setBounds(274, 75, 134, 25);
		panel1.add(name);
		
		panel2.setBounds(29, 203, 940, 161);
		panel2.setLayout(null);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 0, 154, 38);
		textArea.setBounds(20, 44, 493, 107);
		panel2.add(lblNewLabel);
		panel2.add(textArea);
		
		panel3.setBounds(29, 404, 940, 174);
		panel3.setLayout(null);
		
		btnNewButton.setBounds(10, 10, 164, 154);
		panel3.add(btnNewButton);
		btnNewButton1.setBounds(184, 10, 164, 154);
		panel3.add(btnNewButton1);
		btnNewButton2.setBounds(358, 10, 164, 154);
		panel3.add(btnNewButton2);
		btnNewButton3.setBounds(532, 10, 164, 154);
		panel3.add(btnNewButton3);
		
		panel1.add(panel3);
		
		contentPane.add(panel1);
		
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 51, 307, 674);
		panel.setLayout(null);
		btnCourses.setBackground(Color.ORANGE);
		btnCourses.setBounds(10, 79, 287, 57);
		panel.add(btnCourses);
		btnEvents.setBounds(10, 133, 287, 57);
		panel.add(btnEvents);
		
		contentPane.add(panel);
		
		panelSettings.setBackground(Color.ORANGE);
		panelSettings.setBounds(10, 275, 287, 114);
		panel.add(panelSettings);
		panelSettings.setLayout(null);
		btnSettings.setBounds(0, 0, 287, 57);
		panelSettings.add(btnSettings);
		btnHelp.setBounds(0, 55, 287, 57);
		panelSettings.add(btnHelp);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		organizationsButton.setBounds(10, 201, 287, 57);
		
		panel.add(organizationsButton);
	}

	public JButton getExitButton() {
		return exitButton;
	}
	
	public JButton getOrganizationsButton() {
		return organizationsButton;
	}
	
	
	public JButton getButton1() {
		return btnNewButton1;
	}
	

	public JButton getButton2() {
		return btnNewButton2;
	}
	
	

	public JButton getButton3() {
		return btnNewButton3;
	}
	
	

	public JButton getButton4() {
		return btnCourses;
	}
	
	

	public JButton getButton5() {
		return btnEvents;
	}
	
	

	public JButton getButton6() {
		return btnHelp;
	}
	
	

	public JButton getButton7() {
		return btnSettings;
	}
	
	public JButton getbtnCourses() {
		return btnCourses;
	}
	
	public JButton getbtnEvents() {
		return btnEvents;
	}
	public JButton getHomeButton() {
		return homeButton;
	}
	
	public void setPanel1Visible() {
		panel1.setVisible(true);
		panel5.setVisible(false);
		panel4.setVisible(false);
	}
	
	public void setPanel4Visible() {
		panel4.setVisible(true);
		panel5.setVisible(false);
		panel1.setVisible(false);
	}
	
	public void setPanel5Visible() {
		panel5.setVisible(true);
		panel4.setVisible(false);
		panel1.setVisible(false);
	}
}