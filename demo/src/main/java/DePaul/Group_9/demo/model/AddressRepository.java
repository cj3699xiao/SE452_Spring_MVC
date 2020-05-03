package DePaul.Group_9.demo.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface AddressRepository extends CrudRepository<Address,Long>{
	List<Address> findBystate(String state);
	
	@Override
	List<Address> findAll();	
}
