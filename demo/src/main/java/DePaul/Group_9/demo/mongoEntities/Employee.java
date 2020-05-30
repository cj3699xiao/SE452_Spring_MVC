package DePaul.Group_9.demo.mongoEntities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document("Employee")
@Data
public class Employee {
	@Id
	private String id;
	private String name;
	private String password;
	private String email;
}
