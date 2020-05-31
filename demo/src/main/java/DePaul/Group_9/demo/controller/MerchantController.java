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

import DePaul.Group_9.demo.model.Merchant;
import DePaul.Group_9.demo.service.MerchantService;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
	
	@Autowired
	private MerchantService merchantService;
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable int id) {
		merchantService.deleteById(id);
		return Boolean.TRUE;
	}
	 
	@GetMapping("/findById/{id}")
	public Optional<Merchant> findById(@PathVariable int id) {
		return 	merchantService.findById(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Merchant m) {
		merchantService.save(m);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Merchant> find(){
		return merchantService.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody Merchant m) {
		merchantService.save(m);
		return Boolean.TRUE;
	}
}
