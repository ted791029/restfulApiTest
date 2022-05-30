package com.api.restfulApiTest.Controllers.MemberController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.restfulApiTest.Models.Member;
import com.api.restfulApiTest.Services.MemberService;

@Controller
@RequestMapping("/api/members")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@GetMapping("/all")
	public ResponseEntity<List<Member>> findAll() {
		List<Member> members = memberService.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(members);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Member> findOne(@PathVariable String id) {
		Member member = new Member();
		member.setId(id);
		Optional<Member> memberOptional = memberService.findOne(member);
		if(!memberOptional.isPresent()) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.status(HttpStatus.OK).body(memberOptional.get());
	}
}
