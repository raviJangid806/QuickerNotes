package com.remind.Quicker.controller.publicApi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/public")
public class PublicController {

//http://localhost:8080/api/public/signup
    @GetMapping("/signup")
    public String signup(){
        return "customer_signup";
    }
}
