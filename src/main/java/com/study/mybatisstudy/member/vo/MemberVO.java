package com.study.mybatisstudy.member.vo;

public class MemberVO {

    private String memberId;
    private String name;
    private String email;
    private int age;

    public MemberVO() {
    }

    public String getMemberId() { 
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}