package net.tralfamadore;

import java.util.ArrayList;
import java.util.List;

public class Agent {
	private List<Listing> listings;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String email;
	
	public Agent() {
		listings = new ArrayList<Listing>();
	}
	
	public Agent(List<Listing> listings, String firstName, String lastName, String contactNumber, String email) {
		super();
		this.listings = listings;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.email = email;
	}

	public List<Listing> getListings() {
		return listings;
	}
	
	public void setListings(List<Listing> listings) {
		this.listings = listings;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Agent [listings=" + listings.size() + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNumber=" + contactNumber + ", email=" + email + "]";
	}
}