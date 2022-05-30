package com.api.restfulApiTest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.api.restfulApiTest.Models.Member;
import com.api.restfulApiTest.Repositories.MemberRepository;



@Service
public class MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	public List<Member> findAll(){
		return memberRepository.findAll();
	}
	
	public Optional<Member> findOne(Member member){
		Example<Member> example =  Example.of(member);
		return memberRepository.findOne(example);
	}
}
