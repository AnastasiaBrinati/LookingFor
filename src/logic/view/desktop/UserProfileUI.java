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
	private JButton settingsButton = new JButton("\u2630");
	
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
	private final JButton exitButton = new JButton("");
	private JLabel locationLbl = new JLabel("location");

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
										
										contentPane.add(descriptionPanel);
										
										JPanel panel_1 = new JPanel();
										panel_1.setBackground(Color.LIGHT_GRAY);
										panel_1.setBounds(0, 0, 992, 155);
										descriptionPanel.add(panel_1);
										panel_1.setLayout(null);
										namelbl.setBounds(145, 11, 216, 24);
										panel_1.add(namelbl);
										namelbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
										surnamelbl.setBounds(145, 35, 284, 25);
										panel_1.add(surnamelbl);
										
										surnamelbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
										lblUsername.setBounds(145, 71, 284, 25);
										panel_1.add(lblUsername);
										
										lblUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
										
										
										locationLbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
										locationLbl.setBounds(145, 107, 216, 24);
										panel_1.add(locationLbl);
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
		headerPanel.setBackground(new Color(255, 0, 0));
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1297, 51);
		headerPanel.setLayout(null);

		homeButton.setBounds(360, 0, 55, 51);
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);

		searchBar = new JTextField();
		searchBar.setBounds(416, 11, 349, 31);
		searchBar.setColumns(10);
		settingsButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		settingsButton.setForeground(Color.WHITE);

		
		settingsButton.setBounds(0, 0, 62, 51);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);
		headerPanel.add(settingsButton);

		contentPane.add(headerPanel);
		exitButton.setBounds(1242, 0, 55, 51);
		
		headerPanel.add(exitButton);
		
		panel.setBackground(new Color(204, 0, 0));
		panel.setBounds(0, 51, 307, 593);
		panel.setLayout(null);
		coursesButton.setForeground(Color.WHITE);
		coursesButton.setBackground(new Color(204, 0, 0));
		coursesButton.setBounds(10, 153, 287, 57);
		panel.add(coursesButton);
		eventsButton.setForeground(Color.WHITE);
		eventsButton.setBackground(new Color(204, 0, 0));
		eventsButton.setBounds(10, 207, 287, 57);
		panel.add(eventsButton);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(255, 255, 255));
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
		
		//Image img3=new ImageIcon(this.getClass().getResource("/046-hierarchy.png")).getImage();
		//coursesButton.setIcon(new ImageIcon(img3));
		coursesButton.setContentAreaFilled(true);
		
		//Image img5=new ImageIcon(this.getClass().getResource("/exit-32.png")).getImage();
		//exitButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Downloads\\exit-32.png"));
		exitButton.setContentAreaFilled(false);
		RoutineButton.setForeground(Color.WHITE);
		
		
		
		//Image img4=new ImageIcon(this.getClass().getResource("/034-flag.png")).getImage();
		//eventsButton.setIcon(new ImageIcon(img4));
		
		//Image img= new ImageIcon(this.getClass().getResource("/house32.png")).getImage();
		//homeButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Downloads\\house-32.png"));
		
		//Image img2= new ImageIcon(this.getClass().getResource("/settings-32.png")).getImage();
		//settingsButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Downloads\\settings-32.png"));
		
		
		RoutineButton.setContentAreaFilled(true);
		RoutineButton.setBackground(new Color(204, 0, 0));
		RoutineButton.setBounds(10, 262, 287, 57);
		
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
		coursesButton.setBackground(new Color(204,0,0));
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
		coursesButton.setBackground(new Color(139,0,0));
		eventsButton.setBackground(new Color(204,0,0));
		
	}
	
	public void setEventsPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		eventsPanel.setVisible(true);
		coursesButton.setBackground(new Color(204,0,0));
		eventsButton.setBackground(new Color(139,0,0));	
	}
	
	public void setCredentials(String name, String surname, String username,String location) {
		
		lblUsername.setText(username);
		namelbl.setText(name);
		surnamelbl.setText(surname);
		locationLbl.setText(location);
		
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
}