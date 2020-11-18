package kr.co.codeplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping({"/loginSuccess", "/hello"})
    public String loginSuccess(){
        return "hello";
    }

    @GetMapping("/loginFailure")
    public String loginFailure(){
        return "loginFailure";
    }

}
