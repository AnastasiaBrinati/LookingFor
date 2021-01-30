package logic.view.desktop;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

import java.awt.SystemColor;
import javax.swing.JTextArea;

public class CourseUIOrg extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JButton exitButton = new JButton("\u2398");
	private JButton homeButton = new JButton("\u2302");
	JLabel nameLbl = new JLabel("Name");
	JLabel sportLbl = new JLabel("Sport");
	JLabel lblAvailability = new JLabel("Availability");
	JLabel instructorNameLbl = new JLabel("John");
	JLabel lblDescription = new JLabel("Description");
	JTextArea descriptionTextArea = new JTextArea();
	JLabel lessonPriceLbl = new JLabel("$20.00");
	JLabel lblMonthlyPrice = new JLabel("Monthly Price");
	JLabel monthlyPriceLbl = new JLabel("$50.00");
	JLabel lblInstructor = new JLabel("Instructor");
	JLabel availabilityLbl = new JLabel("7");
	JButton deleteButton = new JButton("Delete ");
	private final JButton backButton = new JButton("\u21E6");

	public CourseUIOrg() {
		this.setLocationRelativeTo(null);
		setBackground(new Color(0, 51, 255));

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		panel.setBackground(Color.RED);
		panel.setBounds(0, 0, 1264, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(438, 10, 151, 44);
		panel.add(lblNewLabel);
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		backButton.setContentAreaFilled(false);
		
		
		exitButton.setBounds(1193, 3, 71, 65);
		panel.add(exitButton);
		homeButton.setFont(new Font("Arial Black", Font.PLAIN, 60));
		homeButton.setForeground(Color.WHITE);
		
		
		homeButton.setContentAreaFilled(false);
		homeButton.setBounds(313, -27, 104, 97);
		panel.add(homeButton);
		backButton.setFont(new Font("Cambria Math", Font.PLAIN, 40));
		
		backButton.setForeground(Color.WHITE);
		backButton.setBackground(new Color(204, 0, 0));
		backButton.setBounds(90, 0, 104, 57);
		
		panel.add(backButton);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 55, 1264, 686);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1264, 148);
		panel_1.setBackground(new Color(47, 79, 79));
		mainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 0, 255));
		lblNewLabel_1.setBounds(10, 11, 126, 126);
		panel_1.add(lblNewLabel_1);
		
		
		nameLbl.setForeground(new Color(255, 255, 255));
		nameLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 23));
		nameLbl.setBounds(146, 11, 277, 25);
		panel_1.add(nameLbl);
		
		
		sportLbl.setForeground(Color.WHITE);
		sportLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		sportLbl.setBounds(146, 47, 413, 14);
		panel_1.add(sportLbl);
		
		
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setBackground(Color.RED);
		deleteButton.setBounds(1003, 46, 133, 63);
		panel_1.add(deleteButton);
		
		
		descriptionTextArea.setBackground(new Color(230, 230, 250));
		descriptionTextArea.setBounds(61, 197, 758, 128);
		mainPanel.add(descriptionTextArea);
		
		
		lblDescription.setForeground(new Color(0, 0, 0));
		lblDescription.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblDescription.setBounds(61, 172, 113, 14);
		mainPanel.add(lblDescription);
		
		JLabel lblLessonPrice = new JLabel("Lesson Price");
		lblLessonPrice.setForeground(Color.BLACK);
		lblLessonPrice.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblLessonPrice.setBounds(61, 356, 113, 14);
		mainPanel.add(lblLessonPrice);
		
		lblMonthlyPrice.setForeground(Color.BLACK);
		lblMonthlyPrice.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblMonthlyPrice.setBounds(61, 410, 113, 14);
		mainPanel.add(lblMonthlyPrice);
		
		
		lessonPriceLbl.setForeground(new Color(0, 0, 0));
		lessonPriceLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		lessonPriceLbl.setBounds(71, 381, 61, 14);
		mainPanel.add(lessonPriceLbl);
		
		monthlyPriceLbl.setForeground(Color.BLACK);
		monthlyPriceLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		monthlyPriceLbl.setBounds(71, 435, 61, 14);
		mainPanel.add(monthlyPriceLbl);
		
		lblInstructor.setForeground(Color.BLACK);
		lblInstructor.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblInstructor.setBounds(61, 460, 113, 14);
		mainPanel.add(lblInstructor);
		
		
		instructorNameLbl.setForeground(Color.BLACK);
		instructorNameLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		instructorNameLbl.setBounds(71, 485, 61, 14);
		mainPanel.add(instructorNameLbl);
		
		
		lblAvailability.setForeground(Color.BLACK);
		lblAvailability.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblAvailability.setBounds(61, 510, 113, 14);
		mainPanel.add(lblAvailability);
		exitButton.setContentAreaFilled(false);
		
		availabilityLbl.setForeground(Color.BLACK);
		availabilityLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		availabilityLbl.setBounds(71, 535, 61, 14);
		mainPanel.add(availabilityLbl);
	}

	
	
	public JButton getExitButton() {
		return exitButton;
	}
	public String getCourseName() {
		return nameLbl.getText();
	}
	
	

	public JButton getHomeButton() {
		
		return homeButton;
	}
	
	public JButton getBackButton() {
		return backButton;
	}
	public JButton getDeleteButton() {
		return deleteButton;
	}

	public void setCredentials(String name, String organization, String lessonPrice, String monthlyPrice,
		String description, String instructorName, String sport) {
		nameLbl.setText(name);
		lessonPriceLbl.setText(lessonPrice);
		monthlyPriceLbl.setText(monthlyPrice);
		descriptionTextArea.setText(description);
		instructorNameLbl.setText(instructorName);
		sportLbl.setText(sport);
		
	}
}
	
