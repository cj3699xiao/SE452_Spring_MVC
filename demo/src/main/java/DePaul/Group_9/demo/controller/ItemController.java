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

import DePaul.Group_9.demo.model.Item;
import DePaul.Group_9.demo.model.Order;
import DePaul.Group_9.demo.service.ItemService;
import DePaul.Group_9.demo.service.OrderService;

@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Item e) {
		itemService.save(e);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Item> find(){
		return itemService.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody Item e) {
		itemService.save(e);
		return Boolean.TRUE;
	}
}
