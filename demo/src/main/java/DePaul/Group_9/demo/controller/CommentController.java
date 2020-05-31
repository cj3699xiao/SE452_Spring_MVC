package DePaul.Group_9.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DePaul.Group_9.demo.model.Order;
import DePaul.Group_9.demo.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import DePaul.Group_9.demo.model.Comment;
import DePaul.Group_9.demo.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	private CommentService commentService;
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable long id) {
		commentService.deleteById(id);
		return Boolean.TRUE;
	}
	
	 
	@GetMapping("/findById/{id}")
	public Optional<Comment> findById(@PathVariable long id) {
		return 	commentService.findById(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Comment e) {
		commentService.save(e);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Comment> find(){
		return commentService.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody Comment e) {
		commentService.save(e);
		return Boolean.TRUE;
	}
	
}
