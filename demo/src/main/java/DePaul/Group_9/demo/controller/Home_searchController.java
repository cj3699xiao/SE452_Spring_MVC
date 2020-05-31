package DePaul.Group_9.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import DePaul.Group_9.demo.model.Shoes;
import DePaul.Group_9.demo.mongoEntities.Employee;
//import DePaul.Group_9.demo.repository.AddressRepository;
import DePaul.Group_9.demo.repository.ShoesRepository;
//import edu.depaul.cdm.se452.demo.repository.AirportRepository;


@Controller
@RequestMapping("/search_allshoes")
public class Home_searchController {

	// setter injection
	@Autowired
	private ShoesRepository repo;
//	public ShoesController() {}

	// public ShoesControoler(ShoesRepository repo){
	// this.repo = repo;}

	@GetMapping
	public String home_searchpage1(Model model) {

//      model.addAttribute("address",repo.findAll());
		model.addAttribute("shoes", repo.findAll());
		return "shoe/list";
//    	return "home_search";
	}

//	  @GetMapping(params = "add")
//	    public String add(Model model) {
//	        model.addAttribute("airport", new Shoes());
//	        return "shoe/shoe_add_form";
//	    }
	

//	@GetMapping(path = "/color", params = "red")
//	public String show(@RequestParam String color, Model model) {
//		List<Shoes> shoes = repo.findBycolor(color);
////		.orElseThrow(() -> new IllegalArgumentException("ERROR"));.orElseThrow(() -> new IllegalArgumentException("ERROR"));
////		model.addAttribute("shoes", shoes.);
//		return "shoe/list";
//	}

}
