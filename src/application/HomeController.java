package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class HomeController {
	
	@FXML
	public AnchorPane basePane;
	
	public void homeBtnClicked(ActionEvent ae) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("home_view.fxml"));
		try {
			basePane.getChildren().clear();
			basePane.getChildren().add(loader.load());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void getDataBtnClicked(ActionEvent ae) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("getData_view.fxml"));
		try {
			basePane.getChildren().clear();
			basePane.getChildren().add(loader.load());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void setDataBtnClicked(ActionEvent ae) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("setData_view.fxml"));
		try {
			basePane.getChildren().clear();
			basePane.getChildren().add(loader.load());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public void infoBtnClicked(ActionEvent ae) {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("info_view.fxml"));
		try {
			basePane.getChildren().clear();
			basePane.getChildren().add(loader.load());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}

}
