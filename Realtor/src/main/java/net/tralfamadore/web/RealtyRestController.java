package net.tralfamadore.web;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import net.tralfamadore.dto.ListingListDto;
import net.tralfamadore.service.ListingService;

@RestController
@EnableWebMvc
public class RealtyRestController {
	@Autowired
	private ListingService listingService;
	
    @CrossOrigin
//    @RequestMapping(value = "/listings", method = RequestMethod.GET, consumes = {"application/json"}, produces=MediaType.APPLICATION_JSON)
    @GetMapping("/listings")
    public @ResponseBody List<ListingListDto> getListings() {
    	return listingService.getListingListDtos();
    }
}
