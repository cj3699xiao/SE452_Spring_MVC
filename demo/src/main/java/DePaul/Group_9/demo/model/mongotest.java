package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "mongo_test")
public class mongotest implements Serializable{
    private String flightNum;
    private String review;
    private String reviewer;
    private Date reviewDate;
}
