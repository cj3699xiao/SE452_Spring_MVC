package DePaul.Group_9.demo.controller;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import DePaul.Group_9.demo.model.User;

@Controller
public class User_Controller implements WebMvcConfigurer {
    @GetMapping("/user")
    public String showForm(User user) {
        return "simpleform";
    }

    @PostMapping("/user")
    public String checkPersonInfo(@Valid User user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "simpleform";
        }

        return "results";
    }
    
}
