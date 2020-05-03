package DePaul.Group_9.demo.model;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "merchants")
public class Merchant extends User {
	private int storeID;
	private String personal_email;
	private String phone;
	private float rating;

}
