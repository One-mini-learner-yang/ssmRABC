package Project;

import lombok.Data;

import java.io.Serializable;
@Data
public class c_user implements Serializable {
    public int id;
    public String username;
    public String name;
    public String email;
}
