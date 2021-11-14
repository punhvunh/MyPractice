package by.epam.learn.db.statment;

import by.epam.learn.classes.javabeanwithxml.Entity;

public class City extends Entity {
	private int id;
	private String name;
	private String countryCode;
	private String district;
	private int population;

	public City(
			final int id, final String name, final String countryCode, final String district, final int population
	) {
		this.id = id;
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	public City(final int id, final String name, final int population) {
		this.id = id;
		this.name = name;
		this.population = population;
	}

	@Override
	public String toString() {
		return "City{" + "id=" + id + ", name='" + name + '\'' + ", countryCode='" + countryCode + '\'' + ", district='"
				+ district + '\'' + ", population=" + population + '}';
	}
}
