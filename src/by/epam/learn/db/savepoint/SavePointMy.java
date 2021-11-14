package by.epam.learn.db.savepoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.Properties;

public class SavePointMy {

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
		Savepoint savepoint = null;
		try {
			connection = DriverManager.getConnection(url, properties);
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();
			statement.executeUpdate("UPDATE INTO world.city VALUES(5052, Moscow, Russia, Rus, 2000000)");
			savepoint = connection.setSavepoint();
			connection.commit();
		} catch (SQLException e){
			try {
				connection.rollback(savepoint);
			} catch (SQLException ex) {
				ex.printStackTrace();
			}

		}
	}
}
