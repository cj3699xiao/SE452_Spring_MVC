package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "all_shoes_type")
public class ShoesType implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long shoestypeID;
	private long shoesnameID;
	private long storeID;
	private long crowd;
	private String style;
	private String shoesname;
	private String brand;
	private String material;
}
