package by.epam.learn.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectingDemo {

	public static void main(String[] args) {

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sakila","root","foka94bond02");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("ok");
	}
}
