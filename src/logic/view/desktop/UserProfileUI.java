package logic.view.desktop;

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
	private JPanel headerPanel = new JPanel();
	
	private JPanel descriptionPanel = new JPanel();
	private TextArea textArea = new TextArea();
	private JLabel lblTitle = new JLabel("Sportee");
	private JButton homeButton = new JButton("");
	private JButton settingsButton = new JButton("Settings");
	private final JPanel panel2 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("About me");
	//non penso servirà più
	private JPanel panel3 = new JPanel();
	
	//profilo
	private final JLabel lblUsername = new JLabel("username");
	private final JLabel name = new JLabel("AnastasiaBR");
	private final JPanel panel = new JPanel();
	private final JButton coursesButton = new JButton("Courses");
	private final JButton eventsButton = new JButton("Events");
	private final JButton organizationsButton = new JButton("Organizations");
	private JLabel myCoursesLbl = new JLabel("MyCourses");
	private final JPanel coursesPanel = new JPanel();
	private final JPanel eventsPanel = new JPanel();

	public UserProfileUI() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//header
		headerPanel.setBackground(new Color(102, 205, 170));
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

		settingsButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\gear-2-32.png"));
		settingsButton.setBounds(10, 0, 55, 51);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);
		headerPanel.add(settingsButton);

		contentPane.add(headerPanel);

		descriptionPanel.setBounds(305, 51, 992, 620);
		descriptionPanel.setLayout(null);
		descriptionPanel.add(panel2);
		
		lblUsername.setFont(new Font("Arial Black", Font.PLAIN, 23));
		lblUsername.setBounds(274, 27, 134, 25);
		descriptionPanel.add(lblUsername);
		name.setFont(new Font("Tahoma", Font.PLAIN, 16));
		name.setBounds(274, 75, 134, 25);
		descriptionPanel.add(name);
		
		panel2.setBounds(29, 203, 940, 161);
		panel2.setLayout(null);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 22));
		lblNewLabel.setBounds(10, 0, 154, 38);
		textArea.setBounds(20, 44, 493, 107);
		panel2.add(lblNewLabel);
		panel2.add(textArea);
		
		panel3.setBounds(29, 423, 940, 155);
		panel3.setLayout(null);
		
		descriptionPanel.add(panel3);
		coursesPanel.setBounds(0, -417, 975, 585);
		panel3.add(coursesPanel);
		
		contentPane.add(descriptionPanel);
		
		myCoursesLbl.setFont(new Font("Arial", Font.PLAIN, 18));
		myCoursesLbl.setBounds(29, 384, 116, 29);
		descriptionPanel.add(myCoursesLbl);
		
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 51, 307, 584);
		panel.setLayout(null);
		coursesButton.setBackground(new Color(102, 205, 170));
		coursesButton.setBounds(10, 79, 287, 57);
		panel.add(coursesButton);
		eventsButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBounds(10, 133, 287, 57);
		panel.add(eventsButton);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		organizationsButton.setBackground(new Color(102, 205, 170));
		organizationsButton.setBounds(10, 201, 287, 57);
		
		panel.add(organizationsButton);
		
	}

	
	public JButton getOrganizationsButton() {
		return organizationsButton;
	}

	public JButton getButton4() {
		return coursesButton;
	}

	public JButton getButton5() {
		return eventsButton;
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
	public JButton getHomeButton() {
		return homeButton;
	}
	
	public void setCoursesPanelVisible() {
		coursesPanel.setVisible(true);
		descriptionPanel.setVisible(false);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(0, 128, 128));
		eventsButton.setBackground(new Color(102, 205, 170));	
	}
	
	public void setEventsPanelVisible() {
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		eventsPanel.setVisible(true);
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(0, 128, 128));	
	}
	
}