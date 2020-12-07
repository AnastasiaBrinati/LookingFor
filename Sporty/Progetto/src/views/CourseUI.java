package views;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CourseUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton settingsButton = new JButton("");
	private JPanel panel = new JPanel();
	private JButton profileButton = new JButton("");
	JPanel panel_1 = new JPanel();
	JButton homeButton = new JButton("");
	private final JPanel panel_2 = new JPanel();
	private final JLabel lblNewLabel = new JLabel("");
	private final JButton btnJoin = new JButton("Join");
	private final JButton btnJoin_1 = new JButton("     Join Course");
	private final JButton profileButton_1 = new JButton("");

	public CourseUI() {
		setTitle("Sporty");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1333, 772);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel.setBackground(Color.ORANGE);
		panel.setForeground(new Color(255, 165, 0));
		panel.setBounds(0, 0, 1317, 42);
		contentPane.add(panel);

		homeButton.setBounds(370, 0, 45, 42);
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel.setLayout(null);
		profileButton_1.setIcon(
				new ImageIcon("C:\\Users\\giuli\\Downloads\\contacts-32.png"));
		profileButton_1.setContentAreaFilled(false);
		profileButton_1.setBorder(null);
		profileButton_1.setBounds(1211, 0, 38, 42);

		panel.add(profileButton_1);
		homeButton.setIcon(
				new ImageIcon("C:\\Users\\giuli\\Downloads\\home-3-32.png"));
		panel.add(homeButton);
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);

		textField = new JTextField();
		textField.setBounds(416, 11, 349, 20);
		panel.add(textField);
		textField.setColumns(10);

		settingsButton.setIcon(
				new ImageIcon("C:\\Users\\giuli\\Downloads\\gear-2-32.png"));
		settingsButton.setBounds(10, 0, 38, 42);
		panel.add(settingsButton);
		settingsButton.setContentAreaFilled(false);
		settingsButton.setBorder(null);

		profileButton.setIcon(
				new ImageIcon("C:\\Users\\giuli\\Downloads\\exit-32.png"));
		profileButton.setContentAreaFilled(false);
		profileButton.setBorder(null);
		profileButton.setBounds(1269, 0, 38, 42);
		panel.add(profileButton);

		panel_1.setBounds(0, 42, 1317, 691);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_2.setBounds(0, 0, 184, 716);

		panel_1.add(panel_2);
		panel_2.setLayout(null);
		btnJoin_1.setForeground(Color.WHITE);
		btnJoin_1.setIcon(
				new ImageIcon("C:\\Users\\giuli\\Downloads\\plus-7-32.png"));
		btnJoin_1.setBackground(new Color(51, 102, 255));
		btnJoin_1.setBounds(10, 20, 154, 41);

		panel_2.add(btnJoin_1);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 72, 154, 2);
		panel_2.add(separator);
		lblNewLabel.setBounds(0, 0, 184, 692);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\5923e27e1c9c5b5d4a3e2604b17b638b.jpg"));
		btnJoin.setBounds(53, 95, 89, 23);
		btnJoin.setIcon(
				new ImageIcon("C:\\Users\\giuli\\Downloads\\images.jpg"));

		panel_2.add(btnJoin);
	}

	public JButton getProfileButton() {
		return profileButton;
	}
}
