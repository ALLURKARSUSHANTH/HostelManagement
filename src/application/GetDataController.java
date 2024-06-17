package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class GetDataController {
	@FXML
	public TextField idTF;
	public TextField nameTF;
	public TextField roomnoTF;
	public TextField contactTF;
	
	public void getDetails(ActionEvent ae) {
		StudentInfo s = DBAccess.getStudentData(idTF.getText());
		nameTF.setText(s.getName());
		roomnoTF.setText(s.getRoomno());
		contactTF.setText(s.getContact());
	}
}
