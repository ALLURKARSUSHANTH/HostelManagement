package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DBAccess {
	 static Statement stmt =null ;
	 static Connection conn = null;
	
	public static void connectToDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hosteldb",
					"root","");
			stmt = conn.createStatement();
			System.out.println("DB Connection Successful");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void disconnectToDB() {
		try {
			conn.close();
			System.out.println("DB Disconnected");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void addStudentData(StudentInfo si) {
		try {
			stmt.executeUpdate("insert into hostelDetails values("
					+ "'"+si.getRollno()+"','"+si.getName()+"',"
							+ "'"+si.getRoomno()+"','"+si.getContact()+"')");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static StudentInfo getStudentData(String id) {
		StudentInfo si = null;
		try {
			ResultSet rs = stmt.executeQuery("select * from hostelDetails where id = '"+id+"'");
			while(rs.next())
			si= new StudentInfo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			return si;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return si;
	}
/*
create database hosteldb;
use hosteldb;
create table hostelDetails( id int, name varchar(30), roomno varchar(10), contact varchar(10));
*/
}

