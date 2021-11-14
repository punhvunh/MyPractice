package by.epam.learn.db.dao.impl;

import java.util.List;

import by.epam.learn.db.dao.CityDao;
import by.epam.learn.db.statment.City;

public class CityDaoImpl implements CityDao {

	@Override
	public List<Long> findAll() {
		return null;
	}

	@Override
	public Long findEntityById(final City id) {
		return null;
	}

	@Override
	public boolean delete(final Long aLong) {
		return false;
	}

	@Override
	public boolean delete(final City id) {
		return false;
	}

	@Override
	public boolean create(final Long aLong) {
		return false;
	}

	@Override
	public Long update(final Long aLong) {
		return null;
	}

	@Override
	public List<City> findCityByName(final String patternName) {
		return null;
	}
}
