package DePaul.Group_9.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Merchant;
import DePaul.Group_9.demo.repository.MerchantRepository;

@Service
public class MerchantService {
	@Autowired
	private MerchantRepository merchantRepository;
	
	public List<Merchant> findAll(){
		return merchantRepository.findAll();
	}
	
	public Optional<Merchant> findById(long id){
		return merchantRepository.findById(id);
	}
	
	public void deleteById(long id) {
		merchantRepository.deleteById(id);
	}
	
	public boolean save(Merchant merchant) {
		if(merchantRepository.existsByusername(merchant.getUsername())) {
			return false;
		}
		else {
			merchantRepository.save(merchant);
			return true;
		}
	}
}
