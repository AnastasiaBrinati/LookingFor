package logic.view.desktop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComponent;

import logic.model.Sport;

import java.awt.event.ActionListener;
import java.util.ArrayList;
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

import java.awt.Panel;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JList;
import java.awt.Choice;

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
	private JTextField textField;
	private JPanel lateralPanel = new JPanel();
	private final JLabel citylbl = new JLabel("City");
	//private DefaultListModel dm=new DefaultListModel();
	private final Choice sportChoice = new Choice();

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

		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
		exitButton.setForeground(Color.WHITE);
		
		exitButton.setBounds(1014, -2, 74, 72);
		headerPanel.add(exitButton);
		settingsButton.setContentAreaFilled(false);
		profileButton.setContentAreaFilled(false);
		textField = new JTextField();
		textField.setBounds(317, 11, 342, 33);
		headerPanel.add(textField);
		textField.setColumns(10);
		lateralPanel.setBackground(Color.LIGHT_GRAY);
		exitButton.setContentAreaFilled(false);
		lateralPanel.setBounds(0, 53, 246, 592);
		contentPane.add(lateralPanel);
		lateralPanel.setLayout(null);
		citylbl.setBounds(10, 20, 45, 26);
		
		lateralPanel.add(citylbl);
		
		JList<String> cityList = new JList<String>();
		cityList.setBounds(10, 56, 226, 26);
		lateralPanel.add(cityList);
		
		JLabel sportlbl = new JLabel("Sport");
		sportlbl.setBounds(10, 92, 45, 26);
		lateralPanel.add(sportlbl);
		
		JList<String> courseEventCourtlbl = new JList<String>();
		courseEventCourtlbl.setBounds(10, 200, 226, 26);
		lateralPanel.add(courseEventCourtlbl);
		
		JButton filtersButton = new JButton("apply filters");
		filtersButton.setBackground(Color.PINK);
		filtersButton.setBounds(22, 262, 198, 36);
		lateralPanel.add(filtersButton);
		sportChoice.setBounds(10, 135, 226, 18);
		
		lateralPanel.add(sportChoice);
		
	}
	
	public void setSportList(ArrayList<String> sports) {
		for(String sport: sports) {
			sportChoice.add(sport);
		}
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
}