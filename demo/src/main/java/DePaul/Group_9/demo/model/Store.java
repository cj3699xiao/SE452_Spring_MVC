package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "stores")
public class Store implements Serializable { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int storeID;
	private String store_name;
	
	private String store_email;
	private String phone;
	private float ratring;
	
	@OneToMany(mappedBy = "ShoesNameID")
	private List<ShoesType> Shoes_on_sale;
	
}
