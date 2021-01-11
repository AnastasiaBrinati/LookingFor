package logic.view.desktop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.FlowLayout;

public class OrganizationProfileUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//private ArrayList<JButton> coursesFrames;
	 
	private JPanel headerPanel = new JPanel();
	private JButton homeButton = new JButton("\u2302");
	private final JButton exitButton = new JButton("\u2398");
	private final JPanel lateralPanel = new JPanel();
	private JButton backButton = new JButton("<-");
	private JButton coursesButton = new JButton("Courses");
	private JButton eventsButton = new JButton("Events");
	private JButton courtsButton = new JButton("Courts");
	private JButton settingsButton = new JButton("\u2630");

	
	private final JPanel descriptionPanel = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("Description");
	private final JTextField descriptionTextfield = new JTextField();
	
	//courses
	private JPanel coursesPanel = new JPanel();
	private JPanel upperPanel = new JPanel();
	private JButton addButtonCourse = new JButton("+");
	private JPanel lowerPanel = new JPanel();
	private final JLabel courseslbl = new JLabel("Courses");

	
	//events
	private final JPanel eventsPanel = new JPanel();
	private JPanel upperPanel2 = new JPanel();
	private JButton addButtonEvent = new JButton("+");
	private JPanel lowerPanel2 = new JPanel();
	private JPanel newEventPanel = new JPanel();
	
	//courts
	private final JPanel courtsPanel = new JPanel();
	private final JPanel lowerPanel3 = new JPanel();
	private final JPanel upperPanel3 = new JPanel();
	private final JLabel lblCourts = new JLabel("Courts");
	private final JButton addButtonCourt = new JButton("+");
	
	//new event panel
	private final JTextField eventNameTextField = new JTextField();
	private final JTextField eventDateTextField = new JTextField();
	private final JTextField eventSportTextField = new JTextField();
	private final JTextField eventDescriptionTextField = new JTextField();
	private final JTextField eventPriceTextField = new JTextField();
	private final JTextField eventAvailabilityTextField = new JTextField();
	private final JLabel lblNewLabel_2 = new JLabel("Name");
	private final JLabel lblNewLabel_2_1 = new JLabel("Date");
	private final JLabel lblNewLabel_2_2 = new JLabel("Sport");
	private final JLabel lblNewLabel_2_3 = new JLabel("Description");
	private final JLabel lblNewLabel_2_4 = new JLabel("Price");
	private final JLabel lblNewLabel_2_5 = new JLabel("Availability");
	private final JButton saveEventButton = new JButton("Save");
	private final JLabel lblNewLabel_3 = new JLabel("Enter new event infos:");
	private final JButton cancelEventButton = new JButton("Cancel");
	
	
	private JTextField textField;
	private static JTextField titleTextField;
	private JLabel organizationNameLbl = new JLabel("");
	
	//new course panel
	private JPanel newCoursePanel = new JPanel();
	private static JTextArea descriptionTextArea = new JTextArea();
	private final JButton saveCourseButton = new JButton("SAVE");
	private JButton cancelCourseButton = new JButton("cancel");
	private final JLabel priceForLessonlbl = new JLabel("price for 1 lesson:");
	private final JLabel monthlyPricelbl = new JLabel("monthly price:");
	private final static JTextField priceForLessonTextField = new JTextField();
	private final static JTextField monthlyPriceTextField = new JTextField();
	private static JTextField sportTextField;
	private static JTextField instructorNameTextField;
	private static JTextField availabilityTextField;
	
	//new court panel
	private final JPanel newCourtPanel = new JPanel();
	private JTextField courtSportTextField;
	private JTextField courtDescriptionTextField;
	private JTextField courtNameTextField;
	private JTextField courtPriceTextField;
	private JTextField courtAvailabilityTextField;
	private JButton cancelCourtButton = new JButton("Cancel");
	private JButton saveCourtButton = new JButton("Save");



	public OrganizationProfileUI() {

		setTitle("Sportee");
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1254, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		descriptionTextfield.setBackground(new Color(220, 220, 220));
		descriptionTextfield.setBounds(10, 66, 798, 119);
		descriptionTextfield.setColumns(10);
		descriptionPanel.setBounds(268, 145, 972, 568);
		
		contentPane.add(descriptionPanel);
		descriptionPanel.setLayout(null);
		lblNewLabel_1.setBounds(10, 41, 86, 14);
		
		descriptionPanel.add(lblNewLabel_1);				
		descriptionPanel.add(descriptionTextfield);
		
		//courts
		courtsPanel.setBounds(268, 145, 972, 568);
		contentPane.add(courtsPanel);
		courtsPanel.setLayout(null);
		newCourtPanel.setBackground(Color.GRAY);
		newCourtPanel.setBounds(0, 0, 972, 572);
		courtsPanel.add(newCourtPanel);
		newCourtPanel.setLayout(null);
		
		courtSportTextField = new JTextField();
		courtSportTextField.setColumns(10);
		courtSportTextField.setBounds(208, 133, 246, 20);
		newCourtPanel.add(courtSportTextField);
		
		JLabel courtNameLabel = new JLabel("Name");
		courtNameLabel.setForeground(Color.WHITE);
		courtNameLabel.setBounds(152, 92, 46, 14);
		newCourtPanel.add(courtNameLabel);
		
		JLabel courtSportLabel = new JLabel("Sport");
		courtSportLabel.setForeground(Color.WHITE);
		courtSportLabel.setBounds(152, 136, 46, 14);
		newCourtPanel.add(courtSportLabel);
		
		courtDescriptionTextField = new JTextField();
		courtDescriptionTextField.setColumns(10);
		courtDescriptionTextField.setBounds(208, 189, 246, 103);
		newCourtPanel.add(courtDescriptionTextField);
		
		JLabel courtDescriptionLabel = new JLabel("Description");
		courtDescriptionLabel.setForeground(Color.WHITE);
		courtDescriptionLabel.setBounds(129, 189, 69, 14);
		newCourtPanel.add(courtDescriptionLabel);
		
		courtNameTextField = new JTextField();
		courtNameTextField.setColumns(10);
		courtNameTextField.setBounds(208, 90, 246, 20);
		newCourtPanel.add(courtNameTextField);
		
		courtPriceTextField = new JTextField();
		courtPriceTextField.setColumns(10);
		courtPriceTextField.setBounds(208, 331, 246, 20);
		newCourtPanel.add(courtPriceTextField);
		
		JLabel priceLabel = new JLabel("Price");
		priceLabel.setForeground(Color.WHITE);
		priceLabel.setBounds(152, 334, 46, 14);
		newCourtPanel.add(priceLabel);
		
		courtAvailabilityTextField = new JTextField();
		courtAvailabilityTextField.setColumns(10);
		courtAvailabilityTextField.setBounds(208, 384, 246, 20);
		newCourtPanel.add(courtAvailabilityTextField);
		
		JLabel courtAvailabilityLabel = new JLabel("Availability");
		courtAvailabilityLabel.setForeground(Color.WHITE);
		courtAvailabilityLabel.setBounds(129, 387, 69, 14);
		newCourtPanel.add(courtAvailabilityLabel);
		
		cancelCourtButton.setForeground(Color.WHITE);
		cancelCourtButton.setBackground(Color.DARK_GRAY);
		cancelCourtButton.setBounds(265, 496, 89, 23);
		newCourtPanel.add(cancelCourtButton);
		
		saveCourtButton.setForeground(Color.WHITE);
		saveCourtButton.setBackground(Color.RED);
		saveCourtButton.setBounds(364, 497, 89, 23);
		newCourtPanel.add(saveCourtButton);
		lowerPanel3.setBounds(0, 134, 972, 434);
		
		courtsPanel.add(lowerPanel3);
		upperPanel3.setBounds(0, 0, 972, 134);
		
		courtsPanel.add(upperPanel3);
		upperPanel3.setLayout(null);
		lblCourts.setBounds(10, 10, 55, 22);
		lblCourts.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		upperPanel3.add(lblCourts);
		addButtonCourt.setBackground(Color.PINK);
		addButtonCourt.setBounds(10, 57, 98, 48);
		
		upperPanel3.add(addButtonCourt);
		settingsButton.setContentAreaFilled(false);
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Cambria Math", Font.PLAIN, 50));
	
		exitButton.setBounds(1171, 0, 65, 70);
		exitButton.setIcon(null);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorder(null);
	    
		exitButton.setIcon(new ImageIcon(""));
		exitButton.setContentAreaFilled(false);
		exitButton.setBorder(null);
		
		headerPanel.setBounds(0, 0, 1400, 54);
		headerPanel.setBackground(new Color(255, 0, 0));
		headerPanel.setForeground(new Color(255, 165, 0));
		homeButton.setFont(new Font("Arial Black", Font.PLAIN, 60));
		homeButton.setForeground(Color.WHITE);
		homeButton.setBounds(304, -11, 55, 65);
		homeButton.setIcon(new ImageIcon(""));
		homeButton.setBorder(null);
		homeButton.setContentAreaFilled(false);
		headerPanel.setLayout(null);
		headerPanel.add(homeButton);
		headerPanel.add(exitButton);
		headerPanel.add(exitButton);
		contentPane.add(headerPanel);
		
		textField = new JTextField();
		textField.setBounds(369, 12, 364, 30);
		headerPanel.add(textField);
		textField.setColumns(10);
		settingsButton.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 50));
		
		settingsButton.setBackground(UIManager.getColor("Button.background"));
		settingsButton.setForeground(Color.WHITE);
		settingsButton.setBounds(0, 0, 77, 54);
		headerPanel.add(settingsButton);
		lateralPanel.setBounds(0, 53, 269, 660);
		lateralPanel.setBackground(new Color(204, 0, 0));
		
		contentPane.add(lateralPanel);
		lateralPanel.setLayout(null);
										
		JLabel lblNewLabel = new JLabel("Sportee");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 35));
		lblNewLabel.setBounds(0, 11, 269, 71);
		lateralPanel.add(lblNewLabel);
		coursesButton.setForeground(new Color(245, 255, 250));
		
		coursesButton.setBackground(new Color(139, 0, 0));
		coursesButton.setBounds(0, 153, 269, 59);
		lateralPanel.add(coursesButton);
		eventsButton.setForeground(new Color(245, 255, 250));
		
		eventsButton.setBackground(new Color(255, 0, 0));
		eventsButton.setBounds(0, 211, 269, 59);
		lateralPanel.add(eventsButton);
		courtsButton.setForeground(new Color(245, 255, 250));
										
		courtsButton.setBackground(new Color(255, 0, 0));
		courtsButton.setBounds(0, 267, 269, 59);
		lateralPanel.add(courtsButton);
		backButton.setForeground(Color.WHITE);
		
		backButton.setFont(new Font("Arial Black", Font.BOLD, 10));
		backButton.setBackground(Color.RED);
		backButton.setBounds(10, 103, 69, 37);
		lateralPanel.add(backButton);
		
		//profile header
		JPanel subtitlePanel = new JPanel();
		subtitlePanel.setBackground(new Color(192, 192, 192));
		subtitlePanel.setBounds(268, 53, 972, 92);
		contentPane.add(subtitlePanel);
		subtitlePanel.setLayout(null);
										
		JLabel orgLocationLbl = new JLabel("Location");
		orgLocationLbl.setBounds(104, 62, 73, 14);
		subtitlePanel.add(orgLocationLbl);
									
		organizationNameLbl.setBounds(104, 26, 179, 25);
		organizationNameLbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		subtitlePanel.add(organizationNameLbl);
										
		JLabel organizationImageLbl = new JLabel("");
		organizationImageLbl.setHorizontalAlignment(SwingConstants.CENTER);
		organizationImageLbl.setIcon(new ImageIcon(""));
		organizationImageLbl.setBounds(10, 11, 73, 71);
		subtitlePanel.add(organizationImageLbl);
		eventNameTextField.setBounds(207, 89, 246, 20);
		eventNameTextField.setColumns(10);
		
		//events
		eventsPanel.setBounds(268, 145, 972, 568);
		contentPane.add(eventsPanel);
		eventsPanel.setLayout(null);
		newEventPanel.setBackground(Color.GRAY);
		
			newEventPanel.setBounds(0, 0, 972, 568);
			eventsPanel.add(newEventPanel);
			newEventPanel.setLayout(null);
			
			newEventPanel.add(eventNameTextField);
			eventDateTextField.setColumns(10);
			eventDateTextField.setBounds(207, 138, 246, 20);
			
			newEventPanel.add(eventDateTextField);
			eventSportTextField.setColumns(10);
			eventSportTextField.setBounds(207, 188, 246, 20);
			
			newEventPanel.add(eventSportTextField);
			eventDescriptionTextField.setColumns(10);
			eventDescriptionTextField.setBounds(207, 238, 246, 103);
			
			newEventPanel.add(eventDescriptionTextField);
			eventPriceTextField.setColumns(10);
			eventPriceTextField.setBounds(207, 375, 246, 20);
			
			newEventPanel.add(eventPriceTextField);
			eventAvailabilityTextField.setColumns(10);
			eventAvailabilityTextField.setBounds(207, 425, 246, 20);
			
			newEventPanel.add(eventAvailabilityTextField);
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBounds(151, 92, 46, 14);
			
			newEventPanel.add(lblNewLabel_2);
			lblNewLabel_2_1.setForeground(Color.WHITE);
			lblNewLabel_2_1.setBounds(151, 141, 46, 14);
			
			newEventPanel.add(lblNewLabel_2_1);
			lblNewLabel_2_2.setForeground(Color.WHITE);
			lblNewLabel_2_2.setBounds(151, 191, 46, 14);
			
			newEventPanel.add(lblNewLabel_2_2);
			lblNewLabel_2_3.setForeground(Color.WHITE);
			lblNewLabel_2_3.setBounds(128, 238, 69, 14);
			
			newEventPanel.add(lblNewLabel_2_3);
			lblNewLabel_2_4.setForeground(Color.WHITE);
			lblNewLabel_2_4.setBounds(151, 378, 46, 14);
			
			newEventPanel.add(lblNewLabel_2_4);
			lblNewLabel_2_5.setForeground(Color.WHITE);
			lblNewLabel_2_5.setBounds(128, 428, 69, 14);
			
			newEventPanel.add(lblNewLabel_2_5);
			saveEventButton.setForeground(Color.WHITE);
			saveEventButton.setBackground(Color.RED);
			saveEventButton.setBounds(362, 496, 89, 23);
			
			newEventPanel.add(saveEventButton);
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_3.setBounds(10, 44, 228, 14);
			
			newEventPanel.add(lblNewLabel_3);
			cancelEventButton.setForeground(Color.WHITE);
			cancelEventButton.setBackground(Color.DARK_GRAY);
			cancelEventButton.setBounds(263, 496, 89, 23);
			
			newEventPanel.add(cancelEventButton);
			
			upperPanel2.setBounds(0, 0, 972, 134);
			eventsPanel.add(upperPanel2);
			upperPanel2.setLayout(null);
			
			JLabel eventsTitlelbl = new JLabel("Events");
			eventsTitlelbl.setBounds(10, 10, 58, 22);
			eventsTitlelbl.setFont(new Font("Arial Black", Font.PLAIN, 15));
			upperPanel2.add(eventsTitlelbl);
			
			addButtonEvent.setBackground(Color.PINK);
			addButtonEvent.setBounds(10, 51, 98, 48);
			upperPanel2.add(addButtonEvent);
			
			lowerPanel2.setBounds(0, 135, 972, 433);
			eventsPanel.add(lowerPanel2);
			
			//courses
			coursesPanel.setBounds(268, 145, 972, 568);
			coursesPanel.setLayout(null);
			
			
			newCoursePanel.setBackground(new Color(211, 211, 211));
			newCoursePanel.setBounds(0, 0, 972, 568);
			coursesPanel.add(newCoursePanel);
			newCoursePanel.setLayout(null);		
			cancelCourseButton.setBounds(52, 498, 162, 40);
			newCoursePanel.add(cancelCourseButton);		
			saveCourseButton.setBackground(new Color(255, 99, 71));
			saveCourseButton.setBounds(247, 498, 162, 40);
			newCoursePanel.add(saveCourseButton);
			
			
			JLabel titleLable = new JLabel("Insert Title:");
			titleLable.setFont(new Font("Tahoma", Font.PLAIN, 20));
			titleLable.setBounds(10, 23, 114, 23);
			newCoursePanel.add(titleLable);
			
			titleTextField = new JTextField();
			titleTextField.setBounds(143, 23, 266, 24);
			newCoursePanel.add(titleTextField);
			titleTextField.setColumns(10);
			
			JLabel descriptionlbl = new JLabel("Description:");
			descriptionlbl.setFont(new Font("Arial", Font.PLAIN, 20));
			descriptionlbl.setBounds(10, 74, 114, 23);
			newCoursePanel.add(descriptionlbl);
			
			JLabel imgLabel = new JLabel("Insert Image:");
			imgLabel.setFont(new Font("Arial", Font.PLAIN, 20));
			imgLabel.setBounds(573, 23, 140, 23);
			newCoursePanel.add(imgLabel);
			
			//JTextArea descriptionTextArea = new JTextArea();
			descriptionTextArea.setBounds(143, 76, 266, 112);
			newCoursePanel.add(descriptionTextArea);
			priceForLessonlbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
			priceForLessonlbl.setBounds(10, 277, 170, 23);
			
			newCoursePanel.add(priceForLessonlbl);
			monthlyPricelbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
			monthlyPricelbl.setBounds(10, 310, 162, 23);
			
			newCoursePanel.add(monthlyPricelbl);
			priceForLessonTextField.setColumns(10);
			priceForLessonTextField.setBounds(190, 277, 219, 23);
			
			newCoursePanel.add(priceForLessonTextField);
			monthlyPriceTextField.setColumns(10);
			monthlyPriceTextField.setBounds(190, 313, 219, 23);
			
			newCoursePanel.add(monthlyPriceTextField);
			
			JLabel lblNewLabel_5 = new JLabel("Sport:");
			lblNewLabel_5.setBounds(10, 350, 46, 14);
			newCoursePanel.add(lblNewLabel_5);
			
			sportTextField = new JTextField();
			sportTextField.setColumns(10);
			sportTextField.setBounds(190, 347, 219, 23);
			newCoursePanel.add(sportTextField);
			
			instructorNameTextField = new JTextField();
			instructorNameTextField.setColumns(10);
			instructorNameTextField.setBounds(190, 381, 219, 23);
			newCoursePanel.add(instructorNameTextField);
			
			availabilityTextField = new JTextField();
			availabilityTextField.setColumns(10);
			availabilityTextField.setBounds(190, 415, 219, 23);
			newCoursePanel.add(availabilityTextField);
			
			JLabel instructorNameLbl = new JLabel("Instructor Name:");
			instructorNameLbl.setBounds(10, 385, 170, 14);
			newCoursePanel.add(instructorNameLbl);
			
			JLabel availabilityLbl = new JLabel("Availability:");
			availabilityLbl.setBounds(10, 419, 114, 14);
			newCoursePanel.add(availabilityLbl);
			upperPanel.setBounds(0, 0, 972, 134);
			coursesPanel.add(upperPanel);
			upperPanel.setLayout(null);
			addButtonCourse.setBackground(Color.PINK);
			addButtonCourse.setBounds(10, 48, 98, 48);
			upperPanel.add(addButtonCourse);
			courseslbl.setFont(new Font("Arial Black", Font.PLAIN, 15));
			courseslbl.setBounds(10, 25, 96, 13);
			
			upperPanel.add(courseslbl);
			
			lowerPanel.setBounds(0, 136, 972, 432);
			coursesPanel.add(lowerPanel);
			lowerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			contentPane.add(coursesPanel);
		
		//Image img3=new ImageIcon(this.getClass().getResource("/046-hierarchy.png")).getImage();
		//coursesButton.setIcon(new ImageIcon(img3));
		//coursesButton.setContentAreaFilled(true);
		
		//Image img4=new ImageIcon(this.getClass().getResource("/034-flag.png")).getImage();
		//eventsButton.setIcon(new ImageIcon(img4));
		//eventsButton.setContentAreaFilled(true);
		
		//Image img5=new ImageIcon(this.getClass().getResource("/015-idea.png")).getImage();
		//courtsButton.setIcon(new ImageIcon(img5));
		//courtsButton.setContentAreaFilled(true);
		
		//Image img6=new ImageIcon(this.getClass().getResource("/002-settings.png")).getImage();
		//settingsButton.setIcon(new ImageIcon(img6));
		//settingsButton.setContentAreaFilled(false);
		
		//Image img7=new ImageIcon(this.getClass().getResource("/016-trash bin.png")).getImage();
		//exitButton.setIcon(new ImageIcon(img7));
		//exitButton.setContentAreaFilled(false);
		
	}
	
	public void doubleCourseErrorMessage(String error){
		resetNewCourseForm();
		titleTextField.setText(error);
		
	}
	public void doubleEventErrorMessage(String error){
		//resetNewEventForm();
		eventNameTextField.setText(error);
		
	}
	public void doubleCourtErrorMessage(String error){
		//resetNewCourtForm();
		courtNameTextField.setText(error);
		
	}

	
	public JButton createCourseFrame(String name) {

        JButton frame = new JButton(name);

        
        frame.setBorder(new LineBorder(Color.BLACK));
        frame.setPreferredSize(new Dimension(100, 100));
        frame.setVisible(true);
        lowerPanel.add(frame);
        lowerPanel.setVisible(true);
        lowerPanel.revalidate();
        lowerPanel.repaint();
        coursesPanel.repaint();
        
        return frame;
        
    }

	public JButton createEventFrame(String name) {

        JButton frame = new JButton(name);
        
        frame.setBorder(new LineBorder(Color.BLACK));
        frame.setPreferredSize(new Dimension(100, 100));
        frame.setVisible(true);
        lowerPanel2.add(frame);
        lowerPanel2.setVisible(true);
        lowerPanel2.revalidate();
        lowerPanel2.repaint();
        eventsPanel.repaint();
        
        return frame;
        
    }
	
	public JButton createCourtFrame(String name) {

        JButton frame = new JButton(name);
        frame.setBorder(new LineBorder(Color.BLACK));
        frame.setPreferredSize(new Dimension(100, 100));
        frame.setVisible(true);
        lowerPanel3.add(frame);
        lowerPanel3.setVisible(true);
        lowerPanel3.revalidate();
        lowerPanel3.repaint();
        courtsPanel.repaint();
        
        return frame;
        
    }
	

	
	public void setDescriptionPanelVisible() {
		backButton.setVisible(false);
		descriptionPanel.setVisible(true);
		coursesPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(false);
		newCoursePanel.setVisible(false);
	}

	public void setCoursesPanelVisible() {
		backButton.setVisible(true);
		
		coursesPanel.setVisible(true);
		upperPanel.setVisible(true);
		lowerPanel.setVisible(true);
		newCoursePanel.setVisible(false);
		
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(false);
		eventsPanel.setVisible(false);
		
		coursesButton.setBackground(new Color(139, 0, 0));
		eventsButton.setBackground(Color.RED);
		courtsButton.setBackground(Color.RED);	
	}
	
	public void setEventsPanelVisible() {
		
		backButton.setVisible(true);
		
		eventsPanel.setVisible(true);
		upperPanel2.setVisible(true);
		lowerPanel2.setVisible(true);
		newEventPanel.setVisible(false);

		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		courtsPanel.setVisible(false);
		
		
		coursesButton.setBackground(Color.RED);
		eventsButton.setBackground(new Color(139, 0, 0));
		courtsButton.setBackground(Color.RED);
	}
	
	public void setCourtsPanelVisible() {
		
		backButton.setVisible(true);
		
		courtsPanel.setVisible(true);
		upperPanel3.setVisible(true);
		lowerPanel3.setVisible(true);
		newCourtPanel.setVisible(false);
		
		coursesPanel.setVisible(false);
		descriptionPanel.setVisible(false);
		eventsPanel.setVisible(false);
		
		coursesButton.setBackground(Color.RED);
		eventsButton.setBackground(Color.RED);
		courtsButton.setBackground(new Color(139, 0, 0));
	}
	

	public void showNewCoursePanel() {
		
		resetNewCourseForm();
		
		backButton.setVisible(true);
		coursesPanel.setVisible(true);
		upperPanel.setVisible(false);
		lowerPanel.setVisible(false);
		newCoursePanel.setVisible(true);
		
	}
	
	public void showNewEventPanel() {
		
		//resetNewEventForm();
		
		backButton.setVisible(true);
		eventsPanel.setVisible(true);
		upperPanel2.setVisible(false);
		lowerPanel2.setVisible(false);
		newEventPanel.setVisible(true);
		
	}
	
	public void showNewCourtPanel() {
		
		//resetNewCourtForm();
		
		backButton.setVisible(true);
		courtsPanel.setVisible(true);
		upperPanel3.setVisible(false);
		lowerPanel3.setVisible(false);
		newCourtPanel.setVisible(true);
		
	}
	
	
	
	public void resetNewCourseForm() {
		titleTextField.setText("");
		descriptionTextArea.setText("");
		
		priceForLessonTextField.setText("");
		monthlyPriceTextField.setText("");
		sportTextField.setText("");
		instructorNameTextField.setText("");
		availabilityTextField.setText("");
		
	}
	public void resetNewEventForm() {
		eventNameTextField.setText("");
		eventSportTextField.setText("");
		eventDateTextField.setText("");
		eventDescriptionTextField.setText("");
		eventPriceTextField.setText("");
		eventAvailabilityTextField.setText("");
		
	}
	
	public void resetNewCourtForm() {
		courtNameTextField.setText("");
		courtSportTextField.setText("");
		courtDescriptionTextField.setText("");
		courtPriceTextField.setText("");
		courtAvailabilityTextField.setText("");
		
	}
	
	
	
	public void setCredentials(String name, String location) {
		organizationNameLbl.setText(name);
		//set img
	}
	
	public JButton getProfileButton() {
			return exitButton;
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
	public JButton getAddCourseButton() {
		return addButtonCourse;
	}
	
	public JButton getAddEventButton() {
		return addButtonEvent;
	}
	
	public JButton getAddCourtButton() {
		return addButtonCourt;
	}
	
	public JButton getSaveCourseButton() {
		return saveCourseButton;
	}
	public JButton getCancelCourseButton() {
		return cancelCourseButton;
	}
	
	public JButton getSaveEventButton() {
		return saveEventButton;
	}
	public JButton getCancelEventButton() {
		return cancelEventButton;
	}
	
	public JButton getSaveCourtButton() {
		return saveCourtButton;
	}
	public JButton getCancelCourtButton() {
		return cancelCourtButton;
	}
	
	public JButton getExitButton() {
		return exitButton;
	}
	
	public JButton getSettingButton() {
		return settingsButton;
	}
	
	public JButton getBackButton() {
		return backButton;
	}
	
	

		//course
		public String getName() {
			return titleTextField.getText();
		}
		public String getMonthlyPrice() {
			return monthlyPriceTextField.getText();
		}
		public String getPriceForLesson() {
			return priceForLessonTextField.getText();
		}
		public String getDescription() {
			return descriptionTextArea.getText();
		}
		public String getSport() {
			return sportTextField.getText();
		}
		public String getInstructorName() {
			return instructorNameTextField.getText();
		}
		
		//event
		public String getEventName() {
			return eventNameTextField.getText();
		}
		
		public String getEventDate() {
			return eventDateTextField.getText();	
		}
		public String getEventDescription() {
			return eventDescriptionTextField.getText();
		}
		public String getEventPrice() {
			return eventPriceTextField.getText();
		}
		public String getEventAvailability() {
			return eventAvailabilityTextField.getText();
		}
		public String getEventSport() {
			return eventSportTextField.getText();
		}
		
		//court
		public String getCourtName() {
			return courtNameTextField.getText();
		}
		public String getCourtDescription() {
			return courtDescriptionTextField.getText();
		}
		public String getCourtPrice() {
			return courtPriceTextField.getText();
		}
		public String getCourtAvailability() {
			return courtAvailabilityTextField.getText();
		}
		public String getCourtSport() {
			return courtSportTextField.getText();
		}
		public JPanel getCoursesPanel() {
			return coursesPanel;
		}
		
}