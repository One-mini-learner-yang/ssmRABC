package Project.Controller;

import Project.Page;
import Project.c_user;
import Project.result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SimpleTimeZone;

@Controller
@RequestMapping("/user")
public class usrController {
    @Autowired
    @Qualifier("server")
    private Project.Server.server server;
    @ResponseBody
    @RequestMapping("/index")
    public Object userIndex(String findIndex,int pageNum,int pageSize)
    {
        result result=new result();
        List<c_user> c_users=server.userSelect(findIndex,(pageNum-1)*pageSize,pageSize);
        int totalUserNum=server.userTotal();
        int totalNum=0;
        if((totalUserNum%pageSize)==0)
        {
            totalNum=totalUserNum/pageSize;
        }else{
            totalNum=(totalUserNum/pageSize)+1;
        }
        Page<c_user> page=new Page<c_user>();
        page.setTs(c_users);
        page.setPageNum(pageNum);
        page.setTotalNum(totalNum);
        page.setPageSize(pageSize);
        result.setPage(page);
        try {
            result.setSuccess("true");
        }catch (Exception e){
            e.printStackTrace();
            result.setSuccess("false");
        }
            return result;

    }
    @RequestMapping("/add")
    public String add(String username,String name,String email)
    {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String time=simpleDateFormat.format(new Date());
        server.add(username,name,email,time);
        server.addUser(username,name);
        return "redirect:/user.jsp";
    }
    @RequestMapping("/updateQuery")
    public String updateQuery(int id, Model model)
    {
        model.addAttribute("user",server.updateQuery(id));
        model.addAttribute("id",id);
        return "update";
    }
    @RequestMapping("/update")
    public String  update(Integer id,String username,String name,String email)
    {
        System.out.println(id);
        server.update(id,username,name,email);
        server.updateUser(id,username,name);
        return "user";
    }
    @RequestMapping("/deleteById")
    public String deleteById(Integer id)
    {
        server.deleteById(id);
        server.deleteUserById(id);
        return "redirect:/user.jsp";
    }
    @RequestMapping("/deleteSome")
    public String deleteSome( Integer[] id)
    {
        List<Integer> list=new ArrayList<>();
        for(Integer i:id)
        {
            list.add(i);
        }
        server.deleteSome(list);
        server.deleteSomeUser(list);
        return "user";
    }
//    注释部分为同步分页后台操作
//    @RequestMapping("/index")
//    public String userIndex(@RequestParam(required = false,defaultValue = "1") Integer pageNum, @RequestParam(required = false,defaultValue = "2") Integer pageSize, Model model)
//    {
//        List<c_user> c_users=server.userSelect((pageNum-1)*pageSize,pageSize);
//        int totalUserNum=server.userTotal();
//        int totalNum=0;
//        if((totalUserNum%pageSize)==0)
//        {
//            totalNum=totalUserNum/pageSize;
//        }else{
//            totalNum=(totalUserNum/pageSize)+1;
//        }
//        model.addAttribute("totalNum",totalNum);
//        model.addAttribute("pageNum",pageNum);
//        model.addAttribute("c_user",c_users);
//        return "/user";
//    }
}
