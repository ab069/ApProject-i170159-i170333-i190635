package userInterfaceLayer;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class afterLogginInController {
	
	@FXML
	private Button assignment;

	@FXML
	private Label menu;

	@FXML
	private Button task;

	@FXML 
	private Button deadline;

	
	
	public void onTask(ActionEvent event) throws IOException{
		Main x=new Main();
		x.changeScene("Taskk.fxml");
	}
	
	public void onDeadline(ActionEvent event) throws IOException{
		Main x=new Main();
		x.changeScene("Deadlinee.fxml");
	}
	
	public void onAssignment(ActionEvent event) throws IOException{
		Main x=new Main();
		x.changeScene("Assignmentt.fxml");
	}

}
