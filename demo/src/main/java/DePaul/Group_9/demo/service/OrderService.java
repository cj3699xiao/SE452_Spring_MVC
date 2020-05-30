package DePaul.Group_9.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Address;
import DePaul.Group_9.demo.model.Order;
import DePaul.Group_9.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findByAddress(Address address){
		List<Order> allOrders = orderRepository.findAll();
		List<Order> result = new ArrayList<Order>();
		for(Order o : allOrders) {
			if (o.getCustomeraddressID() == address.getId()) {
				result.add(o);
			}
		}
		return result;
	}
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Optional<Order> findById(long id){
		return orderRepository.findById(id);
	}
	
	public void deleteById(long id) {
		orderRepository.deleteById(id);
	}
	
	public void save(Order order) {
		orderRepository.save(order);
	}
}
