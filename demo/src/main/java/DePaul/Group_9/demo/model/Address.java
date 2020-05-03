package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "address")
public class Address implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addressID;
	String state;
	String city;
	String street_apt;
	int zipcode;
}
