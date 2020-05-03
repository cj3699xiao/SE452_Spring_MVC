package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderID;
	@OneToMany(mappedBy = "itemID")
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
