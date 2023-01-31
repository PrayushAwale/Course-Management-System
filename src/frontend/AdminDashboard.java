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
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.api.jdbc.Statement;

import backend.Database;
import backend.UpdateDb;

import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

public class AdminDashboard extends JFrame {

	private JPanel AdminDashboard;
	private JPanel panel;
	public CardLayout cardPanel = new CardLayout(0, 0);
	private JButton coursesButton;
	private JButton dashboardButton;
	private JButton instructorsButton;
	private JButton studentsButton;
	private JButton settingButton;
	private String moduleCode = "";
	private String moduleTitle = "";
	private String moduleDuration = "";
	private String moduleMark = "";
	private String moduleLeader = "";
	private String newmoduleTitle = "";
	private String newmoduleDuration = "";
	private String newmoduleMark = "";
	private String newmoduleLeader = "";
	static AdminDashboard frame;
	static int selectedRow = 0;
	static int moduleTitleColumnIndex = 0;
	static int moduleDurationColumnIndex = 0;
	static int moduleMarkColumnIndex = 0;
	static int moduleCodeColumnIndex  = 0;
	static int moduleLeaderColumnIndex = 0;
	Database db = new Database();
	UpdateModal updateCourse = new UpdateModal();
	/**
	 * Launch the application.
	 */
	
	static //Default value for module
	DefaultTableModel modalValue =  new DefaultTableModel(
			new Object[][] {
				
				
				
			},
			new String[] {
				"Module Code","Module Title", "Moudle Duration", "Moudle Mark", "Module Leader"
			}
		);
	
	static //Default value for teacher
	DefaultTableModel teacherValue =  new DefaultTableModel(
			new Object[][] {
				
				
				
			},
			new String[] {
				"Teacher ID","Teacher Name", "Phone Number", "Module", "Address", "Full Time"
			}
		);
	
	//Default value for student
	DefaultTableModel studentValue =  new DefaultTableModel(
			new Object[][] {
				
				
				
			},
			new String[] {
				"University ID","Student Name", "Phone Number", "Address", "Level", "Course"
			}
		);
	public static void showDataFromDatabase() {
        Statement statement = (Statement) UpdateDB.getStatement();

        String selectQuery = "SELECT * FROM `course`";

        try {
            ResultSet resultSet = statement.executeQuery(selectQuery);
            modalValue.setRowCount(0);
            while (resultSet.next()) {
                String teacherIdFromDB = resultSet.getString("module_code");
                String teacherNameFromDB = resultSet.getString("module_title");
                String teacherPhoneFromDB = resultSet.getString("module_duration");
                String teacherAddressFromDB = resultSet.getString("module_mark");
                String assignedModuleFromDB = resultSet.getString("module_leader");

                modalValue.addRow(new Object[] { teacherIdFromDB, teacherNameFromDB, teacherPhoneFromDB,
                        teacherAddressFromDB, assignedModuleFromDB

                });
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	private JTable courseTables;
	private JTable instructorTables;
	private JTable studentTables;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminDashboard();
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
	public AdminDashboard() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1290, 720);
		AdminDashboard = new JPanel();
		AdminDashboard.setBackground(new Color(255, 255, 255));
		AdminDashboard.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(AdminDashboard);
		AdminDashboard.setLayout(null);
		
		JPanel sideBar = new JPanel();
		sideBar.setBackground(new Color(52, 73, 94));
		sideBar.setBounds(0, 0, 251, 683);
		AdminDashboard.add(sideBar);
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
		dashboardButton.setIcon(new ImageIcon(AdminDashboard.class.getResource("/Images/dashboard.png")));
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
		
		coursesButton.setIcon(new ImageIcon(AdminDashboard.class.getResource("/Images/courses.png")));
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
		settingButton.setIcon(new ImageIcon(AdminDashboard.class.getResource("/Images/settings.png")));
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
		logoutButton.setIcon(new ImageIcon(AdminDashboard.class.getResource("/Images/log-out.png")));
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
		instructorsButton.setIcon(new ImageIcon(AdminDashboard.class.getResource("/Images/instructor.png")));
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
		studentsButton.setIcon(new ImageIcon(AdminDashboard.class.getResource("/Images/graduates.png")));
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
		AdminDashboard.add(panel);
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
		
		JLabel lblNewLabel_3 = new JLabel("Admin");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(98, 28, 109, 37);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome to the Course Management System Dashboard");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 59, 444, 32);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/helolo.png")));
		lblNewLabel_5.setBounds(347, 0, 512, 279);
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(214, 234, 247));
		panel_4.setBounds(59, 192, 210, 215);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/studentsicon2.png")));
		lblNewLabel_6.setBounds(10, 10, 78, 85);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Students");
		lblNewLabel_7.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_7.setBounds(92, 145, 108, 60);
		panel_4.add(lblNewLabel_7);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(-135, -107, 298, 264);
		panel_4.add(lblNewLabel_10);
		lblNewLabel_10.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce.png")));
		
		JLabel lblNewLabel_15 = new JLabel("101");
		lblNewLabel_15.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_15.setBounds(23, 145, 63, 60);
		panel_4.add(lblNewLabel_15);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(214, 234, 247));
		panel_5.setBounds(398, 192, 210, 215);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/teachericon.png")));
		lblNewLabel_8.setBounds(10, 10, 81, 87);
		panel_5.add(lblNewLabel_8);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce2.png")));
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
		panel_6.setBounds(708, 192, 210, 215);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/courseicons.png")));
		lblNewLabel_9.setBounds(10, 24, 81, 67);
		panel_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce3.png")));
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
		courseTitle.setBackground(new Color(214, 234, 247));
		courseTitle.setHorizontalAlignment(SwingConstants.CENTER);
		courseTitle.setFont(new Font("Century Gothic", Font.BOLD, 30));
		headerCourses.add(courseTitle);
		UIManager.getDefaults().put("TableHeader.cellBorder" , BorderFactory.createEmptyBorder(0,0,0,0));
		for(int i = 0 ; i<db.getCourseCode().size();i++) {
			modalValue.addRow(new Object[] {db.getCourseCode().get(i),db.getCourseTitle().get(i),db.getCourseDuration().get(i),db.getCourseMark().get(i),db.getCourseLeader().get(i)});
		}
		for(int i = 0 ; i<db.getStudentId().size();i++) {
			studentValue.addRow(new Object[] {db.getStudentId().get(i),db.getStudentName().get(i),db.getPhoneNum().get(i),db.getStudentAddress().get(i),db.get_level().get(i),db.getStudentCourse().get(i)});
		}
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(70, 189, 359, 349);
		mainCoursesFrame.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/computer.png")));
		lblNewLabel_20.setBounds(146, 10, 77, 136);
		panel_7.add(lblNewLabel_20);
		
		JLabel lblNewLabel_19 = new JLabel("");
		lblNewLabel_19.setBounds(25, -62, 306, 248);
		panel_7.add(lblNewLabel_19);
		lblNewLabel_19.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce2.png")));
		
		JLabel lblNewLabel_23 = new JLabel("BSC(Hons)");
		lblNewLabel_23.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_23.setBounds(120, 196, 134, 56);
		panel_7.add(lblNewLabel_23);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_793698549557300");
//				frame.showDataFromDatabase();
			}
		});
		btnNewButton_1.setBackground(new Color(250, 229, 227));
		btnNewButton_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_1.setBounds(138, 270, 85, 35);
		panel_7.add(btnNewButton_1);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBackground(new Color(255, 255, 255));
		panel_7_1.setBounds(592, 189, 359, 349);
		mainCoursesFrame.add(panel_7_1);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/business.png")));
		lblNewLabel_21.setBounds(147, 10, 83, 121);
		panel_7_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce3.png")));
		lblNewLabel_22.setBounds(20, -61, 339, 247);
		panel_7_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_24 = new JLabel("BIBM");
		lblNewLabel_24.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_24.setBounds(147, 196, 68, 46);
		panel_7_1.add(lblNewLabel_24);
		
		JButton btnNewButton_2 = new JButton("View");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_793698549557300");
			}
		});
		btnNewButton_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_2.setBackground(new Color(229, 223, 243));
		btnNewButton_2.setBounds(145, 273, 85, 32);
		panel_7_1.add(btnNewButton_2);
		
	
		

		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/asc.jpg")));
		lblNewLabel_25.setBounds(0, 76, 1028, 607);
		mainCoursesFrame.add(lblNewLabel_25);
		
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
		UIManager.getDefaults().put("TableHeader.cellBorder" , BorderFactory.createEmptyBorder(0,0,0,0));
		for(int i = 0 ; i<db.getTeacherId().size();i++) {
			teacherValue.addRow(new Object[] {db.getTeacherId().get(i),db.getTeacherName().get(i),db.getPhoneNumber().get(i),db.get_module().get(i),db.get_address().get(i),db.get_fullTime().get(i)});
		}
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setLayout(null);
		panel_7_2.setBackground(Color.WHITE);
		panel_7_2.setBounds(79, 199, 359, 349);
		mainInstructor.add(panel_7_2);
		
		JLabel lblNewLabel_23_1 = new JLabel("BSC(Hons)");
		lblNewLabel_23_1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_23_1.setBounds(120, 196, 134, 56);
		panel_7_2.add(lblNewLabel_23_1);
		
		JButton btnNewButton_1_1 = new JButton("View");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_796135818434000");
			}
		});
		btnNewButton_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_1_1.setBackground(new Color(250, 229, 227));
		btnNewButton_1_1.setBounds(138, 270, 85, 35);
		panel_7_2.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/computer.png")));
		lblNewLabel_26.setBounds(149, 35, 85, 106);
		panel_7_2.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce2.png")));
		lblNewLabel_27.setBounds(21, -60, 309, 246);
		panel_7_2.add(lblNewLabel_27);
		
		JPanel panel_7_2_1 = new JPanel();
		panel_7_2_1.setLayout(null);
		panel_7_2_1.setBackground(Color.WHITE);
		panel_7_2_1.setBounds(605, 199, 359, 349);
		mainInstructor.add(panel_7_2_1);
		
		JLabel lblNewLabel_23_1_1 = new JLabel("BIBM");
		lblNewLabel_23_1_1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_23_1_1.setBounds(149, 194, 85, 56);
		panel_7_2_1.add(lblNewLabel_23_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("View");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_796135818434000");
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_1_1_1.setBackground(new Color(250, 229, 227));
		btnNewButton_1_1_1.setBounds(138, 270, 85, 35);
		panel_7_2_1.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_28 = new JLabel("");
		lblNewLabel_28.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/business.png")));
		lblNewLabel_28.setBounds(159, 34, 85, 97);
		panel_7_2_1.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce3.png")));
		lblNewLabel_29.setBounds(31, -53, 318, 240);
		panel_7_2_1.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("");
		lblNewLabel_30.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/asc.jpg")));
		lblNewLabel_30.setBounds(0, 79, 1028, 616);
		mainInstructor.add(lblNewLabel_30);
		
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
		UIManager.getDefaults().put("TableHeader.cellBorder" , BorderFactory.createEmptyBorder(0,0,0,0));
		
		JPanel panel_7_2_2 = new JPanel();
		panel_7_2_2.setLayout(null);
		panel_7_2_2.setBackground(Color.WHITE);
		panel_7_2_2.setBounds(66, 174, 359, 349);
		mainStudents.add(panel_7_2_2);
		
		JLabel lblNewLabel_23_1_2 = new JLabel("BSC(Hons)");
		lblNewLabel_23_1_2.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_23_1_2.setBounds(120, 196, 134, 56);
		panel_7_2_2.add(lblNewLabel_23_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("View");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_797954346157000");
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_1_1_2.setBackground(new Color(250, 229, 227));
		btnNewButton_1_1_2.setBounds(138, 270, 85, 35);
		panel_7_2_2.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_31 = new JLabel("");
		lblNewLabel_31.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/computer.png")));
		lblNewLabel_31.setBounds(145, 59, 78, 72);
		panel_7_2_2.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("");
		lblNewLabel_32.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce2.png")));
		lblNewLabel_32.setBounds(20, -49, 299, 255);
		panel_7_2_2.add(lblNewLabel_32);
		
		JPanel panel_7_2_2_1 = new JPanel();
		panel_7_2_2_1.setLayout(null);
		panel_7_2_2_1.setBackground(Color.WHITE);
		panel_7_2_2_1.setBounds(577, 174, 359, 349);
		mainStudents.add(panel_7_2_2_1);
		
		JLabel lblNewLabel_23_1_2_1 = new JLabel("BIBM");
		lblNewLabel_23_1_2_1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblNewLabel_23_1_2_1.setBounds(154, 196, 69, 56);
		panel_7_2_2_1.add(lblNewLabel_23_1_2_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("View");
		btnNewButton_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardPanel.show(panel,"name_797954346157000");
			}
		});
		btnNewButton_1_1_2_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btnNewButton_1_1_2_1.setBackground(new Color(250, 229, 227));
		btnNewButton_1_1_2_1.setBounds(138, 270, 85, 35);
		panel_7_2_2_1.add(btnNewButton_1_1_2_1);
		
		JLabel lblNewLabel_33 = new JLabel("");
		lblNewLabel_33.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/business.png")));
		lblNewLabel_33.setBounds(156, 51, 85, 72);
		panel_7_2_2_1.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("");
		lblNewLabel_34.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/cirlce3.png")));
		lblNewLabel_34.setBounds(27, -51, 291, 253);
		panel_7_2_2_1.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("");
		lblNewLabel_35.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/asc.jpg")));
		lblNewLabel_35.setBounds(0, 81, 1028, 602);
		mainStudents.add(lblNewLabel_35);
		
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
		lblNewLabel_18.setIcon(new ImageIcon(AdminDashboard.class.getResource("/images/250.jpg")));
		lblNewLabel_18.setBounds(98, 86, 270, 244);
		panel_1.add(lblNewLabel_18);
		
		JPanel courseTablePanel = new JPanel();
		panel.add(courseTablePanel, "name_793698549557300");
		courseTablePanel.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1028, 554);
		courseTablePanel.add(scrollPane_2);
		
		courseTables = new JTable();
		courseTables.setFillsViewportHeight(true);
		JTextField moduleCodeValue = updateCourse.getModuleCodeTextfield();
		JTextField mouduleTitleValue = updateCourse.getModuleTitleTextfield();
		JTextField moduleDurationValue = updateCourse.getModuleDurationTextfield();
		JTextField moduleMarkValue = updateCourse.getModuleMarkTextfield();
		JTextField moduleLeaderValue = updateCourse.getModuleLeaderTextfield();
		courseTables.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Object[] options = { "Update", "Delete" };
				int optionSelected = JOptionPane.showOptionDialog(null, "Do you want to update, delete or add?", "Update or Delete Landlord",
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
				//Updating table
				if(optionSelected == 0) {
					selectedRow = courseTables.getSelectedRow();
					for(int columnIndex = 0; columnIndex < courseTables.getColumnCount(); columnIndex++) {
					
						if(moduleCode.isEmpty()) {
							moduleCode = (String) courseTables.getValueAt(courseTables.getSelectedRow(), columnIndex);
							moduleCodeColumnIndex = columnIndex;
						}
						else if (moduleTitle.isEmpty()){
							moduleTitle = (String) courseTables.getValueAt(courseTables.getSelectedRow(), columnIndex);
							moduleTitleColumnIndex = columnIndex;
						} else if (moduleDuration.isEmpty()){
							moduleDuration = (String) courseTables.getValueAt(courseTables.getSelectedRow(),
									columnIndex);
							moduleDurationColumnIndex = columnIndex;

						} else if (moduleMark.isEmpty()) {
							moduleMark = (String) courseTables.getValueAt(courseTables.getSelectedRow(), columnIndex);
							moduleMarkColumnIndex = columnIndex;
						} else if (moduleLeader.isEmpty()) {
							moduleLeader = (String) courseTables.getValueAt(courseTables.getSelectedRow(), columnIndex);
							moduleLeaderColumnIndex = columnIndex;
						}
					}
					moduleCodeValue.setText(moduleCode);
					mouduleTitleValue.setText(moduleTitle);
					moduleDurationValue.setText(moduleDuration);
					moduleMarkValue.setText(moduleMark);
					moduleLeaderValue.setText(moduleLeader);
					
					
					JButton submitButton = updateCourse.getSubmitbutton();
					submitButton.setText("Update");
					submitButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {

					
							courseTables.setValueAt(moduleCodeValue.getText(), selectedRow, moduleCodeColumnIndex);
							courseTables.setValueAt(mouduleTitleValue.getText(), selectedRow, moduleTitleColumnIndex);
							courseTables.setValueAt(moduleDurationValue.getText(), selectedRow, moduleDurationColumnIndex);
							courseTables.setValueAt(moduleMarkValue.getText(), selectedRow, moduleMarkColumnIndex);
							courseTables.setValueAt(moduleLeaderValue.getText(), selectedRow, moduleLeaderColumnIndex);

							updateCourse.setVisible(false);
						}
					});
				String updateQuery = "UPDATE `course SET `module_code` = '"+moduleCodeValue.getText()+"', module_title='"+mouduleTitleValue.getText()+"',"
						+ "module_duration='"+moduleDurationValue.getText()+"',module_duration='"+moduleDurationValue.getText()+"',";
					
					updateCourse.setVisible(true);
					
					
				}
				else if(optionSelected == 1) {
					modalValue.removeRow(courseTables.getSelectedRow());
//					modalValue.addRow(new Object[] {"Hello", "kiki", "NabinGay"});
				}
			}
		});
		courseTables.setModel(modalValue);
		courseTables.setDefaultEditor(Object.class,null);
		courseTables.getTableHeader().setBackground(Color.decode("#d6eaf7"));
		courseTables.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 20));
		courseTables.setIntercellSpacing(new Dimension(5, 5));
		courseTables.setShowVerticalLines(false);
		courseTables.setRowHeight(35);
		courseTables.setIntercellSpacing(new Dimension(5, 5));
		courseTables.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		courseTables.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		courseTables.setBackground(Color.WHITE);
		scrollPane_2.setViewportView(courseTables);
		
		JButton addCourseButton = new JButton("Add");
		addCourseButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				updateCourse.setVisible(true);
				updateCourse.getModuleCodeTextfield().setVisible(false);
				updateCourse.getShowthis().setVisible(true);
				JTextField mouduleTitleValue = updateCourse.getModuleTitleTextfield();
				JTextField moduleDurationValue = updateCourse.getModuleDurationTextfield();
				JTextField moduleMarkValue = updateCourse.getModuleMarkTextfield();
				JTextField moduleLeaderValue = updateCourse.getModuleLeaderTextfield();
				JButton addButton = updateCourse.getSubmitbutton();
				addButton.setText("Add");
				
				
				addButton.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						newmoduleTitle = mouduleTitleValue.getText();
						newmoduleDuration= moduleDurationValue.getText();
						newmoduleMark= moduleMarkValue.getText();
						newmoduleLeader= moduleLeaderValue.getText();
//						Statement statement = dbUpdate.getStatement();
						Statement statement =  (Statement) UpdateDB.getStatement();
						
						String insertQuery = "INSERT INTO `course` ( `module_title`,  `module_duration`,`module_mark`, `module_leader`) " + "VALUES ( '"+newmoduleTitle+"','"+newmoduleDuration+"','"+newmoduleMark+"','"+newmoduleLeader+"')";
							
					try {
						int success = statement.executeUpdate(insertQuery);
					
						if (success==1) {
							frame.showDataFromDatabase();
							updateCourse.dispose();
                            JOptionPane.showMessageDialog(null, "Added Teacher data successfully!");
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null, "Unable to add the course, please try!");
					}
					}
				});
				
			}
		});
		addCourseButton.setForeground(new Color(255, 255, 255));
		addCourseButton.setBackground(new Color(45, 204, 112));
		addCourseButton.setFont(new Font("Century Gothic", Font.BOLD, 20));
		addCourseButton.setBounds(463, 605, 101, 35);
		courseTablePanel.add(addCourseButton);
		
		JPanel instructorTablePanel = new JPanel();
		panel.add(instructorTablePanel, "name_796135818434000");
		instructorTablePanel.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 1028, 556);
		instructorTablePanel.add(scrollPane_3);
		
		instructorTables = new JTable();
		instructorTables.setFillsViewportHeight(true);
		instructorTables.setModel(teacherValue);
		instructorTables.getTableHeader().setBackground(Color.decode("#d6eaf7"));
		instructorTables.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 20));
		instructorTables.setShowVerticalLines(false);
		instructorTables.setRowHeight(35);
		instructorTables.setIntercellSpacing(new Dimension(5, 5));
		instructorTables.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		instructorTables.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		instructorTables.setBackground(Color.WHITE);
		scrollPane_3.setViewportView(instructorTables);
		
		JButton addCourseButton_1 = new JButton("Add");
		addCourseButton_1.setForeground(Color.WHITE);
		addCourseButton_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		addCourseButton_1.setBackground(new Color(45, 204, 112));
		addCourseButton_1.setBounds(467, 613, 101, 35);
		instructorTablePanel.add(addCourseButton_1);
		
		JPanel studentTablePanel = new JPanel();
		panel.add(studentTablePanel, "name_797954346157000");
		studentTablePanel.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 1028, 551);
		studentTablePanel.add(scrollPane_4);
		
		studentTables = new JTable();
		studentTables.setFillsViewportHeight(true);
		studentTables.setModel(studentValue);
		studentTables.getTableHeader().setBackground(Color.decode("#d6eaf7"));
		studentTables.getTableHeader().setFont(new Font("Century Gothic", Font.BOLD, 20));
		studentTables.setShowVerticalLines(false);
		studentTables.setRowHeight(35);
		studentTables.setIntercellSpacing(new Dimension(5, 5));
		studentTables.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		studentTables.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		studentTables.setBackground(Color.WHITE);
		scrollPane_4.setViewportView(studentTables);
		
		JButton addCourseButton_1_1 = new JButton("Add");
		addCourseButton_1_1.setForeground(Color.WHITE);
		addCourseButton_1_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
		addCourseButton_1_1.setBackground(new Color(45, 204, 112));
		addCourseButton_1_1.setBounds(440, 604, 101, 35);
		studentTablePanel.add(addCourseButton_1_1);
	}
}
