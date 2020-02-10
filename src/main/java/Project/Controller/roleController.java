package Project.Controller;

import Project.Page;
import Project.result;
import Project.role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/role")
public class roleController {
    @Autowired
    @Qualifier("server")
    private Project.Server.server server;
    @ResponseBody
    @RequestMapping("/index")
    public Object roleIndex(Integer pageNum,Integer pageSize,String findIndex){
        result result=new result();
        List<role> roles= server.roleSelect(findIndex,(pageNum-1)*pageSize,pageSize);
        Page<role> page=new Page<role>();
        page.setTs(roles);
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);
        int totalNum=0;
        int totalRoleNum=server.roleTotal();
        if(totalRoleNum%pageSize==0)
        {
            totalNum=totalRoleNum/pageSize;
        }
        if (totalRoleNum%pageSize!=0)
        {
            totalNum=(totalRoleNum/pageSize)+1;
        }
        page.setTotalNum(totalNum);
        result.setPage(page);
        try{
            result.setSuccess("true");
        }catch (Exception e){
            e.printStackTrace();
            result.setSuccess("false");
        }
        return result;
    }
    @RequestMapping("/add")
    public String addRole(String name){
        server.addRole(name);
        return "role";
    }
    @RequestMapping("/assignRoleQuery")
    public String assignRoleQuery(Integer id, Model model) {
        List<role> roles = new ArrayList<>();
        List<role> assignRoles = new ArrayList<>();
        List<role> unAssignRoles = new ArrayList<>();
        List<Integer> assignRoleIds = new ArrayList<>();
        roles = server.queryAllRole();
        assignRoleIds = server.roleIdSelect(id);
        for (role r : roles) {
            if (assignRoleIds.contains(r.getId()))
                assignRoles.add(r);
            else
                unAssignRoles.add(r);
        }
        model.addAttribute("userId",id);
        model.addAttribute("assignRoles", assignRoles);
        model.addAttribute("unAssignRoles", unAssignRoles);
        return "assignRole";
    }
    @RequestMapping("/assignRole")
    public String assignRole(Integer userId,Integer[] unAssignRoleIds)
    {
        for(Integer unAssignRoleId:unAssignRoleIds){
            server.assignRole(unAssignRoleId,userId);
        }
        return "assignRole";
    }
    @RequestMapping("/unAssignRole")
    public String unAssignRole(Integer userId,Integer[] unAssignRoleIds)
    {
        for(Integer unAssignRoleId:unAssignRoleIds){
            server.unAssignRole(unAssignRoleId,userId);
        }
        return "assignRole";
    }
}
