package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtFamilyName;
	@FXML
	private TextField txtEmail;
	@FXML
	private TextField txtUserName;
	@FXML
	private TextField txtPass;
	@FXML
	private TextField txtConfPass;
	
	public void Create(ActionEvent event) throws Exception {
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("/application/main.fxml"));
		Scene scene = new Scene(root,800,700);
		scene.getStylesheets().add(getClass().getResource("/application/main.fxml").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public void Return(ActionEvent event) throws Exception {
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("/application/login.fxml"));
		Scene scene = new Scene(root,800,700);
		scene.getStylesheets().add(getClass().getResource("/application/login.fxml").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}


}
