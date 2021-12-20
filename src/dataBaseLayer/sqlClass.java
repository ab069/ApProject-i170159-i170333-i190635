package dataBaseLayer;

import java.sql.*;

public class sqlClass {
	public void insertIntoUser(int id, String name, String userName,  String password){
		try {
		//	String url="jdbc:mysql://localhost:3306/db";
			Class.forName("com.mysql.cj.jdbc.Driver");
		//	Connection con=DriverManager.getConnection(url,"root","password");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","9597");
			Statement statemnt=con.createStatement();
		
			String q="insert into User id, userName, and password)" + " values ('"+id+"','"+name+"','"+userName+"','"+password+"')";
			
			statemnt.executeUpdate(q);
			con.close();
		   }
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void insertIntoAssignment(String sub, String top, int total, boolean s){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","9597");
			Statement statemnt=con.createStatement();
		
			String q="insert into Assignmengt subject, Topic, Total, and Status)" + " values ('"+sub+"','"+top+"','"+total+"','"+s+"')";
			
			statemnt.executeUpdate(q);
			con.close();
		   }
		catch(Exception e) {
			System.out.println(e);
		}
	}

}