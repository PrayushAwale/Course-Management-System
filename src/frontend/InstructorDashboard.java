package frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InstructorDashboard extends JFrame {

	private JPanel InstructorDashboard;
	private JPanel panel;
	public CardLayout cardPanel = new CardLayout(0, 0);
	private JButton coursesButton;
	private JButton dashboardButton;
	private JButton instructorsButton;
	private JButton studentsButton;
	private JButton settingButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstructorDashboard frame = new InstructorDashboard();
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
	public InstructorDashboard() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1290, 720);
		InstructorDashboard = new JPanel();
		InstructorDashboard.setBackground(new Color(255, 255, 255));
		InstructorDashboard.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(InstructorDashboard);
		InstructorDashboard.setLayout(null);
		
		JPanel sideBar = new JPanel();
		sideBar.setBackground(new Color(52, 73, 94));
		sideBar.setBounds(0, 0, 251, 683);
		InstructorDashboard.add(sideBar);
		sideBar.setLayout(null);
		
		dashboardButton = new JButton("Dashboard");
		dashboardButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				dashboardButton.setBackground(new Color(35,51,66));
				coursesButton.setBackground(new Color(52, 73, 94));
				studentsButton.setBackground(new Color(52, 73, 94));
				instructorsButton.setBackground(new Color(52, 73, 94));
				settingButton.setBackground(new Color(52,73,94));
				
			}
		});
		dashboardButton.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/Images/dashboard.png")));
		dashboardButton.setForeground(new Color(255, 255, 255));
		dashboardButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		dashboardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cardPanel.show(panel,"name_482633956555500");
			}
		});
		dashboardButton.setBackground(new Color(52, 73, 94));
		dashboardButton.setBounds(0, 82, 251, 70);
		sideBar.add(dashboardButton);
		
		coursesButton = new JButton("Courses");
		coursesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				coursesButton.setBackground(new Color(35,51,66));
				dashboardButton.setBackground(new Color(52, 73, 94));
				studentsButton.setBackground(new Color(52, 73, 94));
				instructorsButton.setBackground(new Color(52, 73, 94));
				settingButton.setBackground(new Color(52,73,94));
			}
		});
		coursesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_482673721529900");
			}
		});
		
		coursesButton.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/Images/courses.png")));
		coursesButton.setBackground(new Color(52, 73, 94));
		coursesButton.setForeground(new Color(255, 255, 255));
		coursesButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		coursesButton.setBounds(0, 151, 251, 70);
		sideBar.add(coursesButton);
		
		settingButton = new JButton("Setting");
		settingButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				coursesButton.setBackground(new Color(52,73,94));
				dashboardButton.setBackground(new Color(52, 73, 94));
				studentsButton.setBackground(new Color(52, 73, 94));
				instructorsButton.setBackground(new Color(52, 73, 94));
				settingButton.setBackground(new Color(35,51,66));
			}
		});
		settingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_484968827713500");
			}
			
		});
		settingButton.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/Images/settings.png")));
		settingButton.setBackground(new Color(52, 73, 94));
		settingButton.setForeground(new Color(255, 255, 255));
		settingButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		settingButton.setBounds(0, 551, 251, 70);
		sideBar.add(settingButton);
		
		JButton logoutButton = new JButton("Log Out");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel, "name_484982008089500");
			}
		});
		logoutButton.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/Images/log-out.png")));
		logoutButton.setBackground(new Color(52, 73, 94));
		logoutButton.setForeground(new Color(255, 255, 255));
		logoutButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		logoutButton.setBounds(0, 619, 251, 64);
		sideBar.add(logoutButton);
		
		instructorsButton = new JButton("Instructors");
		instructorsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				coursesButton.setBackground(new Color(52,73,94));
				dashboardButton.setBackground(new Color(52, 73, 94));
				studentsButton.setBackground(new Color(52, 73, 94));
				settingButton.setBackground(new Color(52,73,94));
				instructorsButton.setBackground(new Color(35,51,66));
			}
		});
		instructorsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_483861222823500");
			}
		});
		instructorsButton.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/Images/instructor.png")));
		instructorsButton.setBackground(new Color(52, 73, 94));
		instructorsButton.setForeground(new Color(255, 255, 255));
		instructorsButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		instructorsButton.setBounds(0, 220, 251, 70);
		sideBar.add(instructorsButton);
		
		studentsButton = new JButton("Students");
		studentsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				coursesButton.setBackground(new Color(52, 73, 94));
				dashboardButton.setBackground(new Color(52, 73, 94));
				instructorsButton.setBackground(new Color(52, 73, 94));
				settingButton.setBackground(new Color(52,73,94));
				studentsButton.setBackground(new Color(35,51,66));
			}
		});
		studentsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel, "name_484683737557400");
			}
		});
		studentsButton.setBackground(new Color(52, 73, 94));
		studentsButton.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/Images/graduates.png")));
		studentsButton.setForeground(new Color(255, 255, 255));
		studentsButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		studentsButton.setBounds(0, 288, 251, 70);
		sideBar.add(studentsButton);
		
		JPanel headerGreen = new JPanel();
		headerGreen.setBackground(new Color(45, 204, 112));
		headerGreen.setBounds(0, 0, 251, 85);
		sideBar.add(headerGreen);
		headerGreen.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("CMS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headerGreen.add(lblNewLabel, BorderLayout.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(248, 0, 1028, 683);
		InstructorDashboard.add(panel);
		panel.setLayout(cardPanel);
		
		JPanel dashBoard = new JPanel();
		panel.add(dashBoard, "name_482633956555500");
		dashBoard.setLayout(null);
		
		JPanel mainDashBoardFrame = new JPanel();
		mainDashBoardFrame.setBackground(new Color(192, 192, 192));
		mainDashBoardFrame.setBounds(0, 0, 1028, 683);
		dashBoard.add(mainDashBoardFrame);
		mainDashBoardFrame.setLayout(null);
		
		JPanel headerDashboard = new JPanel();
		headerDashboard.setBounds(0, 0, 1028, 81);
		mainDashBoardFrame.add(headerDashboard);
		headerDashboard.setLayout(new BorderLayout(0, 0));
		
		JLabel dashboardTitle = new JLabel("Dashboard");
		dashboardTitle.setHorizontalAlignment(SwingConstants.CENTER);
		dashboardTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		headerDashboard.add(dashboardTitle);
		
		JPanel courses = new JPanel();
		panel.add(courses, "name_482673721529900");
		courses.setLayout(null);
		
		JPanel mainCoursesFrame = new JPanel();
		mainCoursesFrame.setBackground(new Color(192, 192, 192));
		mainCoursesFrame.setBounds(0, 0, 1028, 683);
		courses.add(mainCoursesFrame);
		mainCoursesFrame.setLayout(null);
		
		JPanel headerCourses = new JPanel();
		headerCourses.setBounds(0, 0, 1028, 82);
		mainCoursesFrame.add(headerCourses);
		headerCourses.setLayout(new BorderLayout(0, 0));
		
		JLabel courseTitle = new JLabel("Courses");
		courseTitle.setHorizontalAlignment(SwingConstants.CENTER);
		courseTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		headerCourses.add(courseTitle);
		
		JPanel instructors = new JPanel();
		panel.add(instructors, "name_483861222823500");
		instructors.setLayout(null);
		
		JPanel mainInstructor = new JPanel();
		mainInstructor.setBackground(new Color(192, 192, 192));
		mainInstructor.setBounds(0, 0, 1028, 683);
		instructors.add(mainInstructor);
		mainInstructor.setLayout(null);
		
		JPanel headerInstructors = new JPanel();
		headerInstructors.setBounds(0, 0, 1028, 83);
		mainInstructor.add(headerInstructors);
		headerInstructors.setLayout(new BorderLayout(0, 0));
		
		JLabel instructorsTitle = new JLabel("Instructors");
		instructorsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		instructorsTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		headerInstructors.add(instructorsTitle, BorderLayout.CENTER);
		
		JPanel students = new JPanel();
		panel.add(students, "name_484683737557400");
		students.setLayout(null);
		
		JPanel mainStudents = new JPanel();
		mainStudents.setBackground(new Color(192, 192, 192));
		mainStudents.setBounds(0, 0, 1028, 683);
		students.add(mainStudents);
		mainStudents.setLayout(null);
		
		JPanel headerStudents = new JPanel();
		headerStudents.setBounds(0, 0, 1028, 83);
		mainStudents.add(headerStudents);
		headerStudents.setLayout(new BorderLayout(0, 0));
		
		JLabel studentsTitle = new JLabel("Students");
		studentsTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		studentsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		headerStudents.add(studentsTitle, BorderLayout.CENTER);
		
		JPanel setting = new JPanel();
		panel.add(setting, "name_484968827713500");
		setting.setLayout(null);
		
		JPanel mainSetting = new JPanel();
		mainSetting.setBackground(new Color(192, 192, 192));
		mainSetting.setBounds(0, 0, 1028, 683);
		setting.add(mainSetting);
		mainSetting.setLayout(null);
		
		JPanel headerSetting = new JPanel();
		headerSetting.setBounds(0, 0, 1028, 82);
		mainSetting.add(headerSetting);
		headerSetting.setLayout(new BorderLayout(0, 0));
		
		JLabel settingTitle = new JLabel("Setting");
		settingTitle.setHorizontalAlignment(SwingConstants.CENTER);
		settingTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		headerSetting.add(settingTitle, BorderLayout.CENTER);
		
		JPanel logOut = new JPanel();
		panel.add(logOut, "name_484982008089500");
		logOut.setLayout(null);
		
		JPanel mainLogOut = new JPanel();
		mainLogOut.setBackground(new Color(192, 192, 192));
		mainLogOut.setBounds(-11, 0, 1039, 683);
		logOut.add(mainLogOut);
		mainLogOut.setLayout(null);
		
		JPanel headerLogOut = new JPanel();
		headerLogOut.setBounds(10, 0, 1029, 81);
		mainLogOut.add(headerLogOut);
		headerLogOut.setLayout(new BorderLayout(0, 0));
		
		JLabel logOutTitle = new JLabel("Log Out");
		logOutTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		logOutTitle.setHorizontalAlignment(SwingConstants.CENTER);
		headerLogOut.add(logOutTitle, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(267, 233, 449, 283);
		mainLogOut.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("You sure want to log out?");
		lblNewLabel_1.setBounds(101, 22, 246, 26);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(186, 226, 85, 21);
		panel_1.add(btnNewButton);
	}
}
