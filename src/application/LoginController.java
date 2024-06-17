package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {
	@FXML
	public AnchorPane basePane;
	public TextField unameTF;
	public PasswordField upwdPF;
	public Label optLB;
	
	public void loginBtnClicked(ActionEvent ae) {
		String uname,upass;
		uname = unameTF.getText();
		upass = upwdPF.getText();
		if(uname.equals("admin") && upass.equals("admin123")) {
			optLB.setText("Login Successful");
			System.out.println("Debug:Login Successful");
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("home.fxml"));
			try {
				basePane.getChildren().clear();
				basePane.getChildren().add(loader.load());
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		else {
			optLB.setText("Login Failed");
			System.out.println("Debug:Login Failed");			
		}
	}
}
