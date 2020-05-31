package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Merchant;


public interface MerchantRepository extends CrudRepository<Merchant,Long>{
	
	List<Merchant> findByusername(String username);
	List<Merchant> findByStoreID(long id);
	List<Merchant> findBypersonalemail(String personalemail);
	List<Merchant> findByphone(String phone);
	List<Merchant> findByrating(double rating);
	
	boolean existsByusername(String username);
	boolean existsByStoreID(long id);
	boolean existsBypersonalemail(String personalemail);
	boolean existsByphone(String phone);
	boolean existsByrating(double rating);
	
	long countByusername(String username);
	long countByStoreID(long id);
	long countBypersonalemail(String personalemail);
	long countByphone(String phone);
	long countByrating(double rating);
	
	void deleteByusername(String username);
	void deleteByStoreID(long id);
	void deleteBypersonalemail(String personalemail);
	void deleteByphone(String phone);
	void deleteByrating(double rating);
	
	@Override
	List<Merchant> findAll();	
}
