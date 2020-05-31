package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Shoes;


public interface ShoesRepository extends CrudRepository<Shoes,Long>{
	
	List<Shoes> findByProductID(long id);
	List<Shoes> findByColor(String color);
	List<Shoes> findBySize(double size);
	List<Shoes> findByPrice(double price);
	List<Shoes> findByItemID(long id);
	List<Shoes> findByShoestypeID(long id);
	
	boolean existsByProductID(long id);
	boolean existsByColor(String color);
	boolean existsBySize(double size);
	boolean existsByPrice(double price);
	boolean existsByItemID(long id);
	boolean existsByShoestypeID(long id);
	
	long countByProductID(long id);
	long countByColor(String color);
	long countBySize(double size);
	long countByPrice(double price);
	long countByItemID(long id);
	long countByShoestypeID(long id);
	
	void deleteByProductID(long id);
	void deleteByColor(String color);
	void deleteBySize(double size);
	void deleteByPrice(double price);
	void deleteByItemID(long id);
	void deleteByShoestypeID(long id);
	
	@Override
	List<Shoes> findAll();	
}