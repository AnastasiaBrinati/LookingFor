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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import java.awt.ScrollPane;
import java.awt.Panel;

public class HomeUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton settingsButton = new JButton("");
	private JPanel headerPanel = new JPanel();
	private final JButton profileButton = new JButton("");
	private final JPanel panel = new JPanel();

	public HomeUI() {

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
		profileButton.setBounds(1046, 0, 38, 42);
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		
			

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
				LineBorder lineBorder=new LineBorder(Color.white,8,true);
	}

	public JButton getProfileButton() {
		return profileButton;
	}	
	
}
	
