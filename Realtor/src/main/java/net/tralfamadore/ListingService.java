package net.tralfamadore;

import java.util.ArrayList;
import java.util.List;

public class ListingService {
	public static List<Listing> getListings() {
		List<Listing> listings = new ArrayList<Listing>();
		Agent agent1 = new Agent();
		agent1.setContactNumber("215-555-1212");
		agent1.setEmail("agent@realtor.com");
		agent1.setFirstName("Agent");
		agent1.setLastName("One");
		Listing listing = new Listing(new Address("534 Queen St.", "Philadelphia", "PA", "19147"), 500000, "A lovely home in Queen Village", 2.5f, 3, agent1);
		agent1.getListings().add(listing);
		listings.add(listing);
		
		listing = new Listing(new Address("537 Catherine St.", "Philadelphia", "PA", "19147"), 520000, "A newly renovated home in Queen Village", 2f, 4, agent1);
		agent1.getListings().add(listing);
		listings.add(listing);
		
		Agent agent2 = new Agent();
		agent2.setContactNumber("215-555-1212");
		agent2.setEmail("agent2@realtor.com");
		agent2.setFirstName("Agent2");
		agent2.setLastName("Two");
		listing = new Listing(new Address("1090 Fitzwater St.", "Philadelphia", "PA", "19147"), 480000, "A great buy in Queen Village", 2f, 4, agent2);
		agent2.getListings().add(listing);
		listings.add(listing);
		
		return listings;
	}
}
