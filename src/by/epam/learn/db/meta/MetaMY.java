package by.epam.learn.db.meta;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import by.epam.learn.db.statment.City;

public class MetaMY {

	public static void main(String[] args) {

	try {
		DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
	} catch (
	SQLException e) {
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
		try (
		Connection connection = DriverManager.getConnection(url,properties);
		Statement statement = connection.createStatement()){
		String sql = "SELECT ID, Name, CountryCode, District, Population  FROM WORLD.CITY WHERE CountryCode = \"AFG\"";
		ResultSet resultSet = statement.executeQuery(sql);
		List<City> cityList = new ArrayList<>();
		while(resultSet.next()){
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String countryCode = resultSet.getString("CountryCode");
			String district = resultSet.getString(4);
			int population = resultSet.getInt(5);
			cityList.add(new City (id, name,countryCode, district, population));
		}
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			System.out.println(resultSetMetaData.getColumnCount());
			System.out.println(resultSetMetaData.getColumnName(1));
			System.out.println(resultSetMetaData.getColumnType(1));
			System.out.println(resultSetMetaData.getColumnTypeName(1));
			System.out.println(resultSetMetaData.isNullable(1));
			DatabaseMetaData databaseMetaData = connection.getMetaData();
			System.out.println(databaseMetaData.getDatabaseProductName());
			System.out.println(databaseMetaData.getDatabaseProductVersion());
			System.out.println(databaseMetaData.getUserName());
			System.out.println(databaseMetaData.getURL());
		if(!cityList.isEmpty()){
			System.out.println(cityList);
		} else {
			System.out.println("Data not found");
		}
	} catch (SQLException e){
		e.printStackTrace();
	}

}
}
