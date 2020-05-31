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

import DePaul.Group_9.demo.model.Store;
import DePaul.Group_9.demo.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable int id) {
		storeService.deleteById(id);
		return Boolean.TRUE;
	}
	 
	@GetMapping("/findById/{id}")
	public Optional<Store> findById(@PathVariable int id) {
		return 	storeService.findById(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Store s) {
		storeService.save(s);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Store> find(){
		return storeService.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody Store s) {
		storeService.save(s);
		return Boolean.TRUE;
	}
}
