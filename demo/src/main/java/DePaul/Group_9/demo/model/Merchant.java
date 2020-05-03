package DePaul.Group_9.demo.model;

import javax.persistence.Entity;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class Merchant extends User {
	private int storeID;
	@JoinColumn(name="seat_type_id", nullable = false)
	private Address ship_address;
	private String personal_email;
	private String phone;
	private float rating;

}
