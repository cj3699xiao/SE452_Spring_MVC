package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "address")  //if name is same with table, no needs this line

public class Address implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressID;
	private String state;
	private String city;
	private String streetapt;
	private int zipcode;

	
}
