package DePaul.Group_9.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import DePaul.Group_9.demo.model.Comment;
import DePaul.Group_9.demo.service.CommentService;

@Controller
@RequestMapping("/comments")
public class Comment_Controller {
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("/search")
	public String findAllComments(Model model) {
		model.addAttribute("comment", commentService.findAllComment());
		return "shoe/comment";
	}
	
	@RequestMapping("/add")
	public String add() {
		Comment comment1 = new Comment(11, 21, 31, 0, "gshfga", "jkhg");
		commentService.save(comment1);
		return "1234567";
	}
	
}
