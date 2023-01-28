package backend;


import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
public Database() {
	try {
		Connection connection = getConnection("jdbc:mysql://ocalhost:3307/course_managemtn_system","root","");
		Statement createStatement = connection.createStatement();
		String Query1 = "SELECT * FROM `student`";
		ResultSet executeQuery = createStatement.executeQuery(Query1);
		executeQuery.next();
		System.out.println(executeQuery.getString("name"));
	}catch(SQLException e) {
		e.printStackTrace();
	}
	
}
public static void main(String[] args) {
	new Database();
}
}