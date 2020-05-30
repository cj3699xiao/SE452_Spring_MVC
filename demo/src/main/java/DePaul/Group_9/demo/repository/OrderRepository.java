package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Order;


public interface OrderRepository extends CrudRepository<Order,Long>{
	
	List<Order> findByCustomerID(long id);
	List<Order> findByStoreID(long id);
	List<Order> findByCustomeraddressID(long id);
	List<Order> findByMerchantaddressID(long id);
	List<Order> findByOrderprice(double orderprice);
	List<Order> findByPaymentmethod(String paymentmethod);
	
	boolean existsByCustomerID(long id);
	boolean existsByStoreID(long id);
	boolean existsByCustomeraddressID(long id);
	boolean existsByMerchantaddressID(long id);
	boolean existsByOrderprice(double orderprice);
	boolean existsByPaymentmethod(String paymentmethod);
	
	long countByCustomerID(long id);
	long countByStoreID(long id);
	long countByCustomeraddressID(long id);
	long countByMerchantaddressID(long id);
	long countByOrderprice(double orderprice);
	long countByPaymentmethod(String paymentmethod);
	
	void deleteByCustomerID(long id);
	void deleteByStoreID(long id);
	void deleteByCustomeraddressID(long id);
	void deleteByMerchantaddressID(long id);
	void deleteByOrderprice(double orderprice);
	void deleteByPaymentmethod(String paymentmethod);
	
	@Override
	List<Order> findAll();	
}
