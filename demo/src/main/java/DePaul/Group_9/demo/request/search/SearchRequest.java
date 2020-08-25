package DePaul.Group_9.demo.request.search;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Valid
public class SearchRequest {
	
	@NotNull(message = "INPUT_NAME_CANNOT_BE_NULL")
	private String input;
	
}

