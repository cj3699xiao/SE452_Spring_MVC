package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Comment;


import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Address;
import DePaul.Group_9.demo.model.Comment;

public interface CommentRepository extends CrudRepository<Comment,Long>{
	List<Comment> findByCustomerID(long id);
	List<Comment> findByStoreID(long id);
	List<Comment> findByCustomeraddressID(long id);
	List<Comment> findByMerchantaddressID(long id);
	List<Comment> findByOrderprice(double orderprice);
	List<Comment> findByPaymentmethod(String paymentmethod);
	
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
	List<Comment> findAll();		
}
