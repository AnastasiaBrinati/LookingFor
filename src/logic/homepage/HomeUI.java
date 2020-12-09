package homepage;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HomeUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField searchBar;
	private JButton settingsButton = new JButton("");
	private JPanel headerPanel = new JPanel();
	private JButton profileButton1 = new JButton("");
	private JPanel panel1 = new JPanel();
	private final JPanel panel2 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("");
	private final JButton btnJoin = new JButton("Join");
	private final JButton profileButton2 = new JButton("");

	public HomeUI() {

		setTitle("Sporty");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
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

		profileButton2.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\contacts-32.png"));
		profileButton2.setContentAreaFilled(false);
		profileButton2.setBorder(null);
		profileButton2.setBounds(1211, 0, 38, 42);

		searchBar = new JTextField();
		searchBar.setBounds(416, 11, 349, 20);
		searchBar.setColumns(10);

		settingsButton.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\gear-2-32.png"));
		settingsButton.setBounds(10, 0, 38, 42);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		profileButton1.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Desktop\\ISPW\\Progetto\\Sporty\\Progetto\\ImagesSporty\\exit-32.png"));
		profileButton1.setContentAreaFilled(false);
		profileButton1.setBorder(null);
		profileButton1.setBounds(1269, 0, 38, 42);

		panel1.setBounds(0, 42, 1317, 691);
		panel1.setLayout(null);

		panel2.setBounds(0, 0, 184, 716);
		panel2.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 72, 154, 2);

		lblNewLabel.setBounds(0, 0, 184, 692);
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\5923e27e1c9c5b5d4a3e2604b17b638b.jpg"));

		btnJoin.setBounds(53, 95, 89, 23);
		btnJoin.setIcon(
				new ImageIcon("C:\\Users\\giuli\\Downloads\\images.jpg"));
		headerPanel.add(searchBar);
		headerPanel.add(profileButton2);
		headerPanel.add(settingsButton);
		headerPanel.add(profileButton1);

		contentPane.add(headerPanel);

		panel1.add(panel2);
		panel2.add(separator);
		panel2.add(lblNewLabel);
		panel2.add(btnJoin);

		contentPane.add(panel1);
	}

	public JButton getProfileButton() {
		return profileButton1;
	}
}