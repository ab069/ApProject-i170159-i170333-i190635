package businessLogicLayer;
import java.applet.Applet;
import java.applet.AudioClip;
import java.sql.SQLException;
import java.util.Scanner;

import javax.print.DocFlavor.URL;


import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import dataBaseLayer.sqlClass;

public class Student extends User{

    private String name;
    private boolean permissionflag;
    
    Scanner inp1 = new Scanner(System.in);
    
    //Setters and Getters 
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public boolean isPermissionflag() {
		return permissionflag;
	}

	public void setPermissionflag(boolean permissionflag) {
		this.permissionflag = permissionflag;
	}

	//Function to add an Assignment
    public Assignment addAssignment() throws SQLException{
            String sub;
            String top;
            int total;
            boolean s;
          
            Assignment obj=new Assignment();
            System.out.print("Enter Subject: ");
            sub = inp1.next();
            obj.setSubject(sub);

            System.out.print("Enter Topic: ");
            top = inp1.next();
            obj.setTopic(top);

            System.out.print("Enter Total Score: ");
            total = inp1.nextInt();
            obj.setTotalScore(total);

            System.out.print("Enter Status: ");
            s = inp1.nextBoolean();
            obj.setStatus(s);
            
            sqlClass sq=new sqlClass();
			sq.insertIntoAssignment(sub,top,total,s);
            
            return obj;
    }
    
    //Function to update an assignment
    public void updateAssignment(Assignment obj) throws ScoreInvalidException{
        String sub;
        String top;
        int total;
        boolean s;
        
        System.out.print("Enter Subject: ");
        sub = inp1.next();
        obj.setSubject(sub);
        System.out.print("Enter Topic: ");
        top = inp1.next();
        obj.setTopic(top);
        System.out.print("Enter Total Score: ");
        total = inp1.nextInt();
        if(total<0)   
      		{
      			throw new ScoreInvalidException("You entered an Invalid Score");
      		}
        obj.setTotalScore(total);
        System.out.print("Enter Status: ");
        s = inp1.nextBoolean();
        obj.setStatus(s);
}
    
    //Function to assign task
    public int assignTask() throws IdInvalidException {
    	if(permissionflag==true) {
    		String topic;
    		int status;
    		int sID;
    
    		Task obj=new Task();
    		System.out.print("Enter Topic: ");
    	    topic = inp1.next();
    	    obj.setTopic(topic);
    	    System.out.print("Enter status: ");
    	    status= inp1.nextInt();
    	    obj.setStatus(status);
    	    System.out.print("Enter student id of student you want to assign the task to: ");
    	    sID= inp1.nextInt();
    	    if(sID<0 || sID>999)  
    		{
    			throw new IdInvalidException("You entered an Invalid id");
    		}
    	    obj.setsId(sID);
    	    
    	    
    	    return 1;
    	}
    	else {
    		System.out.print("You don't have permission to assign a task");
    		return 0;
    	}
    }
    
    public int setDeadline() {
    	if(permissionflag==true) {
    		String deadline;
    		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
    		LocalDateTime now = LocalDateTime.now();  
    	
    		System.out.print("Enter date and time of deadline in this format yyyy/MM/dd HH:mm:ss: ");
    	    deadline = inp1.next();
    	    
    /*	    while(deadline==dtf.format(now)) {
    	    	java.net.URL url = getClass().getResource("/foo/bar/sound.wav");
    	    	AudioClip clip = Applet.newAudioClip(url);
    	    	clip.play();	
    	    }*/
    	    
    	    return 1;
    	}
    	else {
    		return 0;
    	}
    }

}