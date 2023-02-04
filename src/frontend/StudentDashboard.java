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

public class StudentDashboard extends JFrame {

	private JPanel StudentDashboard;
	private JPanel panel;
	public CardLayout cardPanel = new CardLayout(0, 0);
	private JButton coursesButton;
	private JButton dashboardButton;
	private JButton instructorsButton;
	private JButton studentsButton;
	private JButton settingButton;
	private JTable courseTable;
	private JTable instructorTable;
	static StudentDashboard frame;
	private JTable studentTable;
	static int selectedRow = 0;
	static int moduleTitleColumnIndex = 0;
	static int moduleDurationColumnIndex = 0;
	static int moduleMarkColumnIndex = 0;
	String currentStudentName = "";
	String currentStudentId="";
	Database db = new Database();
//	LogIn valueofStudent = new LogIn();
	
	/**
	 * Launch the application.
	 */
	
	DefaultTableModel modalValue =  new DefaultTableModel(
			new Object[][] {
				
				
				
			},
			new String[] {
				"Module Code","Module Title", "Moudle Duration", "Moudle Mark", "Module Leader"
			}
		);
	
	public void setCurrentStudentName(String currentStudentName) {
		this.currentStudentName = currentStudentName;
	}

	public void setCurrentStudentId(String currentStudentId) {
		this.currentStudentId = currentStudentId;
	}

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
		


		public JLabel getLblNewLabel_23() {
			return lblNewLabel_23;
		}

		public JLabel getLblNewLabel_23_1() {
			return lblNewLabel_23_1;
		}

		public JLabel getLblNewLabel_23_2() {
			return lblNewLabel_23_2;
		}

		public JLabel getLblNewLabel_23_3() {
			return lblNewLabel_23_3;
		}

		public JLabel getLblNewLabel_23_4() {
			return lblNewLabel_23_4;
		}

	private JTextField question1textField;
	private JTextField question2textField;
	private JTextField question3textField;
	private JTextField question4textField;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_23_1;
	private JLabel lblNewLabel_23_2;
	private JLabel lblNewLabel_23_3;
	private JLabel lblNewLabel_23_4;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new StudentDashboard();
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
	public StudentDashboard() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1290, 720);
		StudentDashboard = new JPanel();
		StudentDashboard.setBackground(new Color(255, 255, 255));
		StudentDashboard.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(StudentDashboard);
		StudentDashboard.setLayout(null);
		
		JPanel sideBar = new JPanel();
		sideBar.setBackground(new Color(52, 73, 94));
		sideBar.setBounds(0, 0, 251, 683);
		StudentDashboard.add(sideBar);
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
		dashboardButton.setIcon(new ImageIcon(StudentDashboard.class.getResource("/Images/dashboard.png")));
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
		
		coursesButton.setIcon(new ImageIcon(StudentDashboard.class.getResource("/Images/courses.png")));
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
		settingButton.setIcon(new ImageIcon(StudentDashboard.class.getResource("/Images/settings.png")));
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
		logoutButton.setIcon(new ImageIcon(StudentDashboard.class.getResource("/Images/log-out.png")));
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
		instructorsButton.setIcon(new ImageIcon(StudentDashboard.class.getResource("/Images/instructor.png")));
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
		studentsButton.setIcon(new ImageIcon(StudentDashboard.class.getResource("/Images/graduates.png")));
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
		StudentDashboard.add(panel);
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
		
		JLabel lblNewLabel_3 = new JLabel("Students");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(98, 28, 206, 37);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome to the Course Management System Dashboard");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 59, 444, 32);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/helolo.png")));
		lblNewLabel_5.setBounds(347, 0, 512, 279);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(214, 234, 247));
		panel_4.setBounds(59, 278, 210, 215);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/studentsicon2.png")));
		lblNewLabel_6.setBounds(10, 10, 78, 85);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Students");
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_7.setBounds(92, 145, 108, 60);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(-135, -107, 298, 264);
		panel_4.add(lblNewLabel_10);
		lblNewLabel_10.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/cirlce.png")));
		
		JLabel lblNewLabel_15 = new JLabel("101");
		lblNewLabel_15.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_15.setBounds(23, 145, 63, 60);
		panel_4.add(lblNewLabel_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(214, 234, 247));
		panel_5.setBounds(399, 278, 210, 215);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/teachericon.png")));
		lblNewLabel_8.setBounds(10, 10, 81, 87);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/cirlce2.png")));
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
		panel_6.setBounds(708, 278, 210, 215);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/courseicons.png")));
		lblNewLabel_9.setBounds(10, 24, 81, 67);
		panel_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/cirlce3.png")));
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
		
		JButton btnNewButton_1 = new JButton("Veiw Assignments");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_950178954078100");
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_1.setBounds(59, 176, 859, 51);
		panel_2.add(btnNewButton_1);
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
		
		lblNewLabel_22 = new JLabel("Name:");
		lblNewLabel_22.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_22.setBounds(66, 141, 99, 32);
		mainSetting.add(lblNewLabel_22);
		
		JLabel lblNewLabel_22_1 = new JLabel("University ID:");
		lblNewLabel_22_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_22_1.setBounds(66, 183, 149, 32);
		mainSetting.add(lblNewLabel_22_1);
		
		JLabel lblNewLabel_22_1_1 = new JLabel("Phone Number:");
		lblNewLabel_22_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_22_1_1.setBounds(66, 225, 169, 32);
		mainSetting.add(lblNewLabel_22_1_1);
		
		JLabel lblNewLabel_22_1_1_1 = new JLabel("Module:");
		lblNewLabel_22_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_22_1_1_1.setBounds(66, 270, 169, 32);
		mainSetting.add(lblNewLabel_22_1_1_1);
		
		JLabel lblNewLabel_22_1_1_2 = new JLabel("Address:");
		lblNewLabel_22_1_1_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_22_1_1_2.setBounds(66, 312, 169, 32);
		mainSetting.add(lblNewLabel_22_1_1_2);
		
		lblNewLabel_23 = new JLabel("");
		lblNewLabel_23.setText(currentStudentId);
		lblNewLabel_23.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_23.setBounds(226, 141, 527, 32);
		mainSetting.add(lblNewLabel_23);
		
		lblNewLabel_23_1 = new JLabel("");
		lblNewLabel_23_1.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_23_1.setBounds(226, 183, 466, 32);
		mainSetting.add(lblNewLabel_23_1);
		
		lblNewLabel_23_2 = new JLabel("");
		lblNewLabel_23_2.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_23_2.setBounds(226, 225, 466, 32);
		mainSetting.add(lblNewLabel_23_2);
		
		lblNewLabel_23_3 = new JLabel("");
		lblNewLabel_23_3.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_23_3.setBounds(226, 267, 466, 32);
		mainSetting.add(lblNewLabel_23_3);
		
		lblNewLabel_23_4 = new JLabel("");
		lblNewLabel_23_4.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		lblNewLabel_23_4.setBounds(226, 312, 466, 32);
		mainSetting.add(lblNewLabel_23_4);
		
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
		lblNewLabel_18.setIcon(new ImageIcon(StudentDashboard.class.getResource("/images/250.jpg")));
		lblNewLabel_18.setBounds(98, 86, 270, 244);
		panel_1.add(lblNewLabel_18);
		
		JPanel assignments = new JPanel();
		panel.add(assignments, "name_950178954078100");
		assignments.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(752, 24, 246, 638);
		assignments.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_19_1 = new JLabel("This Week");
		lblNewLabel_19_1.setBounds(59, 10, 126, 32);
		lblNewLabel_19_1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		panel_7.add(lblNewLabel_19_1);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 62, 226, 2);
		panel_7.add(panel_9);
		
		JLabel lblNewLabel_20 = new JLabel("OOP");
		lblNewLabel_20.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_20.setBounds(45, 98, 66, 32);
		panel_7.add(lblNewLabel_20);
		
		JLabel lblNewLabel_20_1 = new JLabel("0");
		lblNewLabel_20_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_20_1.setBounds(169, 98, 44, 32);
		panel_7.add(lblNewLabel_20_1);
		
		JLabel lblNewLabel_20_1_1 = new JLabel("0");
		lblNewLabel_20_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_20_1_1.setBounds(169, 160, 44, 32);
		panel_7.add(lblNewLabel_20_1_1);
		
		JLabel lblNewLabel_20_2 = new JLabel("NMC");
		lblNewLabel_20_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_20_2.setBounds(45, 160, 66, 32);
		panel_7.add(lblNewLabel_20_2);
		
		JLabel lblNewLabel_20_1_2 = new JLabel("0");
		lblNewLabel_20_1_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_20_1_2.setBounds(169, 217, 44, 32);
		panel_7.add(lblNewLabel_20_1_2);
		
		JLabel lblNewLabel_20_3 = new JLabel("AI");
		lblNewLabel_20_3.setFont(new Font("Century Gothic", Font.BOLD, 20));
		lblNewLabel_20_3.setBounds(45, 217, 53, 32);
		panel_7.add(lblNewLabel_20_3);
		
		JLabel lblNewLabel_21 = new JLabel("To Do");
		lblNewLabel_21.setFont(new Font("Century", Font.PLAIN, 10));
		lblNewLabel_21.setBounds(158, 75, 45, 13);
		panel_7.add(lblNewLabel_21);
		
		JLabel lblNewLabel_21_1 = new JLabel("Module");
		lblNewLabel_21_1.setFont(new Font("Century", Font.PLAIN, 10));
		lblNewLabel_21_1.setBounds(53, 74, 45, 13);
		panel_7.add(lblNewLabel_21_1);
		
		JLabel lblNewLabel_19 = new JLabel("Activites");
		lblNewLabel_19.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_19.setBounds(38, 24, 125, 51);
		assignments.add(lblNewLabel_19);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(192, 192, 192));
		panel_8.setBounds(17, 85, 725, 3);
		assignments.add(panel_8);
		
		JButton btnNewButton_2 = new JButton("Object Oriented Programming");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_1055731468530900");
			}
		});
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_2.setBounds(17, 117, 343, 76);
		assignments.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Numerical Methods & Concurrency");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_1055731468530900");
			}
		});
		btnNewButton_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_1.setBackground(new Color(255, 255, 255));
		btnNewButton_2_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(375, 117, 343, 76);
		assignments.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Artificial Intelligence");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_1055731468530900");
			}
		});
		btnNewButton_2_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_2_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_2_1_1.setBounds(17, 227, 343, 76);
		assignments.add(btnNewButton_2_1_1);
		
		JPanel OOP = new JPanel();
		panel.add(OOP, "name_1055731468530900");
		OOP.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Go Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_950178954078100");
			}
		});
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Century Gothic", Font.BOLD, 15));
		btnNewButton_3.setBounds(30, 26, 124, 35);
		OOP.add(btnNewButton_3);
		
		JLabel question1 = new JLabel("No Question Provided");
		
		question1.setText(String.valueOf(db.getQuestion_1().get(1)));
		
		question1.setBounds(30, 90, 962, 35);
		OOP.add(question1);
		
		JLabel question2 = new JLabel("WHat is OOP?");
		question2.setText(String.valueOf(db.getQuestion_2().get(1)));
		question2.setBounds(30, 204, 962, 35);
		OOP.add(question2);
		
		JLabel question3 = new JLabel("WHat is OOP?");
		question3.setText(String.valueOf(db.getQuestion_3().get(1)));
		question3.setBounds(30, 322, 962, 35);
		OOP.add(question3);
		
		JLabel question4 = new JLabel("WHat is OOP?");
		question4.setText(String.valueOf(db.getQuestion_4().get(1)));
		question4.setBounds(30, 448, 962, 35);
		OOP.add(question4);
		
		question1textField = new JTextField();
		question1textField.setBounds(30, 135, 962, 28);
		OOP.add(question1textField);
		question1textField.setColumns(10);
		
		question2textField = new JTextField();
		question2textField.setColumns(10);
		question2textField.setBounds(30, 249, 962, 28);
		OOP.add(question2textField);
		
		question3textField = new JTextField();
		question3textField.setColumns(10);
		question3textField.setBounds(30, 371, 962, 28);
		OOP.add(question3textField);
		
		question4textField = new JTextField();
		question4textField.setColumns(10);
		question4textField.setBounds(30, 493, 962, 28);
		OOP.add(question4textField);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Statement statement =  (Statement) UpdateDB.getStatement();
				
				String insertQuery = "INSERT INTO `submittedassignments` ( `student_id`,  `submitted_by`,`module`,`answer1`,`answer2`,`answer3`,`answer4`) " + "VALUES ( '"+currentStudentId+"','"+currentStudentName+"', 'OOP' ,'"+question1textField.getText()+"','"+question2textField.getText()+"','"+question3textField.getText()+"','"+question4textField.getText()+"')";
					
			try {
				int success = statement.executeUpdate(insertQuery);
			
				if (success==1) {

                    JOptionPane.showMessageDialog(null, "Assignment Submitted successfully!");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null, "Unable to submit assignment, please try!");
			}
			
				
				
			
				
			
			}
		});
		submitButton.setFont(new Font("Century Gothic", Font.BOLD, 15));
		submitButton.setBackground(new Color(45, 204, 112));
		submitButton.setForeground(new Color(255, 255, 255));
		submitButton.setBounds(30, 565, 146, 35);
		OOP.add(submitButton);
	}
}