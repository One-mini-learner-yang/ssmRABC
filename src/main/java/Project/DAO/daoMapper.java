package Project.DAO;

import Project.c_user;
import Project.permission;
import Project.role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("daoMapper")
public interface daoMapper{
    public String Verify(String username);
    public List<c_user> userSelect(@Param("findIndex") String findIndex,@Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
    public List<role> roleSelect(@Param("findIndex")String findIndex,@Param("pageStart")int pageStart,@Param("pageSize")int pageSize);
    public List<Integer> roleIdSelect(int userId);
    public List<role> queryAllRole();
    public List<permission> permissionSelect();
    public int userTotal();
    public int roleTotal();
    public void add(@Param("username")String username,@Param("name")String name,@Param("email")String email,@Param("time")String time);
    public void addRole(String name);
    public void assignRole(@Param("roleId") Integer roleId,@Param("userId") Integer userId);
    public void unAssignRole(@Param("roleId") Integer roleId,@Param("userId") Integer userId);
    public void addUser(@Param("username")String username,@Param("password")String password);
    public c_user updateQuery(int id);
    public void update(@Param("id")int id,@Param("username")String username,@Param("name")String name,@Param("email")String email);
    public void updateUser(@Param("id")int id,@Param("username")String username,@Param("password")String password);
    public void deleteById(int id);
    public void deleteUserById(int id);
    public void deleteSome(List<Integer> ids);
    public void deleteSomeUser(List<Integer> ids);

}
