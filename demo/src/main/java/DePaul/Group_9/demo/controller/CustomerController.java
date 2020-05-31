package DePaul.Group_9.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DePaul.Group_9.demo.model.Customer;
import DePaul.Group_9.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable int id) {
		customerService.deleteById(id);
		return Boolean.TRUE;
	}
	 
	@GetMapping("/findById/{id}")
	public Optional<Customer> findById(@PathVariable int id) {
		return 	customerService.findById(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Customer e) {
		customerService.save(e);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Customer> find(){
		return customerService.findAll();
	}

	@PostMapping("/save")
	public String save(@RequestBody Customer e) {
		customerService.save(e);
		return "<a href=\"/customer\">Login</a>";
	}
}
