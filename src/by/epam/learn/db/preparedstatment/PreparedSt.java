package by.epam.learn.db.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import by.epam.learn.db.statment.City;

public class PreparedSt {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/world";
		Properties properties = new Properties();
		properties.put("user", "root");
		properties.put("password", "foka94bond02");
		properties.put("autoReconnect", "true");
		properties.put("characterEncoding", "UTF-8");
		try (Connection connection = DriverManager.getConnection(url, properties)) {
			String sql = "INSERT INTO CITY(ID, Name, CountryCode, District, Population) VALUES(?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,5055);
			preparedStatement.setString(2,"Paris");
			preparedStatement.setString(3,"Fra");
			preparedStatement.setString(4,"Par");
			preparedStatement.setInt(5,20155454);
			 int rows = preparedStatement.executeUpdate();
			System.out.println(rows);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
