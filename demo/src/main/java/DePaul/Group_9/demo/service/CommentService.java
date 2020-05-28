package DePaul.Group_9.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import DePaul.Group_9.demo.model.Comment;
import DePaul.Group_9.demo.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private CommentRepository commentRepository;
	
	public List<Comment> findAllComment() {
		return commentRepository.findAll();
	}
	
	public void save(Comment comment) {
		commentRepository.save(comment);
	}
	
	
}
