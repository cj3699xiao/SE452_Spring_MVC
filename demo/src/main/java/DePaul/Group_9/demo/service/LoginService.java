package DePaul.Group_9.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.POJO.Customer;
import DePaul.Group_9.demo.POJO.Merchant;
import DePaul.Group_9.demo.repository.CustomerRepository;
import DePaul.Group_9.demo.repository.MerchantRepository;

@Service
public class LoginService {
	
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	MerchantRepository merchantRepository;
	
	public boolean merchantLogin (String username, String password) {
		if(merchantRepository.existsByusername(username)) {
			List<Merchant> list = merchantRepository.findByusername(username);
			for(Merchant m : list) {
				if(m.getPassword().equals(password))
					return true;
			}
		}
		return false;
	}
	
	public boolean customerLogin (String username, String password) {
		if(customerRepository.existsByUsername(username)) {
			List<Customer> list = customerRepository.findByUsername(username);
			for(Customer c : list) {
				if(c.getPassword().equals(password))
					return true;
			}
		}
		return false;
	}
	
}
