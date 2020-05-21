package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@ToString
@Table(name = "shoes")
@NotNull
public class Shoes implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productID;
	
	private String brand;
	private String brandID;
	private String color;
	private double size;
	private double price;
//	@ManyToOne
//	@JoinColumn(name="ShoesNameID", nullable = false)
//	private ShoesType type;

}
