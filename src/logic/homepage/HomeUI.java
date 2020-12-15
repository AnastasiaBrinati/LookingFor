package logic.homepage;

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
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import java.awt.ScrollPane;
import java.awt.Panel;
import javax.swing.JMenuBar;
import javax.swing.Box;
import java.awt.SystemColor;

public class HomeUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JLabel lblNewLabel_1 = new JLabel("setings");
	private JButton profileButton = new JButton("profile");

	public HomeUI() {

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panel.setBackground(new Color(102, 205, 170));
		panel.setBounds(0, 0, 1088, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(438, 10, 151, 44);
		panel.add(lblNewLabel);
		
		lblNewLabel_1.setBounds(10, 10, 75, 34);
		panel.add(lblNewLabel_1);
		
		profileButton.setBackground(SystemColor.info);
		profileButton.setBounds(997, 10, 81, 34);
		panel.add(profileButton);
		LineBorder lineBorder=new LineBorder(Color.white,8,true);
	}

	public JButton getProfileButton() {
		return profileButton;
	}	
}
	
