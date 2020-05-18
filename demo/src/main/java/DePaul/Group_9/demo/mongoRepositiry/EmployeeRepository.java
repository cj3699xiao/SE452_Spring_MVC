package DePaul.Group_9.demo.mongoRepositiry;

import org.springframework.data.mongodb.repository.MongoRepository;

import DePaul.Group_9.demo.mongoEntities.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String>{
	
}
