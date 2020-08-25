package DePaul.Group_9.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.POJO.Order;
import DePaul.Group_9.demo.POJO.Shoes;
import DePaul.Group_9.demo.model.ShoesModel;
import DePaul.Group_9.demo.repository.OrderRepository;
import DePaul.Group_9.demo.repository.ShoesRepository;

@Service
public class SearchService {
	
	@Autowired
	ShoesRepository shoesRepository;
	@Autowired
	OrderRepository orderRepository;
	
	public List<ShoesModel> searchShoes(String input) 
	{
		List<String> keywords = inputSplit(input);
		List<ShoesModel> list = new ArrayList<ShoesModel>();
		List<ShoesModel> all = shoesRepository.findAllShoesModel();
		for(ShoesModel shoes : all) {
			for(String keyword : keywords) {
				
				if(		shoes.getBrand().contains(keyword)
						|| shoes.getType().contains(keyword)
						|| shoes.getMaterial().contains(keyword)
						|| shoes.getColor().contains(keyword)
				  ) {
					list.add(shoes);
				}
			}
		}
		return list;
		
	}
	
	private List<String> inputSplit(String input)
	{
		List<String> keywords = new ArrayList<String>();
		keywords.add(input);
		for(String con : new String[] {" ", ",", "-"}) {
			int ks = keywords.size();
			for(int i=0; i<ks; i++) {
				if(keywords.get(i).contains(con)) {
					String[] split = keywords.get(i).split(con);
					keywords.remove(i);
					keywords.addAll(Arrays.asList(split));
					ks = keywords.size();
					i--;
				}
			}
		}
		return keywords;
	}
	
}
