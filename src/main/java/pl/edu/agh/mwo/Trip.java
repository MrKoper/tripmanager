package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {

	private String name;
	private String description;
	private Collection<Photo> photos;

	public Trip(String name, String description) {
		if (name == null || description == null || name.equals("") || description.equals("")) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.description = description;
	}

	public String name() {
		return getName();
	}

	public String description() {
		return getDescription();
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Collection<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {

		if (photos == null) {
			photos = new ArrayList<>();
		}
		photos.add(photo);
	}

}