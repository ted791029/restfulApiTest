package com.api.restfulApiTest.Controllers.MemberController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/getTest")
	public ResponseEntity<List<Member>> getTest() {
		List<Member> members = new ArrayList<>();
		Member member1 = new Member();
		member1.setId("001");
		member1.setName("GET方法測試1");
		member1.setAccount("get@gmail.com");
		member1.setEmail("get@gmail.com");
		member1.setPassword("get123456");
		Member member2 = new Member();
		member2.setId("002");
		member2.setName("GET方法測試2");
		member2.setAccount("get@gmail.com");
		member2.setEmail("get@gmail.com");
		member2.setPassword("get123456");
		members.add(member1);
		members.add(member2);
		return ResponseEntity.status(HttpStatus.OK).body(members);
	}
	@PostMapping("/postTest")
	public ResponseEntity<Member> postTest(@RequestBody Member member) {
		Member member1 = new Member();
		if(!member.getId().equals("001")) return ResponseEntity.status(HttpStatus.NOT_FOUND).body(member1);
		member1.setId("001");
		member1.setName("POST方法測試");
		member1.setAccount("post@gmail.com");
		member1.setEmail("post@gmail.com");
		member1.setPassword("post123456");
		return ResponseEntity.status(HttpStatus.OK).body(member1);
	}
}
