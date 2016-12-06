package net.tralfamadore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.tralfamadore.domain.Listing;
import net.tralfamadore.domain.ListingDetail;

@Repository
public class ListingDao {
	private static Logger log = Logger.getLogger(ListingDao.class);

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}


	@Transactional
	@CacheEvict(value = { "listingList" }, allEntries = true, beforeInvocation = true)
	public long saveListing(Listing listing) {
		if(listing.getAddress().getId() != null)
			listing.setAddress(em.merge(listing.getAddress()));

		if(listing.getAgent().getId() != null)
			listing.setAgent(em.merge(listing.getAgent()));

		em.persist(listing);
		return listing.getId();
	}
	
	@Cacheable(value = { "listingList" })
	public List<Listing> getListings() {
		log.info("fetching listings list");
		return em.createQuery("from Listing", Listing.class).getResultList();
	}
	
	@Transactional
	@CacheEvict(value = { "listingList" }, allEntries = true, beforeInvocation = true)
	public void deleteListing(Listing listing) {
		em.remove(em.contains(listing) ? listing : em.merge(listing));
	}

	@Transactional
	@CacheEvict(value = { "listingList" }, allEntries = true, beforeInvocation = true)
	public void updateListing(Listing listing) {
		Listing l = em.find(Listing.class, listing.getId());
		l.setAddress(listing.getAddress());
		l.setAgent(listing.getAgent());
		l.setBaths(listing.getBaths());
		l.setBedrooms(listing.getBedrooms());
		l.setHouseType(listing.getHouseType());
		l.setPrice(listing.getPrice());
		l.setSquareFeet(listing.getSquareFeet());
		em.merge(l);
	}

	public Listing getListing(long listingId) {
		return em.createQuery("from Listing where id = :id", Listing.class).setParameter("id", listingId).getSingleResult();
	}

	public ListingDetail getListingDetail(long listingId) {
		return em.createQuery("from ListingDetail where id = :id", ListingDetail.class).setParameter("id", listingId).getSingleResult();
	}
}
