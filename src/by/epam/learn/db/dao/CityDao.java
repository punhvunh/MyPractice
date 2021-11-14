package by.epam.learn.db.dao;

import java.util.List;

import by.epam.learn.db.statment.City;

public interface CityDao extends BaseDao<Long , City > {
	List<City> findCityByName(String  patternName);
}
