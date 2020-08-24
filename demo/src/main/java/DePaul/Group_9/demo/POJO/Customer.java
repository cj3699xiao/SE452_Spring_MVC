package DePaul.Group_9.demo.POJO;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long customerID;
    private String username;
    private String password;
	private String paymentmethod;
    private String email;
	private String phone;
	private double rating;
	
}
