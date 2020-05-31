package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Address;


public interface AddressRepository extends CrudRepository<Address,Long>{
	
	List<Address> findBystate(String state);
	List<Address> findBycity(String city);
	List<Address> findBystreetapt(String streetapt);
	List<Address> findByzipcode(int zipcode);
	
	boolean existsBystate(String state);
	boolean existsBycity(String city);
	boolean existsBystreetapt(String streetapt);
	boolean existsByzipcode(int zipcode);

	
	long countBystate(String state);
	long countBycity(String city);
	long countBystreetapt(String streetapt);
	long countByzipcode(int zipcode);
	
	void deleteBystate(String state);
	void deleteBycity(String city);
	void deleteBystreetapt(String streetapt);
	void deleteByzipcode(int zipcode);
	
	@Override
	List<Address> findAll();	
}