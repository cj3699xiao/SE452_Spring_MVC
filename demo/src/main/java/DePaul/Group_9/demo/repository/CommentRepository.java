package DePaul.Group_9.demo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Address;
import DePaul.Group_9.demo.model.Comment;

public interface CommentRepository extends CrudRepository<Comment,Long>{
//	Shoes findBycolor(String color);
	
	@Override
	List<Comment> findAll();	
}
