package Project.Server;

import Project.c_user;
import Project.permission;
import Project.role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("server")
public class server {
    @Autowired
    @Qualifier("daoMapper")
    private Project.DAO.daoMapper daoMapper;
    public String Verify(String username){
        return daoMapper.Verify(username);
    }
    public List<c_user> userSelect(String findIndex,int pageStart, int pageSize)
    {
        return daoMapper.userSelect(findIndex,pageStart,pageSize);
    }
    public List<role> roleSelect(String findIndex,int pageStart,int pageSize)
    {
        return daoMapper.roleSelect(findIndex, pageStart, pageSize);
    }
    public List<Integer> roleIdSelect(int userId){
        return daoMapper.roleIdSelect(userId);
    }
    public List<role> queryAllRole()
    {
        return daoMapper.queryAllRole();
    }
    public List<permission> permissionSelect(){
        return daoMapper.permissionSelect();
    }
    public int userTotal(){
        return daoMapper.userTotal();
    }
    public int roleTotal(){
        return daoMapper.roleTotal();
    }
    public void add(String username,String name, String email,String time) {
        daoMapper.add(username,name,email,time);
    }
    public void addRole(String name)
    {
        daoMapper.addRole(name);
    }
    public void addUser(String username,String password)
    {
        daoMapper.addUser(username,password);
    }
    public void assignRole(Integer roleId,Integer userId)
    {
        daoMapper.assignRole(roleId,userId);
    }
    public c_user updateQuery(int id)
    {
        return daoMapper.updateQuery(id);
    }
    public void update(int id,String username,String name,String email)
    {
        daoMapper.update(id,username,name,email);
    }
    public void updateUser(int id,String username,String password)
    {
        daoMapper.updateUser(id,username,password);
    }

    public void deleteById(int id) {
        daoMapper.deleteById(id);
    }
    public void deleteUserById(int id)
    {
        daoMapper.deleteUserById(id);
    }
    public void deleteSome(List<Integer> ids)
    {
        daoMapper.deleteSome(ids);
    }
    public void deleteSomeUser(List<Integer> ids)
    {
        daoMapper.deleteSomeUser(ids);
    }
    public void unAssignRole(Integer roleId,Integer userId)
    {
        daoMapper.unAssignRole(roleId,userId);
    }
}
