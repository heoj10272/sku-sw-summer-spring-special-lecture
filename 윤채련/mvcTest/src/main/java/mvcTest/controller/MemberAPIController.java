package mvcTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mvcTest.model.Member;
import mvcTest.service.MemberService;

@RestController
@RequestMapping("/api/members")
public class MemberAPIController {
	
	@Autowired
	private MemberService memberService;
	@GetMapping("/{id}")
	public Member getMember(@PathVariable String id) {
		return null;
		//return memberService.getMember(id);
	}
	
	
	
}
