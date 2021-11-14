package by.epam.learn.db.resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import by.epam.learn.db.statment.City;

public class ResultSETMY {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver( new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
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
		try (Connection connection = DriverManager.getConnection(url,properties);
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
			ResultSet resultSet = statement.executeQuery("SELECT ID, Name, CountryCode, District, Population  FROM WORLD.CITY WHERE CountryCode = \"AFG\" ");
			List<City> cityList = new ArrayList<>();
			resultSet.moveToInsertRow();
			resultSet.updateInt(1,5050);
			resultSet.updateString(2,"Minsk");
			resultSet.updateString(3,"Bel");
			resultSet.updateString(4,"Minsk Obl");
			resultSet.updateInt(5,2000000);
			resultSet.insertRow();
			resultSet.moveToCurrentRow();
			while(resultSet.next()){
				int id = resultSet.getInt(1);
				if (id==1){
					resultSet.updateInt("Population", 1000);
					resultSet.updateRow();
				}
				String name = resultSet.getString(2);
				String countryCode = resultSet.getString("CountryCode");
				String district = resultSet.getString(4);
				int population = resultSet.getInt(5);
				cityList.add(new City (id, name,countryCode, district, population));
			}
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
