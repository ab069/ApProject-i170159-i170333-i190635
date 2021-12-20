package userInterfaceLayer;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.io.IOException;

import businessLogicLayer.Student;

public class logInController {

	stt a;
	Student[] st=new Student[5];
	int i=0;
@FXML
private Button logButton;

@FXML
private Label wrongLogin;

@FXML
private TextField username;

@FXML 
private PasswordField password;


public void userLogIn(ActionEvent event) throws IOException {
	checkLogIn();
}

private void checkLogIn() throws IOException{
	Main x=new Main();
	if(username.getText().toString().equals("Narmeen") && password.getText().toString().equals("123")) {
		wrongLogin.setText("Successful Login!");
		st[i].setUserName(username.getText().toString());
		st[i].setId(1);
		st[i].setPassword(password.getText().toString());
		st[i].setPermissionflag(false);
		st[i].setName(username.getText().toString());
		if(i==4)
		{
			a.add(st);
		}
		i++;
		//String name="afterLoggingIn.fxml";
		x.changeScene("afterLoggingIn.fxml");
		//x.changeScene(name);
	}
	
	else if(username.getText().toString().equals("Abdullah") && password.getText().toString().equals("234")) {
		wrongLogin.setText("Successful Login!");	
		st[i].setUserName(username.getText().toString());
		st[i].setId(2);
		st[i].setPassword(password.getText().toString());
		st[i].setPermissionflag(false);
		st[i].setName(username.getText().toString());
		if(i==4)
		{
			a.add(st);
		}
		i++;
		x.changeScene("afterLoggingIn.fxml");
	}
	
	else if(username.getText().toString().equals("Umair") && password.getText().toString().equals("345")) {
		wrongLogin.setText("Successful Login!");	
		st[i].setUserName(username.getText().toString());
		st[i].setId(3);
		st[i].setPassword(password.getText().toString());
		st[i].setPermissionflag(false);
		st[i].setName(username.getText().toString());
		i++;
		if(i==4)
		{
			a.add(st);
		}
		x.changeScene("afterLoggingIn.fxml");
	}
	
	else if(username.getText().toString().equals("Subhan") && password.getText().toString().equals("456")) {
		wrongLogin.setText("Successful Login!");
		st[i].setUserName(username.getText().toString());
		st[i].setId(4);
		st[i].setPassword(password.getText().toString());
		st[i].setPermissionflag(false);
		st[i].setName(username.getText().toString());
		i++;
		if(i==4)
		{
			a.add(st);
		}
		x.changeScene("afterLoggingIn.fxml");
	}
	
	else if(username.getText().toString().equals("Waleed") && password.getText().toString().equals("567")) {
		wrongLogin.setText("Successful Login!");	
		st[i].setUserName(username.getText().toString());
		st[i].setId(5);
		st[i].setPassword(password.getText().toString());
		st[i].setPermissionflag(false);
		st[i].setName(username.getText().toString());
		if(i==4)
		{
			a.add(st);
		}
		i++;
		x.changeScene("afterLoggingIn.fxml");
	}
	
	else if(username.getText().toString().equals("Teacher") && password.getText().toString().equals("abc")) {
		wrongLogin.setText("Successful Login!");	
		x.changeScene("afterLoggingIn.fxml");
	}
	
	else if(username.getText().isEmpty() && password.getText().isEmpty()) {
		wrongLogin.setText("Please Enter Information.");
	}
	
	else {
		wrongLogin.setText("Incorrect Username or Password Entered!");
	}
}
}
