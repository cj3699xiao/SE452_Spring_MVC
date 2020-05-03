package DePaul.Group_9.demo.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Specified_Shoes extends Shoes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productID;
	private float extraPrice;
	private String description;
}
