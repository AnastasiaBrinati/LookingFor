package views;

import java.awt.Button;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JButton resetButton = new JButton("Reset");
	JLabel lblNewLabel = new JLabel("E-MAIL");
	JButton signUpButton = new JButton("Sign Up");

	/**
	 * Launch the application.
	 */

	// Create the frame.
	public LoginUI() {
		setTitle("SignUp");
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\giuli\\Downloads\\icons8-basketball-64.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 826, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField_0 = new JTextField();
		textField_0.setBounds(447, 281, 289, 20);
		contentPane.add(textField_0);
		textField_0.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBackground(Color.GRAY);
		separator.setBounds(447, 253, 289, 2);
		contentPane.add(separator);

		lblNewLabel.setBounds(447, 208, 46, 14);
		lblNewLabel.setForeground(Color.WHITE);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(447, 222, 289, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);

		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(447, 266, 92, 14);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel_1);

		Button button_1 = new Button("Login");
		button_1.setBounds(565, 480, 70, 22);
		button_1.setForeground(Color.WHITE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBackground(Color.GRAY);
		contentPane.add(button_1);

		textField_2 = new JTextField();
		textField_2.setBounds(447, 48, 289, 20);
		textField_2.setColumns(10);
		contentPane.add(textField_2);

		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setBounds(447, 149, 118, 14);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBackground(Color.WHITE);
		contentPane.add(lblUsername);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.GRAY);
		separator_1.setBounds(447, 195, 289, 2);
		contentPane.add(separator_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(447, 107, 289, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(447, 164, 289, 20);
		contentPane.add(textField_4);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(Color.GRAY);
		separator_1_1.setBounds(447, 136, 289, 2);
		contentPane.add(separator_1_1);

		JLabel lblSurname = new JLabel("SURNAME");
		lblSurname.setForeground(Color.WHITE);
		lblSurname.setBackground(Color.WHITE);
		lblSurname.setBounds(447, 92, 118, 14);
		contentPane.add(lblSurname);

		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBackground(Color.GRAY);
		separator_1_1_1.setBounds(447, 79, 289, 2);
		contentPane.add(separator_1_1_1);

		JLabel lblSurname_1 = new JLabel("NAME");
		lblSurname_1.setForeground(Color.WHITE);
		lblSurname_1.setBackground(Color.WHITE);
		lblSurname_1.setBounds(447, 34, 118, 14);
		contentPane.add(lblSurname_1);

		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.GRAY);
		separator_2.setBounds(406, 363, 362, -9);
		contentPane.add(separator_2);

		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.GRAY);
		separator_3.setBounds(457, 322, 289, 2);
		contentPane.add(separator_3);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 382, 512);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(-80, -12, 512, 537);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Pictures\\Wallpapers\\Sports-Wallpapers-and-Backgrounds-HD-by-Pocket-Books.jpg"));

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\Facebook_logo_(square) (1).png"));
		btnNewButton_1.setBounds(552, 416, 40, 40);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(
				"C:\\Users\\giuli\\Downloads\\219-2197783_training-documents-google-logo-icon-png (1).png"));
		btnNewButton_2.setBounds(602, 416, 40, 40);
		contentPane.add(btnNewButton_2);

		JLabel lblNewLabel_2 = new JLabel("Or sign up with:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(552, 393, 96, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_5 = new JLabel("Or");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(589, 460, 46, 14);
		contentPane.add(lblNewLabel_5);

		resetButton.setBackground(Color.GRAY);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		resetButton.setBounds(450, 345, 89, 23);
		contentPane.add(resetButton);

		signUpButton.setBackground(Color.ORANGE);
		signUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		signUpButton.setBounds(602, 345, 89, 23);
		contentPane.add(signUpButton);
	}

	public JButton getDeleteButton() {
		return resetButton;

	}
	public JButton getSignUpButton() {
		return signUpButton;
	}
	public void resetForm() {
		textField_0.setText(" ");
		textField_1.setText(" ");
		textField_2.setText(" ");
		textField_3.setText(" ");
		textField_4.setText(" ");
	}
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

	public String getName() {
		return textField_0.getText();
	}
	public String getSurname() {
		return textField_1.getText();
	}
	public String getUsername() {
		return textField_2.getText();
	}
	public String getEmail() {
		return textField_3.getText();
	}
	public String getPassword() {
		return textField_4.getText();
	}
}
