package DePaul.Group_9.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Address;
import DePaul.Group_9.demo.model.Comment;
import DePaul.Group_9.demo.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	

	
	public List<Comment> findAll(){
		return commentRepository.findAll();
	}
	
	public Optional<Comment> findById(long id){
		return commentRepository.findById(id);
	}
	
	public void deleteById(long id) {
		commentRepository.deleteById(id);
	}
	
	public void save(Comment comment) {
		commentRepository.save(comment);
	}
	
	
}
