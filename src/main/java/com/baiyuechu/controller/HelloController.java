package com.baiyuechu.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    //是否拥有这个权限
//    @PreAuthorize("hasAuthority('system:book:update')")
    //是否拥有这些权限
//    @PreAuthorize("hasAnyAuthority('test','admin','system:book:add')")
    //是否拥有这个角色
        @PreAuthorize(("hasRole('system:book:add')"))
    //是否拥有这些角色
//    @PreAuthorize(("hasAnyRole('test','admin','system:book:add')"))
    public String hello() {
        return "hello";
    }

    @GetMapping("/testCors")
    public String testCors() {
        return "cors";
    }
}
