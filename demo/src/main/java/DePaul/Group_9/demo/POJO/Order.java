package DePaul.Group_9.demo.POJO;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "all_orders")
public class Order implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long orderID;
	private long shoesID;
//	private long customerID;
//	private long storeID;
//	private long customeraddressID;
//	private long merchantaddressID;
//	private double orderprice;
//	private String paymentmethod;
	
}
