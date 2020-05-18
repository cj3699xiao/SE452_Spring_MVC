package DePaul.Group_9.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import DePaul.Group_9.demo.mongoEntities.Employee;
import DePaul.Group_9.demo.mongoRepositiry.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository er;
	
	@DeleteMapping("/delete/{id}")
	public Boolean delete(@PathVariable String id) {
		er.deleteById(id);
		return Boolean.TRUE;
	}
	 
	@GetMapping("/findById/{id}")
	public Optional<Employee> findById(@PathVariable String id) {
		return 	er.findById(id);
	}
	
	@PutMapping("/update")
	public Boolean update(@RequestBody Employee e) {
		er.save(e);
		return Boolean.TRUE;
	}
	
	@GetMapping("/list")
	public List<Employee> find(){
		return er.findAll();
	}

	@PostMapping("/save")
	public Boolean save(@RequestBody Employee e) {
		er.save(e);
		return Boolean.TRUE;
	}
}
