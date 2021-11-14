package by.epam.learn.db.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

public class MyBatch {

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
		properties.put("useUnicode", "true");
		properties.put("useSSL", "true");
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url,properties);
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			statement.addBatch("INSERT INTO city(ID, Name, CountryCode, District, Population) VALUES(5052, Moscow, Russia, Rus, 2000000)");
			statement.addBatch("INSERT INTO city(ID, Name, CountryCode, District, Population) VALUES(5053, 'Moscow', 'Russia', 'Rus', 2000000)");
			int[] updateCounts = statement.executeBatch();
			connection.commit();
			System.out.println(Arrays.toString(updateCounts));
		} catch (SQLException e){
			try {
				if(connection !=null){
					connection.rollback();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		} finally {
			try {
				if(connection !=null) {
					connection.setAutoCommit(true);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(connection !=null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
