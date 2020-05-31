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

import DePaul.Group_9.demo.model.Shoes;
import DePaul.Group_9.demo.service.ShoesService;

@RestController
@RequestMapping("/shoes")
public class ShoesController {
	
	@Autowired
	private ShoesService shoesService;
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable int id) {
		shoesService.deleteById(id);
		return Boolean.TRUE;
	}
	 
	@GetMapping("/findById/{id}")
	public Optional<Shoes> findById(@PathVariable int id) {
		return 	shoesService.findById(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Shoes s) {
		shoesService.save(s);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Shoes> find(){
		return shoesService.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody Shoes s) {
		shoesService.save(s);
		return Boolean.TRUE;
	}
}
