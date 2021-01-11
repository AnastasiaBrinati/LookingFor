package logic.view.desktop;

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
import java.awt.Image;

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
	private JPanel headerPanel = new JPanel();
	private JLabel lblNewLabel = new JLabel("Sportee");
	private JButton profileButton = new JButton("\u26F9");
	private JButton settingsButton = new JButton("\u2630");
	private JButton exitButton = new JButton("\u2398");
	private final JPanel choicePanel = new JPanel();
	private JTextField textField;
	
	private JButton categoriesButton = new JButton("Categories");
	private JButton homeButton = new JButton("Home");
	private JPanel categoriesPanel = new JPanel();
	private JPanel homePanel = new JPanel();

	public HomeUI() {

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1102, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		headerPanel.setBackground(new Color(255, 0, 0));
		headerPanel.setBounds(0, 0, 1088, 54);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(77, 11, 146, 43);
		headerPanel.add(lblNewLabel);
		profileButton.setForeground(Color.WHITE);
		profileButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		
		profileButton.setBackground(SystemColor.info);
		profileButton.setBounds(926, -4, 90, 63);
		headerPanel.add(profileButton);
		settingsButton.setForeground(Color.WHITE);
		settingsButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 40));
		settingsButton.setBounds(0, 1, 74, 53);
		headerPanel.add(settingsButton);
		//settingsButton.setEnabled(false);
		
		settingsButton.setContentAreaFilled(false);
		
		//Image img3=new ImageIcon(this.getClass().getResource("/002-settings.png")).getImage();
		//settingsButton.setIcon(new ImageIcon(img3));
		settingsButton.setContentAreaFilled(false);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		exitButton.setForeground(Color.WHITE);
		
		//Image img5=new ImageIcon(this.getClass().getResource("/exit-32.png")).getImage();
		//exitButton.setIcon(new ImageIcon(img5));
		exitButton.setContentAreaFilled(false);
		
		//Image img6=new ImageIcon(this.getClass().getResource("/settings-24.png")).getImage();
		//settingsButton.setIcon(new ImageIcon(img6));
		settingsButton.setContentAreaFilled(false);
		
		//Image img4=new ImageIcon(this.getClass().getResource("/040-user.png")).getImage();
		//profileButton.setIcon(new ImageIcon(img4));
		profileButton.setContentAreaFilled(false);

		
		
		profileButton.setContentAreaFilled(false);
		
		
		exitButton.setBounds(1014, -2, 74, 72);
		headerPanel.add(exitButton);
		
		textField = new JTextField();
		textField.setBounds(317, 11, 342, 33);
		headerPanel.add(textField);
		textField.setColumns(10);
		
		homePanel.setBounds(0, 95, 1088, 550);
		contentPane.add(homePanel);
		choicePanel.setBounds(0, 53, 1088, 42);
		
		contentPane.add(choicePanel);
		choicePanel.setLayout(null);
		homeButton.setForeground(Color.PINK);
		homeButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		homeButton.setBackground(Color.RED);
		homeButton.setBounds(0, 0, 513, 42);
		choicePanel.add(homeButton);
		categoriesButton.setFont(new Font("Arial Black", Font.PLAIN, 15));
		categoriesButton.setForeground(Color.WHITE);
		
		categoriesButton.setBackground(Color.RED);
		categoriesButton.setBounds(511, 0, 577, 42);
		choicePanel.add(categoriesButton);
		
		categoriesPanel.setBounds(0, 95, 1088, 550);
		contentPane.add(categoriesPanel);
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
	public JButton getCategoriesButton() {
		return categoriesButton;
	}
	
	public void showCategories() {
		
		categoriesPanel.setVisible(true);
		homePanel.setVisible(false);
		homeButton.setForeground(Color.WHITE);
		categoriesButton.setForeground(Color.PINK);
		
	}
	
	public void showHome() {
		categoriesPanel.setVisible(false);
		homePanel.setVisible(true);
		homeButton.setForeground(Color.PINK);
		categoriesButton.setForeground(Color.WHITE);
	}
}
	
