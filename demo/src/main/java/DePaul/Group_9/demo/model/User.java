package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;

    @NotNull
    @Size(min = 2, max = 30)
    private String username;

    @NotNull
    @Min(21)
    private Integer age;
    
//	@OneToOne
//	@JoinColumn(name="id", nullable = false)
	@NotNull
	@Size(min = 2, max = 30)
	private String address;
    
    

}
