package xyz.fefine.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.fefine.core.model.User;
import xyz.fefine.service.UserService;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/id")
    public @ResponseBody User findById(@RequestParam("id") int id) {
        return userService.findById(id);
    }

    @GetMapping("/name")
    public @ResponseBody User findByName(@RequestParam("name") String name) {
        return userService.findByName(name);
    }

}
