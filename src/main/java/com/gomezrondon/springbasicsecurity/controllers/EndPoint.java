package com.gomezrondon.springbasicsecurity.controllers;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class EndPoint {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello World!";
    }

    @GetMapping("/bye")
    public String goodbye(@AuthenticationPrincipal final UserDetails user) {
        System.out.println(user.getUsername()+" "+user.getAuthorities().toString());
        return "Hasta la Vista!";
    }

    @GetMapping("/resources/a")
    public String otherEP1() {
        return "otherEP1";
    }

    @GetMapping("/resources/b")
    public String otherEP2() {
        return "otherEP1";
    }

    @GetMapping("/otra/b")
    public String otherEP3() {
        return "otherEP1";
    }

}
