package businessLogicLayer;


import java.util.Scanner;

public class Teacher extends User{

	private String name;
    private String room;
    private String email;
    private String course;

    Scanner inp1 = new Scanner(System.in);
    
    public void setGroupLeader(Student[] a){
        
    	int check=0;
    	int idOfLeader;
        System.out.println("Enter student id of Leader");
        idOfLeader=inp1.nextInt();
        for (int i=0;i<a.length;i++) {
        	if(a[i].isPermissionflag()) {
        		check=1;
        	}
        }
        if(check==0) {
        	 for (int i=0;i<a.length;i++) {
             	if (a[i].getId()==idOfLeader) {
             		a[i].setPermissionflag(true);
             		break;
             	}		
             }
        }
        else {
        	System.out.print("There already is a group leader");
        }
       
    }
}
