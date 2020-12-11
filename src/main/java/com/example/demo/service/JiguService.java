package com.example.demo.service;

import java.util.ArrayList;
import java.util.Map;

import com.example.demo.domains.JiguDto;

import org.springframework.stereotype.Component;

@Component
public interface JiguService {

	public int writer(JiguDto jigudto);

	public ArrayList<JiguDto> list();

	public int getElementById(String jiguNum);

	


	


    
}
