package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SetDataController {

	@FXML
	public TextField idTF;
	public TextField nameTF;
	public TextField roomnoTF;
	public TextField contactTF;
	public Label optLabel;
	
	public void setData(ActionEvent ae) {
		StudentInfo s = new StudentInfo
				(Integer.parseInt(idTF.getText()), 
						nameTF.getText(), roomnoTF.getText(), 
						contactTF.getText());
		DBAccess.addStudentData(s);;
		optLabel.setText("Data Inserted Successfully");
	}
}
