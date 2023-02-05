package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.api.jdbc.Statement;

import backend.Database;

import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.awt.event.ItemEvent;
import java.awt.Cursor;

public class LogIn extends JFrame {
	
	private String newstudentName = "";
	private String newstudentAddress = "";
	private String newstudentPhoneNum = "";
	private String newstudentCourse = "";
	private String newstudentLevel = "";
	private String newstudentPassword = "";
	private String currentStudentName = "";
	private String currentStudentId = "";
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private static LogIn frame;
	private String loginAs = "";
	/**
	 * Launch the application.
	 */
	
	
	
	Database db = new Database();
	StudentDashboard valuesofStudents = new StudentDashboard();
	public String getCurrentStudentName() {
		return currentStudentName;
	}

	public String getCurrentStudentId() {
		return currentStudentId;
	}

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
		usernameLabel.setBounds(90, 140, 125, 49);
		loginPanel.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		usernameField.setBounds(90, 183, 218, 34);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Century Gothic", Font.BOLD, 20));
		passwordLabel.setBounds(90, 227, 163, 34);
		loginPanel.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		passwordField.setBounds(90, 260, 218, 34);
		loginPanel.add(passwordField);
		
		JButton loginButton = new JButton("Log in");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(loginAs.equals("Admin") &&  usernameField.getText().equals("admin")&& Arrays.equals(passwordField.getPassword(),new char[] {'1','2','3'})) {
					AdminDashboard frameLogin = new AdminDashboard();
					frameLogin.setVisible(true);
					frame.dispose();
				}
				if(loginAs.equals("Student")){
				
					for(int i =0;i<db.getStudentId().size();i++) {
						if(usernameField.getText().trim().equals(db.getStudentName().get(i).trim()) && String.valueOf(passwordField.getPassword()).trim().equals(db.getStudentPassword().get(i).trim())) {
							currentStudentName = String.valueOf(db.getStudentName().get(i));
							currentStudentId = String.valueOf(db.getStudentId().get(i));
		
							StudentDashboard frameLogin = new StudentDashboard();
							frameLogin.setVisible(true);
							frameLogin.setCurrentStudentName(currentStudentName);
							frameLogin.setCurrentStudentId(currentStudentId);
							frameLogin.getLblNewLabel_23().setText(currentStudentName);
							frameLogin.getLblNewLabel_23_1().setText(currentStudentId);
							frameLogin.getLblNewLabel_23_2().setText(String.valueOf(db.getPhoneNum().get(i)));
							frameLogin.getLblNewLabel_23_3().setText(String.valueOf(db.getStudentCourse().get(i)));
							frameLogin.getLblNewLabel_23_4().setText(String.valueOf(db.getStudentAddress().get(i)));
							frameLogin.getAiMark().setText(String.valueOf(db.getAi_mark().get(i)));
							frameLogin.getOopMark().setText(String.valueOf(db.getOop_mark().get(i)));
							frameLogin.getNmcMark().setText(String.valueOf(db.getNmc_mark().get(i)));
							frame.dispose();
						}
					}
				}
				
				if(loginAs.equals("Instructor")){
					for(int i =0;i<db.getTeacherId().size();i++) {
						if(usernameField.getText().trim().equals(db.getTeacherName().get(i).trim()) && String.valueOf(passwordField.getPassword()).trim().equals(db.getTeacherPassword().get(i).trim())) {
							InstructorDashboard frameLogin = new InstructorDashboard();
							frameLogin.setVisible(true);
							frameLogin.getLblNewLabel_22().setText(String.valueOf(db.getTeacherName().get(i)));
							frameLogin.getLblNewLabel_22_1().setText(String.valueOf(db.getTeacherId().get(i)));
							frameLogin.getLblNewLabel_22_1_1().setText(String.valueOf(db.getPhoneNumber().get(i)));
							frameLogin.getLblNewLabel_22_1_1_1().setText(String.valueOf(db.get_module().get(i)));
							frameLogin.getLblNewLabel_22_1_1_1_1().setText(String.valueOf(db.get_address().get(i)));
							frame.dispose();
						}
					}
				}
				
				

				
				else {
					lblNewLabel.setVisible(true);
				}
			}
		});
		loginButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
		loginButton.setBackground(new Color(254, 179, 22));
		loginButton.setBounds(90, 327, 218, 34);
		loginPanel.add(loginButton);
		
		JLabel welcomeText = new JLabel("Welcome,");
		welcomeText.setForeground(new Color(1, 53, 111));
		welcomeText.setFont(new Font("Century Gothic", Font.BOLD, 35));
		welcomeText.setBounds(90, 10, 229, 84);
		loginPanel.add(welcomeText);
		
		JLabel SMStext = new JLabel("To               Management System");
		SMStext.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		SMStext.setBounds(90, 93, 274, 21);
		loginPanel.add(SMStext);
		
		JLabel lblNewLabel_4 = new JLabel("Course");
		lblNewLabel_4.setBackground(new Color(253, 99, 63));
		lblNewLabel_4.setForeground(new Color(253, 99, 63));
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_4.setBounds(110, 97, 57, 13);
		loginPanel.add(lblNewLabel_4);
		
		lblNewLabel = new JLabel("Cannot Login Please Try Again!");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(90, 304, 285, 13);
		loginPanel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Sign up");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setForeground(new Color(253, 99, 63));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudentModal frameLogin = new UpdateStudentModal();
				frameLogin.setVisible(true);
				frame.dispose();
				frameLogin.getAutoGenerated().setVisible(true);
				frameLogin.getIdTextField().setVisible(false);;
				
				JTextField studentNameValue = frameLogin.getNameTextField();
				JTextField studentPhoneNumValue = frameLogin.getPhoneNumField();
				JTextField studentAddressValue = frameLogin.getAddressTextField();
				JTextField studentPasswordValue = frameLogin.getPasswordTextField();
				JTextField studentLevelValue = frameLogin.getLeveltextField();
				JTextField studentCourseValue = frameLogin.getCoursetextFiled();

				JButton addButton = frameLogin.getAddButton();
				addButton.setText("Add");
				
				
				addButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						newstudentName = studentNameValue.getText();
						newstudentPhoneNum= studentPhoneNumValue.getText();
						newstudentAddress = studentAddressValue.getText();
						newstudentLevel= studentLevelValue.getText();
						newstudentCourse= studentCourseValue.getText();
						newstudentPassword = studentPasswordValue.getText();
								
						Statement statement =  (Statement) UpdateDB.getStatement();
						
						String insertQuery = "INSERT INTO `student` (  `student_name`,`address`, `phone_num`, `level`, `course`,`password`) " + "VALUES ( '"+newstudentName+"','"+newstudentAddress+"','"+newstudentPhoneNum+"','"+newstudentLevel+"','"+newstudentCourse+"','"+newstudentPassword+"')";
							
					try {
						int success = statement.executeUpdate(insertQuery);
					
						if (success==1) {
//							frame.showDataFromDatabase();
							StudentDashboard dashboard = new StudentDashboard();
							dashboard.setVisible(true);
							frame.dispose();
							frameLogin.dispose();
                            JOptionPane.showMessageDialog(null, "Successfully created an account!");
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Unable to Create new account please try again, please try!");
					}
					}
				});
				
			
			
			}
		});
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(230, 366, 57, 21);
		loginPanel.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == 1) {
					loginAs = (String) e.getItem();
				}
			}
		});
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Admin", "Instructor", "Student"}));
		comboBox.setBounds(90, 124, 218, 21);
		loginPanel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Don't have an acoount?");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel_1.setBounds(90, 371, 145, 13);
		loginPanel.add(lblNewLabel_1);
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
