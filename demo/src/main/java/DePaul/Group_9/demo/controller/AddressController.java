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

import DePaul.Group_9.demo.model.Address;
import DePaul.Group_9.demo.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable long id) {
		addressService.deleteById(id);
		return Boolean.TRUE;
	}
	 
	@GetMapping("/findById/{id}")
	public Optional<Address> findById(@PathVariable long id) {
		return 	addressService.findById(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Address a) {
		addressService.save(a);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Address> find(){
		return addressService.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody Address a) {
		addressService.save(a);
		return Boolean.TRUE;
	}
}
