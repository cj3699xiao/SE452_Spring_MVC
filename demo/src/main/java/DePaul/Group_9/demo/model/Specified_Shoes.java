package DePaul.Group_9.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "shoes")
public class Specified_Shoes extends Shoes { 
	private float extraPrice;
	private String description;
}
