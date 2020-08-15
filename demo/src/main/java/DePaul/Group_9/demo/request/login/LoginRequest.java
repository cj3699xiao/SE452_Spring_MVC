package DePaul.Group_9.demo.request.login;

import javax.validation.Valid;

import lombok.Data;

@Data
@Valid
public class LoginRequest {
	 
	String username;
	String password;
}
