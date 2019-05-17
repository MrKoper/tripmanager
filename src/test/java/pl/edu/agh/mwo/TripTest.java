package pl.edu.agh.mwo;
import static org.junit.Assert.assertEquals;

import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripTest {

	private Trip theTrip;

	@Before
	public void createEmptyTripForTheTest() {
		theTrip = new Trip("Rok akademicki 18/19", "Studia");
	}

	@Test
	public void testTripCtorIsCorrect() {
		Assert.assertEquals("Rok akademicki 18/19", theTrip.name());
		Assert.assertEquals("Studia", theTrip.description());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhotoWithNullName() {
		@SuppressWarnings("unused")
		Trip theTrip = new Trip(null, "Wyjazd z rodziną");

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhotoWithEmptyName() {
		@SuppressWarnings("unused")
		Trip theTrip = new Trip("", "Wyjazd z rodziną");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhotoWithNullDescription() {
		@SuppressWarnings("unused")
		Trip theTrip = new Trip("Wakacje 2019", null);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testPhotoWithEmptyDescription() {
		@SuppressWarnings("unused")
		Trip theTrip = new Trip("Wakacje 2019", "");
	}

	@Test
	public void testEmptyCollectionOfPhotosHaveNullValue() {
		Assert.assertThat(theTrip.getPhotos(), IsNull.nullValue());
	}

	@Test
	public void testNonEmptyCollectionOfPhotosNotHaveNullValue() {
		Photo photo1 = new Photo("Kraków - Wawel");
		theTrip.addPhoto(photo1);
		Assert.assertThat(theTrip.getPhotos(), IsNull.notNullValue());
	}

	@Test
	public void testCollectionHaveExpectedSize() {
		Photo photo1 = new Photo("Kraków - Wawel");
		Photo photo2 = new Photo("Kraków - Miasteczko studenckie AGH");

		theTrip.addPhoto(photo1);
		assertEquals(1, theTrip.getPhotos().size());

		theTrip.addPhoto(photo2);
		assertEquals(2, theTrip.getPhotos().size());
	}
}
