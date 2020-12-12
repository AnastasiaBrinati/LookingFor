package logic.course_page;

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

public class CourseUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;
	private JButton settingsButton = new JButton("");
	private JPanel headerPanel = new JPanel();
	
	private JPanel panel1 = new JPanel();
	private JButton homeButton = new JButton("");
	private final JPanel panel2 = new JPanel();
	private final JButton profileButton = new JButton("");

	public CourseUI() {

		setTitle("Sporty");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1333, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		headerPanel.setBackground(Color.ORANGE);
		headerPanel.setForeground(new Color(255, 165, 0));
		headerPanel.setBounds(0, 0, 1317, 42);
		headerPanel.setLayout(null);

		homeButton.setBounds(370, 0, 45, 42);
		homeButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\home-3-32.png"));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);
		
			

		profileButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\contacts-32.png"));
		profileButton.setContentAreaFilled(false);
		profileButton.setBorder(null);
		profileButton.setBounds(1211, 0, 38, 42);

		searchBar = new JTextField();
		searchBar.setBounds(416, 11, 349, 20);
		searchBar.setColumns(10);

		settingsButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\gear-2-32.png"));
		settingsButton.setBounds(10, 0, 38, 42);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		profileButton.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\exit-32.png"));
		profileButton.setContentAreaFilled(false);
		profileButton.setBorder(null);
		profileButton.setBounds(1269, 0, 38, 42);

		panel1.setBounds(0, 42, 1317, 691);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);
		headerPanel.add(profileButton);
		headerPanel.add(settingsButton);
		headerPanel.add(profileButton);

		contentPane.add(headerPanel);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

		panel1.add(panel2);
		panel2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(431, 243, 2, 2);
		panel2.add(scrollPane);

		contentPane.add(panel1);
	}

	public JButton getProfileButton() {
		return profileButton;
	}
}