package com.test;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<BaseUser> getUsers(String name) {
        return null;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public BaseUser updateUser(@RequestBody BaseUser user) {
        return null;
    }
}
