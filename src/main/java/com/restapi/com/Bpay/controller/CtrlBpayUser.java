package com.restapi.com.Bpay.controller;

import com.restapi.com.Bpay.model.MdlBpayUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.restapi.com.Bpay.repository.iRepoBpayuser;

import java.util.List;

@RestController
@RequestMapping("/user")
public class CtrlBpayUser {
    @Autowired
    iRepoBpayuser repoBpayuser;

    @PostMapping("/create")
    public String saveBPayUser(@RequestBody MdlBpayUser bpayUser){
       return repoBpayuser.save(bpayUser).toString();
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<MdlBpayUser>> getAllUsers(){
        return ResponseEntity.ok(repoBpayuser.findAll());
    }

}
