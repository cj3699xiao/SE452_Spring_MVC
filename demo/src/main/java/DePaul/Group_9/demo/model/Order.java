package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order implements Serializable {
	private int orderID;
	@OneToMany(mappedBy = "items")
	private List<Item> items ;
	private int customerID;
	private int storeID;
	@JoinColumn(name="addressID", nullable = false)
	private Address Customer_adrs;
	@JoinColumn(name="addressID", nullable = false)
	private Address Merchant_adrs;
	private float order_price;
	private String payment_method;
	
}
