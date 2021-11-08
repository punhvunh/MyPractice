package by.epam.learn.exceptions.overriding;

import java.io.IOException;

import by.epam.learn.exceptions.custom.ResourceException;

public class WhiteStone extends Stone {

	@Override
	public void accept( String data) throws ResourceException, IOException {
		super.accept(data);
	}
}
