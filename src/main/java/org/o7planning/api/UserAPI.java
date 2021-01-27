package org.o7planning.api;


import org.o7planning.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
public class UserAPI {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/login")
    public Boolean checkUser(@RequestBody Map<String, String> map){
        String email = map.get("email");
        String password = map.get("password");
        return userService.checkUser(email, password);
    }
}
