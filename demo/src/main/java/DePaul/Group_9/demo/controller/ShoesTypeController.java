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

import DePaul.Group_9.demo.model.Order;
import DePaul.Group_9.demo.model.ShoesType;
import DePaul.Group_9.demo.service.OrderService;
import DePaul.Group_9.demo.service.ShoesTypeService;

@RestController
@RequestMapping("/shoestype")
public class ShoesTypeController {
	
	@Autowired
	private ShoesTypeService shoesTypeService;
	
	@PutMapping("/update")
	public Boolean update(@RequestBody ShoesType e) {
		shoesTypeService.save(e);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<ShoesType> find(){
		return shoesTypeService.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody ShoesType e) {
		shoesTypeService.save(e);
		return Boolean.TRUE;
	}
}
