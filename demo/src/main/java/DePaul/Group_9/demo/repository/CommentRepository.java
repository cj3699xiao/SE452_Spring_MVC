package DePaul.Group_9.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Comment;


import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.Comment;

public interface CommentRepository extends CrudRepository<Comment,Long>{
	List<Comment> findByuserID(long id);
	List<Comment> findByStoreID(long id);
	List<Comment> findByrating(int rating);
	List<Comment> findBycommentwords(String commentWords);
	List<Comment> findBylikesdislike(int likesdislike);
	
	boolean existsByuserID(long id);
	boolean existsByStoreID(long id);
	boolean existsByrating(int rating);
	boolean existsBycommentwords(String commentWords);
	boolean existsBylikesdislike(int likesdislike);
	
	long countByuserID(long id);
	long countByStoreID(long id);
	long countByrating(int rating);
	long countBycommentwords(String commentWords);
	long countBylikesdislike(int likesdislike);
	
	void deleteByuserID(long id);
	void deleteByStoreID(long id);
	void deleteByrating(int rating);
	void deleteBycommentwords(String commentWords);
	void deleteBylikesdislike(int likesdislike);
	
	@Override
	List<Comment> findAll();		
}
