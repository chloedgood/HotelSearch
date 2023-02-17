package co.grandcircus.hotelsearch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelController {
	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public static String Home() {
		return "home";
	}
	
	@RequestMapping("/results")
	public String result( @RequestParam String city, Model model) {
		List<Hotel> hotellist;
		
		hotellist = repo.findByCity(city);
		
		model.addAttribute("hotels", hotellist);
		model.addAttribute("city", city);
		return "results";
	}
	
	
}
