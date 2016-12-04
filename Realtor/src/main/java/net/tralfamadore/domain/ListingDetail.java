package net.tralfamadore.domain;

import java.util.List;

public class ListingDetail {
	private long id;
	private long listingId;
	private String overview;
	private String masterBedroom;
	private int fullBathrooms;
	private int halfBathrooms;
	private String diningKitchen;
	private boolean diningRoom;
	private List<String> exteriorFeatures;
	private List<String> otherRooms;
	private int stories;
	private String exterior;
	private String parking;
	private int price;
	
	public ListingDetail(long id, long listingId, String overview, String masterBedroom, int fullBathrooms, int halfBathrooms,
			String diningKitchen, boolean diningRoom, List<String> exteriorFeatures, List<String> otherRooms,
			int stories, String exterior, String parking, int price) {
		this.id = id;
		this.listingId = listingId;
		this.overview = overview;
		this.masterBedroom = masterBedroom;
		this.fullBathrooms = fullBathrooms;
		this.halfBathrooms = halfBathrooms;
		this.diningKitchen = diningKitchen;
		this.diningRoom = diningRoom;
		this.exteriorFeatures = exteriorFeatures;
		this.otherRooms = otherRooms;
		this.stories = stories;
		this.exterior = exterior;
		this.parking = parking;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getListingId() {
		return listingId;
	}

	public void setListingId(long listingId) {
		this.listingId = listingId;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getMasterBedroom() {
		return masterBedroom;
	}

	public void setMasterBedroom(String masterBedroom) {
		this.masterBedroom = masterBedroom;
	}

	public int getFullBathrooms() {
		return fullBathrooms;
	}

	public void setFullBathrooms(int fullBathrooms) {
		this.fullBathrooms = fullBathrooms;
	}

	public int getHalfBathrooms() {
		return halfBathrooms;
	}

	public void setHalfBathrooms(int halfBathrooms) {
		this.halfBathrooms = halfBathrooms;
	}

	public String getDiningKitchen() {
		return diningKitchen;
	}

	public void setDiningKitchen(String diningKitchen) {
		this.diningKitchen = diningKitchen;
	}

	public boolean isDiningRoom() {
		return diningRoom;
	}

	public void setDiningRoom(boolean diningRoom) {
		this.diningRoom = diningRoom;
	}

	public List<String> getExteriorFeatures() {
		return exteriorFeatures;
	}

	public void setExteriorFeatures(List<String> exteriorFeatures) {
		this.exteriorFeatures = exteriorFeatures;
	}

	public List<String> getOtherRooms() {
		return otherRooms;
	}

	public void setOtherRooms(List<String> otherRooms) {
		this.otherRooms = otherRooms;
	}

	public int getStories() {
		return stories;
	}

	public void setStories(int stories) {
		this.stories = stories;
	}

	public String getExterior() {
		return exterior;
	}

	public void setExterior(String exterior) {
		this.exterior = exterior;
	}

	public String getParking() {
		return parking;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
