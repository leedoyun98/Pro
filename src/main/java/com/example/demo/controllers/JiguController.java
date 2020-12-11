package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.JiguDto;
import com.example.demo.service.JiguService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JiguController {
    @Autowired JiguService service;
    @PostMapping("/jigus")
    public Map<?,?> write(@RequestBody JiguDto jigu){
        var map = new HashMap<>();
        System.out.println("글쓰기 넘어온 정보 : "+jigu.toString());
        map.put("message", (service.writer(jigu) == 1) ? "SUCCESS":"FAILURE");
        return map;
    }
    @GetMapping("/jigus")
    public Map<?,?> list(){
        var map = new HashMap<>();
        ArrayList<JiguDto> list = service.list();
        for(JiguDto j : list){
            System.out.println("목록의 값: "+j);
        }
        map.put("list", list);
        return map;

    }
    @GetMapping("/jigus/{jiguNum}")
    public Map<?,?> detail(@PathVariable String jiguNum) {
        var map = new HashMap<>();
        int reuslt = service.getElementById(jiguNum);
        return map;
    }

    
}
