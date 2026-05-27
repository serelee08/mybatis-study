package com.study.mybatisstudy.member.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.mybatisstudy.member.vo.MemberVO;

@Mapper
public interface MemberDAO {

    void insertMember(MemberVO member);

    MemberVO selectMember(String memberId);

    List<MemberVO> selectMemberList();

}