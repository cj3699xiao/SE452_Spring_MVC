package DePaul.Group_9.demo.request.signUp;

import lombok.Data;

@Data
public class SignUpRequest {
	
	private long customerID;
    private String username;
    private String password;
	private String paymentmethod;
    private String email;
	private String phone;
	private double rating;
	
}
