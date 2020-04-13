package DePaul.Group_9.demo.model;

import org.springframework.data.repository.CrudRepository;

/**
 * Helps to perform CRUD operations for Airport
 */
public interface AddressRepository extends CrudRepository<Address, Long>  {
    Address findByCode(String code);
}
