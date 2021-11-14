package by.epam.learn.db.statment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class DBMain {
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
		try (
			Connection connection = DriverManager.getConnection(url,properties);
			Statement statement = connection.createStatement()) {
			String sql = "SELECT ID, Name, Population  FROM WORLD.CITY WHERE CountryCode = \"AFG\" ";
			ResultSet resultSet = statement.executeQuery(sql);
			List<City> cityList = new ArrayList<>();
			while(resultSet.next()){
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				int population = resultSet.getInt("Population");
				cityList.add(new City (id, name,population));
			}
			System.out.println(cityList);

		} catch (SQLException e){
			e.printStackTrace();
		}

	}
}
