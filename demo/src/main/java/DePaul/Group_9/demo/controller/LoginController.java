package DePaul.Group_9.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

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
	
	@GetMapping("/customer")
	public void customerLogin(@RequestBody LoginRequest request, HttpServletResponse response) throws IOException {
		if(loginservice.customerLogin(request.getUsername(), request.getPassword())) {
			response.sendRedirect("/home_search.html");
		}
		else
			response.sendRedirect("customer");
	}
	
}







