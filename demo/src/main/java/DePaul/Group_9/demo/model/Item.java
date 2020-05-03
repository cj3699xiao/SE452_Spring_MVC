package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "items")
public class Item implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int itemID;
	int quantity;
	String note;
	@OneToOne
	@JoinColumn(name="productID", nullable = false)
	Shoes shoes;
	
	@ManyToOne
	@JoinColumn(name="storeID", nullable = false)
	Store store;
	
}
