package userInterfaceLayer;

import java.io.IOException;
import java.sql.SQLException;

import businessLogicLayer.Assignment;
import businessLogicLayer.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AssignmentController {

	@FXML
	private Button addedAssignmengts;

	@FXML
	private Button add;
	
	private void onAdd() throws IOException, SQLException{
		Main x=new Main();
		Assignment obj=new Assignment();
		Student s = new Student();
		s.addAssignment();
	}
	public void onAddedAssignments() throws IOException{
		
	}
		
}
