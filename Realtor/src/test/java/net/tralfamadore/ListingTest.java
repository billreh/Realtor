package net.tralfamadore;

import java.util.List;
import java.util.Map;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.groupingBy;

import org.junit.Test;

import net.tralfamadore.domain.Agent;
import net.tralfamadore.domain.Listing;
import net.tralfamadore.service.ListingService;

public class ListingTest {
	@Test
	public void testListingService() {
//		List<Listing> listings = ListingService.getListings();
//		System.out.println(listings);
//		Map<Agent,List<Listing>> listingsByAgent = listings.stream().collect(groupingBy(Listing::getAgent));
//		System.out.println(listingsByAgent);
		
//		listings.stream().filter(l -> l.getBaths() > 2).collect(toList()).forEach(System.out::println);
//		listings.stream().filter(l -> l.getBedrooms() > 3).collect(toList()).forEach(System.out::println);
//		listings.stream().sorted(comparing(Listing::getBedrooms)).forEach(System.out::println);
	}

}
