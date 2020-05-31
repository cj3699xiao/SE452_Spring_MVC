package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Order;
import DePaul.Group_9.demo.model.ShoesType;


public interface ShoesTypeRepository extends CrudRepository<ShoesType,Long>{
	
	List<ShoesType> findByShoestypeID(long id);
	List<ShoesType> findByShoesnameID(long id);
	List<ShoesType> findByStoreID(long id);
	List<ShoesType> findByCrowd(long crowd);
	List<ShoesType> findByStyle(String style);
	List<ShoesType> findByShoesname(String shoesname);
	List<ShoesType> findByBrand(String brand);
	List<ShoesType> findByMaterial(String material);
	
	boolean existsByShoestypeID(long id);
	boolean existsByShoesnameID(long id);
	boolean existsByStoreID(long id);
	boolean existsByCrowd(long crowd);
	boolean existsByStyle(String style);
	boolean existsByShoesname(String shoesname);
	boolean existsByBrand(String brand);
	boolean existsByMaterial(String material);
	
	long countByShoestypeID(long id);
	long countByShoesnameID(long id);
	long countByStoreID(long id);
	long countByCrowd(long crowd);
	long countByStyle(String style);
	long countByShoesname(String shoesname);
	long countByBrand(String brand);
	long countByMaterial(String material);
	
	void deleteByShoestypeID(long id);
	void deleteByShoesnameID(long id);
	void deleteByStoreID(long id);
	void deleteByCrowd(long crowd);
	void deleteByStyle(String style);
	void deleteByShoesname(String shoesname);
	void deleteByBrand(String brand);
	void deleteByMaterial(String material);
	
	@Override
	List<ShoesType> findAll();	
}
