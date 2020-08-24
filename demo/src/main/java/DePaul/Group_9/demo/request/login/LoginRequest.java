package DePaul.Group_9.demo.request.login;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Valid
public class LoginRequest {
	
	@NotNull(message = "USER_NAME_CANNOT_BE_NULL")
	private String username;
	
	@NotNull(message = "PASSWORD_CANNOT_BE_NULL")
	private String password;
}
