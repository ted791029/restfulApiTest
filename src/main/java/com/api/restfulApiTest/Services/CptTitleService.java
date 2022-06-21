package com.api.restfulApiTest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.api.restfulApiTest.Models.CptTitle;
import com.api.restfulApiTest.Repositories.CptTitleRepository;

@Service
public class CptTitleService{
	@Autowired
	private CptTitleRepository cptTitleRepository;
	
	public List<CptTitle> findAll(CptTitle title){
		Example<CptTitle> example = Example.of(title); 
		return cptTitleRepository.findAll(example, Sort.by(Sort.Direction.ASC, "sort"));
	}
}
