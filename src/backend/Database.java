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
	

	public List<String> getTeacherPassword() {
		return teacherPassword;
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


	public List<String> getOop_mark() {
		return oop_mark;
	}
	public List<String> getNmc_mark() {
		return nmc_mark;
	}
	public List<String> getAi_mark() {
		return ai_mark;
	}
	public List<String> getModule() {
		return module;
	}
	public List<String> getDueDate() {
		return dueDate;
	}
	public List<String> getQuestion_1() {
		return question1;
	}
	public List<String> getQuestion_2() {
		return question2;
	}
	public List<String> getQuestion_3() {
		return question3;
	}
	public List<String> getQuestion_4() {
		return question4;
	}
	public List<String> getMark() {
		return mark;
	}

	

	public List<String> getQuestion1() {
		return question1;
	}
	public List<String> getQuestion2() {
		return question2;
	}
	public List<String> getQuestion3() {
		return question3;
	}
	public List<String> getQuestion4() {
		return question4;
	}
	public List<String> getCheckStudentId() {
		return checkStudentId;
	}
	public List<String> getSubmittedBy() {
		return submittedBy;
	}
	public List<String> getCheckModule() {
		return checkModule;
	}
	public List<String> getCheckAssignment1() {
		return checkAssignment1;
	}
	public List<String> getCheckAssignment2() {
		return checkAssignment2;
	}
	public List<String> getCheckAssignment3() {
		return checkAssignment3;
	}
	public List<String> getCheckAssignment4() {
		return checkAssignment4;
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
	List<String> teacherPassword = new ArrayList<String>();
//Array for student table
		List<String> studentId = new ArrayList<String>();
		List<String> studentName= new ArrayList<String>();
		List<String> phoneNum= new ArrayList<String>();
		List<String> _level = new ArrayList<String>();
		List<String> studentAddress= new ArrayList<String>();
		List<String> studentCourse = new ArrayList<String>();
		List<String> studentPassword = new ArrayList<String>();
		List<String> oop_mark = new ArrayList<String>();
		List<String> nmc_mark = new ArrayList<String>();
		List<String> ai_mark = new ArrayList<String>();
//Array for assignment table
				List<String> module = new ArrayList<String>();
				List<String> dueDate= new ArrayList<String>();
				List<String> question1= new ArrayList<String>();
				List<String> question2 = new ArrayList<String>();
				List<String> question3= new ArrayList<String>();
				List<String> question4 = new ArrayList<String>();
				List<String> mark = new ArrayList<String>();
//Array for chekc assignment table
				List<String> checkStudentId = new ArrayList<String>();
				List<String> submittedBy= new ArrayList<String>();
				List<String> checkModule= new ArrayList<String>();
				List<String> checkAssignment1 = new ArrayList<String>();
				List<String> checkAssignment2= new ArrayList<String>();
				List<String> checkAssignment3 = new ArrayList<String>();
				List<String> checkAssignment4 = new ArrayList<String>();

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
			String teacherPasswords = executeQueryTeacher.getString("password");
			teacherId.add(teacher_id);
			teacherName.add(teacher_name);
			phoneNumber.add(phone_number);
			_module.add(module);
			_address.add(address);
			_fullTime.add(full_time);
			teacherPassword.add(teacherPasswords);
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
					String oopMark = executeQueryStudent.getString("oop_mark");
					String nmcMark = executeQueryStudent.getString("nmc_mark");
					String aiMark = executeQueryStudent.getString("ai_mark");
					studentId.add(student_id);
					studentName.add(student_name);
					phoneNum.add(phone_number);
					studentAddress.add(address);
					_level.add(level);
					studentCourse.add(course);
					studentPassword.add(password);
					oop_mark.add(oopMark);
					nmc_mark.add(aiMark);
					ai_mark.add(aiMark);
//					System.out.println(student_name + password);
				}
//		Fetching data of Assignment
				String QueryAssignment = "SELECT * FROM `assignment`";
				ResultSet executeQueryAssignmnet = createStatement.executeQuery(QueryAssignment);
				while(executeQueryAssignmnet.next()) {
//					Insertion for student table
					String modules = executeQueryAssignmnet.getString("module");
					String due_date = executeQueryAssignmnet.getString("due_date");
					String question_1 = executeQueryAssignmnet.getString("question_1");
					String question_2 = executeQueryAssignmnet.getString("question_2");
					String question_3 = executeQueryAssignmnet.getString("question_3");
					String question_4 = executeQueryAssignmnet.getString("question_4");
					String marks = executeQueryAssignmnet.getString("mark");
					module.add(modules);
					dueDate.add(due_date);
					question1.add(question_1);
					question2.add(question_2);
					question3.add(question_3);
					question4.add(question_4);
					mark.add(marks);
				}
//				Fetching data of Check Assignment
						String QueryCheckAssignment = "SELECT * FROM `submittedassignments`";
						ResultSet executeQueryCheckAssignmnet = createStatement.executeQuery(QueryCheckAssignment);
						while(executeQueryCheckAssignmnet.next()) {
//							Insertion for student table
							String student_id = executeQueryCheckAssignmnet.getString("student_id");
							String submitted_by = executeQueryCheckAssignmnet.getString("submitted_by");
							String module = executeQueryCheckAssignmnet.getString("module");
							String answer1 = executeQueryCheckAssignmnet.getString("answer1");
							String answer2 = executeQueryCheckAssignmnet.getString("answer2");
							String answer3 = executeQueryCheckAssignmnet.getString("answer3");
							String answer4 = executeQueryCheckAssignmnet.getString("answer4");
							checkStudentId.add(student_id);
							submittedBy.add(submitted_by);
							checkModule.add(module);
							checkAssignment1.add(answer1);
							checkAssignment2.add(answer2);
							checkAssignment3.add(answer3);
							checkAssignment4.add(answer4);
						}
				
			
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	
	new Database();
}
}