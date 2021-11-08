package by.epam.learn.collections.enummap;

import by.epam.learn.collections.enumset.Country;

import java.util.EnumMap;


public class EnumMapMain {
    public static void main(String[] args) {
        EnumMap<Country, Integer> countryIntegerEnumMap = new EnumMap<Country, Integer>(Country.class);
        countryIntegerEnumMap.put(Country.POLAND,8);
        countryIntegerEnumMap.put(Country.UKRAINE, 1);
        countryIntegerEnumMap.put(Country.BELARUS, 0);
        System.out.println(countryIntegerEnumMap);
        System.out.println(countryIntegerEnumMap.containsKey(Country.UKRAINE));
    }
}
