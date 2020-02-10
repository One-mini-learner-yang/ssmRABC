package Project;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class permission {
    public Integer id;
    public String name;
    public Integer pid;
    public String url;
    public String icon;
    public boolean open=true;
    public List<permission> children=new ArrayList<>();
}
