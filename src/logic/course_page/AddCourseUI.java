package logic.course_page;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;

public class AddCourseUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCourseName;
	private JTextField textFieldPriceLesson;
	private JTextField textFieldPriceMonthly;
	private JTextField textFieldImg;
	
	private JButton addCourseButton = new JButton("add course");

	public AddCourseUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 293);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton addCourseButton = new JButton("add course");
		addCourseButton.setBackground(new Color(255, 0, 0));
		addCourseButton.setBounds(136, 211, 114, 35);
		contentPane.add(addCourseButton);
		
		JLabel nameLabel = new JLabel("Course Name");
		nameLabel.setBounds(10, 22, 90, 25);
		contentPane.add(nameLabel);
		
		JLabel priceForLessonLabel = new JLabel("Price for Lesson");
		priceForLessonLabel.setBounds(10, 57, 90, 25);
		contentPane.add(priceForLessonLabel);
		
		textFieldCourseName = new JTextField();
		textFieldCourseName.setBounds(136, 22, 204, 25);
		contentPane.add(textFieldCourseName);
		textFieldCourseName.setColumns(10);
		
		textFieldPriceLesson = new JTextField();
		textFieldPriceLesson.setColumns(10);
		textFieldPriceLesson.setBounds(136, 57, 204, 25);
		contentPane.add(textFieldPriceLesson);
		
		textFieldPriceMonthly = new JTextField();
		textFieldPriceMonthly.setColumns(10);
		textFieldPriceMonthly.setBounds(136, 92, 204, 25);
		contentPane.add(textFieldPriceMonthly);
		
		JLabel lblNewLabel = new JLabel("Price Monthly");
		lblNewLabel.setBounds(10, 98, 74, 19);
		contentPane.add(lblNewLabel);
		
		JLabel imgLabel = new JLabel("img file path:");
		imgLabel.setBounds(10, 127, 90, 22);
		contentPane.add(imgLabel);
		
		textFieldImg = new JTextField();
		textFieldImg.setBounds(136, 127, 204, 25);
		contentPane.add(textFieldImg);
		textFieldImg.setColumns(10);
	}
	
	public JButton getAddCourseButton() {
		return addCourseButton;
	}
	
	public String getName() {
		return textFieldCourseName.getText();
	}
	
	public Double getPriceForLesson() {
		return Double.parseDouble(textFieldPriceLesson.getText());
	}
	
	public Double getPriceMonthly() {
		return Double.parseDouble(textFieldPriceMonthly.getText());
	}
	
	
}
