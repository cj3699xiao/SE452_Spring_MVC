package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Item;

public interface ItemRepository extends CrudRepository<Item,Long>{
	
	@Override
	List<Item> findAll();
}
