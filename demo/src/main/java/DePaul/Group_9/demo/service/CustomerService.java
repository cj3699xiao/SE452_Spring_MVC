package DePaul.Group_9.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Customer;
import DePaul.Group_9.demo.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	public Optional<Customer> findById(long id){
		return customerRepository.findById(id);
	}
	
	public void deleteById(long id) {
		customerRepository.deleteById(id);
	}
	
	public void save(Customer customer) {
		customerRepository.save(customer);
	}
}
