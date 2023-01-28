package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private static LogIn frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setType(Type.UTILITY);
		setResizable(false);
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1290, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(239, 239, 239));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		loginPanel.setBounds(243, 138, 471, 417);
		contentPane.add(loginPanel);
		loginPanel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		usernameLabel.setBounds(91, 151, 125, 49);
		loginPanel.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		usernameField.setBounds(91, 194, 218, 34);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		passwordLabel.setBounds(91, 238, 163, 34);
		loginPanel.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passwordField.setBounds(91, 271, 218, 34);
		loginPanel.add(passwordField);
		
		JButton loginButton = new JButton("Log in");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(usernameField.getText().equals("student")&& Arrays.equals(passwordField.getPassword(),new char[] {'1','2','3'})) {
					StudentDashboard frameLogin = new StudentDashboard();
					frameLogin.setVisible(true);
					frame.dispose();
				}else {
					lblNewLabel.setVisible(true);
				}
//				if(usernameField.getText().equals("std")&& Arrays.equals(passwordField.getPassword(),new char[] {'s','t','d'})) {
//					StudentDashboard frame = new StudentDashboard();
//					frame.setVisible(true);
//				}if(usernameField.getText().equals("std")&& Arrays.equals(passwordField.getPassword(),new char[] {'s','t','d'})) {
//					StudentDashboard frame = new StudentDashboard();
//					frame.setVisible(true);
//				}
			}
		});
		loginButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		loginButton.setBackground(new Color(254, 179, 22));
		loginButton.setBounds(91, 345, 85, 34);
		loginPanel.add(loginButton);
		
		JLabel welcomeText = new JLabel("Welcome,");
		welcomeText.setForeground(new Color(1, 53, 111));
		welcomeText.setFont(new Font("Century Gothic", Font.BOLD, 35));
		welcomeText.setBounds(91, 21, 229, 84);
		loginPanel.add(welcomeText);
		
		JLabel SMStext = new JLabel("To               Management System");
		SMStext.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		SMStext.setBounds(91, 104, 274, 21);
		loginPanel.add(SMStext);
		
		JLabel lblNewLabel_4 = new JLabel("Course");
		lblNewLabel_4.setBackground(new Color(253, 99, 63));
		lblNewLabel_4.setForeground(new Color(253, 99, 63));
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_4.setBounds(111, 108, 57, 13);
		loginPanel.add(lblNewLabel_4);
		
		lblNewLabel = new JLabel("Incorrect Username or Password");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(91, 315, 285, 13);
		loginPanel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(254, 179, 22));
		btnNewButton.setBounds(215, 345, 94, 34);
		loginPanel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("or");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(186, 356, 45, 13);
		loginPanel.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Admin", "Instructor", "Student"}));
		comboBox.setBounds(91, 135, 218, 21);
		loginPanel.add(comboBox);
		lblNewLabel.setVisible(false);
		Image img = new ImageIcon(this.getClass().getResource("/bg.jpg")).getImage();
		
		JLabel loginMainImage = new JLabel("");
		loginMainImage.setBounds(683, 35, 368, 623);
		contentPane.add(loginMainImage);
		loginMainImage.setHorizontalAlignment(SwingConstants.CENTER);
		loginMainImage.setIcon(new ImageIcon(img));
		
		JPanel loginPanelShadow = new JPanel();
		loginPanelShadow.setBounds(240, 138, 815, 425);
		contentPane.add(loginPanelShadow);
		loginPanelShadow.setBackground(new Color(218, 218, 218));
	}
}
