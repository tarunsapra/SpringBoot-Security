package com.example.security.application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tarunsapra on 20/07/2017.
 */
@RestController
public class RequestController {

    @RequestMapping("/")
    public String getHome() {
        return "welcome to home page";
    }

    @RequestMapping("/users/list")
    public String getUser() {
        return "List of users";
    }
    @RequestMapping("/public")
    public String getPublic() {
        return "Public space";
    }
}
