package net.tralfamadore.service;

import java.util.ArrayList;
import static java.util.stream.Collectors.toList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.tralfamadore.dao.ListingDao;
import net.tralfamadore.domain.Address;
import net.tralfamadore.domain.Agent;
import net.tralfamadore.domain.Listing;
import net.tralfamadore.dto.ListingListDto;

@Service
public class ListingService {
	@Autowired
	private ListingDao listingDao;
	
	public List<Listing> getListings() {
		return listingDao.getListings();
	}
	
	public long saveListing(Listing listing) {
		return listingDao.saveListing(listing);
	}
	
	public List<ListingListDto> getListingListDtos() {
		return getListings().stream().map(listing -> new ListingListDto(listing.getId(), listing.getAddress().getStreet(), listing.getAddress().getCity(),
					listing.getAddress().getState(), listing.getAddress().getZipCode(), listing.getHouseType(), listing.getBedrooms(),
					listing.getBaths(), listing.getSquareFeet(), listing.getPrice())).collect(toList());
	}
	
	/*
	public static List<Listing> getListings() {
		List<Listing> listings = new ArrayList<Listing>();
		Agent agent1 = new Agent();
		agent1.setContactNumber("215-555-1212");
		agent1.setEmail("agent@realtor.com");
		agent1.setFirstName("Agent");
		agent1.setLastName("One");
		Listing listing = new Listing(1, new Address(1, "534 Queen St.", "Philadelphia", "PA", "19147"), 500000, "Single Family Home", 2.5f, 3, 1700, agent1);
		agent1.getListings().add(listing);
		listings.add(listing);
		
		listing = new Listing(2, new Address(2, "537 Catherine St.", "Philadelphia", "PA", "19147"), 520000, "Row Home", 2f, 4, 1645, agent1);
		agent1.getListings().add(listing);
		listings.add(listing);
		
		Agent agent2 = new Agent();
		agent2.setContactNumber("215-555-1212");
		agent2.setEmail("agent2@realtor.com");
		agent2.setFirstName("Agent2");
		agent2.setLastName("Two");
		listing = new Listing(3, new Address(3, "1090 Fitzwater St.", "Philadelphia", "PA", "19147"), 480000, "Condominium", 2f, 4, 1829, agent2);
		agent2.getListings().add(listing);
		listings.add(listing);
		
		return listings;
	}
	*/
}
