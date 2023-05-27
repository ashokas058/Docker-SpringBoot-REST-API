package com.restapi.com.Bpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CtrlBpayHome {

    @GetMapping("/")
    public String welcome(Model model){
        model.addAttribute("name","SpringBoot");
        return "home";
    }
}
