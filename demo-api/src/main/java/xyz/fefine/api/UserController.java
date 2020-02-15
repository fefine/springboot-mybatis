package xyz.fefine.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.fefine.core.model.Response;
import xyz.fefine.core.model.User;
import xyz.fefine.service.UserService;


@RestController
@RequestMapping(path = "/user")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/id")
    public User findById(@RequestParam("id") int id) {
        return userService.findById(id);
    }

    @GetMapping("/name")
    public User findByName(@RequestParam("name") String name) {
        return userService.findByName(name);
    }

    @PostMapping("/add")
    public Response addNewUser(@RequestBody User user) {
        // todo add try-cathc in there is not good
        try {
            int res = userService.addUser(user);
            if (res == 1) {
                // success
                return new Response(1, "Success");
            }
            return new Response(0, "Failed");
        } catch (Exception e) {
            log.error("add user failed", e);
            return new Response(0, "Failed");
        }
    }
}
