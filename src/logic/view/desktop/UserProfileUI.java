package logic.view.desktop;

import javax.swing.DefaultListModel;
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
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JCheckBox;

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
	private final JPanel workoutPanel = new JPanel();
	private JButton workoutButton = new JButton("My Workout Routine");
	private JLabel workoutlbl = new JLabel("my workout routine");
	JButton addWorkoutButton = new JButton("Start Your Workout With Us!");
	private JPanel newWorkoutPanel = new JPanel();
	
	private final JLabel lblUsername = new JLabel("username");
	private final JLabel name = new JLabel("name");
	private final JPanel panel = new JPanel();
	private final JButton coursesButton = new JButton("Courses");
	private final JButton eventsButton = new JButton("Events");
	private final JButton organizationsButton = new JButton("Organizations");
	private final JPanel coursesPanel = new JPanel();
	private final JPanel eventsPanel = new JPanel();
	private final JButton backButton = new JButton("<-");
	private JTextField textField;
	private JTextField textField_1;

	public UserProfileUI() {

		setTitle("Sporty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1311, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
								
								contentPane.add(workoutPanel);
								workoutPanel.setBounds(305, 51, 992, 584);
								workoutPanel.setLayout(null);
								
								newWorkoutPanel.setBounds(10, 30, 958, 509);
								workoutPanel.add(newWorkoutPanel);
								newWorkoutPanel.setLayout(null);
								workoutlbl.setBounds(428, 257, 136, 36);
								newWorkoutPanel.add(workoutlbl);
								workoutlbl.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 15));
								addWorkoutButton.setBounds(368, 303, 265, 59);
								newWorkoutPanel.add(addWorkoutButton);
								
								JLabel RoutineName = new JLabel("Choose a name for your routine:");
								RoutineName.setFont(new Font("Tahoma", Font.PLAIN, 15));
								RoutineName.setBounds(28, 40, 248, 20);
								workoutPanel.add(RoutineName);
								
								textField = new JTextField();
								textField.setBounds(332, 41, 200, 23);
								workoutPanel.add(textField);
								textField.setColumns(10);
								
								JList<String> list = new JList<String>();
								DefaultListModel<String> listModel1 = new DefaultListModel<String>();
								listModel1.addElement("none");
								listModel1.addElement("Monday");
								listModel1.addElement("Tuesday");
								listModel1.addElement("Wednesday");
								listModel1.addElement("Thursday");
								listModel1.addElement("Friday");
								listModel1.addElement("Saturday");
								listModel1.addElement("Sunday");
								list.setModel(listModel1);
								list.setBounds(233, 132, 167, 142);
								workoutPanel.add(list);
								
								JLabel lblChooseOffDays = new JLabel("Choose Off Days:");
								lblChooseOffDays.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblChooseOffDays.setBounds(28, 127, 180, 20);
								workoutPanel.add(lblChooseOffDays);
								
								JCheckBox notifyMeCheckBox = new JCheckBox("Want to recive a reminder?");
								notifyMeCheckBox.setBounds(28, 328, 273, 21);
								workoutPanel.add(notifyMeCheckBox);
								
								JLabel lblTime = new JLabel("-how much?");
								lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
								lblTime.setBounds(484, 127, 180, 23);
								workoutPanel.add(lblTime);
								
								textField_1 = new JTextField();
								textField_1.setBounds(639, 130, 96, 19);
								workoutPanel.add(textField_1);
								textField_1.setColumns(10);
						
								descriptionPanel.setBounds(305, 51, 992, 584);
								descriptionPanel.setLayout(null);
								
								lblUsername.setFont(new Font("Arial", Font.PLAIN, 23));
								lblUsername.setBounds(274, 67, 134, 25);
								descriptionPanel.add(lblUsername);
								name.setFont(new Font("Arial", Font.PLAIN, 20));
								name.setBounds(274, 102, 134, 25);
								descriptionPanel.add(name);
								
								contentPane.add(descriptionPanel);
								
								JLabel lblNewLabel = new JLabel("cognome");
								lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
								lblNewLabel.setBounds(274, 139, 134, 25);
								descriptionPanel.add(lblNewLabel);
		
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
		
		contentPane.add(eventsPanel);
		eventsPanel.setBounds(307, 52, 990, 585);
		contentPane.add(eventsPanel);
		coursesPanel.setBounds(307, 52, 990, 585);
		contentPane.add(coursesPanel);
		
		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 51, 307, 584);
		panel.setLayout(null);
		coursesButton.setBackground(new Color(102, 205, 170));
		coursesButton.setBounds(10, 220, 287, 57);
		panel.add(coursesButton);
		eventsButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBounds(10, 287, 287, 57);
		panel.add(eventsButton);
		
		contentPane.add(panel);
		lblTitle.setBounds(89, 27, 141, 41);
		panel.add(lblTitle);
		lblTitle.setForeground(new Color(0, 0, 0));
		lblTitle.setFont(new Font("Bauhaus 93", Font.BOLD, 35));
		organizationsButton.setBackground(new Color(102, 205, 170));
		organizationsButton.setBounds(10, 354, 287, 57);
		
		panel.add(organizationsButton);
		
		workoutButton.setBackground(new Color(102, 205, 170));
		workoutButton.setBounds(10, 153, 287, 57);
		panel.add(workoutButton);
		backButton.setBounds(10, 107, 64, 36);
		panel.add(backButton);
		backButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		
		
	}
	
	public JButton getOrganizationsButton() {
		return organizationsButton;
	}

	public JButton getWorkoutButton() {
		return workoutButton;
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
		workoutPanel.setVisible(false);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(102, 205, 170));
		workoutButton.setBackground(new Color(102, 205, 170));
	}
	
	public void setWorkoutPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		workoutPanel.setVisible(true);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(102, 205, 170));
		workoutButton.setBackground(new Color(0, 128, 128));
	}
	
	public void setCoursesPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(true);
		descriptionPanel.setVisible(false);
		workoutPanel.setVisible(false);
		eventsPanel.setVisible(false);
		coursesButton.setBackground(new Color(0, 128, 128));
		eventsButton.setBackground(new Color(102, 205, 170));
		workoutButton.setBackground(new Color(102, 205, 170));
	}
	
	public void setEventsPanelVisible() {
		backButton.setVisible(true);
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		workoutPanel.setVisible(false);
		eventsPanel.setVisible(true);
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(0, 128, 128));	
		workoutButton.setBackground(new Color(102, 205, 170));
	}
	
	public void enableNewWorkoutPanel() {
		newWorkoutPanel.setVisible(false);
		
	}
}