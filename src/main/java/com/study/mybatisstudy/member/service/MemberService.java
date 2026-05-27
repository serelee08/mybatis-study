package com.study.mybatisstudy.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.mybatisstudy.member.dao.MemberDAO;
import com.study.mybatisstudy.member.vo.MemberVO;

@Service
public class MemberService {

    private final MemberDAO memberDAO;

    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public void joinMember(MemberVO member) {

        if (member.getMemberId() == null || member.getMemberId().isEmpty()) {
            throw new IllegalArgumentException("아이디는 필수입니다.");
        }

        if (member.getName() == null || member.getName().isEmpty()) {
            throw new IllegalArgumentException("이름은 필수입니다.");
        }

        memberDAO.insertMember(member);
    }

    public MemberVO getMember(String memberId) {
        return memberDAO.selectMember(memberId);
    }

    public List<MemberVO> getMemberList() {
        return memberDAO.selectMemberList();
    }

}