package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Data;

@Data
public class ShoesType implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ShoesNameID;
	
	private String ShoesName;
	@Min(0)
	@Max(2)
	private int crowd;
	private String style;
	private String brand;
	private String material;
	
}
