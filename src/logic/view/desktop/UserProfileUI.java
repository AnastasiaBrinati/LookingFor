package logic.view.desktop;

//import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;


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
	private JButton homeButton = new JButton("\u2302");
	private JButton settingsButton = new JButton("\u2630");
	
	private final JLabel lblUsername = new JLabel("username");
	private final JLabel namelbl = new JLabel("name");
	private JLabel surnamelbl = new JLabel("cognome");
	private final JPanel panel = new JPanel();
	private final JButton coursesButton = new JButton("My Courses");
	private final JButton eventsButton = new JButton("My Events");
	private final JPanel coursesPanel = new JPanel();
	private final JPanel eventsPanel = new JPanel();
	private final JButton backButton = new JButton("<-");
	private final JButton exitButton = new JButton("\u2398");
	private JLabel locationLbl = new JLabel("location");
	private final JLabel lblNewLabel_4 = new JLabel("Profile");
	private final JButton searchButton = new JButton("\uD83D\uDD0D");
	
	private static int countCourseX = 0;
	private static int countCourseY = 0;
	
	private static int countEventX = 0;
	private static int countEventY = 0;
	private final JPanel newGamePanel = new JPanel();
	private final JLabel lblNewLabel = new JLabel("Organize Your Match");
	private final JButton matchButton = new JButton("+");
	private final JLabel scoreTitlelbl = new JLabel("");

	public UserProfileUI() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
										
										JPanel subtitlePanel = new JPanel();
										subtitlePanel.setBackground(Color.LIGHT_GRAY);
										subtitlePanel.setBounds(305, 51, 992, 154);
										contentPane.add(subtitlePanel);
										subtitlePanel.setLayout(null);
										namelbl.setBounds(145, 11, 216, 24);
										subtitlePanel.add(namelbl);
										namelbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
										surnamelbl.setBounds(145, 35, 284, 25);
										subtitlePanel.add(surnamelbl);
										
										surnamelbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
										lblUsername.setBounds(145, 71, 284, 25);
										subtitlePanel.add(lblUsername);
										
										lblUsername.setFont(new Font("Tahoma", Font.BOLD, 20));
										
										
										locationLbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
										locationLbl.setBounds(145, 107, 216, 24);
										subtitlePanel.add(locationLbl);
										scoreTitlelbl.setBounds(707, 21, 45, 13);
										
										subtitlePanel.add(scoreTitlelbl);
								
										descriptionPanel.setBounds(305, 206, 992, 438);
										descriptionPanel.setLayout(null);
										
										contentPane.add(descriptionPanel);
										newGamePanel.setBackground(new Color(230, 230, 250));
										newGamePanel.setBounds(10, 24, 272, 386);
										
										descriptionPanel.add(newGamePanel);
										newGamePanel.setLayout(null);
										lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
										lblNewLabel.setBounds(59, 104, 148, 45);
										
										newGamePanel.add(lblNewLabel);
										matchButton.setBackground(new Color(95, 158, 160));
										matchButton.setBounds(93, 159, 77, 70);
										
										newGamePanel.add(matchButton);
															
		
		//header
		headerPanel.setBackground(new Color(255, 0, 0));
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1297, 51);
		headerPanel.setLayout(null);
		homeButton.setFont(new Font("Arial Black", Font.PLAIN, 60));
		homeButton.setForeground(Color.WHITE);

		homeButton.setBounds(362, -15, 55, 67);
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
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		exitButton.setBounds(1229, -1, 86, 67);
		
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
		backButton.setBackground(new Color(204, 0, 0));
		backButton.setBounds(10, 107, 64, 36);
		panel.add(backButton);
		backButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		coursesPanel.setBounds(307, 206, 990, 438);
		contentPane.add(coursesPanel);
		
		contentPane.add(eventsPanel);
		eventsPanel.setBounds(307, 206, 990, 438);
		contentPane.add(eventsPanel);
		
		//Image img3=new ImageIcon(this.getClass().getResource("/046-hierarchy.png")).getImage();
		//coursesButton.setIcon(new ImageIcon(img3));
		coursesButton.setContentAreaFilled(true);
		
		//Image img5=new ImageIcon(this.getClass().getResource("/exit-32.png")).getImage();
		//exitButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Downloads\\exit-32.png"));
		exitButton.setContentAreaFilled(false);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.PLAIN, 35));
		lblNewLabel_4.setBounds(67, -3, 149, 54);
		
		headerPanel.add(lblNewLabel_4);
		searchButton.setVerticalAlignment(SwingConstants.TOP);
		searchButton.setHorizontalAlignment(SwingConstants.LEADING);
		searchButton.setForeground(Color.WHITE);
		searchButton.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 25));
		searchButton.setBackground(Color.DARK_GRAY);
		searchButton.setBounds(764, 11, 71, 31);
		
		headerPanel.add(searchButton);
	
		
	}
	
	public JButton getSettingsButton() {
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
	
	public JButton getMatchButton() {
		return matchButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	public JButton getSearchButton() {
		return searchButton;
	}
	
	public String getSearchText() {
		return searchBar.getText();
	}
	
	public void setDescriptionPanelVisible() {
		backButton.setVisible(false);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(true);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(204,0,0));
		eventsButton.setBackground(new Color(204,0,0));
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
		
	public void resetCoursePanel() {
		coursesPanel.removeAll();
	}
	
	public void resetEventPanel() {
		eventsPanel.removeAll();
	}
	
	public JButton createCourseFrame(String name) {
		
		if(countCourseY==4) {
			countCourseY=0;
			countCourseX+=1;
		}
		
		int height = 168;
		int width = 120;
		
		JPanel coursePanel = new JPanel();
		coursePanel.setBackground(Color.PINK);
		coursePanel.setBounds(20+(countCourseY*(width+10)), 174+(countCourseX*(height+10)), width, height);
		coursesPanel.add(coursePanel);
		coursePanel.setLayout(null);
		
		JLabel imgLbl = new JLabel("img");
		imgLbl.setBackground(Color.ORANGE);
		imgLbl.setBounds(0, 0, 120, 87);
		coursePanel.add(imgLbl);
		
		JButton showMoreButton = new JButton("Show More");
		showMoreButton.setBounds(10, 137, 100, 21);
		coursePanel.add(showMoreButton);
		
		JLabel courseNameLbl = new JLabel(name);
		courseNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		courseNameLbl.setBounds(10, 97, 100, 21);
		coursePanel.add(courseNameLbl);
		
		countCourseY+=1;
		
		return showMoreButton;
        
    }

	public JButton createEventFrame(String name) {

		if(countEventY==4) {
			countEventY=0;
			countEventX+=1;
		}
		
		int height = 168;
		int width = 120;
		
		JPanel eventPanel = new JPanel();
		eventPanel.setBackground(Color.PINK);
		eventPanel.setBounds(20+(countEventY*(width+10)), 174+(countEventX*(height+10)), width, height);
		coursesPanel.add(eventPanel);
		eventPanel.setLayout(null);
		
		JLabel imgLbl = new JLabel("img");
		imgLbl.setBackground(Color.ORANGE);
		imgLbl.setBounds(0, 0, 120, 87);
		eventPanel.add(imgLbl);
		
		JButton showMoreButton = new JButton("Show More");
		showMoreButton.setBounds(10, 137, 100, 21);
		eventPanel.add(showMoreButton);
		
		JLabel courseNameLbl = new JLabel(name);
		courseNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		courseNameLbl.setBounds(10, 97, 100, 21);
		eventPanel.add(courseNameLbl);
		
		countEventY+=1;
		
		return showMoreButton;
        
    }
	
}