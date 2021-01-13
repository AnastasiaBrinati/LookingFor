package logic.view.desktop;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.util.ArrayList;
import java.awt.Font;

import java.awt.SystemColor;
import javax.swing.JList;
import java.awt.Choice;

public class HomeUISUs extends JFrame {

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

	private final Choice sportChoice = new Choice();
	private JButton filtersButton = new JButton("apply filters");
	private Choice courseEventCourt = new Choice();
	private JScrollPane panelHome = new JScrollPane();
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int space=20;
	

	public HomeUISUs() {

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
		lateralPanel.setBackground(new Color(204, 0, 0));
		exitButton.setContentAreaFilled(false);
		lateralPanel.setBounds(0, 53, 246, 592);
		contentPane.add(lateralPanel);
		lateralPanel.setLayout(null);
		citylbl.setForeground(Color.WHITE);
		citylbl.setBounds(10, 29, 45, 26);
		
		lateralPanel.add(citylbl);
		
		JList<String> cityList = new JList<String>();
		cityList.setBounds(10, 56, 226, 26);
		lateralPanel.add(cityList);
		
		JLabel sportlbl = new JLabel("Sport");
		sportlbl.setForeground(Color.WHITE);
		sportlbl.setBounds(10, 103, 45, 26);
		lateralPanel.add(sportlbl);


		courseEventCourt.add("COURSE");
		courseEventCourt.add("COURT");
		courseEventCourt.add("EVENT");
		courseEventCourt.setBounds(10, 200, 226, 26);
		lateralPanel.add(courseEventCourt);
		
		filtersButton.setForeground(Color.WHITE);
		filtersButton.setBackground(Color.GRAY);
		filtersButton.setBounds(22, 262, 198, 36);
		lateralPanel.add(filtersButton);
		sportChoice.setBounds(10, 135, 226, 18);
		
		lateralPanel.add(sportChoice);
		
		panelHome.setBounds(247, 53, 841, 592);
		contentPane.add(panelHome);

		
		
	}

	public void cleanHome(){
		
		panelHome.removeAll();
		panelHome.setVisible(true);
        panelHome.revalidate();
        panelHome.repaint();
        
        x=0;
        y=0;
        height=0;
        width=0;
		
	}
	
	public JButton displayElement(String name, String org, int i, int j) {
		
		  x=10;
	      y=10;
	      width=260;
	      height=270;
	      
			
		
		JPanel elementPanel = new JPanel();
		elementPanel.setBounds((x+j*(width+space)), (y+i*(height+space)), width, height);
		panelHome.add(elementPanel);
		elementPanel.setLayout(null);
		elementPanel.setBackground(Color.PINK);
		
		JLabel imgLbl = new JLabel("                  img");
		imgLbl.setBounds(0, 0, 212, 134);
		elementPanel.add(imgLbl);
		
		JLabel nameLbl = new JLabel(name);
		nameLbl.setFont(new Font("Arial Black", Font.PLAIN, 15));
		nameLbl.setBounds(10, 144, 84, 13);
		elementPanel.add(nameLbl);
		
		JLabel orgLbl = new JLabel(org);
		orgLbl.setFont(new Font("Arial", Font.PLAIN, 13));
		orgLbl.setBounds(10, 167, 99, 13);
		elementPanel.add(orgLbl);
		
		JButton detailsButton = new JButton("view details");
		detailsButton.setBackground(Color.GRAY);
		detailsButton.setForeground(Color.BLACK);
		detailsButton.setBounds(70, 205, 103, 21);
		elementPanel.add(detailsButton);
		
		panelHome.setVisible(true);
        panelHome.revalidate();
        panelHome.repaint();
        
        return detailsButton;
     
	}
	
	public void setSportList(ArrayList<String> sports) {
		for(String sport: sports) {
			sportChoice.add(sport);
		}
	}
	
	public String getSport() {
		return sportChoice.getSelectedItem();
	}
	
	public String getItemType() {
		return courseEventCourt.getSelectedItem();
	}
	
		
	public JButton getFiltersButton() {
		return filtersButton;
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