package logic.organization_profile;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.ScrollPane;
import java.awt.Panel;

public class OrganizationProfileUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton settingsButton = new JButton("");
	private JPanel headerPanel = new JPanel();
	private JButton homeButton = new JButton("");
	private final JButton profileButton = new JButton("profile");
	private final JPanel panel = new JPanel();
	private JPanel coursesPanel = new JPanel();
	private JButton coursesButton = new JButton("Courses");
	private JButton eventsButton = new JButton("Events");
	private JButton courtsButton = new JButton("Courts");
	private JButton btnNewButton_2_3 = new JButton("Settings");
	private JButton helpButton = new JButton("Help");
	private final JPanel descriptionPanel = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("Description");
	private final JTextField descriptionTextfield = new JTextField();
	private final JLabel lblNewLabel_2 = new JLabel("Courses");
	private final JPanel courtsPanel = new JPanel();
	private final JLabel lblNewLabel_3 = new JLabel("Courts");
	private final JButton btnNewButton_3_1 = new JButton("New button");
	private final JButton btnNewButton_3_1_1 = new JButton("New button");
	private final JButton btnNewButton_3_1_2 = new JButton("New button");
	private final JPanel eventsPanel = new JPanel();
	private final JButton btnNewButton_3_1_1_1 = new JButton("New button");
	private final JButton btnNewButton_3_1_1_1_1 = new JButton("New button");
	private final JLabel lblNewLabel_4 = new JLabel("Events");
	
	private Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	private JPanel PANEL = new JPanel();
	private final JButton addButton = new JButton("+");

	public OrganizationProfileUI() {
		descriptionTextfield.setBackground(new Color(220, 220, 220));
		descriptionTextfield.setBounds(10, 66, 798, 119);
		descriptionTextfield.setColumns(10);

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
	
		
		//courses
		
		//coursesPanel.pack();
        //coursesPanel.setLocation(null);

		
		profileButton.setBounds(1046, 0, 38, 42);
		profileButton.setIcon(null);
		profileButton.setContentAreaFilled(false);
		profileButton.setBorder(null);
		settingsButton.setBounds(10, 0, 38, 42);
		
	    settingsButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\gear-2-32.png"));
	    settingsButton.setContentAreaFilled(false);
	    settingsButton.setBorder(null);
	    
		profileButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\exit-32.png"));
		profileButton.setContentAreaFilled(false);
		profileButton.setBorder(null);
		
		headerPanel.setBounds(0, 0, 1086, 40);
		headerPanel.setBackground(new Color(0, 128, 128));
		headerPanel.setForeground(new Color(255, 165, 0));
		homeButton.setBounds(58, 0, 45, 42);
		homeButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\home-3-32.png"));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);
		headerPanel.setLayout(null);
		headerPanel.add(homeButton);
		headerPanel.add(profileButton);
		headerPanel.add(settingsButton);
		headerPanel.add(profileButton);
		contentPane.add(headerPanel);
        
		coursesPanel.setBounds(268, 132, 818, 511);
		coursesPanel.add(addButton);
		addButton.setBounds(10, 63, 130, 63);
		lblNewLabel_2.setBounds(10, 38, 73, 14);
		coursesPanel.add(lblNewLabel_2);
		contentPane.add(coursesPanel);
		coursesPanel.setLayout(null);
		
		PANEL.setBounds(10, 147, 599, 243);
		coursesPanel.add(PANEL);
		
		//events
		eventsPanel.setBounds(268, 132, 818, 511);
		contentPane.add(eventsPanel);
		eventsPanel.setLayout(null);
		btnNewButton_3_1_1_1.setBounds(10, 62, 256, 123);
		eventsPanel.add(btnNewButton_3_1_1_1);
		btnNewButton_3_1_1_1_1.setBounds(276, 62, 256, 123);
		eventsPanel.add(btnNewButton_3_1_1_1_1);
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 37, 87, 14);
		eventsPanel.add(lblNewLabel_4);
		
		//courts
		courtsPanel.setBounds(268, 132, 818, 511);
		contentPane.add(courtsPanel);
		courtsPanel.setLayout(null);
		lblNewLabel_3.setBounds(10, 34, 46, 14);
		courtsPanel.add(lblNewLabel_3);
		btnNewButton_3_1.setBounds(10, 59, 256, 123);
		courtsPanel.add(btnNewButton_3_1);
		btnNewButton_3_1_1.setBounds(276, 59, 256, 123);
		courtsPanel.add(btnNewButton_3_1_1);
		btnNewButton_3_1_2.setBounds(542, 59, 256, 123);
		courtsPanel.add(btnNewButton_3_1_2);
		panel.setBounds(0, 39, 269, 604);
		panel.setBackground(new Color(102, 205, 170));
		
		contentPane.add(panel);
		panel.setLayout(null);
										
		JLabel lblNewLabel = new JLabel("Sportee");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(0, 11, 269, 71);
		panel.add(lblNewLabel);
		coursesButton.setBackground(new Color(0, 128, 128));
										
		coursesButton.setBounds(0, 91, 269, 59);
		panel.add(coursesButton);
		
		eventsButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBounds(0, 156, 269, 59);
		panel.add(eventsButton);
										
		courtsButton.setBackground(new Color(102, 205, 170));
		courtsButton.setBounds(0, 221, 269, 59);
		panel.add(courtsButton);
		
		btnNewButton_2_3.setBackground(new Color(102, 205, 170));
		btnNewButton_2_3.setBounds(0, 285, 269, 59);
		panel.add(btnNewButton_2_3);
										
		helpButton.setBackground(new Color(102, 205, 170));
		helpButton.setBounds(0, 349, 269, 59);
		panel.add(helpButton);
		
		//profile header
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(268, 39, 818, 93);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
										
		JLabel orgLocationLbl = new JLabel("Location");
		orgLocationLbl.setBounds(104, 68, 73, 14);
		panel_1.add(orgLocationLbl);
										
		JLabel organizationNameLbl = new JLabel("Organization Name");
		organizationNameLbl.setBounds(104, 26, 179, 25);
		organizationNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(organizationNameLbl);
										
		JLabel organizationImageLbl = new JLabel("");
		organizationImageLbl.setHorizontalAlignment(SwingConstants.CENTER);
		organizationImageLbl.setIcon(new ImageIcon("C:\\Users\\giuli\\Downloads\\icons8-ping-pong-64.png"));
		organizationImageLbl.setBounds(10, 11, 73, 71);
		panel_1.add(organizationImageLbl);
		descriptionPanel.setBounds(268, 132, 818, 511);
										
		contentPane.add(descriptionPanel);
		descriptionPanel.setLayout(null);
		lblNewLabel_1.setBounds(10, 41, 86, 14);
										
		descriptionPanel.add(lblNewLabel_1);
										
		descriptionPanel.add(descriptionTextfield);
		LineBorder lineBorder=new LineBorder(Color.white,8,true);
		
		
	}

	public JButton getProfileButton() {
		return profileButton;
	}	
	public JButton getCoursesButton() {
		return coursesButton;
	}
	public JButton getCourtsButton() {
		return courtsButton;
	}
	public JButton getEventsButton() {
		return eventsButton;
	}
	public JButton getHomeButton() {
		return homeButton;
	}
	public JButton getAddButton() {
		return addButton;
	}
	
	public void createFrame(String name) {

        JButton frame = new JButton(name);
        frame.setBorder(new LineBorder(Color.BLACK));
        frame.setPreferredSize(new Dimension(80, 80));
        frame.setVisible(true);
        PANEL.add(frame);
        coursesPanel.revalidate();
        //contentPane.revalidate();

    }
	
	public void setDescriptionPanelVisible() {
		descriptionPanel.setVisible(true);
		coursesPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(false);
	}

	public void setCoursesPanelVisible() {
		coursesPanel.setVisible(true);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(false);
		
		coursesButton.setBackground(new Color(0, 128, 128));
		eventsButton.setBackground(new Color(102, 205, 170));
		courtsButton.setBackground(new Color(102, 205, 170));		
	}
	
	public void setEventsPanelVisible() {
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(true);
		
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(0, 128, 128));
		courtsButton.setBackground(new Color(102, 205, 170));
	}
	
	public void setCourtsPanelVisible() {
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(true);
		eventsPanel.setVisible(false);
		
		coursesButton.setBackground(new Color(102, 205, 170));
		eventsButton.setBackground(new Color(102, 205, 170));
		courtsButton.setBackground(new Color(0, 128, 128));
	}
}
	
