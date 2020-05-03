package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "comments")
public class Comment implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int commentID;
	private int userID;
	private int storeID;
	private int rating;
	private String commentWords;
	private String reply;
	private Date commentTime;
	private boolean like_dislike;
}
