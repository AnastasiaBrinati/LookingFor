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

public class EventUIOrg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JButton profileButton = new JButton("");
	private JButton exitButton = new JButton("\u2398");
	private JButton homeButton = new JButton("\u2302");
	
	private JLabel priceLbl = new JLabel("$15.00");
	private JLabel organizationLbl = new JLabel("Organization");
	private JLabel availabilityLbl = new JLabel("7");
	private JLabel nameLbl = new JLabel("Name");
	private JLabel sportLbl = new JLabel("Sport");
	private JLabel dateLbl = new JLabel("$20.00");
	private JTextArea descriptionTextArea = new JTextArea();
	private JButton deleteButton = new JButton("Delete ");
	private JButton backButton = new JButton("\u21E6");


	public EventUIOrg() {

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1088, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(438, 10, 151, 44);
		panel.add(lblNewLabel);
		exitButton.setContentAreaFilled(false);
		profileButton.setBackground(SystemColor.info);
		profileButton.setBounds(943, 0, 49, 49);
		panel.add(profileButton);
		//settingsButton.setEnabled(false);
		/*
		settingsButton.setContentAreaFilled(false);
		
		Image img3=new ImageIcon(this.getClass().getResource("049-edit (1).png")).getImage();
		settingsButton.setIcon(new ImageIcon(img3));
		settingsButton.setContentAreaFilled(false);

		Image img5=new ImageIcon(this.getClass().getResource("/exit-32.png")).getImage();
		exitButton.setIcon(new ImageIcon(img5));
		exitButton.setContentAreaFilled(false);

		//Image img5=new ImageIcon(this.getClass().getResource("/exit-32.png")).getImage();
		//exitButton.setIcon(new ImageIcon(img5));
		exitButton.setContentAreaFilled(false);

		Image img6=new ImageIcon(this.getClass().getResource("/settings-24.png")).getImage();
		settingsButton.setIcon(new ImageIcon(img6));
		settingsButton.setContentAreaFilled(false);

		//Image img6=new ImageIcon(this.getClass().getResource("/settings-24.png")).getImage();
		//settingsButton.setIcon(new ImageIcon(img6));
		settingsButton.setContentAreaFilled(false);

		
		//Image img4=new ImageIcon(this.getClass().getResource("/040-user.png")).getImage();
		//profileButton.setIcon(new ImageIcon(img4));
		profileButton.setContentAreaFilled(false);

		
		
		profileButton.setContentAreaFilled(false);
		*/
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		exitButton.setForeground(Color.WHITE);
		
		exitButton.setBounds(1002, 0, 86, 67);
		panel.add(exitButton);
		homeButton.setFont(new Font("Arial Black", Font.PLAIN, 60));
		homeButton.setForeground(Color.WHITE);
		
		homeButton.setContentAreaFilled(false);
		homeButton.setBounds(336, -14, 79, 68);
		panel.add(homeButton);
		
		
		backButton.setForeground(Color.WHITE);
		backButton.setFont(new Font("Cambria Math", Font.PLAIN, 40));
		backButton.setContentAreaFilled(false);
		backButton.setBackground(new Color(204, 0, 0));
		backButton.setBounds(98, 0, 85, 54);
		panel.add(backButton);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 55, 1088, 588);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1088, 148);
		panel_1.setBackground(new Color(47, 79, 79));
		mainPanel.add(panel_1);
		panel_1.setLayout(null);
		
		nameLbl.setForeground(new Color(255, 255, 255));
		nameLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 23));
		nameLbl.setBounds(146, 22, 61, 14);
		panel_1.add(nameLbl);
		
		sportLbl.setForeground(Color.WHITE);
		sportLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		sportLbl.setBounds(146, 47, 61, 14);
		panel_1.add(sportLbl);
		
		
		deleteButton.setForeground(Color.WHITE);
		deleteButton.setBackground(Color.RED);
		deleteButton.setBounds(915, 47, 133, 63);
		panel_1.add(deleteButton);
		
		organizationLbl.setForeground(Color.WHITE);
		organizationLbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		organizationLbl.setBounds(146, 72, 145, 14);
		panel_1.add(organizationLbl);
		
		descriptionTextArea.setBackground(new Color(230, 230, 250));
		descriptionTextArea.setBounds(61, 197, 758, 128);
		mainPanel.add(descriptionTextArea);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setForeground(new Color(0, 0, 0));
		lblDescription.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblDescription.setBounds(61, 172, 113, 14);
		mainPanel.add(lblDescription);
		
		JLabel lbl = new JLabel("Date");
		lbl.setForeground(Color.BLACK);
		lbl.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lbl.setBounds(61, 356, 113, 14);
		mainPanel.add(lbl);
		
		JLabel lblMonthlyPrice = new JLabel("Price");
		lblMonthlyPrice.setForeground(Color.BLACK);
		lblMonthlyPrice.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblMonthlyPrice.setBounds(61, 410, 113, 14);
		mainPanel.add(lblMonthlyPrice);
		
		dateLbl.setForeground(new Color(0, 0, 0));
		dateLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		dateLbl.setBounds(71, 381, 61, 14);
		mainPanel.add(dateLbl);
		
		priceLbl.setForeground(Color.BLACK);
		priceLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		priceLbl.setBounds(71, 435, 61, 14);
		mainPanel.add(priceLbl);
		
		JLabel typeLbl2 = new JLabel("Instructor");
		typeLbl2.setForeground(Color.BLACK);
		typeLbl2.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		typeLbl2.setBounds(61, 460, 113, 14);
		mainPanel.add(typeLbl2);
		
		JLabel typeLbl = new JLabel("John");
		typeLbl.setForeground(Color.BLACK);
		typeLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		typeLbl.setBounds(71, 485, 61, 14);
		mainPanel.add(typeLbl);
		
		JLabel lblAvailability = new JLabel("Availability");
		lblAvailability.setForeground(Color.BLACK);
		lblAvailability.setFont(new Font("Dubai Medium", Font.PLAIN, 17));
		lblAvailability.setBounds(61, 510, 113, 14);
		mainPanel.add(lblAvailability);
		
		availabilityLbl.setForeground(Color.BLACK);
		availabilityLbl.setFont(new Font("Dubai Light", Font.PLAIN, 17));
		availabilityLbl.setBounds(71, 535, 61, 14);
		mainPanel.add(availabilityLbl);
		//LineBorder lineBorder=new LineBorder(Color.white,8,true);
	}

	public JButton getProfileButton() {
		return profileButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	public JButton getHomeButton() {
		return homeButton;
	}
	
	public void setCredentials(String name, String date, String price, String description, String sport, String organization, String availability) {
		
		nameLbl.setText(name);
		sportLbl.setText(sport);
		organizationLbl.setText(organization);
		availabilityLbl.setText(availability);
		priceLbl.setText(price);
		dateLbl.setText(date);
		descriptionTextArea.setText(description);
		
	}
	
	public JButton getDeleteButton() {
		return deleteButton;
	}
	public JButton getBackButton() {
		return backButton;
	}

	public String getEventName() {
		return nameLbl.getText();
	}
}
	
