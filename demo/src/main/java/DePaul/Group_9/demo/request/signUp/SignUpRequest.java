package DePaul.Group_9.demo.request.signUp;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class SignUpRequest {

	@NotNull(message = "USER_NAME_CANNOT_BE_NULL")
	private String username;
	
	@NotNull(message = "PASSWORD_CANNOT_BE_NULL")
	private String password;
	
	private String paymentmethod;
    private String email;
	private String phone;
	
}
