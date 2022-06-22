package com.api.restfulApiTest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restfulApiTest.Models.CptTitle;
import com.api.restfulApiTest.Models.Lable;

@Repository
public interface LableRepository extends JpaRepository<Lable, Long>{
	
}
