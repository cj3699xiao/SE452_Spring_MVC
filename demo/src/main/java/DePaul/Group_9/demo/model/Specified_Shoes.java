package DePaul.Group_9.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity
//@Data
@Table(name = "shoes_special")
public class Specified_Shoes extends Shoes { 
	private long productID;
	private float extraPrice;
	private String description;
}
