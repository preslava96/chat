package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
@FXML
private Label lblSign;
@FXML
private TextField txtUserName;
@FXML
private TextField txtPass;

public void Login(ActionEvent event) throws Exception {
	if(txtUserName.getText().equals("user") && txtPass.getText().equals("pass")) {
		lblSign.setText("Login success!");
		Stage primaryStage=new Stage();
		Parent root=FXMLLoader.load(getClass().getResource("/application/main.fxml"));
		Scene scene = new Scene(root,800,700);
		scene.getStylesheets().add(getClass().getResource("/application/main.fxml").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	else
	{
		lblSign.setText("Login failed!");
	}
}
public void Register(ActionEvent event) throws Exception {
	Stage primaryStage=new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("/application/register.fxml"));
	Scene scene = new Scene(root,800,700);
	scene.getStylesheets().add(getClass().getResource("/application/register.fxml").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}

}
