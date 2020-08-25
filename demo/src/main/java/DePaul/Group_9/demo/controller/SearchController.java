package DePaul.Group_9.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DePaul.Group_9.demo.model.ShoesModel;
import DePaul.Group_9.demo.request.search.SearchRequest;
import DePaul.Group_9.demo.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
	@GetMapping("/result")
	public List<ShoesModel> search(@RequestBody SearchRequest request) {
		return searchService.searchShoes(request.getInput());
	}
	
	/*
	 * 
	 * 
	 * 
	 * 这个search方法要改许多东西：
	 * 		1. 参照loginController中的customerLogin方法改url和参数
	 * 		2. 参照request.login中的LoginRequest新建一个request类 （其中仅包含一个参数： private String input）
	 * 		3. 选作：
	 * 			1. 在model包中新建一个Shoes类（其中仅包含： brand， type， material， color， size， price 6 个成员变量）
	 * 			2. 将 这个search方法中的返回值类型List<Shoes>中的Shoes定义为model中的Shoes而不是之前用的POJO中的Shoes
	 * 			3. 用Postman测试一下
	 * 
	 * 
	 */
	
}
