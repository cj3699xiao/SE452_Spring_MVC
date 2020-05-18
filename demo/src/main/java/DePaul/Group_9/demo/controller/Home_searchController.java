package DePaul.Group_9.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import DePaul.Group_9.demo.repository.ShoesRepository;

@Controller
@RequestMapping("/home_search")
public class Home_searchController {
	
	private ShoesRepository repo;
	
	
	
    @GetMapping
    public String home_searchpage1(Model model) {
    	
//        model.addAttribute("airports",repo.findAll());
//        return "shoe/list";
    	return "home_search";
    }
	
       
    
}
