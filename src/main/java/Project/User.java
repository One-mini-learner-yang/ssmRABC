package Project;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    public String username;
    public String password;
}
