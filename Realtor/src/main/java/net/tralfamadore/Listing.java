package net.tralfamadore;

public class Listing {
	private Address address;
	private int price;
	private String description;
	private float baths;
	private int bedrooms;
	private Agent agent;
	
	public Listing() {
		
	}
	
	public Listing(Address address, int price, String description, float baths, int bedrooms, Agent agent) {
		super();
		this.address = address;
		this.price = price;
		this.description = description;
		this.baths = baths;
		this.bedrooms = bedrooms;
		this.agent = agent;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public float getBaths() {
		return baths;
	}
	
	public void setBaths(float baths) {
		this.baths = baths;
	}
	
	public int getBedrooms() {
		return bedrooms;
	}
	
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@Override
	public String toString() {
		return "Listing [address=" + address + ", price=" + price + ", description=" + description + ", baths=" + baths
				+ ", bedrooms=" + bedrooms + ", agent=" + agent + "]";
	}
}