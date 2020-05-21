package DePaul.Group_9.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import DePaul.Group_9.demo.repository.AddressRepository;
import DePaul.Group_9.demo.repository.ShoesRepository;
//import edu.depaul.cdm.se452.demo.repository.AirportRepository;

@Controller
@RequestMapping("/search_address")
public class Home_searchController {
	@Autowired
	private ShoesRepository repo;
//	private AddressRepository repo;
	
	
    @PostMapping
    public String home_searchpage1(Model model) {
    	
//      model.addAttribute("address",repo.findAll());
    	model.addAttribute("shoes",repo.findAll());
        return "shoe/list";
//    	return "home_search";
    }
	
       
    
}
