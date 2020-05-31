package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Store;


public interface StoreRepository extends CrudRepository<Store,Long>{
	
	List<Store> findBystorename(String storename);
	List<Store> findBystoreemail(String storeemail);
	List<Store> findByphone(String phone);
	List<Store> findBycommentID(long id);
	List<Store> findByrating(double rating);
	
	boolean existsBystorename(String storename);
	boolean existsBystoreemail(String storeemail);
	boolean existsByphone(String phone);
	boolean existsBycommentID(long id);
	boolean existsByrating(double rating);
	
	long countBystorename(String storename);
	long countBystoreemail(String storeemail);
	long countByphone(String phone);
	long countBycommentID(long id);
	long countByrating(double orderprice);
	
	void deleteBystorename(String storename);
	void deleteBystoreemail(String storeemail);
	void deleteByphone(String phone);
	void deleteBycommentID(long id);
	void deleteByrating(double rating);
	
	@Override
	List<Store> findAll();	
}

