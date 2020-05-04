package DePaul.Group_9.demo.model;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "merchants")
public class Merchant extends User {
	private int[] storeID;  //onetomany?
	private String personal_email;
	private int phone;
	private int rating;//change to int same with comments

}
