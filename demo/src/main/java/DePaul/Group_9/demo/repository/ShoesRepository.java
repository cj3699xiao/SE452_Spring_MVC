package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.POJO.Shoes;


public interface ShoesRepository extends CrudRepository<Shoes,Long>{
	
	List<Shoes> findByShoesID(long id);
	List<Shoes> findByBrand(String brand);
	List<Shoes> findByColor(String color);	
	List<Shoes> findBySize(double size);
	List<Shoes> findByPrice(double price);
	
	
	boolean existsByShoesID(long id);
	boolean existsByBrand(String brand);
	boolean existsByColor(String color);
	boolean existsBySize(double size);
	boolean existsByPrice(double price);
	
	
	long countByShoesID(long id);
	long countByBrand(String brand);
	long countByColor(String color);
	long countBySize(double size);
	long countByPrice(double price);

	
	void deleteByShoesID(long id);
	void deleteByBrand(String brand);
	void deleteByColor(String color);
	void deleteBySize(double size);
	void deleteByPrice(double price);

	
	@Override
	List<Shoes> findAll();	
}