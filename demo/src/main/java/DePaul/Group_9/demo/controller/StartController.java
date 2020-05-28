package DePaul.Group_9.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class StartController {
  
    @GetMapping("/hello")
    public String greeting1(Model model) {
        model.addAttribute("name", "Guest");
        return "greeting";
    }
    
//    @GetMapping("/hello1")
//    public String greeting2(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "simpleform";
//    }
    
    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "shibo");
        return "greeting";
    }
    
    @GetMapping("/home_search")
    public String home_searchpage(Model model) {
        
        return "home_search";
    }
    

    @GetMapping("/comment_search")
    public String comment_searchpage(Model model) {
        
        return "comment_search";
    }
    
    
    
    
}
