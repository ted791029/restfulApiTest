package com.api.restfulApiTest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.restfulApiTest.Models.CptTitle;

@Repository
public interface CptTitleRepository extends JpaRepository<CptTitle, Long>{
	
}
