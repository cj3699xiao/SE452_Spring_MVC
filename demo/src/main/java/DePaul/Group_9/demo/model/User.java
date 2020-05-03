package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	private String userName;
	@OneToOne
	@JoinColumn(name="id", nullable = false)
	Address address;
	
}
