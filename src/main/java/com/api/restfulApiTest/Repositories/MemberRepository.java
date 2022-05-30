package com.api.restfulApiTest.Repositories;
import org.springframework.stereotype.Repository;

import com.api.restfulApiTest.Models.Member;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

}
