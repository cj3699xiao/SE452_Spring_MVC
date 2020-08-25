package DePaul.Group_9.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShoesModel {
	private String brand;
	private String type;
	private String material;
	private String color;
	private double size;
	private double price;
}
