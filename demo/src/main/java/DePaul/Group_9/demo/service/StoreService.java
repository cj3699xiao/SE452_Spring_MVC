package DePaul.Group_9.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Store;
import DePaul.Group_9.demo.repository.StoreRepository;

@Service
public class StoreService {
	@Autowired
	private StoreRepository storeRepository;
	
	public List<Store> findAll(){
		return storeRepository.findAll();
	}
	
	public Optional<Store> findById(long id){
		return storeRepository.findById(id);
	}
	
	public void deleteById(long id) {
		storeRepository.deleteById(id);
	}
	
	public void save(Store s) {
		storeRepository.save(s);
	}
}
