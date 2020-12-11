package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.Map;

import com.example.demo.domains.JiguDto;

import org.springframework.stereotype.Repository;

@Repository
public interface JiguRepository {

    public int insert(JiguDto jigudto);

	public ArrayList<JiguDto> selectAll();

	public int selectById(String jiguNum);

	

	

	

	

	
     
}
