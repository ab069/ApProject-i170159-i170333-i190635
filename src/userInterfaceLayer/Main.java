package userInterfaceLayer;
	
import java.io.IOException;

import businessLogicLayer.Student;
import javafx.application.Application;
import javafx.stage.Stage;
//import jdk.internal.util.xml.XMLStreamException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private static Stage stg;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			stg=primaryStage;
			String name="Login.fxml";
			primaryStage.setResizable(false);
		//	BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Login.fxml"));
			//Parent root=FXMLLoader.load(getClass().getResource(name));
			Parent root=FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(root,600,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Assignment Management System");
		//	primaryStage.setFullScreen(true);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String fxml) throws IOException{
		try {
		Parent pane=FXMLLoader.load(getClass().getResource(fxml));
		//BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource(fxml));
		stg.getScene().setRoot(pane);
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}

