package DePaul.Group_9.demo.model;

//import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;




//@RunWith(SpringRunner.class)
@DataJpaTest
public class AddressRepositoryTest {
	

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AddressRepository repository;
    
    @Test
    public void testFindAll() {
        int numOfRows = repository.findAll().size();
        final int EXPECTED_NUM_OF_ROWS = 1;
        assertEquals(numOfRows, EXPECTED_NUM_OF_ROWS);
    }
    
    @Test
    public void testAirport() {
        
        Address thisone = repository.findBystate("IL").get(0);
        String thisone_city = thisone.getCity();
        		
        assertEquals("Chicago", thisone_city);
    }


}
