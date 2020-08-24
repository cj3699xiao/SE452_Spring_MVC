package DePaul.Group_9.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DePaul.Group_9.demo.request.login.LoginRequest;
import DePaul.Group_9.demo.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginservice;
	
	@GetMapping("/merchant/{username}/{password}")
	public String merchantLogin(@PathVariable String username, @PathVariable String password) {
		if(loginservice.merchantLogin(username, password)) {
			return "merchant_page";
		}
		else
			return "merchant";
	}
	
	@GetMapping("/customer")
	public String customerLogin(@RequestBody LoginRequest request) {
		if(loginservice.customerLogin(request.getUsername(), request.getPassword())) {
			return "customer_page";
		}
		else
			return "customer";
	}
	
}







