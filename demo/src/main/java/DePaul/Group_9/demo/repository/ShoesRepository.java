package DePaul.Group_9.demo.repository;


import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Shoes;

public interface ShoesRepository extends CrudRepository<Shoes,Long>{
	Shoes findBycolor(String color);
}
