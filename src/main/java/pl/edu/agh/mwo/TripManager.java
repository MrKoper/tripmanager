package pl.edu.agh.mwo;
import java.util.*;

public class TripManager {
	private HashMap<String,Trip> tripList;
	
	public TripManager() {
		tripList = new HashMap<String,Trip>();
	}
	
	public void add(Trip trip) throws TripAlreadyExistsException {
		if (tripList.get(trip.getName()) != null) {
			throw new TripAlreadyExistsException();
		}
		else {
			tripList.put(trip.getName(),trip);
		}
	}
	
	public HashMap<String,Trip> getTrips() {
		return tripList;
	}

	public void remove(String name) {
		tripList.remove(name);
	}
	
	public HashMap<String,Trip> findTrip(String keyword) {

		HashMap<String,Trip> foundedTrips = new HashMap<>();

		for (Trip trip : tripList.values()) {
			String name_and_description = (trip.name() + " " + trip.description()).toLowerCase();
			if (name_and_description.contains(keyword.toLowerCase())) {
				foundedTrips.get(trip);
			}
		}
		return foundedTrips;
	}
	
}
