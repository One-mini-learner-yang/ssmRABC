package Project.Controller;

import Project.Server.server;
import Project.permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/permission")
public class permissionController {
    @Autowired
    @Qualifier("server")
    private Project.Server.server server;
    @ResponseBody
    @RequestMapping("/index")
    public Object permissionQuery()
    {
        List<permission>  data=new ArrayList<>();
        List<permission>  permissions;
        permissions=server.permissionSelect();
//        此处的三种方案：递归方式查询子节点（调用数据库多次，效率不高）
//        查询全部数据，使用list集合筛选（此方案相较map方案，筛选没有索引，效率不高）
        Map<Integer,permission> map=new HashMap<>();
        for (permission p:permissions)
        {
            map.put(p.getId(),p);
        }
        for(permission p:permissions)
        {
            permission child=p;
            if(p.getPid()==0)
                data.add(p);
            else {
                permission parent=map.get(child.getPid());
                parent.getChildren().add(child);
            }
        }
        System.out.println(data);
        return data;
    }
}
