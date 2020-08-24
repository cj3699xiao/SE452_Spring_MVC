package DePaul.Group_9.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

import DePaul.Group_9.demo.POJO.Address;
import DePaul.Group_9.demo.repository.AddressRepository;
//import edu.depaul.cdm.se452.demo.repository.FlightRepository;
import DePaul.Group_9.demo.repository.ShoesRepository;


@SpringBootApplication
public class ShoeApplication {
//@Autowired
//private static MongoTemplate mongoTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ShoeApplication.class, args);
//		Address a = new Address();
//		a.getState();
//		mongoTemplate.save(test);
//		flightNum;
//	    private String review;
//	    private String reviewer;
//	    private Date reviewDate;
	}

//	@Value("${userid}")
//	private String userId;
//	
//	@Bean
//	public CommandLineRunner demo(ShoesRepository repo) {
//		return (args) ->{
//			System.out.println("Address found with findAll():");
//			repo.findAll().forEach((a) -> {
//				System.out.println(a.toString());
//           });
//		};
//		
//	}
	
	
//	  //@Bean
//    public CommandLineRunner demo(FlightRepository repository) {
//        return (args) -> {
//            // fetch all customers
//            log.info("Flights found with findAll():");
//            log.info("-------------------------------");
//            repository.findAll().forEach((flight) -> {
//                log.info(flight.toString());
//            });
//            log.info("");
//        };
//    }
	
}
