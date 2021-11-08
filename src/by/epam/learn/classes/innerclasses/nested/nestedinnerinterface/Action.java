package by.epam.learn.classes.innerclasses.nested.nestedinnerinterface;

public interface Action {
	static void newService(){

	}
	default void newService2(){

	}
	class StaticService{
		static void service(){

		}
		void service2(){

		}
	}

}
