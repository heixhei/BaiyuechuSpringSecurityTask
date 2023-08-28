package com.baiyuechu.controller;

import com.baiyuechu.domain.ResponseResult;
import com.baiyuechu.domain.User;
import com.baiyuechu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User  user) {
        //登录
        return loginService.login(user);
    }


}
