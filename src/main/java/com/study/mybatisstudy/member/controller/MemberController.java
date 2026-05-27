package com.study.mybatisstudy.member.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.mybatisstudy.member.service.MemberService;
import com.study.mybatisstudy.member.vo.MemberVO;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/members")
    public String joinMember(@RequestBody MemberVO member) {
        memberService.joinMember(member);
        return "회원 등록 성공";
    }

    @GetMapping("/members/{memberId}")
    public MemberVO getMember(@PathVariable String memberId) {
        return memberService.getMember(memberId);
    }

    @GetMapping("/members")
    public List<MemberVO> getMemberList() {
        return memberService.getMemberList();
    }

}