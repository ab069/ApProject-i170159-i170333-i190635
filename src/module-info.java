module AssignmentManagementSystem {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.junit.jupiter.api;
	requires java.sql;
	requires java.desktop;
	requires jdk.internal.le;
	requires javafx.graphics;
	requires java.base;
	
	opens userInterfaceLayer to javafx.graphics, javafx.fxml;
}
