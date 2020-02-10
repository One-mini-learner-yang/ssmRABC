package Project.Controller;

import Project.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/server")
public class controller {
    @Autowired
    @Qualifier("server")
    private Project.Server.server server;

    @RequestMapping(value = "/Verify", method = RequestMethod.POST)
    @ResponseBody
    public String Verify(User user, HttpSession httpSession) {
        String password = server.Verify(user.getUsername());
        httpSession.setAttribute("username",user.getUsername());
        if (user.getPassword().equals(password)) {
            return "yes";
        } else {
            return "wrong";
        }
    }

    @RequestMapping("logOut")
    public String logOut(HttpSession session)
    {
        session.invalidate();
        return "redirect:/index.jsp";
    }
}
