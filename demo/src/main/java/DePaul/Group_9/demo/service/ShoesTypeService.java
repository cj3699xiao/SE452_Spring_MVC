package DePaul.Group_9.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Address;
import DePaul.Group_9.demo.model.Order;
import DePaul.Group_9.demo.model.ShoesType;
import DePaul.Group_9.demo.repository.OrderRepository;
import DePaul.Group_9.demo.repository.ShoesTypeRepository;

@Service
public class ShoesTypeService {
	@Autowired
	private ShoesTypeRepository shoesTypeRepository;
	
	public List<ShoesType> findAll(){
		return shoesTypeRepository.findAll();
	}
	
	public void save(ShoesType shoesType) {
		shoesTypeRepository.save(shoesType);
	}

}
