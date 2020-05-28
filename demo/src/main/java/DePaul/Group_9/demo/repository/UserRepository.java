package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.User;

public interface UserRepository extends CrudRepository<User,Long>{
	
	public List<User> findAll();
}
