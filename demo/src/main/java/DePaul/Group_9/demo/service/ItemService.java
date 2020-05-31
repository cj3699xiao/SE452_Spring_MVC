package DePaul.Group_9.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Item;
import DePaul.Group_9.demo.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepository;
	
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	
	public void save(Item item) {
		itemRepository.save(item);
	}

}
