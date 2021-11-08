package by.epam.learn.classes.innerclasses.anonymousclasses.anoninterface;

public class AnonMain {
	public static void main(String[] args) {
		Action action = () ->
				System.out.println("Interface");

		action.logic1();
	}

}
