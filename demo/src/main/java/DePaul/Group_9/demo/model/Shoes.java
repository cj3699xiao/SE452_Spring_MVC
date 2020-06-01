package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;


@Entity
@Data
@Table(name = "shoes")
public class Shoes implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long shoesID;	
	private String brand;
	private String type;
	private String material;
	private String color;
	private String description;
	private double size;
	private double price;
	
	
	
}
