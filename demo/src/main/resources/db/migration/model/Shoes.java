package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
public class Shoes implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productID;
	private String color;
	private float size;
	private float price;
	@ManyToOne
	@JoinColumn(name="ShoesNameID", nullable = false)
	private ShoesType type;

}
