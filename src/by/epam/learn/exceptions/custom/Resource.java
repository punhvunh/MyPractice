package by.epam.learn.exceptions.custom;

public class Resource {

	public Resource() throws ResourceException {
	}

	public boolean isCreate(){
		return true;
	}
	public boolean isExists(){
		return false;
	}
	public void execute(){
	}
	public void close (){
	}
}
