package com.api.restfulApiTest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.api.restfulApiTest.Models.Lable;
import com.api.restfulApiTest.Repositories.LableRepository;

@Service
public class LableService{
	@Autowired
	private LableRepository lableRepository;
	
	public List<Lable> findAll(Lable lable){
		Example<Lable> example = Example.of(lable); 
		return lableRepository.findAll(example);
	}
}
