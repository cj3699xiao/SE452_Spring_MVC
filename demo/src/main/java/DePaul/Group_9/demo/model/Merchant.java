package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "merchants")
public class Merchant implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long merchantID;
	private String username;
	private String password;
	private long storeID;
	private String personalemail;
	private String phone;
	private double rating;


}
