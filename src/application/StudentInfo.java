package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class StudentInfo {
	
	SimpleIntegerProperty rollno;
	SimpleStringProperty name;
	SimpleStringProperty roomno;
	SimpleStringProperty contact;
	
	
	public StudentInfo(int rollno, String name, String roomno, String contact) {
		super();
		this.rollno = new SimpleIntegerProperty(rollno);
		this.name = new SimpleStringProperty(name);
		this.roomno = new SimpleStringProperty(roomno);
		this.contact = new SimpleStringProperty(contact);
	}
	public int getRollno() {
		return rollno.get();
	}
	
	public String getName() {
		return name.get();
	}

	public String getRoomno() {
		return roomno.get();
	}

	public String getContact() {
		return contact.get();
	}

}
