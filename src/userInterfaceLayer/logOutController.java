package userInterfaceLayer;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class logOutController {
	
	public void userLogOut(ActionEvent event) throws IOException{
		Main x=new Main();
		x.changeScene("Login.fxml");
	}

}
