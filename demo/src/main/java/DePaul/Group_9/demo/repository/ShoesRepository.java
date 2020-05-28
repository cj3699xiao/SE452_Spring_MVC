package DePaul.Group_9.demo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Shoes;

public interface ShoesRepository extends CrudRepository<Shoes,Long>{
//	Shoes findBycolor(String color);

	List<Shoes> findBycolor(String color);
	
	@Override
	List<Shoes> findAll();	
}
