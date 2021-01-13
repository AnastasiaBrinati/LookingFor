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

public class EventUISUs extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JButton profileButton = new JButton("");
	private JButton settingsButton = new JButton("\u2630");
	private JButton exitButton = new JButton("\u2398");
	private JButton homeButton = new JButton("");
	
	private JLabel priceLbl = new JLabel("$15.00");
	private JLabel organizationLbl = new JLabel("Organization");
	private JLabel availabilityLbl = new JLabel("7");
	private JLabel nameLbl = new JLabel("Name");
	private JLabel sportLbl = new JLabel("Sport");
	private JLabel dateLbl = new JLabel("$20.00");
	private JTextArea descriptionTextArea = new JTextArea();
	
	private JButton joinButton = new JButton("Join");
	
	public EventUISUs() {

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		settingsButton.setContentAreaFilled(false);

		profileButton.setContentAreaFilled(false);
		exitButton.setContentAreaFilled(false);
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(0, 0, 1088, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(438, 10, 151, 44);
		panel.add(lblNewLabel);
		
		profileButton.setBackground(SystemColor.info);
		profileButton.setBounds(964, 0, 49, 49);
		panel.add(profileButton);
		settingsButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		settingsButton.setForeground(Color.WHITE);
		settingsButton.setBounds(0, 0, 69, 54);
		panel.add(settingsButton);
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
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		
		exitButton.setBounds(1017, 0, 71, 67);
		panel.add(exitButton);
		
		homeButton.setContentAreaFilled(false);
		homeButton.setBounds(336, 10, 40, 43);
		panel.add(homeButton);
		
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
		
		joinButton.setForeground(new Color(255, 255, 255));
		joinButton.setBackground(new Color(0, 128, 0));
		joinButton.setBounds(900, 44, 157, 65);
		panel_1.add(joinButton);
		
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
	public JButton getSettingsButton() {
		return settingsButton;
	}
	public JButton getExitButton() {
		return exitButton;
	}
	public JButton getHomeButton() {
		return homeButton;
	}
	public JButton getJoinButton() {
		return joinButton;
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

}
	
