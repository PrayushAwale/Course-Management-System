package backend;


import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public List<String> getCourseCode() {
		return courseCode;
	}
	public List<String> getCourseTitle() {
		return courseTitle;
	}
	public List<String> getCourseDuration() {
		return courseDuration;
	}
	public List<String> getCourseMark() {
		return courseMark;
	}
	public List<String> getCourseLeader() {
		return courseLeader;
	}
	
public List<String> getTeacherId() {
		return teacherId;
	}
	public List<String> getTeacherName() {
		return teacherName;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public List<String> get_module() {
		return _module;
	}
	public List<String> get_address() {
		return _address;
	}
	public List<String> get_fullTime() {
		return _fullTime;
	}


	public List<String> getStudentId() {
		return studentId;
	}
	public List<String> getStudentName() {
		return studentName;
	}
	public List<String> getPhoneNum() {
		return phoneNum;
	}
	public List<String> get_level() {
		return _level;
	}
	public List<String> getStudentAddress() {
		return studentAddress;
	}
	public List<String> getStudentCourse() {
		return studentCourse;
	}

	public List<String> getStudentPassword() {
		return studentPassword;
	}


	//	Array for module table
	List<String> courseCode = new ArrayList<String>();
	List<String> courseTitle= new ArrayList<String>();
	List<String> courseDuration= new ArrayList<String>();
	List<String> courseMark= new ArrayList<String>();
	List<String> courseLeader= new ArrayList<String>();
//Array for teacher table
	List<String> teacherId = new ArrayList<String>();
	List<String> teacherName= new ArrayList<String>();
	List<String> phoneNumber= new ArrayList<String>();
	List<String> _module= new ArrayList<String>();
	List<String> _address= new ArrayList<String>();
	List<String> _fullTime= new ArrayList<String>();
//Array for student table
		List<String> studentId = new ArrayList<String>();
		List<String> studentName= new ArrayList<String>();
		List<String> phoneNum= new ArrayList<String>();
		List<String> _level = new ArrayList<String>();
		List<String> studentAddress= new ArrayList<String>();
		List<String> studentCourse = new ArrayList<String>();
		List<String> studentPassword = new ArrayList<String>();

public Database() {
	try {
		Connection connection = getConnection("jdbc:mysql://localhost:3307/course management system","root","");
		Statement createStatement = connection.createStatement();
		String Query1 = "SELECT * FROM `course`";
		ResultSet executeQuery = createStatement.executeQuery(Query1);
		
//		String CountQuery = "SELECT COUNT(student_id)";
//		ResultSet executeCount = createStatement.executeQuery(CountQuery);
//		
//		String COunt = executeQuery.getString(0);
//		System.out.println(COunt);
//		fetching data for students
		while(executeQuery.next()) {
//			Insertion for module table
			String coursecode = executeQuery.getString("module_code");
			String coursetitle = executeQuery.getString("module_title");
			String courseduration = executeQuery.getString("module_duration");
			String coursemark = executeQuery.getString("module_mark");
			String courseleader = executeQuery.getString("module_leader");
			courseCode.add(coursecode);
			courseTitle.add(coursetitle);
			courseDuration.add(courseduration);
			courseMark.add(coursemark);
			courseLeader.add(courseleader);
			
			
		}
		
		
		//Fetching data for teachers
		String QueryInsutructor = "SELECT * FROM `teacher`";
		ResultSet executeQueryTeacher = createStatement.executeQuery(QueryInsutructor);
		while(executeQueryTeacher.next()) {
//			Insertion for teacher table
			String teacher_id = executeQueryTeacher.getString("teacher_id");
			String teacher_name = executeQueryTeacher.getString("teacher_name");
			String phone_number = executeQueryTeacher.getString("phone_number");
			String module = executeQueryTeacher.getString("module");
			String address = executeQueryTeacher.getString("address");
			String full_time = executeQueryTeacher.getString("full_time");
			teacherId.add(teacher_id);
			teacherName.add(teacher_name);
			phoneNumber.add(phone_number);
			_module.add(module);
			_address.add(address);
			_fullTime.add(full_time);
		}

		//Fetching data for students
				String QueryStudent = "SELECT * FROM `student`";
				ResultSet executeQueryStudent = createStatement.executeQuery(QueryStudent);
				while(executeQueryStudent.next()) {
//					Insertion for student table
					String student_id = executeQueryStudent.getString("uni_id");
					String student_name = executeQueryStudent.getString("student_name");
					String phone_number = executeQueryStudent.getString("phone_num");
					String level = executeQueryStudent.getString("level");
					String address = executeQueryStudent.getString("address");
					String course = executeQueryStudent.getString("course");
					String password = executeQueryStudent.getString("password");
					studentId.add(student_id);
					studentName.add(student_name);
					phoneNum.add(phone_number);
					studentAddress.add(address);
					_level.add(level);
					studentCourse.add(course);
					studentPassword.add(password);
//					System.out.println(student_name + password);
				}
//		Fetching data of assignmnet
				String QueryAssignment = "SELECT * FROM `student`";
				ResultSet executeQueryAssignmnet = createStatement.executeQuery(QueryAssignment);
				while(executeQueryAssignmnet.next()) {
//					Insertion for student table
					String student_id = executeQueryAssignmnet.getString("uni_id");
					String student_name = executeQueryAssignmnet.getString("student_name");
					String phone_number = executeQueryAssignmnet.getString("phone_num");
					String level = executeQueryAssignmnet.getString("level");
					String address = executeQueryAssignmnet.getString("address");
					String course = executeQueryAssignmnet.getString("course");
					String password = executeQueryAssignmnet.getString("password");
					studentId.add(student_id);
					studentName.add(student_name);
					phoneNum.add(phone_number);
					studentAddress.add(address);
					_level.add(level);
					studentCourse.add(course);
					studentPassword.add(password);
//					System.out.println(student_name + password);
				}
				
			
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	
	new Database();
}
}