package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long>{
	
	@Override
	List<Customer> findAll();
}
