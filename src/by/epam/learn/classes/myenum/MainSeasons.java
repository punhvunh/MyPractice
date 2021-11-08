package by.epam.learn.classes.myenum;

import java.util.Arrays;

public class MainSeasons {

	public static void main(String[] args) {
		Seasons seasons = Seasons.SUMMER;
		//  через new Enum не создается
		seasons.info();
		System.out.println("Enum array: " + Arrays.toString(Seasons.values()));
		System.out.println("Length of Enum: " + Seasons.values().length);
		System.out.println(seasons.getDeclaringClass());
		System.out.println(seasons.getClass());
		Seasons seasonsNew = Seasons.valueOf("WINTER");
		System.out.println("Compare by queue: " + seasons.compareTo(seasonsNew));
		Year year = new Year(Seasons.SUMMER, "Pig");
		System.out.println("Print object: " + year);
		System.out.println("Method service: " + seasons.service(2020,98));
		System.out.println("Method service: " + seasonsNew.service(2020,99));
		SeasonAction seasonAction = new SeasonAction();
		int result = seasonAction.action(Seasons.WINTER, 9,10);
		System.out.println(result);
	}
}
