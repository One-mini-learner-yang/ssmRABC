package Project;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component("result")
public class result {
    public String success;
    public Object page;

}
