package DePaul.Group_9.demo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Order;

public interface OrderRepository extends CrudRepository<Order,Long>{
	
	@Override
	public List<Order> findAll();
}
