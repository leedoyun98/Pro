package com.example.demo.domains;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component @Data 
public class JiguDto {
    private String writerId, title, content, regDate, count, jiguNum ; 
    
}
