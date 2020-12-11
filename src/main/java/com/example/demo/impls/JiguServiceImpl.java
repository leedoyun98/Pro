package com.example.demo.impls;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

import com.example.demo.domains.JiguDto;
import com.example.demo.repositories.JiguRepository;
import com.example.demo.service.JiguService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JiguServiceImpl implements JiguService {
    // insert select update dalete
    @Autowired
    JiguRepository repository;

    @Override
    public int writer(JiguDto jigu) {
        jigu.setRegDate(LocalDate.now().toString());
        jigu.setCount("0");
        return repository.insert(jigu);
    }

    @Override
    public ArrayList<JiguDto> list() {
        return repository.selectAll();
    }

    @Override
    public int getElementById(String jiguNum) {
        return repository.selectById(jiguNum);
    }

   


   
    

   
    
}
