package DePaul.Group_9.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DePaul.Group_9.demo.model.Order;
import DePaul.Group_9.demo.repository.CustomerRepository;
import DePaul.Group_9.demo.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private CustomerRepository customerRepository;
	
//	public List<Order> findByAddress(Address address){
//		List<Order> allOrders = orderRepository.findAll();
//		List<Order> result = new ArrayList<Order>();
//		for(Order o : allOrders) {
//			if (o.getCustomeraddressID() == address.getId()) {
//				result.add(o);
//			}
//		}
//		return result;
//	}
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Optional<Order> findById(long id){
		return orderRepository.findById(id);
	}
	
//	public List<Order> findByName(String name){
//		long id = customerRepository.findByUsername(name).get(0).getCustomerID();
//		return orderRepository.findByCustomerID(id);
//	}
	
	public void deleteById(long id) {
		orderRepository.deleteById(id);
	}
	
	public boolean save(Order order) {
		if(orderRepository.existsByShoesID(order.getShoesID())) {
			return false;
		}
		else {
			orderRepository.save(order);
			return true;
		}
	}
}
