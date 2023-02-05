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
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import java.awt.CardLayout;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.api.jdbc.Statement;

import backend.Database;

import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

public class InstructorDashboard extends JFrame {

	private JPanel InstructorDashboard;
	private JPanel panel;
	public CardLayout cardPanel = new CardLayout(0, 0);
	private JButton coursesButton;
	private JButton dashboardButton;
	private JButton instructorsButton;
	private JButton studentsButton;
	private JButton settingButton;
	private JTable courseTable;
	private JTable instructorTable;
	static InstructorDashboard frame;
	private JTable studentTable;
	static int selectedRow = 0;
	static int moduleTitleColumnIndex = 0;
	static int moduleDurationColumnIndex = 0;
	static int moduleMarkColumnIndex = 0;
	Database db = new Database();
	GiveMarks giveMarks = new GiveMarks();
	/**
	 * Launch the application.
	 */
	DefaultTableModel checkAssignent = new DefaultTableModel(
			new Object[][] {
				
				
				
			},
			new String[] {
					"Student ID", "Student Name", "Module", "Status"
			}
		);
	
	DefaultTableModel modalValue =  new DefaultTableModel(
			new Object[][] {
				
				
				
			},
			new String[] {
				"Module Code","Module Title", "Moudle Duration", "Moudle Mark", "Module Leader"
			}
		);
	
	DefaultTableModel studentValue =  new DefaultTableModel(
			new Object[][] {
				
				
			},
			new String[] {
					"University ID","Student Name", "Phone Number", "Address", "Level", "Course"
			}
		);
	DefaultTableModel teacherValue =  new DefaultTableModel(
			new Object[][] {
				
				
				
			},
			new String[] {
				"Teacher ID","Teacher Name", "Phone Number", "Module", "Address", "Full Time"
			}
		);
	private JTextField question1TextField;
	private JTextField question2TextField;
	private JTextField question4TextField;
	private JTextField mark;
	private JTextField dueDate;
	private JTextField module;
	private JTextField question3TextField;
	private JTable assignmentTable;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_22_1;
	private JLabel lblNewLabel_22_1_1;
	private JLabel lblNewLabel_22_1_1_1;
	private JLabel lblNewLabel_22_1_1_1_1;
	
	


	public JLabel getLblNewLabel_22() {
		return lblNewLabel_22;
	}

	public JLabel getLblNewLabel_22_1() {
		return lblNewLabel_22_1;
	}

	public JLabel getLblNewLabel_22_1_1() {
		return lblNewLabel_22_1_1;
	}

	public JLabel getLblNewLabel_22_1_1_1() {
		return lblNewLabel_22_1_1_1;
	}

	public JLabel getLblNewLabel_22_1_1_1_1() {
		return lblNewLabel_22_1_1_1_1;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new InstructorDashboard();
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
		dashboardButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		coursesButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		settingButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		logoutButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		instructorsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		studentsButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		headerGreen.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CMS");
		lblNewLabel.setBounds(0, 0, 251, 85);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headerGreen.add(lblNewLabel);
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
		
		JPanel headerDashboard = new JPanel();
		headerDashboard.setLayout(new BorderLayout(0, 0));
		
		JLabel dashboardTitle = new JLabel("Dashboard");
		dashboardTitle.setBackground(new Color(245, 246, 250));
		dashboardTitle.setHorizontalAlignment(SwingConstants.CENTER);
		dashboardTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		headerDashboard.add(dashboardTitle);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 246, 250));
		GroupLayout gl_mainDashBoardFrame = new GroupLayout(mainDashBoardFrame);
		gl_mainDashBoardFrame.setHorizontalGroup(
			gl_mainDashBoardFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainDashBoardFrame.createSequentialGroup()
					.addGroup(gl_mainDashBoardFrame.createParallelGroup(Alignment.LEADING)
						.addComponent(headerDashboard, GroupLayout.PREFERRED_SIZE, 1028, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 1037, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_mainDashBoardFrame.setVerticalGroup(
			gl_mainDashBoardFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_mainDashBoardFrame.createSequentialGroup()
					.addComponent(headerDashboard, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 614, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(59, 28, 859, 112);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Hello,");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 30));
		lblNewLabel_2.setBounds(10, 23, 126, 47);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Teachers");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(98, 28, 207, 37);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome to the Course Management System Dashboard");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 59, 444, 32);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/helolo.png")));
		lblNewLabel_5.setBounds(347, 0, 512, 279);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(214, 234, 247));
		panel_4.setBounds(59, 277, 210, 215);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/studentsicon2.png")));
		lblNewLabel_6.setBounds(10, 10, 78, 85);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Students");
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_7.setBounds(92, 145, 108, 60);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(-135, -107, 298, 264);
		panel_4.add(lblNewLabel_10);
		lblNewLabel_10.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/cirlce.png")));
		
		JLabel lblNewLabel_15 = new JLabel("101");
		lblNewLabel_15.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_15.setBounds(23, 145, 63, 60);
		panel_4.add(lblNewLabel_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(214, 234, 247));
		panel_5.setBounds(395, 277, 210, 215);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/teachericon.png")));
		lblNewLabel_8.setBounds(10, 10, 81, 87);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/cirlce2.png")));
		lblNewLabel_11.setBounds(-133, -106, 309, 260);
		panel_5.add(lblNewLabel_11);
		
		JLabel lblNewLabel_13 = new JLabel("Instructors");
		lblNewLabel_13.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_13.setBounds(72, 159, 128, 32);
		panel_5.add(lblNewLabel_13);
		
		JLabel lblNewLabel_16 = new JLabel("100");
		lblNewLabel_16.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_16.setBounds(10, 164, 69, 24);
		panel_5.add(lblNewLabel_16);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(214, 234, 247));
		panel_6.setBounds(708, 277, 210, 215);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/courseicons.png")));
		lblNewLabel_9.setBounds(10, 24, 81, 67);
		panel_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/cirlce3.png")));
		lblNewLabel_12.setBounds(-137, -111, 311, 263);
		panel_6.add(lblNewLabel_12);
		
		JLabel lblNewLabel_14 = new JLabel("Courses");
		lblNewLabel_14.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_14.setBounds(95, 161, 105, 26);
		panel_6.add(lblNewLabel_14);
		
		JLabel lblNewLabel_17 = new JLabel("99");
		lblNewLabel_17.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_17.setBounds(48, 150, 43, 44);
		panel_6.add(lblNewLabel_17);
		
		JButton btnNewButton_1 = new JButton("Create Assignments");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_1027892276699800");
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_1.setBounds(59, 175, 689, 56);
		panel_2.add(btnNewButton_1);
		
		JButton checkAssignmnet = new JButton("Check");
		checkAssignmnet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_1124097311106900");
			}
		});
		checkAssignmnet.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		checkAssignmnet.setFont(new Font("Century Gothic", Font.BOLD, 20));
		checkAssignmnet.setBackground(Color.WHITE);
		checkAssignmnet.setBounds(745, 175, 179, 56);
		panel_2.add(checkAssignmnet);
		mainDashBoardFrame.setLayout(gl_mainDashBoardFrame);
		
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
		
		JScrollPane scrollPaneCourse = new JScrollPane();
		scrollPaneCourse.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		scrollPaneCourse.setBounds(0, 81, 1028, 592);
		mainCoursesFrame.add(scrollPaneCourse);
		
		courseTable = new JTable();
		courseTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		courseTable.setDefaultEditor(Object.class,null);
		courseTable.getTableHeader().setBackground(Color.decode("#d6eaf7"));
		courseTable.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 20));
		UIManager.getDefaults().put("TableHeader.cellBorder" , BorderFactory.createEmptyBorder(0,0,0,0));
		courseTable.setIntercellSpacing(new Dimension(5, 5));
		courseTable.setBackground(new Color(255, 255, 255));
		courseTable.setRowHeight(35);
		courseTable.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		courseTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		courseTable.setShowVerticalLines(false);
		for(int i = 0 ; i<db.getCourseCode().size();i++) {
			modalValue.addRow(new Object[] {db.getCourseCode().get(i),db.getCourseTitle().get(i),db.getCourseDuration().get(i),db.getCourseMark().get(i),db.getCourseLeader().get(i)});
		}
		for(int i = 0 ; i<db.getTeacherId().size();i++) {
			teacherValue.addRow(new Object[] {db.getTeacherId().get(i),db.getTeacherName().get(i),db.getPhoneNumber().get(i),db.get_module().get(i),db.get_address().get(i),db.get_fullTime().get(i)});
		}
		for(int i = 0 ; i<db.getStudentId().size();i++) {
			studentValue.addRow(new Object[] {db.getStudentId().get(i),db.getStudentName().get(i),db.getPhoneNum().get(i),db.getStudentAddress().get(i),db.get_level().get(i),db.getStudentCourse().get(i)});
		}
		for(int i = 0 ; i<db.getCheckStudentId().size();i++) {
			checkAssignent.addRow(new Object[] {db.getCheckStudentId().get(i),db.getSubmittedBy().get(i),db.getCheckModule().get(i),"Compeleted"});
		}
		courseTable.setModel(modalValue);
		
		scrollPaneCourse.setViewportView(courseTable);
		
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 80, 1028, 320);
		mainInstructor.add(scrollPane);
		
		instructorTable = new JTable();
		instructorTable.getTableHeader().setBackground(Color.decode("#d6eaf7"));
		instructorTable.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 20));
		UIManager.getDefaults().put("TableHeader.cellBorder" , BorderFactory.createEmptyBorder(0,0,0,0));
		instructorTable.setModel(teacherValue);
		instructorTable.setShowVerticalLines(false);
		instructorTable.setRowHeight(35);
		instructorTable.setIntercellSpacing(new Dimension(5, 5));
		instructorTable.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		instructorTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		instructorTable.setBackground(Color.WHITE);
		scrollPane.setViewportView(instructorTable);
		
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
		studentsTitle.setBackground(new Color(245, 246, 250));
		studentsTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		studentsTitle.setHorizontalAlignment(SwingConstants.CENTER);
		headerStudents.add(studentsTitle, BorderLayout.CENTER);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 83, 1028, 600);
		mainStudents.add(scrollPane_1);
		
		studentTable = new JTable();
		studentTable.getTableHeader().setBackground(Color.decode("#d6eaf7"));
		studentTable.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 20));
		UIManager.getDefaults().put("TableHeader.cellBorder" , BorderFactory.createEmptyBorder(0,0,0,0));
		studentTable.setModel(studentValue);
		studentTable.setShowVerticalLines(false);
		studentTable.setRowHeight(35);
		studentTable.setIntercellSpacing(new Dimension(5, 5));
		studentTable.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		studentTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		studentTable.setBackground(Color.WHITE);
		scrollPane_1.setViewportView(studentTable);
		
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
		
		JLabel lblNewLabel_21 = new JLabel("Name:");
		lblNewLabel_21.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_21.setBounds(51, 118, 72, 31);
		mainSetting.add(lblNewLabel_21);
		
		JLabel lblNewLabel_21_1 = new JLabel("Teacher ID:");
		lblNewLabel_21_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_21_1.setBounds(51, 159, 130, 31);
		mainSetting.add(lblNewLabel_21_1);
		
		JLabel lblNewLabel_21_1_1 = new JLabel("Phone Number:");
		lblNewLabel_21_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_21_1_1.setBounds(51, 200, 163, 31);
		mainSetting.add(lblNewLabel_21_1_1);
		
		JLabel lblNewLabel_21_1_1_1 = new JLabel("Module:");
		lblNewLabel_21_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_21_1_1_1.setBounds(51, 242, 163, 31);
		mainSetting.add(lblNewLabel_21_1_1_1);
		
		lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_22.setBounds(223, 118, 437, 26);
		mainSetting.add(lblNewLabel_22);
		
		lblNewLabel_22_1 = new JLabel("");
		lblNewLabel_22_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_22_1.setBounds(223, 159, 437, 26);
		mainSetting.add(lblNewLabel_22_1);
		
		lblNewLabel_22_1_1 = new JLabel("");
		lblNewLabel_22_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_22_1_1.setBounds(224, 202, 437, 26);
		mainSetting.add(lblNewLabel_22_1_1);
		
		lblNewLabel_22_1_1_1 = new JLabel("");
		lblNewLabel_22_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_22_1_1_1.setBounds(224, 244, 437, 26);
		mainSetting.add(lblNewLabel_22_1_1_1);
		
		JLabel lblNewLabel_21_1_1_1_1 = new JLabel("Address:");
		lblNewLabel_21_1_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_21_1_1_1_1.setBounds(51, 283, 163, 31);
		mainSetting.add(lblNewLabel_21_1_1_1_1);
		
		lblNewLabel_22_1_1_1_1 = new JLabel("");
		lblNewLabel_22_1_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_22_1_1_1_1.setBounds(223, 288, 437, 26);
		mainSetting.add(lblNewLabel_22_1_1_1_1);
		
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
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(267, 156, 449, 431);
		mainLogOut.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("You sure want to log out?");
		lblNewLabel_1.setBounds(101, 22, 246, 26);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Log Out");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LogIn frameLogin = new LogIn();
				frameLogin.setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBackground(new Color(255, 114, 92));
		btnNewButton.setBounds(186, 364, 109, 21);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setIcon(new ImageIcon(InstructorDashboard.class.getResource("/images/250.jpg")));
		lblNewLabel_18.setBounds(98, 86, 270, 244);
		panel_1.add(lblNewLabel_18);
		
		JPanel createAssignmnet = new JPanel();
		panel.add(createAssignmnet, "name_1027892276699800");
		createAssignmnet.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Create Activites");
		lblNewLabel_19.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_19.setBounds(42, 27, 198, 39);
		createAssignmnet.add(lblNewLabel_19);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(192, 192, 192));
		panel_7.setBounds(25, 76, 976, 2);
		createAssignmnet.add(panel_7);
		
		question1TextField = new JTextField();
		question1TextField.setBounds(42, 176, 959, 39);
		createAssignmnet.add(question1TextField);
		question1TextField.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Question 1");
		lblNewLabel_20.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_20.setBounds(42, 140, 93, 26);
		createAssignmnet.add(lblNewLabel_20);
		
		JLabel lblNewLabel_20_1 = new JLabel("Question 2");
		lblNewLabel_20_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_20_1.setBounds(42, 244, 93, 26);
		createAssignmnet.add(lblNewLabel_20_1);
		
		question2TextField = new JTextField();
		question2TextField.setColumns(10);
		question2TextField.setBounds(42, 280, 959, 39);
		createAssignmnet.add(question2TextField);
		
		JLabel lblNewLabel_20_2 = new JLabel("Question 4");
		lblNewLabel_20_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_20_2.setBounds(42, 431, 93, 26);
		createAssignmnet.add(lblNewLabel_20_2);
		
		question4TextField = new JTextField();
		question4TextField.setColumns(10);
		question4TextField.setBounds(42, 467, 959, 39);
		createAssignmnet.add(question4TextField);
		
		JLabel lblNewLabel_20_3_1_1_1 = new JLabel("Total Marks");
		lblNewLabel_20_3_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_20_3_1_1_1.setBounds(42, 525, 93, 26);
		createAssignmnet.add(lblNewLabel_20_3_1_1_1);
		
		mark = new JTextField();
		mark.setColumns(10);
		mark.setBounds(145, 521, 235, 39);
		createAssignmnet.add(mark);
		
		JButton createAssignmentButton = new JButton("Create");
		createAssignmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newDueDate = dueDate.getText();
				String newModule = module.getText();
				String newQuestion1 = question1TextField.getText();
				String newQuestion2= question2TextField.getText();
				String newQuestion3 = question3TextField.getText();
				String newQuestion4 = question4TextField.getText();
				String newmark = mark.getText();
						Statement statement =  (Statement) UpdateDB.getStatement();
						
						String insertQuery = "INSERT INTO `assignment` ( `module`,  `due_date`, `question_1`, `question_2`, `question_3`, `question_4`, `mark`) " + "VALUES ( '"+newModule+"','"+newDueDate+"','"+newQuestion1+"','"+newQuestion2+"','"+newQuestion3+"','"+newQuestion4+"','"+newmark+"')";
							
					try {
						int success = statement.executeUpdate(insertQuery);
					
						if (success==1) {
                            JOptionPane.showMessageDialog(null, "Added Assignment successfully!");
                            dueDate.setText("");
                            module.setText("");
                            question1TextField.setText("");
                            question2TextField.setText("");
                            question3TextField.setText("");
                            question4TextField.setText("");
                            mark.setText("");
                          
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Unable to add the Assignment, please try!");
					}
				
				
			}
		});
		createAssignmentButton.setBackground(new Color(45, 204, 112));
		createAssignmentButton.setForeground(new Color(255, 255, 255));
		createAssignmentButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		createAssignmentButton.setBounds(42, 596, 242, 39);
		createAssignmnet.add(createAssignmentButton);
		
		dueDate = new JTextField();
		dueDate.setColumns(10);
		dueDate.setBounds(610, 98, 360, 39);
		createAssignmnet.add(dueDate);
		
		JLabel lblNewLabel_20_3_1_2 = new JLabel("Due Date");
		lblNewLabel_20_3_1_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_20_3_1_2.setBounds(528, 102, 72, 26);
		createAssignmnet.add(lblNewLabel_20_3_1_2);
		
		module = new JTextField();
		module.setColumns(10);
		module.setBounds(108, 98, 379, 39);
		createAssignmnet.add(module);
		
		JLabel lblNewLabel_20_3_1_2_1 = new JLabel("Module");
		lblNewLabel_20_3_1_2_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_20_3_1_2_1.setBounds(42, 104, 81, 26);
		createAssignmnet.add(lblNewLabel_20_3_1_2_1);
		
		JLabel lblNewLabel_20_2_1 = new JLabel("Question 3");
		lblNewLabel_20_2_1.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_20_2_1.setBounds(42, 339, 93, 26);
		createAssignmnet.add(lblNewLabel_20_2_1);
		
		question3TextField = new JTextField();
		question3TextField.setColumns(10);
		question3TextField.setBounds(42, 375, 959, 39);
		createAssignmnet.add(question3TextField);
		
		JPanel chekcAssignmentPanle = new JPanel();
		panel.add(chekcAssignmentPanle, "name_1124097311106900");
		chekcAssignmentPanle.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1028, 551);
		chekcAssignmentPanle.add(scrollPane_2);
		
		assignmentTable = new JTable();
		assignmentTable.setModel(checkAssignent);
		assignmentTable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				giveMarks.getAnswer1().setText(String.valueOf(db.getCheckAssignment1().get(assignmentTable.getSelectedRow())));
				giveMarks.getAnswer2().setText(String.valueOf(db.getCheckAssignment2().get(assignmentTable.getSelectedRow())));
				giveMarks.getAnswer3().setText(String.valueOf(db.getCheckAssignment3().get(assignmentTable.getSelectedRow())));
				giveMarks.getAnswer4().setText(String.valueOf(db.getCheckAssignment4().get(assignmentTable.getSelectedRow())));
				giveMarks.setVisible(true);
				JButton doneButton = giveMarks.getDoneButton();
				doneButton.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
						Statement statement =  (Statement) UpdateDB.getStatement();
						try {
							if(String.valueOf(db.getCheckModule().get(assignmentTable.getSelectedRow())).equals("OOP")) {				
								String updateQuery = "UPDATE `student` SET `oop_mark` ='"+giveMarks.getMarkTextField().getText()+"'"
										+ " WHERE uni_id='"+String.valueOf(db.getCheckStudentId().get(assignmentTable.getSelectedRow()))+"'";
								int success = statement.executeUpdate(updateQuery);
								if (success==1) {
									giveMarks.dispose();
		                            JOptionPane.showMessageDialog(null, "Added Mark successfully!");
								}
							}
							if(String.valueOf(db.getCheckModule().get(assignmentTable.getSelectedRow())).equals("NMC")) {				
								String updateQuery = "UPDATE `student` SET `nmc_mark` ='"+giveMarks.getMarkTextField().getText()+"'"
										+ " WHERE uni_id='"+String.valueOf(db.getCheckStudentId().get(assignmentTable.getSelectedRow()))+"'";
								int success = statement.executeUpdate(updateQuery);
								if (success==1) {
									giveMarks.dispose();
		                            JOptionPane.showMessageDialog(null, "Added Mark successfully!");
								}
							}
							if(String.valueOf(db.getCheckModule().get(assignmentTable.getSelectedRow())).equals("AI")) {				
								String updateQuery = "UPDATE `student` SET `ai_mark` ='"+giveMarks.getMarkTextField().getText()+"'"
										+ " WHERE uni_id='"+String.valueOf(db.getCheckStudentId().get(assignmentTable.getSelectedRow()))+"'";
								int success = statement.executeUpdate(updateQuery);
								if (success==1) {
									giveMarks.dispose();
		                            JOptionPane.showMessageDialog(null, "Added Mark successfully!");
								}
							}
							
						}catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
							JOptionPane.showMessageDialog(null, "Unable to Add the mark, please try!");
						}
					}
					
				});
				
			}
		});
		assignmentTable.setDefaultEditor(Object.class,null);
		assignmentTable.getTableHeader().setBackground(Color.decode("#d6eaf7"));
		assignmentTable.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 20));
		assignmentTable.setShowVerticalLines(false);
		assignmentTable.setRowHeight(35);
		assignmentTable.setIntercellSpacing(new Dimension(5, 5));
		assignmentTable.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		assignmentTable.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		assignmentTable.setBackground(Color.WHITE);
		scrollPane_2.setViewportView(assignmentTable);
	}
}