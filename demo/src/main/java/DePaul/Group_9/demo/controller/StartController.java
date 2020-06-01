package DePaul.Group_9.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
    
    @GetMapping("/sign_up")
    public String sign_up_mongo(Model model) {
        
        return "sign_up";
    }
    
    @GetMapping("/userInformation")
    public String userInformation_mongo(Model model) {
        
        return "userInformation";
    }
    
    @GetMapping("/add_order")
    public String add_order(Model model) {
        
        return "add_order";
    }
    
    @GetMapping("/add_comment")
    public String add_comment(Model model) {
        
        return "add_comment";
    }
    
    @GetMapping("/add_address")
    public String add_address(Model model) {
        
        return "add_address";
    }
    
    @GetMapping("/add_shoes")
    public String add_shoes(Model model) {
        
        return "add_shoes";
    }
    
    @GetMapping("/add_store")
    public String add_store(Model model) {
        
        return "add_store";
    }
    
    @GetMapping("/add_shoestype")
    public String add_shoestype(Model model) {
        
        return "add_shoestype";
    }
    
    @GetMapping("/add_merchant")
    public String add_merchant(Model model) {
        
        return "add_merchant";
    }
    
    @GetMapping("/add_item")
    public String add_item(Model model) {
        
        return "add_item";
    }
    
    @GetMapping("/add_customer")
    public String add_customer(Model model) {
        
        return "add_customer";
    }
    
    @GetMapping("/customer")
    public String customer_login(Model model) {
        
        return "customer";
    }
    
    @GetMapping("/merchant")
    public String merchant_login(Model model) {
        
        return "merchant";
    }
    
    @GetMapping("/customer_page")
    public String customer_page(Model model) {
        
        return "customer_page";
    }
    
    @GetMapping("/merchant_page")
    public String merchant_page(Model model) {
        
        return "merchant_page";
    }
    
    @GetMapping("/search_shoes")
    public String search_shoes(Model model) {
        
        return "search_shoes";
    }
    

    
}
