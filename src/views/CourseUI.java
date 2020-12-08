package views;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

	private JPanel contentPane;
	private JTextField searchBar;
	private JButton settingsButton = new JButton("");
	private JPanel headerPanel = new JPanel();
	private JButton profileButton = new JButton("");
	private JPanel panel_1 = new JPanel();
	private JButton homeButton = new JButton("");
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("");
	private final JButton btnJoin_1 = new JButton("     Join Course");
	private final JButton profileButton_1 = new JButton("");

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
		
			

		profileButton_1.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\contacts-32.png"));
		profileButton_1.setContentAreaFilled(false);
		profileButton_1.setBorder(null);
		profileButton_1.setBounds(1211, 0, 38, 42);

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

		panel_1.setBounds(0, 42, 1317, 691);
		btnJoin_1.setBounds(10, 20, 154, 41);

		
		btnJoin_1.setForeground(Color.WHITE);
		btnJoin_1.setIcon(new ImageIcon("C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\plus-7-32.png"));
		btnJoin_1.setBackground(Color.DARK_GRAY);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 72, 154, 2);

		headerPanel.add(homeButton);
		headerPanel.add(searchBar);
		headerPanel.add(profileButton_1);
		headerPanel.add(settingsButton);
		headerPanel.add(profileButton);

		contentPane.add(headerPanel);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		panel_1.add(panel_2);
		panel_2.setLayout(null);
		panel_2.add(btnJoin_1);
		panel_2.add(separator);
		lblNewLabel.setBounds(0, 0, 184, 692);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\giuli\\Downloads\\5923e27e1c9c5b5d4a3e2604b17b638b.jpg"));

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(431, 243, 2, 2);
		panel_2.add(scrollPane);

		contentPane.add(panel_1);
	}

	public JButton getProfileButton() {
		return profileButton;
	}
}