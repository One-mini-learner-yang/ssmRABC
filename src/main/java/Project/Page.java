package Project;

import lombok.Data;

import java.util.List;

@Data
public class Page<T> {
    public List<T> ts;
    public int pageNum;
    public int totalNum;
    public int pageSize;
}
