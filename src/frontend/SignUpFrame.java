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
import javax.swing.JRadioButton;

public class SignUpFrame extends JFrame {

	private JPanel contentPane;
	private JTextField emailFIeld;
	private JPasswordField passwordField;
	private JTextField usernameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpFrame frame = new SignUpFrame();
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
	public SignUpFrame() {
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
		
		JPanel SignUpFramePanel = new JPanel();
		SignUpFramePanel.setBackground(new Color(255, 255, 255));
		SignUpFramePanel.setBounds(243, 138, 471, 417);
		contentPane.add(SignUpFramePanel);
		SignUpFramePanel.setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		usernameLabel.setBounds(91, 217, 125, 49);
		SignUpFramePanel.add(usernameLabel);
		
		emailFIeld = new JTextField();
		emailFIeld.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		emailFIeld.setBounds(91, 188, 218, 34);
		SignUpFramePanel.add(emailFIeld);
		emailFIeld.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		passwordLabel.setBounds(91, 283, 163, 34);
		SignUpFramePanel.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passwordField.setBounds(91, 314, 218, 34);
		SignUpFramePanel.add(passwordField);
		
		JLabel welcomeText = new JLabel("Welcome,");
		welcomeText.setForeground(new Color(1, 53, 111));
		welcomeText.setFont(new Font("Century Gothic", Font.BOLD, 35));
		welcomeText.setBounds(91, 21, 229, 84);
		SignUpFramePanel.add(welcomeText);
		
		JLabel SMStext = new JLabel("To               Management System");
		SMStext.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		SMStext.setBounds(91, 104, 274, 21);
		SignUpFramePanel.add(SMStext);
		
		JLabel lblNewLabel_4 = new JLabel("Course");
		lblNewLabel_4.setBackground(new Color(253, 99, 63));
		lblNewLabel_4.setForeground(new Color(253, 99, 63));
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_4.setBounds(111, 108, 57, 13);
		SignUpFramePanel.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(254, 179, 22));
		btnNewButton.setBounds(91, 358, 94, 34);
		SignUpFramePanel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Instructor", "Student"}));
		comboBox.setBounds(165, 133, 142, 21);
		SignUpFramePanel.add(comboBox);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Century Gothic", Font.BOLD, 15));
		emailLabel.setBounds(91, 166, 45, 13);
		SignUpFramePanel.add(emailLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(91, 255, 218, 34);
		SignUpFramePanel.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("You are a");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(91, 135, 77, 13);
		SignUpFramePanel.add(lblNewLabel);
		Image img = new ImageIcon(this.getClass().getResource("/bg.jpg")).getImage();
		
		JLabel SignUpFrameMainImage = new JLabel("");
		SignUpFrameMainImage.setBounds(683, 35, 368, 623);
		contentPane.add(SignUpFrameMainImage);
		SignUpFrameMainImage.setHorizontalAlignment(SwingConstants.CENTER);
		SignUpFrameMainImage.setIcon(new ImageIcon(img));
		
		JPanel SignUpFramePanelShadow = new JPanel();
		SignUpFramePanelShadow.setBounds(240, 138, 815, 425);
		contentPane.add(SignUpFramePanelShadow);
		SignUpFramePanelShadow.setBackground(new Color(218, 218, 218));
	}
}
