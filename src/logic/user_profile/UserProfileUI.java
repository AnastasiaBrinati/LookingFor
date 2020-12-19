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
import java.awt.Image;
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
	
	private JPanel descriprionPanel = new JPanel();
	private TextArea textArea = new TextArea();
	private JLabel lblTitle = new JLabel("Sportee");
	private JButton homeButton = new JButton("");
	private final JButton exitButton = new JButton("");
	private final JPanel panel2 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("About me");
	//non penso servirà più
	private JPanel panel3 = new JPanel();
	
	//profilo
	private final JLabel lblUsername = new JLabel("username");
	private final JLabel name = new JLabel("AnastasiaBR");
	private final JPanel panel = new JPanel();
	private final JButton btnCourses = new JButton("Courses");
	private final JButton btnEvents = new JButton("Events");
	private final JButton btnHelp = new JButton("Help");
	private final JButton btnSettings = new JButton("Settings");
	private final JPanel panelSettings = new JPanel();
	private final JButton organizationsButton = new JButton("Organizations");

	public UserProfileUI() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1283, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//header
		headerPanel.setBackground(new Color(102, 205, 170));
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1269, 51);
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

		descriprionPanel.setBounds(305, 51, 1012, 620);
		descriprionPanel.setLayout(null);
		descriprionPanel.add(panel2);
		
		lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 23));
		lblUsername.setBounds(274, 27, 134, 25);
		descriprionPanel.add(lblUsername);
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setBounds(274, 75, 134, 25);
		descriprionPanel.add(name);
		
		panel2.setBounds(29, 203, 940, 161);
		panel2.setLayout(null);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 0, 154, 38);
		textArea.setBounds(20, 44, 493, 107);
		panel2.add(lblNewLabel);
		panel2.add(textArea);
		
		panel3.setBounds(29, 423, 940, 155);
		panel3.setLayout(null);
		
		descriprionPanel.add(panel3);
		
		contentPane.add(descriprionPanel);
		
		JLabel myCoursesLbl = new JLabel("MyCourses");
		myCoursesLbl.setFont(new Font("Arial", Font.PLAIN, 18));
		myCoursesLbl.setBounds(29, 384, 116, 29);
		descriprionPanel.add(myCoursesLbl);
		
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 51, 307, 584);
		panel.setLayout(null);
		btnCourses.setBackground(new Color(102, 205, 170));
		btnCourses.setBounds(10, 79, 287, 57);
		panel.add(btnCourses);
		btnEvents.setBackground(new Color(102, 205, 170));
		btnEvents.setBounds(10, 133, 287, 57);
		panel.add(btnEvents);
		
		contentPane.add(panel);
		
		panelSettings.setBackground(new Color(102, 205, 170));
		panelSettings.setBounds(10, 275, 287, 114);
		panel.add(panelSettings);
		panelSettings.setLayout(null);
		btnSettings.setBackground(new Color(102, 205, 170));
		btnSettings.setBounds(0, 0, 287, 57);
		panelSettings.add(btnSettings);
		btnHelp.setBounds(0, 57, 287, 57);
		panelSettings.add(btnHelp);
		btnHelp.setBackground(new Color(102, 205, 170));
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		organizationsButton.setBackground(new Color(102, 205, 170));
		organizationsButton.setBounds(10, 201, 287, 57);
		
		panel.add(organizationsButton);
	}

	public JButton getExitButton() {
		return exitButton;
	}
	
	public JButton getOrganizationsButton() {
		return organizationsButton;
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
}