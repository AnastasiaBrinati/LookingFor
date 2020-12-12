package course_page;

import java.awt.Color;
import java.awt.Toolkit;

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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
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
	private final JButton profileButton = new JButton("");
	private final JPanel panel = new JPanel();
	JPanel coursesPanel = new JPanel();
	JButton coursesButton = new JButton("Courses");
	JButton eventsButton = new JButton("Events");
	JButton courtsButton = new JButton("Courts");
	JButton btnNewButton_2_3 = new JButton("Settings");
	JButton helpButton = new JButton("Help");
	private final JPanel descriptionPanel = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("Description");
	private final JTextField descriptionTextfield = new JTextField();
	private final JButton btnNewButton = new JButton("New button");
	private final JButton btnNewButton_1 = new JButton("New button");
	private final JButton btnNewButton_2 = new JButton("New button");
	private final JButton btnNewButton_3 = new JButton("New button");
	private final JButton btnNewButton_4 = new JButton("New button");
	private final JButton btnNewButton_5 = new JButton("New button");
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
		setContentPane(contentPane);
		headerPanel.setBounds(0, 0, 1086, 40);
		
		

		headerPanel.setBackground(Color.ORANGE);
		headerPanel.setForeground(new Color(255, 165, 0));
		homeButton.setBounds(275, 0, 45, 42);
		homeButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\home-3-32.png"));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);
		profileButton.setBounds(1046, 0, 38, 42);
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		eventsPanel.setBounds(268, 132, 818, 511);
		
		contentPane.add(eventsPanel);
		eventsPanel.setLayout(null);
		btnNewButton_3_1_1_1.setBounds(10, 62, 256, 123);
		
		eventsPanel.add(btnNewButton_3_1_1_1);
		btnNewButton_3_1_1_1_1.setBounds(276, 62, 256, 123);
		
		eventsPanel.add(btnNewButton_3_1_1_1_1);
		lblNewLabel_4.setBounds(10, 37, 46, 14);
		
		eventsPanel.add(lblNewLabel_4);
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
		
		
		coursesPanel.setBounds(268, 132, 818, 511);
		contentPane.add(coursesPanel);
		coursesPanel.setLayout(null);
		btnNewButton.setBounds(10, 63, 256, 123);
		
		coursesPanel.add(btnNewButton);
		btnNewButton_1.setBounds(276, 63, 256, 123);
		
		coursesPanel.add(btnNewButton_1);
		btnNewButton_2.setBounds(542, 63, 256, 123);
		
		coursesPanel.add(btnNewButton_2);
		btnNewButton_3.setBounds(10, 197, 256, 123);
		
		coursesPanel.add(btnNewButton_3);
		btnNewButton_4.setBounds(276, 197, 256, 123);
		
		coursesPanel.add(btnNewButton_4);
		btnNewButton_5.setBounds(542, 197, 256, 123);
		
		coursesPanel.add(btnNewButton_5);
		lblNewLabel_2.setBounds(10, 38, 73, 14);
		
		coursesPanel.add(lblNewLabel_2);
		
			

		profileButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\contacts-32.png"));
		profileButton.setContentAreaFilled(false);
		profileButton.setBorder(null);
		settingsButton.setBounds(10, 0, 38, 42);
		
				settingsButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\gear-2-32.png"));
				settingsButton.setContentAreaFilled(false);
				settingsButton.setBorder(null);
				
						profileButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\exit-32.png"));
						profileButton.setContentAreaFilled(false);
						profileButton.setBorder(null);
						headerPanel.setLayout(null);
						
								headerPanel.add(homeButton);
								headerPanel.add(profileButton);
								headerPanel.add(settingsButton);
								headerPanel.add(profileButton);
										contentPane.add(headerPanel);
										
										JLayeredPane layeredPane = new JLayeredPane();
										layeredPane.setBounds(0, 0, 1, 1);
										headerPanel.add(layeredPane);
										panel.setBounds(0, 39, 269, 604);
										panel.setBackground(new Color(255, 215, 0));
										
										contentPane.add(panel);
										panel.setLayout(null);
										
										JLabel lblNewLabel = new JLabel("Sportee");
										lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
										lblNewLabel.setForeground(Color.BLACK);
										lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
										lblNewLabel.setBounds(0, 11, 269, 71);
										panel.add(lblNewLabel);
										coursesButton.setBackground(new Color(255, 69, 0));
										
										
										coursesButton.setBounds(0, 91, 269, 59);
										panel.add(coursesButton);
										eventsButton.setBackground(new Color(255, 69, 0));
										
										
										eventsButton.setBounds(0, 156, 269, 59);
										panel.add(eventsButton);
										courtsButton.setBackground(new Color(255, 69, 0));
										
										
										courtsButton.setBounds(0, 221, 269, 59);
										panel.add(courtsButton);
										btnNewButton_2_3.setBackground(new Color(255, 69, 0));
										
										
										btnNewButton_2_3.setBounds(0, 285, 269, 59);
										panel.add(btnNewButton_2_3);
										helpButton.setBackground(new Color(255, 69, 0));
										
									
										helpButton.setBounds(0, 349, 269, 59);
										panel.add(helpButton);
										
										JPanel panel_1 = new JPanel();
										panel_1.setBackground(new Color(255, 222, 173));
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
		
	}
	public void setEventsPanelVisible() {
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(true);
		
	}
	public void setCourtsPanelVisible() {
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(true);
		eventsPanel.setVisible(false);
		
	}
	
	
}
	
