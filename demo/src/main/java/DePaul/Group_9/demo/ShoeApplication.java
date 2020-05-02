package DePaul.Group_9.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import DePaul.Group_9.demo.model.Address;


@SpringBootApplication
public class ShoeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoeApplication.class, args);
//		Address a = new Address();
//		a.getState();		
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
