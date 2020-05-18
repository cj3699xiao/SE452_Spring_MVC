package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Address;


public interface AddressRepository extends CrudRepository<Address,Long>{
	List<Address> findBystate(String state);
	
	@Override
	List<Address> findAll();	
}
