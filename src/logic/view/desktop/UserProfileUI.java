package logic.view.desktop;

//import javax.swing.DefaultListModel;
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


public class UserProfileUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;
	private JPanel headerPanel = new JPanel();
	
	private JPanel descriptionPanel = new JPanel();
	private JLabel lblTitle = new JLabel("Sportee");
	private JButton homeButton = new JButton("");
	private JButton settingsButton = new JButton("Settings");
	
	private final JLabel lblUsername = new JLabel("username");
	private final JLabel namelbl = new JLabel("name");
	private JLabel surnamelbl = new JLabel("cognome");
	private final JPanel panel = new JPanel();
	private final JButton coursesButton = new JButton("Courses");
	private final JButton eventsButton = new JButton("Events");
	private final JPanel coursesPanel = new JPanel();
	private final JPanel eventsPanel = new JPanel();
	private final JButton backButton = new JButton("<-");
	private final JButton RoutineButton = new JButton("MyRoutine");

	public UserProfileUI() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
								
										descriptionPanel.setBounds(305, 51, 992, 593);
										descriptionPanel.setLayout(null);
										
										lblUsername.setFont(new Font("Arial", Font.PLAIN, 23));
										lblUsername.setBounds(274, 67, 134, 25);
										descriptionPanel.add(lblUsername);
										namelbl.setFont(new Font("Arial", Font.PLAIN, 20));
										namelbl.setBounds(274, 102, 134, 25);
										descriptionPanel.add(namelbl);
										
										contentPane.add(descriptionPanel);
										
										surnamelbl.setFont(new Font("Arial", Font.PLAIN, 20));
										surnamelbl.setBounds(274, 139, 134, 25);
										descriptionPanel.add(surnamelbl);
								/*
								DefaultListModel<String> listModel1 = new DefaultListModel<String>();
								listModel1.addElement("none");
								listModel1.addElement("Monday");
								listModel1.addElement("Tuesday");
								listModel1.addElement("Wednesday");
								listModel1.addElement("Thursday");
								listModel1.addElement("Friday");
								listModel1.addElement("Saturday");
								listModel1.addElement("Sunday");
								*/
		
		//header
		headerPanel.setBackground(new Color(0, 128, 128));
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

		settingsButton.setIcon(null);
		settingsButton.setBounds(0, 0, 55, 51);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);
		headerPanel.add(settingsButton);

		contentPane.add(headerPanel);
		
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 51, 307, 593);
		panel.setLayout(null);
		coursesButton.setBackground(new Color(102, 205, 170));
		coursesButton.setBounds(10, 153, 287, 57);
		panel.add(coursesButton);
		eventsButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBounds(10, 207, 287, 57);
		panel.add(eventsButton);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		backButton.setBackground(new Color(102, 205, 170));
		backButton.setBounds(10, 107, 64, 36);
		panel.add(backButton);
		backButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		coursesPanel.setBounds(307, 52, 990, 585);
		contentPane.add(coursesPanel);
		
		contentPane.add(eventsPanel);
		eventsPanel.setBounds(307, 52, 990, 585);
		contentPane.add(eventsPanel);
		
		Image img3=new ImageIcon(this.getClass().getResource("/046-hierarchy.png")).getImage();
		coursesButton.setIcon(new ImageIcon(img3));
		coursesButton.setContentAreaFilled(true);
		
		
		Image img4=new ImageIcon(this.getClass().getResource("/034-flag.png")).getImage();
		eventsButton.setIcon(new ImageIcon(img4));
		eventsButton.setContentAreaFilled(true);
		RoutineButton.setContentAreaFilled(true);
		RoutineButton.setBackground(new Color(102, 205, 170));
		RoutineButton.setBounds(10, 332, 287, 57);
		
		panel.add(RoutineButton);
	
		
	}
	
	public JButton getButtonSettings() {
		return settingsButton;
	}
	
	public JButton getCoursesButton() {
		return coursesButton;
	}
	
	public JButton getEventsButton() {
		return eventsButton;
	}
	
	public JButton getBackButton() {
		return backButton;
	}
	
	public JButton getHomeButton() {
		return homeButton;
	}
	
	public void setDescriptionPanelVisible() {
		backButton.setVisible(false);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(true);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(102, 205, 170));
	}
	
	public void setWorkoutPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(102, 205, 170));
	}
	
	public void setCoursesPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(true);
		descriptionPanel.setVisible(false);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(0, 128, 128));
		eventsButton.setBackground(new Color(102, 205, 170));
	}
	
	public void setEventsPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		eventsPanel.setVisible(true);
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(0, 128, 128));	
	}
	
	public void setCredentials(String name, String surname, String username) {
		
		lblUsername.setText(username);
		namelbl.setText(name);
		surnamelbl.setText(surname);
		
	}
	

}