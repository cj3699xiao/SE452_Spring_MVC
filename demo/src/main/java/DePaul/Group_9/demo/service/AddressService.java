package DePaul.Group_9.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Address;
import DePaul.Group_9.demo.repository.AddressRepository;

@Service
public class AddressService {
	@Autowired
	private AddressRepository addressRepository;
	

	
	public List<Address> findAll(){
		return addressRepository.findAll();
	}
	
	public Optional<Address> findById(long id){
		return addressRepository.findById(id);
	}
	
	public void deleteById(long id) {
		addressRepository.deleteById(id);
	}
	
	public void save(Address address) {
		addressRepository.save(address);
	}
	
	
}
