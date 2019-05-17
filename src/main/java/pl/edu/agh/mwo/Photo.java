package pl.edu.agh.mwo;

public class Photo {

	private String comment;

	public Photo(String comment) {
		if (comment == null || comment.equals("")) {
			throw new IllegalArgumentException();
		}
		this.comment = comment;
	}

	public String comment() {
		return getComment();
	}

	public String getComment() {
		return comment;
	}
}