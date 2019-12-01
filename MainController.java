package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainController {
@FXML
private TextField txtOtherUserType;
@FXML
private TextField txtUserType;
@FXML
private TextField txtSearch;
@FXML
private TextField txtWhoisType;
@FXML
private ImageView imageSent;
@FXML
private ImageView imageAttach;
@FXML
private ImageView imageCall;
@FXML
private ImageView imageVideoCall;

public void Logout(ActionEvent event) throws Exception {
	Stage primaryStage=new Stage();
	Parent root=FXMLLoader.load(getClass().getResource("/application/login.fxml"));
	Scene scene = new Scene(root,800,700);
	scene.getStylesheets().add(getClass().getResource("/application/login.fxml").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
}

public void SentMessages() {
	
}

public void attachFile() {
	
}
public void CallUser() {
	
}

}
