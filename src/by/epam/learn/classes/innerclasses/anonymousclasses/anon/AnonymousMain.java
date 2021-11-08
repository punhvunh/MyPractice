package by.epam.learn.classes.innerclasses.anonymousclasses.anon;

public class AnonymousMain {
	public static void main(String[] args) {
		Service service = new Service() {
			@Override
			public void service1() {
				System.out.println("Anon service1");
			}

			@Override
			public void service2() {
				System.out.println("Anon service2");
			}
		};
		service.service1();
		Service serviceMy = new Service();
		serviceMy.service1();
	}
}
