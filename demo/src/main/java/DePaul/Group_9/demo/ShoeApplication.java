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

import DePaul.Group_9.demo.model.Address;


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
//	public CommandLineRunner demo() {
//		return (args) ->{
//			System.out.println("-----");
//			System.out.println(userId);
//			System.out.println("-----");
//		};
//		
//	}
	
}
