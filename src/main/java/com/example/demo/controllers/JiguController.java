package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.JiguDto;
import com.example.demo.service.JiguService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JiguController {
    @Autowired JiguService service;
    @PostMapping("/jigu")
    public Map<?,?> write(@RequestBody JiguDto jigu){
        var map = new HashMap<>();
        System.out.println("글쓰기 넘어온 정보 : "+jigu.toString());
        System.out.println(">>>>>>>>"+service.writer(jigu));
        map.put("message", (service.writer(jigu) == 1) ? "SUCCESS":"FAILURE");
        return map;
    }
    
}
