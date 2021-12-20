package businessLogicLayer;


import java.sql.SQLException;
import java.util.Scanner;

import dataBaseLayer.sqlClass;

public class User 
{
	private int id;
	private String name;
	private String userName;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Scanner inp1 = new Scanner(System.in);
    
    void openNewAccount() throws SQLException {
    	
    		System.out.print("Enter your id: ");
  	        id = inp1.nextInt();
  	        System.out.print("Enter your Name: ");
	        name = inp1.next();
  	        System.out.print("Enter your userName: ");
  	        userName = inp1.next();
  	        System.out.print("Enter your password: ");
  	        password = inp1.next();
  	        
			sqlClass sq=new sqlClass();
			sq.insertIntoUser(id,name,userName,password);
      
    }
	

}
