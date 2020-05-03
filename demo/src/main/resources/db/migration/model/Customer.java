package DePaul.Group_9.demo.model;

import javax.persistence.*;

import DePaul.Group_9.demo.model.User;

import lombok.Data;

@Entity
@Data
@Table(name="customers")
public class Customer extends User {
	private String Payment_method;
	private String email;
	private String phone;
	private float rating;


}
