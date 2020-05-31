package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "stores")
public class Store implements Serializable { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long storeID;
	private String storename;
	private String storeemail;
	private String phone;
	private long commentID;
	private double rating;
	
}
