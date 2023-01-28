package backend;


import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
	
	public List<String> getArrayName() {
		return arrayName;
	}
	public List<String> getArrayID() {
		return arrayID;
	}
	List<String> arrayName = new ArrayList<String>();
	List<String> arrayID= new ArrayList<String>();
public Database() {
	try {
		Connection connection = getConnection("jdbc:mysql://localhost:3307/course management system","root","");
		Statement createStatement = connection.createStatement();
		String Query1 = "SELECT * FROM `teacher`";
		ResultSet executeQuery = createStatement.executeQuery(Query1);
		while(executeQuery.next()) {
			String teacherName = executeQuery.getString("teacher_name");
			String teacherId = executeQuery.getString("teacher_id");
			arrayName.add(teacherName);
			arrayID.add(teacherId);
		}
		System.out.println(arrayName);
		System.out.println(arrayID);
		
		
		
		
		
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	
	new Database();
}
}