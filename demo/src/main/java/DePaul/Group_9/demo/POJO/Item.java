package DePaul.Group_9.demo.POJO;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "items")
public class Item implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long itemID;
	private long shoesID;
	private long storeID;
	private long orderID;
	private long customerID;
	private int quantity;
	private String note;
}
