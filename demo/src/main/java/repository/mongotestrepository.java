package repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import DePaul.Group_9.demo.model.mongotest;

public interface mongotestrepository extends CrudRepository<mongotest,String> {
	mongotest a = new mongotest();
//	a.setFlightNum(123);
//	repository.save(a);


}
