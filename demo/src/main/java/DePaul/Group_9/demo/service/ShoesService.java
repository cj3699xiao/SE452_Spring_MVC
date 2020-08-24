package DePaul.Group_9.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.POJO.Shoes;
import DePaul.Group_9.demo.repository.ShoesRepository;

@Service
public class ShoesService {
	@Autowired
	private ShoesRepository shoesRepository;
	
	public List<Shoes> findAll(){
		return shoesRepository.findAll();
	}
	
	public Optional<Shoes> findById(long id){
		return shoesRepository.findById(id);
	}
	
	public void deleteById(long id) {
		shoesRepository.deleteById(id);
	}
	
	public void save(Shoes s) {
		shoesRepository.save(s);
	}
}
