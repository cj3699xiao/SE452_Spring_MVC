package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "comments")
public class Comment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long commentID;
	private long userID;
	private long storeID;
	private int rating;
	private String commentwords;
	private int likesdislike;

}
