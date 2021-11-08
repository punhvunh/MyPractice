package by.epam.learn.classes.myenum;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public enum Seasons implements SeasonService, Supplier<BiFunction> {
	SUMMER(2021,1){
		@Override
		public int service(int... param) {
			return param[0]*2 + param[1];
		}
	},
	AUTUMN(2020,2),
	WINTER((o1,o2) -> 2 *o1*o2),
	SPRING,
	WORLD_OF_WARCRAFT;
	private int year;
	private int count;
	private BiFunction<Integer,Integer,Integer> biFunction;
// без модификаторов доступа
	Seasons(BiFunction<Integer, Integer, Integer> biFunction) {
		this.biFunction = biFunction;
	}

	Seasons(){
		System.out.println(this.name() + " " + this.ordinal());
	}

	private int getYear() {
		return year;
	}

	private void setYear(int year) {
		this.year = year;
	}

	Seasons(int year, int count) {
		this.year = year;
		this.count = count;
		System.out.println(this.name() + " " + this.ordinal());
	}

	public void info(){
		switch (this){
			case SUMMER: System.out.println("Your season is Summer " + year);
				break;
			case SPRING: System.out.println("Your season is Spring");
				break;
			case WINTER: System.out.println("Your season is Winter");
				break;
			case AUTUMN:System.out.println("Your season is Autumn " + year);
				break;
			default:
				System.out.println("Wrong information");
		}
	}
	@Override
	public int service(int... param) {
		return param[0]+ param[1] -2 ;
	}

	@Override
	public BiFunction<Integer, Integer, Integer> get() {
		return biFunction;
	}
}
