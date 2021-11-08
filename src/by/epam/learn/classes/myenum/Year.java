package by.epam.learn.classes.myenum;

public class Year {
	private Seasons seasons;
	private String name;

	public Year(final Seasons seasons, final String name) {
		this.seasons = seasons;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classes.myenum.Year{" + "seasons=" + seasons + ", name='" + name + '\'' + '}';
	}
}
