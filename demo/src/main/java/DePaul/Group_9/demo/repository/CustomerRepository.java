package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.POJO.Customer;


public interface CustomerRepository extends CrudRepository<Customer,Long>{
	
	
	List<Customer> findByUsername(String username);
	List<Customer> findByEmail(String customeremail);
	List<Customer> findByPhone(String customerphone);
	List<Customer> findByRating(double customerrating);
	List<Customer> findByPaymentmethod(String paymentmethod);
	
	
	boolean existsByUsername(String username);
	boolean existsByEmail(String customeremail);
	boolean existsByPhone(String customerphone);
	boolean existsByRating(double customerrating);
	boolean existsByPaymentmethod(String paymentmethod);
	
	
	long countByUsername(String username);
	long countByEmail(String customeremail);
	long countByPhone(String customerphone);
	long countByRating(double customerrating);
	long countByPaymentmethod(String paymentmethod);
	
	
	void deleteByUsername(String username);
	void deleteByEmail(String customeremail);
	void deleteByPhone(String customerphone);
	void deleteByRating(double customerrating);
	void deleteByPaymentmethod(String paymentmethod);
	
	@Override
	List<Customer> findAll();	
}
