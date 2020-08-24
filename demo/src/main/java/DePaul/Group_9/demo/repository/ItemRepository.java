package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.POJO.Item;
import DePaul.Group_9.demo.POJO.Order;


public interface ItemRepository extends CrudRepository<Item,Long>{
	
	List<Item> findByItemID(long id);
	List<Item> findByShoesID(long id);
	List<Item> findByStoreID(long id);
	List<Item> findByOrderID(long id);
	List<Item> findByCustomerID(long id);
	List<Item> findByQuantity(int quantity);
	List<Item> findByNote(String note);
	
	boolean existsByItemID(long id);
	boolean existsByShoesID(long id);
	boolean existsByStoreID(long id);
	boolean existsByOrderID(long id);
	boolean existsByCustomerID(long id);
	boolean existsByQuantity(int quantity);
	boolean existsByNote(String note);
	
	long countByItemID(long id);
	long countByShoesID(long id);
	long countByStoreID(long id);
	long countByOrderID(long id);
	long countByCustomerID(long id);
	long countByQuantity(int quantity);
	long countByNote(String note);
	
	void deleteByItemID(long id);
	void deleteByShoesID(long id);
	void deleteByStoreID(long id);
	void deleteByOrderID(long id);
	void deleteByCustomerID(long id);
	void deleteByQuantity(int quantity);
	void deleteByNote(String note);
	
	@Override
	List<Item> findAll();	
}
