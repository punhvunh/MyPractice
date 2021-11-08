package by.epam.learn.collections.enumset;

import java.util.EnumSet;
import static by.epam.learn.collections.enumset.Country.*;
public class EnumSetMain {
    public static void main(String[] args) {
        EnumSet<Country> asiaCountries = EnumSet.of(ARMENIA, INDIA, KAZAKHSTAN);
        String nameCountry = "Belarus";
        Country current = Country.valueOf(nameCountry.toUpperCase());
        if(asiaCountries.contains(current)){
            System.out.println("Asia Action");
        }
        asiaCountries.forEach(c ->c.grow(1));

    }
}
