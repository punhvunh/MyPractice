package by.epam.learn.exceptions.custom;

public class ResourceAction {
	public static void load(Resource resource) throws ResourceException {
		if(resource == null || !resource.isExists() || resource.isCreate()){
			throw new ResourceException("mess...");
		}

	}
}
