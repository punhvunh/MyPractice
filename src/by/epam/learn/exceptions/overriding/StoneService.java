package by.epam.learn.exceptions.overriding;

import java.io.IOException;

import by.epam.learn.exceptions.custom.ResourceException;

public class StoneService {
	public void buildHouse(Stone stone){
		try {
			stone.accept("Some data");
		} catch (ResourceException | IOException e) {
			e.printStackTrace();
		}
	}

}
