package co.grandcircus.hotelsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {
	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public static String Home() {
		return "home";
	}
	
	
}
